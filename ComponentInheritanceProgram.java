class Component {
	String id;
	String name;
	double price;

	Component(String id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;

	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	double getPrice() {
		return price;
	}

	String getId() {
		return id;
	}

}

class Frame extends Component {
	String material;

	Frame(String id, String name, String material, double price) {
		super(id, name, price);
		this.material = material;

	}

	String getMaterial() {
		return material;
	}

	public String toString() {
		return id + ": " + name + material + " frame, " + price + "euros";
	}
}

class GroupSet extends Component {
	int gear;

	GroupSet(String id, String name, int gear, double price) {
		super(id, name, price);
		this.gear = gear;
	}

	public String toString() {
		return id + ": " + name + " group set, " + gear + " gears, " + price+ "euros";
	}

	int getGears() {
		return gear;
	}
}

public class ComponentInheritanceProgram {
	public static void main(String[] args) {

		Component[] bike1 = { new Frame("F001", "SuperLight", "titanium", 1500),
				new GroupSet("GS01", "Campagnolo Record", 11, 2300) };
		Component[] bike2 = { new Frame("F002", "AluLight", "aluminium", 700),
				new GroupSet("GS02", "Shimano Ultegra", 10, 900) };
		double totalPrice = 0;

		System.out.println("--- Bike 1 ---");
		for (Component component : bike1) {
			System.out.println(component);
			totalPrice += component.getPrice();
		}
		System.out.println("Total price: " + totalPrice);

		totalPrice = 0;

		System.out.println("\n--- Bike 2 ---");
		for (Component component : bike2) {
			System.out.println(component);
			totalPrice += component.getPrice();
		}
		System.out.println("Total price: " + totalPrice);
	}
}
