package com.codeanhcuong.readwrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GhiFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("FileMoi.txt");
		
		try {
			file.createNewFile();
	
			FileWriter fw = new FileWriter(file);
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			PrintWriter pw = new PrintWriter(bw);
			
			String data = "Xin Chao";
			
			bw.write(data);
			//bw.close();
			//fw.close();
			pw.println("\nHello");
			pw.println("Bongjour");
			pw.close();
			
			
	}

		catch (IOException e) {
			e.printStackTrace();
		}

	}
}
