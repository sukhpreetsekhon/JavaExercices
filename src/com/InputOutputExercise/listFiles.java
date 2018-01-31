package com.InputOutputExercise;

import java.io.File;
import java.sql.Date;

public class listFiles {
	
	public static void main (String[] arg){
		//list of files 
		File file = new File("E:\\old laptop data\\ielts");
		String[] fileList = file.list();
		for (String name: fileList)
		{
			System.out.println(name);
		}
		
		//last modified time:
	       File fileName = new File("E:\\old laptop data\\ielts\\Cambridge Practice Tests for IELTS 4 (booK).pdf");
	       Date date=new Date(fileName.lastModified());
		   System.out.println("\nThe file was last modified on: "+date+"\n");	   
	     
	}

}
