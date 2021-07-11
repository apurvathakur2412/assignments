package assignment2;
import java.util.Scanner;
public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rupees,count=0, c1,c2,c3,c4,c5,c6; 
		Scanner in=new Scanner(System.in); 
		rupees = in.nextInt(); 
		in.close();
		if(rupees<0) { 
			count=-1;
			System.out.print("Invalid input"); 
			System.exit(0); 
			}
		else {
			c1=rupees/500; 
			rupees=rupees-(500*c1); 
			c2=rupees/100;
			rupees=rupees-(100*c2);
			c3=rupees/50;
			rupees=rupees-(50*c3);
			c4=rupees/10;
			rupees=rupees-(10*c4);
			c5=rupees/5;
			rupees=rupees-(5*c5);
			c6=rupees/1;
			rupees=rupees-(1*c6);
			count=c1+c2+c3+c4+c5+c6;
			System.out.print(count);
			}
	}

}
