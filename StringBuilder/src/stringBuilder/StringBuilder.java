
package stringBuilder;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;


public class StringBuilder {
	

		

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
	

		
		
		ArrayList<String> num = new ArrayList<>();
		ArrayList<String> num1 = new ArrayList<>();
		
		
		
		LocalDate date = LocalDate.of(2022, Month.APRIL, 24);
		LocalTime time = LocalTime.of(07,15);
		LocalDateTime time1 =  LocalDateTime.of(date,time);
		date = date.plusDays(7);
		System.out.println(time1);
		
		DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println(shortF.format(time1));
		
	
		num.add("1");
		num.add("20");
		
		System.out.println(num.equals(num1));
		System.out.println(num.isEmpty());
		System.out.println(num.size());
		System.out.println(num.remove("1"));
		
	
		
	}

}
