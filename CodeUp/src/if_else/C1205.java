package if_else;

import java.util.Scanner;

public class C1205 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double max = 0;
		double plus = a + b;
		double minus = 0;
		if (a >= b) {
			minus = a - b;
		} else {
			minus = b - a;
		}
		double multi = a * b;
		double divi = 0;
		if (a >= b) {
			divi = a / b;
		} else {
			divi = b / a;
		}
		double ppow1 = Math.pow(a, b);
		double ppow2 = Math.pow(b, a);
		
		double arr[] = {plus, minus, multi, divi, ppow1, ppow2};
		for(int i =0; i <6; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		System.out.printf("%.6f", max);
	}

}
