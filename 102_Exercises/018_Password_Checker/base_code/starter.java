import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
        int s1 = 0;
        int s2 = 0;
        int s3 = 0;
        boolean flag1 = false;
        boolean flag2 = false;
        
		for(int j = 0; j < passwords.length; j++) {
		    String pass = passwords[j];
		    
		    if(pass.length() >= 8) {
		        s1++;
		        flag1 = true;
		    }
		    if(pass.contains("!") || pass.contains("@") || pass.contains("#") || pass.contains("$") || pass.contains("%") || pass.contains("^") || pass.contains("&") || pass.contains("*")) {
		        s2++;
		        flag2 = true;
		    }
		    if(flag1 && flag2) {
		        s3++;
		    }
		    j++;
		}
		System.out.println("There are " + s1 + " passwords of strength 1 with 8 or more characters.");
		System.out.println("There are " + s2 + " passwords of strength 2 with a special symbol.");
		System.out.println("There are " + s3 + " passwords of strength 3 with both strength 1 and 2.");
	}
}
