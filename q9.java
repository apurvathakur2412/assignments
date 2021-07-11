package assignment2;

import java.util.Scanner;

public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i,j,count=0,sum=0,temp=0,avg; 
		Scanner in=new Scanner(System.in); 
		n = in.nextInt(); 
		in.close();
		if(n < 0) {
			System.out.print("Invalid array size"); 
			System.exit(0); 
			}
		else {
			int a[]=new int[100];
			for(i = 1; i<=n; i++) {
				a[i] = in.nextInt(); 
				if(a[i] < 0) {
					System.out.print("Invalid input"); 
					System.exit(0); 
					}
				}
			for(i=1;i<=n;i++) {
			count=0;
			for(j=1;j<=i;j++) { 
				if(i%j==0) count++;
				}
			if(count==2) {
				sum = sum+a[i]; temp++;
				}
			}
			avg=sum/temp;
			System.out.print(avg);
			} 
	}

}
