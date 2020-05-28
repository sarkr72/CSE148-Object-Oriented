package p1;

public class PersonBag {

	private Person[] personArray;
	private static int nElems;
	private static String[] idArray;
	private static String[] gpaArray;
	private static int idCounters;
	private static int idCounters1;

	public PersonBag(int maxPersons) {
		super();
		personArray = new Person[maxPersons];
		nElems = 0;
		idCounters = 0;
		idCounters1 = 0;
	}

	public static void insertGpa(String s) {
		gpaArray[idCounters1++] = s;
	}

//	public static void insertId(String s) {
//		idArray[idCounters++] = s;
//	}

	public void insertPerson(Person person) {
		personArray[nElems++] = person;
	}

	public void findGpaById(String ids) {
		for (int i = 0; i < nElems; i++) {
			if (ids.contentEquals(idArray[i])) {
				System.out.println("gpa: " + gpaArray[i]);
			} else {
				System.out.println("not found");
			}
		}
	}

	public Person findPersonById(String ids) {
		for (int i = 0; i < nElems; i++) {
			if (ids.contentEquals((idArray[i]))) {
				return personArray[i];
			}
		}
		return null;
	}

	public Person removePersonById(String ids) {
		int i;
		for (i = 0; i < nElems; i++) {
			if (ids.contentEquals((idArray[i]))) {
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
}
