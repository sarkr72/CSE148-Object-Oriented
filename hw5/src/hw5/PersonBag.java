package hw5;

public class PersonBag {

	private Person[] personArray;
	private int nElems;
	
	public PersonBag(int maxPersons) {
		super();
		personArray = new Person[maxPersons];
		nElems = 0;
	}
	
	public void insertPerson(Person person) {
		personArray[nElems++] = person;
	}
	
	public Person findPersonById(int id) {
		for (int i = 0; i < nElems; i++) {
			if (id == (personArray[i].getId())) {
				return personArray[i];
			}
		}
		return null;
	}
	
	public Person removePersonById(int id) {
		int i;
		for (i = 0; i < nElems; i++) {
			if (id == (personArray[i].getId())) {
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
		for(int i = 0; i < nElems; i++) {
			System.out.println(personArray[i]);
			System.out.println();
		}
	}
}
