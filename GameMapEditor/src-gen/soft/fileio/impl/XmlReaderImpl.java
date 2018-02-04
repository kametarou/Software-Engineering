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
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Xml
 * Reader</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class XmlReaderImpl extends MinimalEObjectImpl.Container implements XmlReader {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected XmlReaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FileioPackage.Literals.XML_READER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void init() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Map xml2map(String filepath) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		// c.f. https://www.mkyong.com/java/how-to-read-xml-file-in-java-dom-parser/

		// create map
		MappingFactory factory = MappingFactory.eINSTANCE;
		Map map = factory.createMap();

		// open file
		File f = new File(filepath);

		// create DOM from XML file
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(f);
			Element mapEl = (Element) doc.getChildNodes().item(0);
			// get meta info and initialize map
			Element metainfo = (Element) mapEl.getElementsByTagName("metaInfo").item(0);
			int height = Integer.valueOf(metainfo.getElementsByTagName("height").item(0).getTextContent()).intValue();
			int width = Integer.valueOf(metainfo.getElementsByTagName("width").item(0).getTextContent()).intValue();
			int maxlayer = Integer.valueOf(metainfo.getElementsByTagName("maxlayer").item(0).getTextContent())
					.intValue();
			map.init(height, width, null);
			
			NodeList cellarrayNode = mapEl.getElementsByTagName("cellarray");
			System.out.println("cell array length:"+cellarrayNode.getLength());
			for (int depth = 0; (depth < cellarrayNode.getLength()) && (depth < maxlayer); depth++) {
				NodeList cells = ((Element)cellarrayNode.item(0)).getElementsByTagName("cell");
				for (int i = 0; i < height*width; i++) {
					Element el = (Element) cells.item(i);
					int x = i % width;
					int y = i / width;
					//Cell c = map.getCellFromSpecifiedLayer(x, y, depth); //unsupported
					Cell c = map.getCellFromCurrentLayer(x, y);
					// assign properties to the cell c
					// (1)position
					Position p = factory.createPosition();
					p.init();
					p.setX(x);
					p.setY(y);
					c.setPosition(p);

					// (2)referenceCell
					String refxString = el.getElementsByTagName("refCellX").item(0).getTextContent();
					String refyString = el.getElementsByTagName("refCellY").item(0).getTextContent();
					if (refxString!=""&&refyString!="") {
						//c.setReferenceCell(map.getCellFromSpecifiedLayer(x, y, depth)); //unsupported
						c.setReferenceCell(map.getCellFromCurrentLayer(x, y));
					}
					// (3)cellColor or Asset
					String colorNum = el.getElementsByTagName("color").item(0).getTextContent();
					if (colorNum == null) {// set Aseet
						// TODO implement here
						Asset a = factory.createImageAsset();
						c.setMyAsset(a);
					} else {
						// convert string into 3 integers(r,g,b)
						int rgb = Integer.valueOf(colorNum);
						System.err.println(rgb);
						int r = rgb /256 /256;
						int g = (rgb-r*256*256)/256;
						int b = rgb-r*256*256-g*256;
						c.setCellColor(new Color(Display.getCurrent(), r, g, b));
					}

					//cellarray[depth][x][y] = c;
				}
			}
			map.setMaxLayer(maxlayer);
			//map.setCells(cellarray);
			return map;
			// throw new UnsupportedOperationException();
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Asset xml2assets(String filepath) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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

} // XmlReaderImpl
