package Basic100;

import java.util.Scanner;

public class C1069 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char grade = sc.next().charAt(0);
		String word = "";
		switch (grade) {
		case 65:
			word = "best!!!";
			break;
		case 66:
			word = "good!!";
			break;
		case 67:
			word = "run!";
			break;
		case 68:
			word = "slowly~";
			break;
		default:
			word = "what?";
			break;
		}
		System.out.println(word);
	}

}
