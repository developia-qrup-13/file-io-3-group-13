package main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class FilePrintStream {

	public static void main(String[] args) throws Exception {
		   FileOutputStream fout=new FileOutputStream("D:\\testout.txt");  
		   PrintStream pout=new PrintStream(fout);  
		   pout.println(65);  
		   pout.println("Hello Java");  
		   pout.println("Welcome to Java");  
		   pout.close();
		   printWriter();
	}
	 static void printWriter() throws Exception {
		PrintWriter writer = new PrintWriter(new File("D:\\testout.txt"));
		writer.write("Like Java, Spring, Android, PHP etc.\n");
		writer.write("Hibernate\n");
		writer.print(65);
		writer.write("\nLike Java, Spring");
		writer.close();
	}

}
