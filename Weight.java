import java.util.Scanner;

public class Weight {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		int cumulativeWeight =0;
		int num= 1;
		int count = 0;
		int avegWeight = 0;
		int weight =0;
		String more = "y";
		
		do {
		  System.out.print(" Item number " + num + " : ");
		     do {  
		        System.out.print("\n Enter kg weight (greater than zero): ");
		        weight = sc.nextInt();  
		     } while (weight <= 0);
		   
		  System.out.print(" more? (y/n): ");
		
		  more = sc.next();
		  count = count + 1;
		  num = num + 1;
		  cumulativeWeight = cumulativeWeight  + weight;
		  avegWeight = cumulativeWeight  / count;

		} while (more.equals ( "y"));

		System.out.print(" Average weight = " + avegWeight + " kg");
        sc.close();
	}

}//
