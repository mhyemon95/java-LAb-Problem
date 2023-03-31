package P2;
import java.util.ArrayList;
import java.util.Scanner;
public class UapBazar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Product> products = new ArrayList<Product>();
		int input = 0;
		
		do {
			System.out.println("\nEnter the menu number which you want to select: ");
			System.out.println("\t1. Add new\n\t2. Update Price\n\t3. Count discounted price\n\t4. View list of products\n\t0. Exit");
			input = scan.nextInt();
			switch(input) {
			case 1:
				System.out.print("Enter the name of the product: ");
				String name = scan.next();
				System.out.print("Enter the id of the product: ");
				int id = scan.nextInt();
				System.out.print("Enter the price of the product: ");
				double price = scan.nextDouble();
				System.out.print("Enter the category of the product: ");
				String category = scan.next();
				
				products.add(new Product(name, id, category, price));
				break;
			case 2:
				id = getIndex(scanID(scan), products);
				if(id == -1) break;
				System.out.print("Enter the updated price: ");
				products.get(id).updateprice(scan.nextDouble());
				break;
			case 3:
				id = getIndex(scanID(scan), products);
				if(id == -1) break;
				System.out.print("Enter the discount rate: ");
				double percentage = scan.nextDouble();
				System.out.printf("Discounted price is: %.2f\n", products.get(id).getDiscountPrice(percentage));
				break;
			case 4:
				for(Product p : products) {
					p.display();
				}
				break;
			}
		} while(input != 0);
		
		scan.close();
	}
	
	static int getIndex(int id, ArrayList<Product> list) {	
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).id == id) {
				return i;
			}
		}
		
		System.out.println("Product not found!");
		return -1;
		
	}
	
	static int scanID(Scanner scan) {
		System.out.print("Enter the product number: ");
		return scan.nextInt();
	}
}


