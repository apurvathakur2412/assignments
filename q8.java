package assignment2;
import java.util.Scanner;
public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i,j,k=0,count,count1; 
		Scanner in=new Scanner(System.in); 
		n = in.nextInt(); 
		in.close();
		if(n < 0) { 
			System.out.print("Invalid array size"); 
			System.exit(0); 
			}
		else { 
			int a[]=new int[n];
			for(i = 0; i< n; i++) {
				a[i] = in.nextInt();
				if(a[i] < 0) {
					System.out.print("Invalid input");
					System.exit(0);
					}
				}
			int b[]=new int[n]; 
			for(i = 0; i< n; i++) 
			{
				b[i] = in.nextInt();
				if(b[i] < 0) {
					System.out.print("Invalid input"); 
					System.exit(0);
					}
				}
			int c[]=new int[100];
			for(i=0;i<n;i=i+2) { 
				count=0; 
				for(j=0;j<n;j=j+2) {
					if(a[i]==b[j]) {
						count=1;
						if(a[i+1]>b[j+1]) { 
							c[k]=a[i]; 
							c[++k]=a[i+1]; k++;
							}
						else {
							c[k]=a[i];
							c[++k]=b[j+1];
							k++;
							}
						}
					}
				if(count==0) {
					
					c[k]=a[i];
					c[++k]=a[i+1];
					k++;
					}
				}
			for(i=0;i<n;i=i+2) {
				count1=0; 
				for(j=0;j<n;j=j+2) {
					if(b[i]==a[j]) {
						count1=1;
						}
					} if(count1!=1) {
						c[k]=b[i];
						c[++k]=b[i+1];
						k++;
						}
					}
			for(i=0;i<k;i++) {
				System.out.println(c[i]); 
				}
			}
		
		
		
		
	}

}
