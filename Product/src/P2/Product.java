package P2;

public class Product {
String name,category;
int id;
double price;
public Product(String name, int id,String category,double price) {
	this.name=name;
	this.id=id;
	this.category=category;
	this.price=price;
}

public void updateprice(double newPrice) {
	price =newPrice;
}
public double getPrice() {
	return price;
}

public double getDiscountPrice(double discountPersentage) {
	double discount = (price*discountPersentage/100.0);
	return price- discount;
}
public void display() {
	System.out.printf("Product name:%s\nID:%d\nprice:%.2f\nCategory:%s\n",name,id,price,category);
}
}
