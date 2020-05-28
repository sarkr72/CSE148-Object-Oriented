package p4;

import java.io.Serializable;

public class Course implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5089702346954782160L;
	private String courseNumber;
	private double credits;
	private EnumGrades letterGrade;

	public Course(String courseNumber, double credits, EnumGrades letterGrade) {
		super();
		this.courseNumber = courseNumber;
		this.credits = credits;
		this.letterGrade = letterGrade;
	}

	public double convertGrade() {
		double point;
		switch (letterGrade) {
		case A:
			point = 4.0;
			break;
		case B_PLUS:
			point = 3.5;
			break;
		case B:
			point = 3.0;
			break;
		case C_PLUS:
			point = 2.5;
			break;
		case C:
			point = 2.0;
			break;
		case D_PLUS:
			point = 1.5;
			break;
		case D:
			point = 1.0;
			break;
		case F:
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

	public double getCredits() {
		return credits;
	}

	public void setCredits(double credits) {
		this.credits = credits;
	}

	public EnumGrades getLetterGrade() {
		return letterGrade;
	}

	public void setLetterGrade(EnumGrades letterGrade) {
		this.letterGrade = letterGrade;
	}

	@Override
	public String toString() {
		return "Course [courseNumber=" + courseNumber + ", credits=" + credits + ", Grade=" + convertGrade() + "]";
	}
}
