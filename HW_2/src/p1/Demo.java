package p1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("john doe", 12, 3.9, "631461546");
		System.out.println(s1);
		Student s2 = new Student();
		System.out.println(s2.setName("name: the rock") + "\n age: " + s2.setAge(45) + "\ngpa: " + s2.setGpa(2.5)
				+ "\nphone number: " + s2.setPhoneNumber("631651641"));

	}

}
