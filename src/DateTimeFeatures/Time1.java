package DateTimeFeatures;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.Temporal;
import java.util.Set;

public class Time1 {
	
public static void main(String args[])

{

  // Local Time Display
	
  LocalTime localtime1 = LocalTime.now();
  System.out.println("LocalTime " + localtime1);
  
  LocalDate localDate1 = LocalDate.now();
  System.out.println("LocalDate " + localDate1);
 
  // Zoned Time Display 
  //The ZoneId is an identifier used to represent different zones.
   
  //A set of all zone id's can be obtained as below:

  Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
  System.out.println(allZoneIds);
  
  //The LocalDateTime can be converted to a specific zone by finding its difference:
  
  ZoneId zoneId = ZoneId.of("Africa/Nairobi");
  System.out.println(zoneId);

  LocalDateTime localDatetime1 = LocalDateTime.now();
  ZonedDateTime zonedDateTime = ZonedDateTime.of(localDatetime1, zoneId);
  System.out.println(zonedDateTime);
  
  ZoneOffset zoneoffset = ZoneOffset.UTC;
  Temporal temp = zoneoffset.adjustInto(ZonedDateTime.now());
  System.out.println("Difference in UTC "  + temp);

}

}
