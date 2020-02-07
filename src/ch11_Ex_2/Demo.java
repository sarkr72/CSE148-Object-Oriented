package ch11_Ex_2;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("John", "12 Bell street", 
				"3473339999", "john12@aol.com");

			Student student = new Student("Mary", "100 Town Ave", "5149993333", 
				"mary100@aol.com", Student.FRESHMAN);

			Employee employee = new Employee("Mike", "34 West street", "6189999999",
				"mike80@aol.com", 910, 60000);

			Faculty faculty = new Faculty("Sue", "28 Well street", "4133333333",
				"sue28@aol.com", 101, 50000, "4pm to 6pm", "Professor");

			Staff staff = new Staff("Tom", "90 Country road", "2030000000",
				"tomcat@aol.com", 12, 65000, "Executive Assistant");
			System.out.println(person);
			System.out.println(student);
			System.out.println(employee);
			System.out.println(faculty);
			System.out.println(staff);
	}

}
