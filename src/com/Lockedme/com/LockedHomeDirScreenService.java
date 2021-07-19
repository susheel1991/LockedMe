package com.Lockedme.com;

import java.util.Scanner;

public class LockedHomeDirScreenService {

	public String Dirpath() {
		Scanner Path = new Scanner(System.in);
		System.out.print("Please Write Folder Path Were File is Save (Like - D:\\LockedMe ,etc) :- ");
		String Directorypath = Path.nextLine();
		System.out.println(" Your Directory Path = " + Directorypath);
		return Directorypath;
	}

	public static void main(String[] args) {
		LockedHomeDirScreenService Defaultscreenobject = new LockedHomeDirScreenService();
		Defaultscreenobject.Dirpath();
	}
}
