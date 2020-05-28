package hw5;

public class MiniStudentCourseInfo {
	
	private String courseNumber;
	private int numberOfCredits;
	private String letterGrade;
	private String courseStatus;
	
	public MiniStudentCourseInfo(String courseNumber, int numberOfCredits, String letterGrade, String courseStatus) {
		super();
		this.courseNumber = courseNumber;
		this.numberOfCredits = numberOfCredits;
		this.letterGrade = letterGrade;
		this.courseStatus = courseStatus;
	}

	public double convertGrade() {
		double point;
		switch (letterGrade) {
		case "A":
			point = 4.0;
			break;
		case "B_PLUS":
			point = 3.5;
			break;
		case "B":
			point = 3.0;
			break;
		case "C_PLUS":
			point = 2.5;
			break;
		case "C":
			point = 2.0;
			break;
		case "D_PLUS":
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
	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public int getNumberOfCredits() {
		return numberOfCredits;
	}

	public void setNumberOfCredits(int numberOfCredits) {
		this.numberOfCredits = numberOfCredits;
	}

	public String getLetterGrade() {
		return letterGrade;
	}

	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
	}

	public String getCourseStatus() {
		return courseStatus;
	}

	public void setCourseStatus(String courseStatus) {
		this.courseStatus = courseStatus;
	}

	@Override
	public String toString() {
		return "MiniStudentInfo [courseNumber=" + courseNumber + ", numberOfCredits=" + numberOfCredits
				+ ", letterGrade=" + letterGrade + ", courseStatus=" + courseStatus + "]";
	}
	
}
