package p1;

public class Demo {
// do this for lettergrades b_plus to b+
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student("Adam", Major.MATH);
		String myMajor = s1.getMajor().toString();
		String letterGrade = "B_PLUS";
		System.out.println(Helper.formatedMajor(myMajor));
		System.out.println(Helper.plusRemoval(letterGrade));
	}
	
	

}
