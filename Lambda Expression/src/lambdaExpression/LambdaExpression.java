package lambdaExpression;

import java.util.ArrayList;

interface Square{
	
	public int area(int w);
}
public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int y = 128;
		byte x = (byte) y;
		System.out.println(x);
		
		Employee e = new Employee();
		e.setEmpID(101);
		e.setName("Muhassan");
		e.getIsPresent();
		
		System.out.println("The employee "+e.getEmpName() + " with the empID "+e.getEmpID()+""
				+ " is absent "+e.getIsPresent());
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
