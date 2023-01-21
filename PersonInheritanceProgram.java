
class Person {
	String name;

	Person(String name) {
		this.name = name;
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

}
class Student extends Person {
	private int credits = 0;

	public Student(String name) {
		super(name);
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return  "Student:" + name + ", " + credits+" credits";
	}

	 void completeCourse() {
		credits = credits + 5;
	}
}

 class Teacher extends Person {
	private double salary;

	public Teacher(String name, double salary) {
		super(name);
		this.salary = salary;
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return  "Teacher:" +name + ", salary is  " + salary;
	}
}
public class PersonInheritanceProgram {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Chris Date", 3000);
        Teacher teacher2 = new Teacher("Joe Satriani", 5000);
        Student student = new Student("Steve Vai");

        System.out.println(teacher1);
        System.out.println(teacher2);

        System.out.println(student);
        student.completeCourse();
        student.completeCourse();

        System.out.println("---");
        System.out.println(student);
    }
}

