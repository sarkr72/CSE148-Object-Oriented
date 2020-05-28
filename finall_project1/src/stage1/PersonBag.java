package stage1;

public class PersonBag {

	private Person[] personArray;
	private Person[] facultyArray;
	private int nElems;
	private int counter;
	public PersonBag(int maxPersons, int max) {
		super();
		personArray = new Person[maxPersons];
		facultyArray = new Person[max];
		nElems = 0;
		counter = 0;
	}
	
	public void insertPerson(Person person) {
		personArray[nElems++] = person;
	}
	
	public void insertFaculty(Person person) {
		facultyArray[counter++] = person;
	}
	
//	public void findGpaById(String ids) {
//		for (int i = 0; i < nElems; i++) {
//			String a = String.format("%08d", i+1);
//			if (ids.contentEquals(a)) {
//				System.out.println("gpa: " + MiniStudentCourseBag.gpaArray[i]);
//			}
//		}
//	}

	public Person findPersonById(String ids) {
		for (int i = 0; i < nElems; i++) {
			String a = String.format("%08d", i+1);
			if (ids.contentEquals(a)) {
				return personArray[i];
			}
		}
		return null;
	}

	public Person removePersonById(String ids) {
		int i;
		for (i = 0; i < nElems; i++) {
			String a = String.format("%08d", i+1);
			if (ids.contentEquals(a)) {
				break;
			}
		}
		Person temp = personArray[i];
		if (i == nElems) {
			return null;
		} else {
			for (int j = i; j < nElems - 1; j++) {
				personArray[j] = personArray[j + 1];
			}
		}
		return temp;
	}

	public void displayPersons() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(personArray[i]);
			System.out.println();
		}
	}
	public void displayFaculty() {
		for (int i = 0; i < counter; i++) {
			System.out.println(facultyArray[i]);
			System.out.println();
		}
	}
}
