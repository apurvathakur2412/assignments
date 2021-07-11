package day1;

public class d1q6b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int a, b, c, i, n;
	      n = 100;
	      a = b = 1;
	      System.out.print(a+" "+b);
	      for(i = 1; i <= n-2; i++) {
	         c = a + b;
	         if (c<=100) {
	         if (c%2 != 0) {
	         
	             System.out.print(c);
	             System.out.print(" ");
	             a = b;
	             b = c;
	         }
	         else {
	        	 System.out.print(" "); 
	             a = b;
	             b = c;
	         }
	         }
	         else {
	        	 break;
	         }
	}

}
}