package p3;

public class Courses {

	private static String courseNumber;
	private int credits;
	private String letterGrade;
	private static Courses[] course;
	private static int id=0;
	
	public Courses(int max) {
		course = new Courses[max];
	}
	public Courses(String courseNubmer, int credits, String letterGrade) {
		super();
		Courses.courseNumber = courseNubmer;
		this.credits = credits;
		this.letterGrade = letterGrade;
		
	}
	public int getId() {
		return id;
	}
	public static void insertCourse(Courses courses) {
		course[id++] = courses;
	}
	public static Courses[] getCourses() {
		return course;
	}
	public double convert() {
		double point;
		switch (letterGrade) {
		case "A":
			point = 4.0;
			break;
		case "B+":
			point = 3.5;
			break;
		case "B":
			point = 3.0;
			break;
		case "C+":
			point = 2.5;
			break;
		case "C":
			point = 2.0;
			break;
		case "D+":
			point = 1.5;
			break;
		case "D":
			point = 1.0;
			break;
		case "F":
			point = 0.0;
			break;
		default:
			point = 0;
		}
		return point;
	}

	public static String getCourseNubmer() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNubmer) {
		this.courseNumber = courseNubmer;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public String getLetterGrade() {
		return letterGrade;
	}

	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
	}

	@Override
	public String toString() {
		return "Courses [courseNubmer=" + courseNumber + ", credits=" + credits + ", letterGrade=" + letterGrade + "]";
	}
}
