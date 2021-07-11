package day1;

public class d1q7c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1, b, d=1, n;
		for (n=1; n<=50; n++) {
			
			b= a+ (n-1)*d;
			if(b%2 != 0) {
			System.out.println(b);
			}
			else if(b%2 ==0) {
				System.out.println("-"+b);
			}
		}
	}

}
