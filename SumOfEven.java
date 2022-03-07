package SumOfEven;
import java.util.Scanner;
public class SumOfEven {
	public static void main(String[]args) {Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the number:");
	int N = scanner.nextInt();
	int sum=0;
	for(;N!=0;N=N/10) {
		if((N%10)%2==0) {
			sum+=N%10;
		}
	}
	System.out.println(sum);

}
}
