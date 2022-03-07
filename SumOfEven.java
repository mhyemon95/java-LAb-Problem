package SumOfEven;
import java.util.Scanner;
public class SumOfEven {
	public static void main(String[]args) {Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the number:");
	int n = scanner.nextInt();
	int sum=0;
	for(;n!=0;n=n/10) {
		if((n%10)%2==0) {
			sum+=n%10;
		}
	}
	System.out.println(sum);

}
}
