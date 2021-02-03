import java.util.Scanner;
import java.util.regex.*;


public class EmailValidation {

	public static void main(String[] args) {
		String[] emails = {"a@a.com", "a.a@a.com", "a..a@a.com", "a..!@a..com", "a@@a.com", "a@a.com.com"};//multiple odd emails to search 
		System.out.println("Please type in an email.");
		Scanner keyboard = new Scanner(System.in);
		String input = keyboard.nextLine();
		String regex = ".{1,}@[^.]{1,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		if(matcher.find()==true)
		{
		System.out.println("Valid email.");
		}
		else if(matcher.find()==false)
		{
			System.out.println("Invalid email.");
			}
		
		for (int search = 0; search<emails.length; search++) {
			if(emails[search].equals(input))
			{
				System.out.println("Found " + input+"!");
				
			}
		}
		keyboard.close();
	}
}
