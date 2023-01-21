import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Scanner;

class Friend {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.yyyy");
	private String nickname;
	private String name;
	private LocalDate birthday;

	Friend(String nickname, String name, LocalDate birthday) {
		this.nickname = nickname;
		this.name = name;
		this.birthday = birthday;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return nickname + ": " + name + ", born " + birthday.format(formatter);
	}
}

class ObjectsFriendMapProgram {
	static HashMap<String, Friend> friend = new HashMap<>();
	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.yyyy");
	static Scanner input = new Scanner(System.in);

	public static void addFriend() {
		String nickname;
		String name;
		LocalDate birthday;
		String date = null;
		boolean dateAccepted = false;
		System.out.println();
		System.out.print("Enter nickname: ");
		nickname = input.nextLine();

		if (friend.containsKey(nickname)) {
			System.out.println(nickname + " is already in use!");
			return;
		}

		System.out.print("Enter name: ");
		name = input.nextLine();

		while (!dateAccepted) {
			try {
				System.out.print("Enter birthdate (dd.mm.yyyy): ");
				date = input.nextLine();
				birthday = LocalDate.parse(date, formatter);
				friend.put(nickname, new Friend(nickname, name, birthday));
				dateAccepted = true;

			} catch (Exception ex) {
				System.out.println("Invalid date: " + date);
			}
		}
	}

	public static void findFriend() {
		System.out.println("");
		System.out.print("Enter nickname: ");
		String name = input.nextLine();
		if (friend.get(name) == null) {
			System.out.println(name + " not found!");
			return;
		} else {
			System.out.println(friend.get(name));
		}
	}

	public static void printFriends() {
		System.out.println("");
		for (String i : friend.keySet()) {
			System.out.println(friend.get(i));
		}
		return;
	}

	public static void deleteFriend() {
		System.out.println("");
		System.out.print("Enter nickname: ");
		String name = input.nextLine();
		if (friend.get(name) == null) {
			System.out.println(name + " not found!");
		} else {
			friend.remove(name);
			System.out.println(name + " deleted!");
		}
	}

	public static int getChoice() {
		int choice = 0;
		System.out.println("");
		boolean dataAccepted = false;
		while (!dataAccepted) {
			System.out.println("1 = Add friend | 2 = Find friend | 3 = Delete friend | 4 = Print friends | 0 = Quit");
			System.out.print("Enter choice: ");
			try {
				choice = Integer.parseInt(input.nextLine());
				dataAccepted = true;
			} catch (NumberFormatException e) {
				System.out.println("Please enter a number between 0 and 4");

			}
		}
		return choice;

	}

	public static void main(String[] args) {
		int choice = getChoice();
		while (choice != 0) {
			if (choice == 1) {
				addFriend();
			} else if (choice == 2) {
				findFriend();
			} else if (choice == 3) {
				deleteFriend();
			} else if (choice == 4) {
				printFriends();
			} else {
				System.out.println("Please enter a number between 0 and 4");
			}
			choice = getChoice();
		}

		System.out.println("Bye!");
	}

}
