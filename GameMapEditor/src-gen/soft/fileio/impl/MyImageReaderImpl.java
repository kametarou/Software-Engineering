/**
 */
package soft.fileio.impl;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ComponentColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

import javax.imageio.ImageIO;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.PaletteData;
import org.eclipse.swt.graphics.RGB;

import soft.fileio.FileioPackage;
import soft.fileio.MyImageReader;
import soft.graphics.AssetProcess;
import soft.graphics.GraphicsFactory;
import soft.mapping.Asset;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>My Image Reader</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MyImageReaderImpl extends MinimalEObjectImpl.Container implements MyImageReader {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyImageReaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FileioPackage.Literals.MY_IMAGE_READER;
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
	 * @generated
	 */
	public Graphics2D image2graphics2D(String filename) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Asset image2asset(String filename) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		BufferedImage readImage;
		Asset a ;
		File f = new File(filename);
		try {
			readImage=ImageIO.read(f);
			
			if(readImage.getColorModel() instanceof DirectColorModel) {System.err.println("direct");}
			else if(readImage.getColorModel() instanceof IndexColorModel) {System.err.println("index");}
			else {System.err.println("others");}
			System.out.println(readImage.getColorModel().toString());
			AssetProcess ap = GraphicsFactory.eINSTANCE.createAssetProcess();
			a=ap.createAsset(readImage, filename);
			//TODO create new Asset and set readImage.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			a=null;
		}
		return a;
		//return null;
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FileioPackage.MY_IMAGE_READER___INIT:
				init();
				return null;
			case FileioPackage.MY_IMAGE_READER___IMAGE2GRAPHICS2_D__STRING:
				return image2graphics2D((String)arguments.get(0));
			case FileioPackage.MY_IMAGE_READER___IMAGE2ASSET__STRING:
				return image2asset((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	//convert AWT image into SWT image
	//modify code in http://johndingus.blogspot.jp/2014/01/java-convert-bufferedimage-to-swt.html
	public static ImageData convertToSWT(BufferedImage bufferedImage) {
		if (bufferedImage.getColorModel() instanceof DirectColorModel) {
			DirectColorModel colorModel = (DirectColorModel)bufferedImage.getColorModel();
			PaletteData palette = new PaletteData(colorModel.getRedMask(), colorModel.getGreenMask(), colorModel.getBlueMask());
			ImageData data = new ImageData(bufferedImage.getWidth(), bufferedImage.getHeight(), colorModel.getPixelSize(), palette);
			for (int y = 0; y < data.height; y++) {
				for (int x = 0; x < data.width; x++) {
					int rgb = bufferedImage.getRGB(x, y);
					int pixel = palette.getPixel(new RGB((rgb >> 16) & 0xFF, (rgb >> 8) & 0xFF, rgb & 0xFF));
					data.setPixel(x, y, pixel);
					if (colorModel.hasAlpha()) {
						data.setAlpha(x, y, (rgb >> 24) & 0xFF);
					}
				}
			}
			return data;
		} else if (bufferedImage.getColorModel() instanceof IndexColorModel) {
			IndexColorModel colorModel = (IndexColorModel)bufferedImage.getColorModel();
			int size = colorModel.getMapSize();
			byte[] reds = new byte[size];
			byte[] greens = new byte[size];
			byte[] blues = new byte[size];
			colorModel.getReds(reds);
			colorModel.getGreens(greens);
			colorModel.getBlues(blues);
			RGB[] rgbs = new RGB[size];
			for (int i = 0; i < rgbs.length; i++) {
				rgbs[i] = new RGB(reds[i] & 0xFF, greens[i] & 0xFF, blues[i] & 0xFF);
			}
			PaletteData palette = new PaletteData(rgbs);
			ImageData data = new ImageData(bufferedImage.getWidth(), bufferedImage.getHeight(), colorModel.getPixelSize(), palette);
			data.transparentPixel = colorModel.getTransparentPixel();
			WritableRaster raster = bufferedImage.getRaster();
			int[] pixelArray = new int[1];
			for (int y = 0; y < data.height; y++) {
				for (int x = 0; x < data.width; x++) {
					raster.getPixel(x, y, pixelArray);
					data.setPixel(x, y, pixelArray[0]);
				}
			}
			return data;
		}else if (bufferedImage.getColorModel() instanceof ComponentColorModel) {
            ComponentColorModel colorModel = (ComponentColorModel)bufferedImage.getColorModel();
            PaletteData palette = new PaletteData(0x0000FF, 0x00FF00,0xFF0000);
            
            ImageData data = new ImageData(bufferedImage.getWidth(), bufferedImage.getHeight(), colorModel.getPixelSize(), palette);

            WritableRaster raster = bufferedImage.getRaster();
            int[] pixelArray = new int[4];
            for (int y = 0; y < data.height; y++) {
                for (int x = 0; x < data.width; x++) {
                    raster.getPixel(x, y, pixelArray);
                    int pixel = palette.getPixel(new RGB(pixelArray[0], pixelArray[1], pixelArray[2]));
                    data.setPixel(x, y, pixel);
                    data.setAlpha(x, y, pixelArray[3]);
                }
            }
            return data;
        }
		return null;
	}
} //MyImageReaderImpl
