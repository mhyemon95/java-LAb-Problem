package pyramid;
import java.util.Scanner;

public class pyramid {

	public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
 int p,q,n;
 System.out.print("Enter the Number : ");
 n=scan.nextInt();    
 if(n>9) {
	 n=9;
 }
 for(p=n; p>=1; p--)
 {
     for(q=1; q<=n-p; q++)
     
         System.out.print("  ");
     
    for(q=1; q<=p; q++)
     
         System.out.print(" "+q);
    
     for ( q = p-1; q>=1; q--) 
         System.out.print(" "+q);
     System.out.println(" ");
             

	}
	
	}
}
