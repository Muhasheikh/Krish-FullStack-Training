package lambdaExpression;

public class Example2 {
	
	interface PrintName{
		
		public void Name(String name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Regular Expression
		PrintName p = new PrintName() {
			
			@Override
			public void Name(String name) {
				// TODO Auto-generated method stub
				System.out.println("My name is "+name);
			}
		};
		//Lambda Expression
		PrintName p1 = (name)->System.out.println("My name is "+name);
		p.Name("Muhasan");
		p1.Name("Muha");

	}

}
