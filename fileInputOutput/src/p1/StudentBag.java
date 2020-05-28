package p1;

public class StudentBag {

	private Student[] a;
	private int nElems;
	
	public StudentBag(int maxSize) {
		a = new Student[maxSize];
		nElems = 0;
	}
	public void insertStudent(Student s ) {
		a[nElems++] = s;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i ++) {
			
		}
	}
}
