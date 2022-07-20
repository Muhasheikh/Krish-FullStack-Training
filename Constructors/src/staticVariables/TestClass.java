package staticVariables;

import staticVariables.StaticMethod.player;

public class TestClass {

	
	static int duckCount;
	
	public   TestClass() {
		
		duckCount++;
	}
	
	
	public static void main(String[]args) {
		
		
	
		
		TestClass t = new TestClass();
		System.out.println(duckCount);
		TestClass t1 = new TestClass();
		System.out.println(duckCount);
	}
}
