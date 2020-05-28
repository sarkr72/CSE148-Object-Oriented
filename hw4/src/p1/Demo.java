package p1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name n1 = new Name("Rinku", "B", "Sarkar");
		Address a1 = new Address("51", "Broadway", "NYC", "NY");
		Student s1 = new Student(n1, a1, "631-545-5412", "Computer Science", 3.6);
		
		Name n2 = new Name("John", "C", "Doe");
		Address a2 = new Address("4", "nicols rd", "Selden", "NY");
		Student s2 = new Student(n2, a2, "631-541-5412", "Biology", 3.0);
		
		Name n3 = new Name("Anthony", "D", "Aguero");
		Address a3 = new Address("56", "North County Rd", "StonyBrook", "NY");
		Student s3 = new Student(n3, a3, "631-545-4865", "Physics", 3.9);
		
		Name n4 = new Name("Mike", "A", "Tyson");
		Address a4 = new Address("5", "Railroad", "Ronkonkoma", "NY");
		Student s4 = new Student(n4, a4, "631-125-5412", "Math", 3.8);
		
		Name n5 = new Name("Brian", "K", "Smith");
		Address a5 = new Address("452", "Ocean Ave", "Ronkonkoma", "NY");
		Student s5 = new Student(n5, a5, "631-545-7894", "Physcology", 3.6);
		
		College college = new College(5);
		college.insertStudents(s1);
		college.insertStudents(s2);
		college.insertStudents(s3);
		college.insertStudents(s4);
		college.insertStudents(s5);
		
		System.out.println("removed student: " + college.removeStudentById("124"));
		System.out.println("removed student: " + college.removeStudentById("122"));
		System.out.println("searched student: " + college.searchStudentById("126"));
		college.display();
	}

}
