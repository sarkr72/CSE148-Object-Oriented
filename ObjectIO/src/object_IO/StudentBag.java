package object_IO;

import java.io.Serializable;

public class StudentBag implements Serializable{
 
	private Student[] s;
	private int nElems;
	
	public StudentBag(int max) {
		s = new Student[max];
		nElems = 0;
	}
	
	public void insert(Student student) {
		s[nElems++] = student;
	}
	
	public void display() {
		for(int i = 0;  i < nElems; i++) {
			System.out.println(s[i]);
		}
	}
	
}
