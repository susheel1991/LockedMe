package com.Lockedme.com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LockedmeAddnewFilesService {
	public  void AddNewFile() throws IOException {

		File parentDir = new File("C:\\Users\\Home\\Desktop\\Susheel\\");
		if (parentDir.isDirectory()) {
			List<String> listFile = Arrays.asList(parentDir.list());
			File[] filelist = parentDir.listFiles();
			Scanner FileName = new Scanner(System.in);
			System.out.println("Enter the FileName to be added to the Folder( Like- .txt,.doc etc) :- ");
			String newfiletobeadded = FileName.nextLine();
			File SerFile = new File("C:\\Users\\Home\\Desktop\\Susheel\\" + newfiletobeadded);
			
			
			boolean a = false;
			for (File file : filelist) {
				String filename = file.getName();
				if (filename.equals(newfiletobeadded)) {

					a = true;
					break;
				}} if (!a) {

					File Newfilelocation = new File("C:\\Users\\Home\\Desktop\\Susheel\\" + newfiletobeadded);
					System.out.println(newfiletobeadded + " File was Created Successfully");

				}else {
					System.out.println("Filename Already exists Please use a different name " + newfiletobeadded);
				  this.AddNewFile();
					}}
				else {
			System.out.println(parentDir.getAbsolutePath() + " Please Give correct Path of Directory or folder ");
		}
	}

	public static void main(String[] args) throws IOException {
		LockedmeAddnewFilesService addfileobject = new LockedmeAddnewFilesService();
		addfileobject.AddNewFile();

	}
}
