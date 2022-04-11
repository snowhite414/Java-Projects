 /*******************************************************************************************************
  * TownDriver.java
  * Hazel Cruz
  *
  *This is the driver for the Town class.
  *******************************************************************************************************/
public class TownDriver {

	public static void main(String[] args) {


		Town newHome = new Town();
		
        newHome.initialize();
        newHome.simulateBirth(); // 2x because the birth of the twins
        newHome.simulateBirth();
        newHome.printStatistics();
        
	} // end of main

} // end of class TownDriver

