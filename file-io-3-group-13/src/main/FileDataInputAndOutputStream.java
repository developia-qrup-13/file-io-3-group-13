package main;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class FileDataInputAndOutputStream {
	public static void main(String[] args) throws Exception {
		FileOutputStream file = new FileOutputStream("D:\\testout.txt");
		DataOutputStream data = new DataOutputStream(file);
		data.writeInt(65);
		data.flush();
		data.writeInt(66);
		data.close();
		System.out.println("Succcess...");
		inputStream();
	}

	static void inputStream() throws Exception {
		InputStream input = new FileInputStream("D:\\testout.txt");
		DataInputStream inst = new DataInputStream(input);
		int count = input.available();
		byte[] ary = new byte[count - 0];
		inst.read(ary);
		for (byte bt : ary) {
			if (bt != 0) {
				char k = (char) bt;
				System.out.print(k);
			}
		}
	}
}
