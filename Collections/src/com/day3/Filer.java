package com.day3;

import java.io.FileWriter;
import java.io.IOException;


public class Filer {

	public static void main(String[] args) throws Exception {
		String file="books.txt";
		FileWriter writer=null;
		try {
			writer=new FileWriter(file);
			writer.append("C,150");
            writer.append("\n");
            writer.append("Java,500");
            writer.append("\n");
            writer.append("C++,300");
            System.out.println("File write - completed");
       } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            writer.close();
        }
        
		
		
		
		
	}

}
