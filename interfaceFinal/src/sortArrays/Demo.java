package sortArrays;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student("F", 2.3);
		Student s2 = new Student("B", 3.9);
		Student s3 = new Student("Z", 1.9);
		Student s4 = new Student("D", 2.9);
		Student[] a = {s1, s2, s3, s4};
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));
	}

}
