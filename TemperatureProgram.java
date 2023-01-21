class Temperatures {
	private int[] x;

	public Temperatures(int[] x) {
		this.x = x;
	}

	public double getAverage() {
		double avg = 0;
		double sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		avg = sum / x.length;
		return avg;
	}

	public String toString() {
		String out = "";
		for (int i = 0; i < x.length; i++) {
			out += x[i] + ", ";
		}

		return out;
	}
}

public class TemperatureProgram {

	public static void main(String[] args) {

		int[] a1 = { 1, 2, 3, -8 };
		int[] a2 = { 2, 3, 5, 6, 4, 2, 5, 3 };

		Temperatures t1 = new Temperatures(a1);
		Temperatures t2 = new Temperatures(a2);

		System.out.println(t1);
		System.out.println(t2);

		System.out.println(t1.getAverage());
		System.out.println(t2.getAverage());
	}
}