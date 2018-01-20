/**
 */
package soft.fileio.impl;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import soft.fileio.FileioPackage;
import soft.fileio.XmlReader;
import soft.mapping.Asset;
import soft.mapping.Cell;
import soft.mapping.Map;
import soft.mapping.MappingFactory;

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
					int x = i%width;
					int y = i/width;
					Cell c = factory.createCell();
					// TODO set appropriate asset to the sell
					c.setCellColor(new Color(255,255,255)); //for test
					
					cellarray[depth][x][y]=c;
				}
			}
			
			//create map
			Map map = factory.createMap();
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
