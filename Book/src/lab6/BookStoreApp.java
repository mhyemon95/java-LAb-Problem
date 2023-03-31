package lab6;
import javax.swing.JOptionPane;

public class BookStoreApp {
	public static void main(String[] args) {
		BookStore b1 = new BookStore("MH Book Store");
		String title, author, sQuantity;
		int quantity;
		int option = -1;
		
		///System.out.println(input);
		

		do {
			String input = JOptionPane.showInputDialog("'1' to sell\n'2' to order\n'3' to display\n'0' to exit");
			option = Integer.parseInt(input);
			switch(option) {
			case 1: //sell
				title = JOptionPane.showInputDialog("Please enter the book title.");
				author = JOptionPane.showInputDialog("Please enter the name of the author.");
				sQuantity = JOptionPane.showInputDialog("Please enter the copies you want to sell.");
				quantity = Integer.parseInt(sQuantity);
				b1.sell(title, author, quantity);
				break;
			case 2: //order
				title = JOptionPane.showInputDialog("Please enter the book title.");
				author = JOptionPane.showInputDialog("Please enter the name of the author.");
				//sQuantity = ;
				quantity = Integer.parseInt(JOptionPane.showInputDialog("Please enter the copies you want to order."));
				b1.order(title, author, quantity);
				break;
			case 3:
				b1.display();
				break;
			default:
				System.out.println("not a valid option.");
				break;
			}

		}while(option != 0);

	}

}

//			static Scanner scan = new Scanner(System.in);
//
//			public static void main(String[] args) {
//				BookStore bs = new BookStore("  Yemon Book Store");
//				
//				int choice;
//				String title, author;
//				int copies;
//
//				while (true) {
//					choice = getManu();
//
//					switch (choice) {
//					case 1:
//						bs.display();
//						
//						break;
//						
//					case 2:
//						System.out.println("Please enter title, author and number of copy you want to order: ");
//						title = scan.next();
//						author = scan.next();
//						copies = scan.nextInt();
//						bs.order(title, author, copies);
//						
//						break;
//						
//					case 3:
//						System.out.println("Please enter title, author and number of copy you want to sell: ");
//						title = scan.next();
//						author = scan.next();
//						copies = scan.nextInt();
//						bs.sell(title, author, copies);
//						
//						break;
//						
//					case 0:
//						System.out.println("Thank you");
//						scan.close();
//						System.exit(0);
//						
//					default:
//						System.out.println("Invalid Input.");	
//
//					}
//				}
//			}
//		        public static int getManu() {
//				System.out.println();
//				System.out.println("MENU");
//				System.out.println();
//				System.out.println("Enter 1 for Display books");
//				System.out.println("Enter 2 for Order");
//				System.out.println("Enter 3 for Sell");
//				System.out.println("Enter 0 for Exit");
//
//				System.out.println("Enter your choice: ");
//				int choice = scan.nextInt();
//				return choice;
//			}
//
//	}
//
