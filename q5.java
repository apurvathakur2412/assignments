package assignment2;
import java.util.Scanner;
public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, rem,prod=1;  
		Scanner in=new Scanner(System.in); 
		n = in.nextInt(); 
		in.close();
		if(n<0 || n>32767) {
			System.out.println ("Invalid Input");
			System.exit(0); 
			}

        else
        {         
                    while(n!=0)
                    {
                                rem=n%10;
                                prod=prod*rem;
                                n=n/10;
                    }
                    System.out.println(prod);
        }

		
		
		
	}

}
