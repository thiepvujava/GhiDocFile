package com.codeanhcuong.readwrite;

import java.io.File;
import java.io.IOException;

public class TaoFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File file = new File("NewFile.txt");
			file.createNewFile();
			
			File directory = new File("NewFolder");
			directory.mkdir();
			
			File directory1 = new File("/home/thiepvu/Desktop/New");
			directory1.mkdir();
			
			File file1 = new File("/home/thiepvu/Desktop/New/Word.txt");
			file1.createNewFile();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		}
	}


