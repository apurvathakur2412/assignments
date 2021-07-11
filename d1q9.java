package day1;
import java.util.Scanner;
public class d1q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int sum=0;
      Scanner sc= new Scanner(System.in);
      System.out.print("Input a number: ");
      int num = sc.nextInt(); 
      sc.close();  
      //System.out.println("The number entered by the user is: "+num);  
      for(sum=0 ;num!=0 ;num/=10)
	    {
		sum+=num%10;
	    }
	    System.out.println("Sum of digits of a number is "+sum);
	}

}
