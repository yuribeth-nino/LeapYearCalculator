class LeapYearCalculator{
  boolean divisibleBy4;
  boolean divisibleBy100;
  boolean divisibleBy400;

	public boolean isLeapYear(int year){
	  divisibleBy4 = ((year % 4) == 0);
  	  divisibleBy100 = ((year % 100)== 0);
      divisibleBy400 = ((year % 400)== 0);	
	  
	  //calculation to know if the year is a leap year  or it is not 
	 
	  if (divisibleBy4 && (!divisibleBy100 || divisibleBy400)){
		  
		  return true;
	  
	  } else {
		  return false;
	  }
	}
	public void displayCalendar(int year) {
	 int spaces = 5;
	String[] months = {
                "",                              
                "January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"};
				//numbers of days in each months
    int[] daysInMonths = { 0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30,31};
	
	            // this formula will put into february the extra day it needs to be a leap year 
	  for (int M = 1; M <= 12; M++) {
	  if  (isLeapYear(year) && M == 2)
                    daysInMonths[M] = 29;
				
				// Displaying the calendar header and the line to separate the month , year from the days 
			System.out.println("          " + months [M] + "  " + year);
			System.out.println("**************************************");
			System.out.println("   Sun  Mon Tue   Wed Thu   Fri  Sat");
			
			//spaces requires to print the numbers in each lines to make a calendar 
		    spaces = (daysInMonths[M-1] + spaces)%7;
			for (int i = 0; i < spaces; i++)
                    System.out.print("     ");
			// this is the formula that allows me to print the numbers of each month in each line in the correctly position
                for (int i = 1; i <= daysInMonths[M]; i++) {
                    System.out.printf(" %3d ", i);
                    if (((i + spaces) % 7 == 0) || (i == daysInMonths[M])) 
						System.out.println();
                }

      
        }
    }
}
