package JavaHead;



class Example {
		
	public String name = "Muha";//initialize an instance variable
	
	int distance (int x, int  y){
		return x + y ;
		} 


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	

		Example ex = new Example();//object creation
		
		System.out.println(ex.distance(5, 5));
		int x = 3;
		if(x>1)
			
				System.out.println(ex.name);
			
		else
			System.out.println("Muhassan");
	}

}


