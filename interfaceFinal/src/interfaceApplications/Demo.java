package interfaceApplications;

import java.util.Arrays;
import java.util.function.Predicate;

import sortArrays.Student;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students s1 = new Students("F", 2.3);
		Students s2 = new Students("B", 2.3);
		Students s3 = new Students("Z", 1.9);
		Students s4 = new Students("D", 2.9);
		
		SBag bag = new SBag(100);
		bag.insert(s1);
		bag.insert(s2);
		bag.insert(s3);
		bag.insert(s4);
		
//		Predicate<Students> predicate = (s) -> {
////			return s.getName().equals("B");
//			return s.getGpa() == 2.3;
//		};
//		Students[] matchArray = bag.find(predicate);
		
		//lamda
		
		Students[] matchArray = bag.find(s -> {
			return s.getName().contentEquals("B");
		});
		
		System.out.println(Arrays.toString(matchArray));
//		System.out.println(bag.findByName("Z"));
//		System.out.println(bag.findByGpa(3.9));
	}

}
