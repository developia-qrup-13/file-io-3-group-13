package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.StreamTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println(10 + 10+"10" );
		tokenizer();
	}

	static void tokenizer() throws Exception {
		FileReader reader = new FileReader("D:\\token.txt");
		BufferedReader bufferread = new BufferedReader(reader);
		StreamTokenizer token = new StreamTokenizer(bufferread);
		int t;
		while ((t = token.nextToken()) != StreamTokenizer.TT_NUMBER) {
			switch (t) {
			case StreamTokenizer.TT_NUMBER:
				System.out.println("Number : " + token.nval);
				break;
			case StreamTokenizer.TT_WORD:
				System.out.println("Word : " + token.sval);
				break;

			}
		}
	}

}
