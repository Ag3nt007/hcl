import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class LockedMe {

    public static void main(String[] args) {
    	System.out.println("Welcome to LockedMe!");
    	optionsSelection();
    }
    
    private static void optionsSelection() {
    	System.out.println("MAIN MENU");
        String[] arr =
        	{
        		"\n1. Sort and show current files.",
                "2. File Operations",
                "3. Close Application",
             };
        int[] arr1 = {1,2,3};
        int opt = arr1.length;
        for(int i = 0; i < opt; i++){
            System.out.println(arr[i]);
        }
        
        System.out.println("\nEnter your choice:");
        Scanner sc = new Scanner(System.in);
        int  options =  sc.nextInt();
                switch (options)
                {
                    case 1:
                    	sortFiles();                     
                        optionsSelection();
                        break;
                        
                    case 2:
                        System.out.println("File Operations:");
                        subMenu();
                        break;
                        
                    case 3:
                    	closeApp();
                        break;
                        
                    default:
                        System.out.println("You have made an invalid choice!");
                        optionsSelection();
                }
    }
    
    private static void closeApp(){
        System.out.println("Goodbye!");
    }
    
    private static void subMenu() {
    	String username = System.getProperty("user.name");
    	String[] arr2 =
        	{
        		"1. Add",
                "2. Delete",
                "3. Search",
                "4. Back"
             };
        int[] arr3 = {1,2,3,4};
        int opt1 = arr3.length;
        for(int i = 0; i < opt1; i++){
            System.out.println(arr2[i]);
        }
        
        System.out.println("\nEnter your choice:");
        Scanner sc1 = new Scanner(System.in);
        int  fileOps =  sc1.nextInt();
        	switch (fileOps){
    		case 1:
    			System.out.println("Enter file name to add: ");

    	    	Scanner sc2 = new Scanner(System.in);
    	    	String add = sc2.next();
    	        try {
    	            File tbAdded = new File("C:\\Users\\" + username + "\\Desktop\\" + add);
    	            if (tbAdded.createNewFile()) {
    	              System.out.println("File created: " + tbAdded.getName());
    	            } else {
    	              System.out.println("File already exists.");
    	            }
    	          } catch (IOException e) {
    	            System.out.println("An error occurred.");
    	          }
    	        subMenu();
    		break;
    		case 2:
    	    	System.out.println("Enter file name to delete: ");
    	    	Scanner sc3 = new Scanner(System.in);
    	    	String delete = sc3.next();
    		    File tbDeleted = new File("C:\\Users\\" + username + "\\Desktop\\" + delete); 
    		    if (tbDeleted.delete()) { 
    		      System.out.println("Deleted the file: " + tbDeleted.getName());
    		    }
    		    else {
    		      System.out.println("Failed to delete the file.");
    		    }
    		    subMenu();
    		break;
    		case 3:
    			System.out.println("Search");
    			searchFiles();
    			subMenu();
    		break;
    		case 4:
    			System.out.println("Back to Main Menu");
    			optionsSelection();
    		default:
    		System.out.println("Invalid choice!");
    		subMenu();
            break;
        	}	
    }
    
    private static void searchFiles()
    {
    	String username = System.getProperty("user.name");
    	System.out.println("Enter file name to search for: ");
    	Scanner sc4 = new Scanner(System.in);
        String s =  sc4.nextLine();
        File file = new File("C:\\Users\\" + username + "\\Desktop\\" + s); 
        if (file.isFile())
            System.out.println("Found " + s);
        else
        	System.out.println("File not found.");
    } 
 
    private static void sortFiles()
    {
    	try
    	{
    	String username = System.getProperty("user.name");
    	File dir = new File("C:\\Users\\" + username + "\\Desktop");
		File[] files = dir.listFiles();
		for(File file:files)
	        System.out.println(file.getName());
    	}
	    catch(Exception e)
    	{
	    	System.out.println("No files found!\n");
	    }
    }
    
}
