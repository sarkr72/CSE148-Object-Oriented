package ch12;

public class Demo2 {

	public static void main(String[] args) {
//		try {
			System.out.println(sum(new int[] { 1, 2, 3, 4, 15}));
//		} catch (Exception ex) {
//			ex.printStackTrace();
//			System.out.println("\n" + ex.getMessage() + "\n" + ex.toString());

//			StackTraceElement[] traceElements = ex.getStackTrace();
//			for (int i = 0; i < traceElements.length; i++) {
//				System.out.println("method " + traceElements[i].getMethodName() + " (" + traceElements[i].getClassName()
//						+ " : " + traceElements[i].getLineNumber() + " ) ");
//			}
		}
	}

	private static int sum(int[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		return result;
	}
}
