package object_IO;

import java.io.Serializable;

public class College implements Serializable{

	private StudentBag studentBag;
//	private textBookBag textBookBag;
//	private classRoomBag classRoomBag;
	
	public College(int studentBagSize) {
		studentBag = new StudentBag(studentBagSize);
	}

	public StudentBag getStudentBag() {
		return studentBag;
	}

	public void setStudentBag(StudentBag studentBag) {
		this.studentBag = studentBag;
	}
	
}
