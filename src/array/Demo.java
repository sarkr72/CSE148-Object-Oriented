package array;
import java.util.Arrays;
public class Demo {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
				int k=1;
				int i;
				int[] a = new int[10];
				for( i = 0; i < a.length; i++) {
					a[i] = k;
					k++;
				}
				System.out.println(Arrays.toString(a));

}
}
