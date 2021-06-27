package DateTimeFeatures;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class LocalDate1 {

  public static void main(String args[])
  {
	  //1.The LocalDate represents 
	  //a date in ISO format (yyyy-MM-dd) without time.
	  
	  LocalDate localDate = LocalDate.now();
	  System.out.println("Local Date " +localDate);
	  
	  //2.One day after
	  
	  LocalDate tomorrow = LocalDate.now().plusDays(1);
	  System.out.println("Next date " + tomorrow);
	  
	  //2. To Display Month and Year use of and parse operator
	 
	  LocalDate localDate1 =LocalDate.of(2015, 02, 20);
	  
	  System.out.println("Default Date " +localDate1);
	  
	  DayOfWeek dayofweek = LocalDate.parse("2016-06-12").getDayOfWeek();
 
	  System.out.println(dayofweek);
	  
	  boolean notBefore = LocalDate.parse("2016-06-12")
			  .isBefore(LocalDate.parse("2016-06-15"));
	  
	  System.out.println(notBefore);
  }


}
