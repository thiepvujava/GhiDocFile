package com.codeanhcuong.readwrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DocFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileReader fr = new FileReader("FileMoi.txt");
			
			BufferedReader br = new BufferedReader(fr);
			
			String data = "";
			while ((data = br.readLine()) != null) {
				System.out.println(data);
			}	
				br.close();
				fr.close();
			
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
