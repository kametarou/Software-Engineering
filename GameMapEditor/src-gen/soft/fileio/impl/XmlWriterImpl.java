/**
 */
package soft.fileio.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.lang.reflect.InvocationTargetException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import soft.fileio.FileioPackage;
import soft.fileio.XmlWriter;
import soft.mapping.Cell;
import soft.mapping.Map;
import soft.mapping.Position;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Xml
 * Writer</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class XmlWriterImpl extends MinimalEObjectImpl.Container implements XmlWriter {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected XmlWriterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FileioPackage.Literals.XML_WRITER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void init() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	public void write(File f, Document d) throws TransformerException, IOException {
		TransformerFactory transFactory = TransformerFactory.newInstance();
		Transformer transformer = transFactory.newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.setOutputProperty(OutputKeys.METHOD, "xml");

		FileOutputStream os = new FileOutputStream(f);

		DOMSource source = new DOMSource(d);
		StreamResult result = new StreamResult(os);
		transformer.transform(source, result);
		os.close();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void map2xml(String filepath, Map map) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document document = dBuilder.newDocument();
			Element mapEl = document.createElement("map");
			mapEl.setAttribute("name", filepath);
			// metaInfo
			Element metaInfo = document.createElement("metaInfo");
			Element height = document.createElement("height");
			height.appendChild(document.createTextNode(String.valueOf(map.getMapheight())));
			Element width = document.createElement("width");
			width.appendChild(document.createTextNode(String.valueOf(map.getMapwidth())));
			Element maxlayer = document.createElement("maxlayer");
			maxlayer.appendChild(document.createTextNode(String.valueOf(map.getMaxLayer())));
			metaInfo.appendChild(height);
			metaInfo.appendChild(width);
			metaInfo.appendChild(maxlayer);
			// document.appendChild(metaInfo);
			mapEl.appendChild(metaInfo);

			// cellArrays
			Element array = document.createElement("cellarray");
			// document.appendChild(array);
			// for (int d = 0; d < map.getMaxLayer(); d++) {
			for (int d = 0; d < 1; d++) {
				for (int y = 0; y < map.getMapheight(); y++) {
					// for (int y = 0; y < 10; y++) {
					for (int x = 0; x < map.getMapwidth(); x++) {
						// for (int x = 0; x < 10; x++) {
						// Cell c = map.getCellFromSpecifiedLayer(x, y, d);ほんとはこっち
						Cell c = map.getCellFromCurrentLayer(x, y);

						Element cEl = document.createElement("cell");
						cEl.setAttribute("pos", String.valueOf(x) + "," + String.valueOf(y));
						// referenceCell
						Element refx = document.createElement("refCellX");
						Element refy = document.createElement("refCellY");
						Cell rc = c.getReferenceCell();
						if (rc == null) {
							refx.setTextContent("");
							refy.setTextContent("");
						} else {
							Position p = c.getReferenceCell().getPosition();
							refx.setTextContent(String.valueOf(p.getX()));
							refy.setTextContent(String.valueOf(p.getY()));
						}
						cEl.appendChild(refx);
						cEl.appendChild(refy);
						// cellColor or Asset
						if (c.getCellColor() != null) {
							Element color = document.createElement("color");
							int red = c.getCellColor().getRed();
							int green = c.getCellColor().getGreen();
							int blue = c.getCellColor().getBlue();
							int rgb = red * 256 * 256 + green * 256 + blue;
							color.appendChild(document.createTextNode(String.valueOf(rgb)));
							cEl.appendChild(color);
						} else {
							Element assetid = document.createElement("assetid");
							assetid.appendChild(document.createTextNode(c.getMyAsset().getAssetId()));
						}
						array.appendChild(cEl);
					}
				}
			}
			mapEl.appendChild(array);
			document.appendChild(mapEl);
			File file = new File(filepath);
			if (file != null && file.canWrite()) {
				write(file, document);
			} else {
				file.createNewFile();
				write(file, document);
			}

		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case FileioPackage.XML_WRITER___INIT:
			init();
			return null;
		case FileioPackage.XML_WRITER___MAP2XML__STRING_MAP:
			map2xml((String) arguments.get(0), (Map) arguments.get(1));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} // XmlWriterImpl
