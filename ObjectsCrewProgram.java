import java.util.ArrayList;
import java.util.List;

class Sailor extends Crew {
	public String name;
	public String email;

	Sailor(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	void setEmail(String email) {
		this.email = email;
	}
	
	
}

class Crew {
	ArrayList<Sailor> sailorList;
	

	Crew() {
		sailorList = new ArrayList<Sailor>();

	}

	public void addCrewMember(Sailor sailor) {

		sailorList.add(sailor);
	}

	public String toString() {
		String x = "";
		for (int i = 0; i < sailorList.size(); i++) {
			x += sailorList.get(i).getName() + " (" + sailorList.get(i).getEmail() + ")" + "\n";
		}
		return x;}
	
}

public class ObjectsCrewProgram {
	public static void main(String[] args) {

		Sailor firstSailor = new Sailor("Frank", "frank@mail.com");
		Sailor secondSailor = new Sailor("Susan", "susan@mail.com");
		Sailor thirdSailor = new Sailor("John", "john@sailors.com");
		Sailor fourthSailor = new Sailor("Ann", "ann@sailors.com");

		Crew firstCrew = new Crew();
		Crew secondCrew = new Crew();

		firstCrew.addCrewMember(firstSailor);
		firstCrew.addCrewMember(secondSailor);
		firstCrew.addCrewMember(fourthSailor);

		secondCrew.addCrewMember(thirdSailor);
		secondCrew.addCrewMember(secondSailor);

		System.out.println("=== First crew ===\n" + firstCrew);
		System.out.println("=== Second crew ===\n" + secondCrew);

		secondSailor.setEmail("Susan@sailors.com");
		System.out.println("=== Second crew ===\n" + secondCrew);

	}

}
