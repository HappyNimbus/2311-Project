/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package MusicXML;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.*;
import java.io.File;

//Not all of the above are needed, they are there just in case.

public class Library {
	
	public static void main (String[] args) throws Exception{
		
		// This is the file you want to read
		File file = new File("bruh");
		ArrayList <String> lines = new ArrayList<String>();
		
		
		try {
			// This is the scanner that actually reads the file
			Scanner reader = new Scanner (file);
			
			// This is code is the one that actually prints it out into java
			while (reader.hasNextLine()) {
				
				String data = reader.nextLine();
				System.out.println(data);
				lines.add(data);
			}
			//closes reader
			reader.close();
		}
		// catches any exceptions
		catch (IOException e) {
			System.out.println("There was an ERROR");
			e.printStackTrace();
		}
		
	}
	
    public boolean someLibraryMethod(){
    	int zero = 0;
        return true;
    }
}
