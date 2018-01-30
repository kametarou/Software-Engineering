/**
 */
package soft.fileio.impl;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import soft.fileio.FileioPackage;
import soft.fileio.XmlReader;
import soft.mapping.Asset;
import soft.mapping.Cell;
import soft.mapping.Map;
import soft.mapping.MappingFactory;
import soft.mapping.Position;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xml Reader</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XmlReaderImpl extends MinimalEObjectImpl.Container implements XmlReader {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmlReaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FileioPackage.Literals.XML_READER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void init() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc --> 
	 * @generated NOT
	 */
	public Map xml2map(String filepath) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		// c.f. https://www.mkyong.com/java/how-to-read-xml-file-in-java-dom-parser/
		
		//create map
		MappingFactory factory = MappingFactory.eINSTANCE;
		Map map = factory.createMap();
		
		//open file
		File f = new File("./sampleMap.xml");
		
		//create DOM from XML file
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(f);
			
			//get meta info
			Element metainfo = (Element) doc.getElementsByTagName("metaInfo").item(0);
			int height = Integer.valueOf(metainfo.getAttribute("height")).intValue();
			int width = Integer.valueOf(metainfo.getAttribute("width")).intValue();
			int maxlayer = Integer.valueOf(metainfo.getAttribute("maxlayer")).intValue();
			
			//create cell array
			Cell[][][] cellarray = new Cell[maxlayer][width][height];
			NodeList cellarrayNode = doc.getElementsByTagName("cellarray");
			for(int depth = 0; (depth < cellarrayNode.getLength()) && (depth<maxlayer);depth++) {
				Node layer = cellarrayNode.item(depth);
				NodeList cells = layer.getChildNodes();
				for(int i = 0; i < cells.getLength();i++) {
					Element el = (Element) cells.item(i);
					int x = i%width;
					int y = i/width;
					Cell c = factory.createCell();
					// assign properties to the cell c
					//(1)position
					Position p = factory.createPosition();
					p.init();
					p.setX(x);p.setY(y);
					c.setPosition(p);
					
					//(2)referenceCell
					int refx = Integer.valueOf(el.getElementsByTagName("refCellX").item(0).getTextContent());
					int refy = Integer.valueOf(el.getElementsByTagName("refCellY").item(0).getTextContent());
					c.setReferenceCell(cellarray[depth][refx][refy]);
					
					//(3)cellColor or Asset
					String colorNum = el.getElementsByTagName("color").item(0).getTextContent();
					if(colorNum==null) {//set Aseet
						// TODO implement here
						Asset a = factory.createImageAsset();
						c.setMyAsset(a);
					}else {
					//convert string into 3 integers(r,g,b)
						int rgb = Integer.valueOf(colorNum);
						int r=rgb>>>16; int g=(rgb<<8)>>>16; int b=(rgb<<16)>>>16;
						c.setCellColor(new Color(Display.getCurrent(), r,g,b)); 
					}
					
					cellarray[depth][x][y]=c;
				}
			}
			
			map.setMapheight(height);
			map.setMapwidth(width);
			map.setMaxLayer(maxlayer);
			map.setCells(cellarray);
			return map;
			//throw new UnsupportedOperationException();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset xml2assets(String filepath) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FileioPackage.XML_READER___INIT:
				init();
				return null;
			case FileioPackage.XML_READER___XML2MAP__STRING:
				return xml2map((String)arguments.get(0));
			case FileioPackage.XML_READER___XML2ASSETS__STRING:
				return xml2assets((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //XmlReaderImpl
