import java.util.Collection;
import java.util.HashMap;

class Course {
	String courseCode;
	String name;
	int credits;

	public Course(String courseCode, String name, int credits) {
		this.courseCode = courseCode;
		this.name = name;
		this.credits = credits;
	}

	public String getCode() {
		return courseCode;
	}

	public String getName() {
		return name;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCode(String code) {
		this.courseCode = courseCode;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return courseCode + ": " + name + ", " + credits + "cr";
	}
}

public class ObjectsCourseMapProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Course> course = new HashMap<>();

		course.put("swd1tf001", new Course("swd1tf001", "Orientation to Software Engineering", 5));
		course.put("swd4tf033", new Course("swd4tf033", "Programming 2", 5));
		course.put("swd4tf032", new Course("swd4tf032", "Programming 1", 5));

		for (String i : course.keySet()) {
			System.out.println(course.get(i));

		}
		Collection<Course> arr = course.values();
		System.out.println("---");
		for (String i : course.keySet()) {
			if (course.get(i).courseCode == "swd4tf033") {
				System.out.println(course.get(i));
			}

		}

	}

}
