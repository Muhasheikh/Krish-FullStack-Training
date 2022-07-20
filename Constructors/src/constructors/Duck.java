package constructors;

public class Duck {

	int size;
	
	public Duck() {
		
		size =27;	
	}
	
	public Duck(int duckSize) {
		
		size = duckSize;
		
	}
	public static void main(String[]args) {
		
		Duck d = new Duck();
		Duck d1 = new Duck(10);
		
	
	}
}
