package day1;
import java.util.Scanner;
public class d1q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2,num3,result;
		System.out.println("Enter any 3 integers ");
		Scanner in = new Scanner(System.in);
		num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextInt();
		result=num1+num2+num3;
		System.out.println("The result after addition is "+result);
	}

}
