package com.Lockedme.com;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LockedmeShowFilesService {

	public  void ShowFile() {
		// Need to mention the File Folder Path
		File parentDir = new File("C:\\Users\\Home\\Desktop\\Susheel\\");

		if (parentDir.isDirectory() && parentDir.list().length == 0) {
			System.out.println("The Directory / Folder is empty, Please add files");

		} else if (parentDir.isDirectory()) {
			List<String> listFile = Arrays.asList(parentDir.list());

			System.out.println("-------------------List of Files------------------- ");
			Collections.sort(listFile);
			int i = 1;
			for (Object S : listFile) {

				System.out.println(i + "." + S);
				i++;

			}
		} else {
			System.out.println(parentDir.getAbsolutePath() + " Please Give correct Path of Directory or foldr  ");
		}

	}

	public static void main(String[] args) {
		LockedmeShowFilesService NewSWF = new LockedmeShowFilesService();
		NewSWF.ShowFile();
	}
}
