class MotorVehicle implements Ownable {
	String model;

	MotorVehicle(String model) {
		this.model = model;
	}

	String getModel() {
		return model;
	}

	void setModel(String model) {
		this.model = model;
	}

	@Override
	public double getValue() {
		return 0;
	}
}

class Car extends MotorVehicle {
	double value;

	Car(String model, int value) { 
		super(model);
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	public String toString() {
		return "Car: " + model + " (value " + value + " euros)";
	}
}

class PublicBus extends MotorVehicle {
	String lineNumber;

	PublicBus(String model, String lineNumber) {
		super(model);
		this.lineNumber = lineNumber;
	}

	public String toString() {
		return "Bus: " + model + " (line" + lineNumber + ")";
	}
}

class Bicycle extends MotorVehicle {
	double value;

	Bicycle(String model, double value) {
		super(model);
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	public String toString() {
		return "Bicycle: " + model + " (value " + value + " euros)";
	}
}

interface Ownable {

	double getValue();

}

public class OwnableInterfaceProgram {
	public static void main(String[] args) {

		Car car = new Car("VW Golf", 5000);
		Bicycle bike1 = new Bicycle("Colnago C50", 520);
		Bicycle bike2 = new Bicycle("Trek 9500", 340);
		PublicBus bus1 = new PublicBus("Ebusco Coach", "10");
		PublicBus bus2 = new PublicBus("Volvo Coach", "11");

		MotorVehicle[] motorVehicles = { car, bus1, bus2 };
		Ownable[] myOwnVehicles = { car, bike1, bike2 };
		double totalValue = 0;

		System.out.println("=== All motor vehicles ===");
		for (MotorVehicle vehicle : motorVehicles) {
			System.out.println(vehicle);
		}

		System.out.println("\n=== My own vehicles ===");
		for (Ownable ownVehicle : myOwnVehicles) {
			System.out.println(ownVehicle);
			totalValue += ownVehicle.getValue();
		}
		System.out.println("-------------------------");
		System.out.println("The total value is " + totalValue + " euros.");
	}

}
