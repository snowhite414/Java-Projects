/**************************************************************************************************************************
 * PhoneNumberDissector.java
 * Hazel Cruz
 * 
 * This program reads phone numbers, and for each phone number, 
 * it displays the phone number’s three components –country code, area code, and local number.
 **************************************************************************************************************************/

import java.util.Scanner;

public class PhoneNumberDissector {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		String phoneNum = "";   // user input
		String cc, area, local; // country code, area code, local phone #
		
		do
		{
		  System.out.print("Enter a phone number in the form cc-area-local,\nwhere cc = country code digits, " + 
		  "area = area code digits,and local = local phone digits.\n" + "Or enter q to quit:");
		  phoneNum = sc.nextLine();
		
		   if (phoneNum.equalsIgnoreCase("q"))
		   {
			  System.exit(0);
		   }
		    
		      cc = phoneNum.substring(0, phoneNum.indexOf('-'));
		      area = phoneNum.substring(phoneNum.indexOf('-'), phoneNum.lastIndexOf('-'));
		      local = phoneNum.substring(phoneNum.lastIndexOf('-'), phoneNum.length());
		 
              System.out.println("country code = " + cc + "\narea code = " + area.substring(1) + 
				 "\nlocal phone number = " + local.substring(1) + "\n");
              
		} while (!phoneNum.equalsIgnoreCase("q"));
		 
		sc.close();
	} // end main

} // end of class PhoneNumberDissector
