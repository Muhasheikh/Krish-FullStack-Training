package constructors;

public class Hippo extends Animal {
	
	int size;

	public Hippo(int newSize) {
		super();
		size = newSize;
		System.out.println(size);
	}
	
	public Hippo() {
		this.size = 5;
		System.out.println("Making a Hippo with a size "+size);
		
	}
}
