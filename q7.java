package assignment2;
import java.util.Scanner;
public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double f,c; 
		Scanner in=new Scanner(System.in); 
		f = in.nextDouble(); 
		in.close();
		if(f < 0) { 
			System.out.print("Invalid Input"); 
			System.exit(0); 
			}
		else { 
			c= (f-32)/9*5;
			System.out.printf("%.2f", c); 
			}
		
		
		
		
	}

}
