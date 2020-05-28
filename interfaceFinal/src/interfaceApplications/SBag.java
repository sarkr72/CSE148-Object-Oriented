package interfaceApplications;

import java.util.Arrays;
import java.util.function.Predicate;

public class SBag {

	private Students[] a;
	private int nElems;
	private int max;
	
	public SBag(int max) {
		a = new Students[max];
		this.max =max;
	}
	
	public void insert(Students s1) {
		a[nElems++] = s1;
	}
	
	public Students[] find(Predicate<Students> predicate) {
		Students[] arr = new Students[nElems];
		int matchCount = 0;
		for(int i = 0; i < nElems; i++) {
			if(predicate.test(a[i])) {
				arr[matchCount++] = a[i];
			}
		}
		return Arrays.copyOf(arr, matchCount);
		
	}
	
	//	public Students[] findByName(String name) {
//		Students[] arr = new Students[max];
//		int matchCount = 0;
//		for(int i = 0; i < nElems; i ++) {
//			if(a[i].getName().contentEquals(name)) {
//				arr[matchCount++] = a[i];
//			}
//		}
//		return Arrays.copyOf(arr, matchCount);
//	}
//	
//	public Students[] findByGpa(Double gpa) {
//		Students[] arr = new Students[max];
//		int matchCount = 0;
//		for(int i = 0; i < nElems; i ++) {
//			if(a[i].getGpa() == gpa) {
//				 arr[matchCount++] = a[i];
//			}
//		}
//		return Arrays.copyOf(arr, matchCount);
//	}
	
	public void display() {
		for(int i = 0; i <  nElems; i++) {
			System.out.println(a[i]);
		}
		System.out.println();
	}

	
	
}
