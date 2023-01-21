import java.util.ArrayList;

class Product {
	String name;
	int quantity;
	double price;

	Product(int quantity, String name, double price) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;

	}

	public int getQuantity() {
		return quantity;
	}

	public double price() {
		return price;
	}

}

class Item {
	Product product;
	int quantity;

	Item(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	Product getProduct() {
		return product;
	}

	int getQuantity() {
		return quantity;
	}

	double getSubtotal() {
		return quantity * product.price;
	}

}

class ShoppingCart {
	ArrayList<Item> itemList;
	Product product;
	int quantity;

	ShoppingCart() {
		 this.itemList = new ArrayList<Item>();
	}

	void add(Product product,int quantity) {
		
		itemList.add();
		
	}

	void remove(Product product) {
		this.itemList.remove(product);
	}

	double getTotalPrice() {
		return product.price * quantity;
	}

	public String toString() {
		return "";
	}
}

public class ObjectsShoppingCartProgram {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		Product product_1 = new Product(10, "Bicycle", 500.00);
		Product product_2 = new Product(11, "Energy bar", 1.50);
		Product product_3 = new Product(12, "Water bottle", 6.00);

		System.out.println(cart);

		cart.add(product_1, 1);
		cart.add(product_2, 5);
		cart.add(product_3, 2);
		System.out.println(cart);

		cart.remove(product_2);
		System.out.println(cart);
	}
}