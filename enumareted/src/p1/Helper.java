package p1;

public class Helper {

	public static String formatedMajor(String myMajor) {
		String myFormatedMajor = "";
		myMajor = myMajor.toLowerCase();
		String[] tokens = myMajor.split("_");
		for (int i = 0; i < tokens.length; i++) {
			String str = String.valueOf(tokens[i].charAt(0)).toUpperCase();
			tokens[i] = str + tokens[i].substring(1);
			
		}
		for(int i = 0; i < tokens.length; i++) {
			myFormatedMajor +=  tokens[i] + " ";
		}
		return myFormatedMajor;
	}
	public static String plusRemoval(String letterGrade) {
		if(letterGrade.contains("_PLUS")) {
			letterGrade = letterGrade.charAt(0) + "+";
		}
		return letterGrade;
	}
}
