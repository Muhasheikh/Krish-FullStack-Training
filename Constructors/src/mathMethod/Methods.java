package mathMethod;

import java.text.Format;
import java.util.Date;

public class Methods {
	
	public Methods() {
		
		number = 5;
		
	}
	
	private int number = 10;
	{System.out.println(number);}

	public static void main(String[]args) {
		
		
		Methods me = new Methods();
		System.out.println(me.number);
		
		int ab = Math.min(10,5);
		System.out.println(ab);
		
		
	
		Date today = new Date();
		String s =String.format("%tA %tb %tD",today,today,today);
		System.out.println(s);
		float ab1 = Math.min(240.44f, 230.00f);
		System.out.println(ab1);
	}
}
