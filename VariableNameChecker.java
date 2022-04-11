/********************************************************************************************************************
 * VariableNameChecker.java
 * Hazel Cruz
 * 
 * This program checks the properness of a given variable name.
 ********************************************************************************************************************/
import java.util.Scanner;

public class VariableNameChecker {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String variableName = "";  // user input 
		char ch;
		boolean illegal = false;   // validate the variable name
		String variableName2 = "^[a-zA-Z0-9]*$"; // contains letters and digits only
	 
		System.out.println("This program checks the properness of a proposed Java variable name.");
		do
		{
		  System.out.print("Enter a variable name (q to quit): ");
		  variableName = sc.nextLine();
		  ch = variableName.charAt(0);
		  
		  if (variableName.equalsIgnoreCase("q"))
		  {
			  System.exit(0);
		  }
		  // 1st character is not a letter or variable contains space
		  else if (!Character.isLetter(ch) || variableName.indexOf(" ") > 0)
		  {
			 illegal = true;
		  }
		  // 1st character is uppercase or variable contains dollar sign and underscore
		  else if (Character.isUpperCase(variableName.charAt(0)) || variableName.indexOf("$") >0 
				  || variableName.indexOf("_") >0 && !illegal)
		  {
			  System.out.println("Legal, but uses poor style.\n");  
			  illegal = false;
		  }
		  else if (variableName.matches(variableName2) && !illegal) // contains letters & digits only 
		  {
			  System.out.println("Good!\n");
			  illegal = false;
		  }
		  for (int i=1; i<variableName.length(); i++) // check the characters from index 1
		  {
			  ch = variableName.charAt(i);
			  if (!Character.isLetterOrDigit(ch) && !(ch == '$') && !(ch == '_'))
			  {
				  illegal = true;
			  } 
		  }
		  if(illegal)
		  {
			  System.out.println("Illegal.\n");
			  illegal = false;    // start again/ clear boolean
		  }
		 
		} while (!variableName.equalsIgnoreCase("q"));
	    
	    
     sc.close();
	} //end of main

} // end of class  VariableNameChecker
