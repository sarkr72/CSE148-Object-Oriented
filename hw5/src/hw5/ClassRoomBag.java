package hw5;

public class ClassRoomBag {

	private Classroom[] classrooms;
	private int nElems;
	
	public ClassRoomBag(int maxClassrooms) {
		classrooms = new Classroom[maxClassrooms];
	}
	
	public void insertClassroom(Classroom classroom) {
		classrooms[nElems++] = classroom;
	}
	
	public Classroom findClassroomByRoomNumber(String roomNumber) {
		for(int i = 0; i < nElems; i++) {
			return classrooms[i];
		}
		return null;
	}
	
	public Classroom removeClassroomByRoomNumber(String roomNumber) {
		int i;
		for (i = 0; i < nElems; i++) {
			if (roomNumber.contentEquals(classrooms[i].getRoomNumber())) {
				break;
			}
		}
		Classroom temp = classrooms[i];
		if (i == nElems) {
			return null;
		} else {
			for (int j = i; j < nElems - 1; j++) {
				classrooms[j] = classrooms[j + 1];
			}
		}
		return temp;
	}
	
	public void displayClassrooms() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(classrooms[i]);
			System.out.println();
		}
	}
}
