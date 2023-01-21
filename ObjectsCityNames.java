import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class city {
	String name;

	city(String name) {
		this.name = name;
	}
	
	String getCity(){
		return name;
	}
	
	public String toString() {
		return name ;
	}
}

public class ObjectsCityNames {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = "";
		
		ArrayList<String> cityList = new ArrayList<String>();
		while (!name.equals("quit")) {
			
			System.out.print("Enter city name: ");
			name = input.nextLine();
			if (name.equals("quit")) {
				break;
			}
			cityList.add(name.toUpperCase());
			
		}
		
		Collections.sort(cityList);
		
		
		for (int i = 0; i < cityList.size(); i++) {
			 System.out.println(cityList.get(i));
			}
		
	}
}