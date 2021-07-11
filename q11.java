package assignment2;
import java.util.Scanner;
public class q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, rem,prod=1; 
		Scanner in=new Scanner(System.in);
		n = in.nextInt(); 
		in.close();
		if(n<0) { 
			System.out.println ("Number too small "); 
			System.exit(0); 
			}
		if(n>32767) {
			System.out.println ("Number too large "); 
			System.exit(0);
			}
		

        else{         
                    if(n==0)
                    {
                                System.out.println("yes");
                                System.exit(0);
                    }


                    while(n!=1)
                    {
                                if(n%2!=0)
                                {
                                            System.out.println ("no ");
                                            System.exit(0);
                                }
                                n=n/2;
                    }
                    System.out.println("yes");
	}
	}
}
