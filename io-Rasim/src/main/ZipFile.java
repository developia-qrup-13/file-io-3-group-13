package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFile {// Zip verdiyimiz txt fileni rar formatina salir
 
	public static void main (String[] args) throws Exception{
		String sourceFile = "G:\\rasim.txt";
		FileOutputStream fos = new FileOutputStream("G:\\rasim.zip");
		ZipOutputStream zipOut = new 	ZipOutputStream(fos);//Zip'in location'unu goturur
		File fileToZip = new File (sourceFile);
		FileInputStream fis = new FileInputStream(fileToZip);
	    ZipEntry zipEntry = new ZipEntry (fileToZip.getName());//Zip filesine kecirdir
	    zipOut.putNextEntry(zipEntry);
	    byte[] bytes = new byte [1024];// fileToZip'i goturur bir-bir byte'ye cevirir ordan oxuyub zipe salirdi
	    int length;
	    while((length =  fis.read(bytes)) >=0) {
	    	zipOut.write(bytes, 0, length);
	    }
	    zipOut.close();
	    fis.close();
	    fos.close();
		
	}
}
