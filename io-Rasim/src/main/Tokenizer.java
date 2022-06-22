package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.StreamTokenizer;

public class Tokenizer {
	public static void main(String[] args) throws Exception {
		rasim();
	

	}
	 
	static void rasim() throws Exception {
		FileReader reader = new FileReader("G:\\Rasim.txt");// burda yeri vermisik( location)
		BufferedReader bufferread = new BufferedReader (reader);
		StreamTokenizer rasim = new StreamTokenizer (bufferread);//buffered reader oxudugunuda rasim'e vermisem ve oxumaga basliyir
		int r;
		while ((r = rasim.nextToken() ) !=StreamTokenizer.TT_EOF){
			switch (r) {
			case StreamTokenizer.TT_NUMBER:
				System.out.println("Number : " + rasim.nval);//number value konsola cixarir
				break;
			case StreamTokenizer.TT_WORD:
				System.out.println("Word : " + rasim.sval);// string value konsola cixarir
				break;
			}
			
		}
	}

}