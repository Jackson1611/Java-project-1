class Department {
	private int number;
	private String name;

	Department(int number, String name) {
		this.name = name;
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	void setNumber() {
		this.number = number;
	}

	void setName() {
		this.name = name;
	}

	public String toString() {
		return name + " department";
	}
}

class Employee {
	private String name;
	private String email;
	private Department department;

	Employee(String name, String email, Department department) {
		this.name = name;
		this.email = email;
		this.department = department;
	}

	void setName() {
		this.name = name;
	}

	void setEmail() {
		this.email = email;
	}

	void setDepartment(Department department) {
		this.department = department;
	}

	public String toString() {
		return name + " (" + email + "), " + department;
	}
}

public class ObjectsCompanyProgram {
	public static void main(String[] args) {
		Department firstDepartment = new Department(10, "Sales");
		Department secondDepartment = new Department(20, "Music");

		Employee[] employeeArray = { new Employee("John Doe", "john@abc.com", firstDepartment),
				new Employee("Hank Marvin", "hank@abc.com", secondDepartment),
				new Employee("Joan Baez", "joan@abc.com", secondDepartment) };

		for (Employee employee : employeeArray) {
			System.out.println(employee);
		}

		employeeArray[0].setDepartment(secondDepartment);
		System.out.println();

		for (Employee employee : employeeArray) {
			System.out.println(employee);
		}
	}
}