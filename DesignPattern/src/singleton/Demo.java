package singleton;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long start;
	        long end;

	        start = System.currentTimeMillis();
	        Singleton singleton1 = Singleton.getInstance();
	        end = System.currentTimeMillis();
	        System.out.println(singleton1);
	        System.out.println("singleton1 instance creation time -- " + (end - start));

	        start = System.currentTimeMillis();
	        Singleton singleton2 = Singleton.getInstance();
	        end = System.currentTimeMillis();
	        System.out.println(singleton2);
	        System.out.println("singleton2 instance creation time -- " + (end - start));
	}

}
