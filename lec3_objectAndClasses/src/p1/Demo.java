package p1;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,2,3,4};
		int[] num2 = num; //shallow copy
		num[0] =10;
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(num2));
		int[] num3 = {1,2,3,4};
		int[] num4 = new int[num.length];
		for(int i = 0; i < num.length; i++) {
			num4[i] = num3[i]; //deep copy
		}
		num3[0] = 12;
		System.out.println(Arrays.toString(num3));
		System.out.println(Arrays.toString(num4));
	}
}