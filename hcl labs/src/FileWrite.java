import java.io.*;
import java.util.Scanner;

public class FileWrite {

public static void main(String [] args)
{
	System.out.println("Would you like to create a new file? Enter y/n: ");
	 Scanner scan = new Scanner(System.in);
	 char i = scan.next().charAt(0);
	switch(i) {
	case 'y': {
	try {
		System.out.println("Enter file name: ");
		Scanner filename = new Scanner(System.in);
		String fn = filename.nextLine().trim();
		File nf = new File(fn + ".txt");
		if(nf.createNewFile())
		{
			System.out.println("New file created: " + nf);
			System.out.println("Would you like to edit " + nf + "? Enter y/n: ");
			char x = (char)System.in.read();
			switch(x) {
			case 'y': try {
			      FileWriter writer = new FileWriter(nf);
			      System.out.println("Enter text to add to file: ");
			      Scanner write = new Scanner(System.in);
			      write.nextLine();
			      String text = write.nextLine().trim();
			      writer.append(text);
			      writer.close();
			System.out.println("Successfully wrote \"" + text + "\" to the file.");
			filename.close();
			scan.close();
			write.close();
			} 
			catch (IOException e) {
		        System.out.println("An error occurred.");
		        e.printStackTrace();
		        }
			break;
			case 'n': System.out.println("Have a nice day!");
			break;
					}
		}
		else
		{
			System.out.println("File already exists.");
			System.out.println("Would you like to edit " + nf + "? Enter y/n: ");
			char j = (char)System.in.read();
			switch(j) {
			case 'y': try {
			      FileWriter writer = new FileWriter(nf, true);
			      System.out.println("Enter text to add to file: ");
			      Scanner write = new Scanner(System.in);
			      write.nextLine();
			      String text = write.nextLine().trim();
			      writer.append("\n" + text);
			      writer.close();
			System.out.println("Successfully wrote \"" + text + "\" to the file.");
			filename.close();
			scan.close();
			write.close();
			} 
			catch (IOException e) {
		        System.out.println("An error occurred.");
		        e.printStackTrace();
		        }
			break;
			case 'n': System.out.println("Have a nice day!");
			break;
					}
		}
	}
	catch (IOException e)
	{
		System.out.println("An error occured.");
		e.printStackTrace();
	}
	break;
	}
	case 'n': System.out.println("Have a nice day!");
	break;
	}
}
}