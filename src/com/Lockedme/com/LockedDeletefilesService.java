package com.Lockedme.com;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LockedDeletefilesService {
	public  String DeleteFile() throws IOException {

		File parentDir =  new File("C:\\Users\\Home\\Desktop\\Susheel\\");
		if(parentDir.isDirectory() && parentDir.list().length == 0) {
		   System.out.println("No files present to perform  Delete Opertion");
		} else {
		  
		List listFile = Arrays.asList(parentDir.list());
		File[] filenamelist = parentDir.listFiles();
		System.out.println("Directory Files :"+listFile);
		if (parentDir.isDirectory()) {
			Scanner FileName = new Scanner(System.in);

			System.out.println("Enter the Valid Filename (Example- .txt,.doc etc) :- ");
			String filetobedeletedname = FileName.nextLine();
			File Newfile = new File("C:\\Users\\Home\\Desktop\\Susheel\\" + filetobedeletedname);
			for (File filename : filenamelist) {
		
				String filetobedeleted = filename.getName();
				if (filetobedeletedname.equals(filetobedeleted)) {
					if (Newfile.delete()) {

						System.out.println("The File "+filetobedeletedname+" was deleted successfully");
						return null;

					}
				} else {
					System.out.println("File Not Found - FNF ");
					return DeleteFile();
				}
			}

		} else {
			System.out.println(parentDir.getAbsolutePath() + " Please provide a Valid Directory or folder Path ");
		}}
		return null;
	
		}	
		
	
	public static void main(String[] args) throws IOException {
		LockedDeletefilesService Def = new LockedDeletefilesService();
		Def.DeleteFile();
	}

}
