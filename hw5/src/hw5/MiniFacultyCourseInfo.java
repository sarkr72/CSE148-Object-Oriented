package hw5;

public class MiniFacultyCourseInfo {

	private String courseNumber;
	private String courseTitle;
	private int numberOfCredits;
	private String courseStatus; // taught or teaching

	public MiniFacultyCourseInfo(String courseNumber, String courseTitle, int numberOfCredits, String courseStatus) {
		super();
		this.courseNumber = courseNumber;
		this.courseTitle = courseTitle;
		this.numberOfCredits = numberOfCredits;
		this.courseStatus = courseStatus;
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public int getNumberOfCredits() {
		return numberOfCredits;
	}

	public void setNumberOfCredits(int numberOfCredits) {
		this.numberOfCredits = numberOfCredits;
	}

	public String getCourseStatus() {
		return courseStatus;
	}

	public void setCourseStatus(String courseStatus) {
		this.courseStatus = courseStatus;
	}

	@Override
	public String toString() {
		return "MiniFacultyCourseInfo [courseNumber=" + courseNumber + ", courseTitle=" + courseTitle
				+ ", numberOfCredits=" + numberOfCredits + ", courseStatus=" + courseStatus + "]";
	}

}
