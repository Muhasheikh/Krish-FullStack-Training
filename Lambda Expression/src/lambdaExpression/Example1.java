package lambdaExpression;

import java.util.ArrayList;

interface Square{
	
	public int area(int w);
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		//Regular Expression
		Square s = new Square() {
			
			@Override
			public int area(int w) {
				// TODO Auto-generated method stub
				return  w * w;
				
			}
		};
		System.out.println("The area of square using regular expression "+s.area(5));
		
		Square s1 =(w)->w*w;
		System.out.println("The area of square using lambda expression "+s1.area(10));
	}

}
