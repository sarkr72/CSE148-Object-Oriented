package ch9Ex13;

public class Location {

	int row = 0, column = 0;
	static double maxValue = 0;
	
	public static Location locateLargestNumber(double[][] arr) {
		Location myLocation = new Location();
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
//				arr[i][j] = j;
				if(arr[i][j] > maxValue) {
					myLocation.maxValue = arr[i][j];
					myLocation.row = i;
					myLocation.column = j;
				}
			}
		}
		return myLocation;
	}
}
