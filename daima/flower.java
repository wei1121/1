package youxi;

public class flower {

	public static void main(String[] args) {
	
	 for (int i = 100; i < 1000; i++) {
		 
		int a = i / 100;
		int b = i / 10 % 10;
		int c = i % 10;
		int d = a * a * a + b * b * b + c * c * c;
		if (d == i) 
	   {
		 System.out.println("找到水仙花数:" + i);
	    }
		 
		        }
		 
		    }
}
		
