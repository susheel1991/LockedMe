package com.Lockedme.com;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LockedmeSearchFilesService {
	public  void SearchFile() {

		File parentDir = new File("C:\\Users\\Home\\Desktop\\Susheel\\");

		if (parentDir.isDirectory() && parentDir.list().length == 0) {
			System.out.println("The Directory / Folder is empty, Please add files");
		}

		else if (parentDir.isDirectory()) {

			List<String> listFile = Arrays.asList(parentDir.list());
			File[] filelist = parentDir.listFiles();

			Scanner SearchFile = new Scanner(System.in);
			System.out.println("Enter the FileName(ie :- .txt,.doc etc) :- ");
			String searchfile = SearchFile.nextLine();
			File SerFile = new File("C:\\Users\\Home\\Desktop\\Susheel\\" + SearchFile);
			boolean B = false;
			for (File file : filelist) {
				String comparesearchfilename = file.getName();
				if (comparesearchfilename.equals(searchfile)) {
					B = true;
					System.out.println("Search Operation was Successfull , Matches found : " + searchfile
							+ "\nFile Location  = " + file.getAbsolutePath());
					break;
				}
			}
			if (!B) {
				System.out.println(" File Not found ");
			SearchFile();
			}
		} else {
			System.out.println(parentDir.getAbsolutePath() + " Please Give correct Path of Directory or folder ");
		}
	}

	public static void main(String[] args) {
		LockedmeSearchFilesService filesearchobject = new LockedmeSearchFilesService();
		filesearchobject.SearchFile();

	}
}
