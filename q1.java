package assignment2;
import java.util.Scanner;
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary=0,shifts=0;
		double savings=0;
		Scanner in=new Scanner(System.in);
		salary = in.nextInt();
		shifts = in.nextInt();
		in.close();
		if(salary > 8000)
			System.out.println("Salary too large ");
		else if(shifts<0)
			System.out.println("Shifts too small\n");
		else if(salary<0)
			System.out.println("Salary too small");
		else
		{
			savings = (salary*0.5)+(salary*0.02*shifts);
		System.out.printf("%.0f",savings);}
	}

}

