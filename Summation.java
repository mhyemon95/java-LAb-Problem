import java.util.Scanner;
public class Summation {
	public static void main(String[] args) {
		int n, p, sum = 0;  
	Scanner	 scan = new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		n = scan.nextInt();  
		while(n > 0)  
		{   
		p= n % 10;  
		sum = sum + p;  
		n = n / 10;  
		}  
		System.out.println("Sum of Digits: "+sum);  
		}
	
	}

