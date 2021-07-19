package com.Lockedme.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LockedmeReadFilesContent {

	public  void Readfile() throws FileNotFoundException {
		// Need to give 2 times folder address in code
		File parentDir = new File("C:\\Users\\Home\\Desktop\\Susheel\\");
		if (parentDir.isDirectory() && parentDir.list().length == 0) {
			System.out.println("No Files present to ReadContents");
		} else if (parentDir.isDirectory()) {
			List<String> listFile = Arrays.asList(parentDir.list());
			File[] filelist = parentDir.listFiles();
			Scanner FileName = new Scanner(System.in);
			System.out.println("Enter the Filename to Display the contents ( ie - .txt,.doc etc) :- ");
			String ReadFile = FileName.nextLine();
			File ReadFilelocation = new File("C:\\Users\\Home\\Desktop\\Susheel\\" + ReadFile);

			boolean a = false;
			for (File file : filelist) {
				String filename = file.getName();
				if (filename.equals(ReadFile)) {

					a = true;
					break;
				}} if (!a) {

					System.out.println(" File not present in the folder");
				}else {
					Scanner sc = new Scanner(ReadFilelocation);
					while (sc.hasNext()) {
						System.out.println(sc.nextLine());

					}
				}
				

			}
		

		else {
			System.out.println(parentDir.getAbsolutePath() + " Please Give correct Path of Directory or folder ");
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		LockedmeReadFilesContent read = new LockedmeReadFilesContent();
		read.Readfile();

	}

}
