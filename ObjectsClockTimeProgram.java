import java.util.Scanner;

class ClockTime {
	private int hours;
	private int minutes;

	ClockTime() {
		hours = Integer.parseInt("00");
		minutes = Integer.parseInt("00");
	}

	void add(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
		
		if (minutes == 60) {
			hours++;
			minutes = 0;
			
		}
	}

	public String toString() {
		return hours + ":" + minutes;
	}
}

public class ObjectsClockTimeProgram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ClockTime clockTime = new ClockTime();

		System.out.print("Enter hours to add: ");
		int hours = Integer.parseInt(input.nextLine());

		while (hours >= 0) {
			System.out.print("Enter minutes to add: ");
			int minutes = Integer.parseInt(input.nextLine());

			clockTime.add(hours, minutes);
			System.out.println(clockTime + "\n");

			System.out.print("Enter hours to add: ");
			hours = Integer.parseInt(input.nextLine());
		}

		input.close();
	}
}
