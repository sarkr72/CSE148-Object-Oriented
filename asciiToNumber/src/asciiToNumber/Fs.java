package asciiToNumber;

public class Fs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String letters = "";
//		letters = letters + (char)(65);
//		System.out.println(letters);
		for(int i = 0; i < 5; i++) {
		int random = (int)(65 + Math.random() * 26);
		System.out.print((char)random);
		}
	}

}
