package main;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;
public class Buffered {

	public static void main(String[] args) {
		File file = new File("G:\\rasim.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			BufferedOutputStream boS = new BufferedOutputStream(new FileOutputStream(file));                                                                                                                                                                                                                                                                                                                                           //Rasimindi kocurmuyun 
			boS.write("Salam_13necesen".getBytes());
		
			
		
			boS.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			BufferedInputStream bIS = new BufferedInputStream(new FileInputStream(file));
			for (int i = 0; i < 15; i++) {
				char ch = (char) bIS.read();
				System.out.print(ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
		
}
}