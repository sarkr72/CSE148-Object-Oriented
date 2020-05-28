package p4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiniCourseBag mcg = new MiniCourseBag(5);
		
		Course c1 = new Course("CSE148", 4.0, EnumGrades.B_PLUS);
		Course c2 = new Course("ENG101", 3.0, EnumGrades.B);
		Course c3 = new Course("MAT142", 4.0, EnumGrades.C_PLUS);
		Course c4 = new Course("SOC101", 3.0, EnumGrades.A);
		Course c5 = new Course("CHE100", 4.0, EnumGrades.C);
		
		mcg.insert(c1);
		mcg.insert(c2);
		mcg.insert(c3);
		mcg.insert(c4);
		mcg.insert(c5);
		
		System.out.println("display: " + "\n");
		mcg.display();
		
		System.out.println("\n" + "searched by course Number: " + "\n");
		Course[] courses = mcg.find(s -> {
			return s.getCourseNumber().contentEquals("ENG101");
		});
		for(Course c : courses) {
			System.out.println(c + "\n");
		}
		
		System.out.println("\n" + "searched by credits: " + "\n");
		Course[] credits = mcg.find(s -> {
			return s.getCredits() == 4.0;
		});
		for(Course d : credits) {
			System.out.println(d + "\n");
		}
		
//		try {
//			FileOutputStream fos = new FileOutputStream("CourseBag.dat");
//			ObjectOutputStream dos = new ObjectOutputStream(fos);
//			dos.writeObject(mcg);
//			dos.close();
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
			
// (s) assumes the method in interface;***
		
	GpaCalculatorIF calc = (s) -> {
		double gradePoint = 0;
		int totalCredits = 0;
		for (int i = 0; i < s.getnElems(); i++) {
			gradePoint += s.getCourses()[i].getCredits() * s.getCourses()[i].convertGrade();
			totalCredits += s.getCourses()[i].getCredits();
		}
		return gradePoint / totalCredits;
		};
	}
}