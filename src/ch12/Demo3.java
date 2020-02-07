package ch12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
public class Demo3 {

	public static void main(String[] args) {
		System.out.println("enter input.");
		String urlString = new Scanner(System.in).next();
		try {
			URL url = new URL(urlString);
			int count = 0;
			Scanner input = new Scanner(url.openStream());
			while(input.hasNext()) {
				String line = input.nextLine();
				count += line.length();
			}
			System.out.println("total " + count + " characters.");
		}
		catch(MalformedURLException ex){
			System.out.println("invalid url");
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
