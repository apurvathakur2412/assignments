package day1;

public class d1q6a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, i, n;
	      n = 10;
	      a = b = 1;
	      System.out.print(a+" "+b);
	      for(i = 1; i <= n-2; i++) {
	         c = a + b;
	         System.out.print(" ");
	         System.out.print(c);
	         a = b;
	         b = c;
	}

	}
}
