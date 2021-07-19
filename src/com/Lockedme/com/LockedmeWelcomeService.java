package com.Lockedme.com;

import java.io.IOException;
import java.util.Scanner;

public class LockedmeWelcomeService {

	public void welcome() throws IOException {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("");
			System.out.println("Enter Yes to Avail the File Services or Exit to Exit the Application:-");
			String userinput = scanner.nextLine();
			if (userinput.equalsIgnoreCase("Yes")) {
				System.out.println("Select the File Services as below");
				System.out.println(
						"Enter - Displayfiles - To Display the existing files. \nEnter - Createfiles - To create a New file \nEnter - Deletefiles - To Delete a File "
								+ "\nEnter - Searchfiles - To Search an Existing File\nEnter - Exit - To Exit the Application  ");
				System.out.println("Please select correct option to perform the application :- ");
			} else if (userinput.equals("Exit")) {
				LockedmeExitAppService ex = new LockedmeExitAppService();
				ex.Exit();
				break;
			} else {
				System.out.println(" Invalid option please choose correct option and restart the application ");
				this.welcome();
			}
			String actioninput = scanner.nextLine();
			if (actioninput.equalsIgnoreCase("Exit")) {
				LockedmeExitAppService exit = new LockedmeExitAppService();
				exit.Exit();
				break;
			}
			switch (actioninput) {
			case "Displayfiles":
				LockedmeShowFilesService sow = new LockedmeShowFilesService();
				sow.ShowFile();

				break;
			case "Createfiles":
				LockedmeAddnewFilesService crt = new LockedmeAddnewFilesService();
				crt.AddNewFile();
				break;
			case "Deletefiles":
				LockedDeletefilesService de = new LockedDeletefilesService();
				de.DeleteFile();
				break;
			case "Searchfiles":
				LockedmeSearchFilesService sf = new LockedmeSearchFilesService();
				sf.SearchFile();
				break;

			default:
				System.out.println(" Invalid option please choose correct option from FileServices Menu");

			}
		}

	}

	public static void main(String[] args) throws IOException {
		System.out.println("     Welcome to LockedMe \nApplication for File Services");
		System.out.println("Develop by :-  Bommak Susheel Kumar ");
		LockedmeWelcomeService welcomeobject = new LockedmeWelcomeService();
		welcomeobject.welcome();
	}

}
