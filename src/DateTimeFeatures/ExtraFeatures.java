package DateTimeFeatures;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ExtraFeatures {
	
	public static void main(String args[])
	{
		//Difference in periods(Same syntax in-case of time)
		
		LocalDateTime Date1 = LocalDateTime.parse("2015-05-10T06:30:00");
		System.out.println("First Date " +Date1);
		
		LocalDateTime Date2 = LocalDateTime.parse("2015-05-10T07:30:00");
		System.out.println("Second Date " +Date2);
		
		long difference = ChronoUnit.HOURS.between(Date1, Date2);
		System.out.println("Actual-Difference " +difference);
		
		//DATE AND TIME FORMATTING
		LocalDateTime localDateTime = 
				    LocalDateTime.of(2015, Month.JANUARY, 25, 6, 30);
		
		System.out.println(localDateTime);
		
		String localDateString = 
				           localDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println("Converted String " +localDateString);
		
		//Custom formatting
		
		String localDateString1 =localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("Desired Format " +localDateString1);
		
		LocalTime localtime1 = LocalTime.now();
		System.out.println("LocalTime " + localtime1);
		
		String test = "06:03:33";
		
		LocalTime Data = LocalTime.parse(test);
		System.out.println("First time " +Data);
		
		LocalTime Data1 = LocalTime.parse("06:51:33");
		System.out.println("Second time " +Data1);
		
		long difference1 = ChronoUnit.HOURS.between(Data, Data1);
		System.out.println("Actual-Difference " +difference1);
		
		
		  
		

		
		
	}
	
}
