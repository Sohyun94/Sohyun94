import java.util.Scanner;

public class B1934 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int min = 0;
		int max = 0;
		int Aa = 0;
		int Bb = 0;
		if(A > B) {
			for(int i = 0; i <= B; i++) {
				if(B % i == 0 && A % i== 0) {
					min = i;
					Aa = A / i;
					Bb = B / i;
				}
			}
		} else {
			for(int i = 0; i <= A; i++) {
				if(B % i == 0 && A % i== 0) {
					min = i;
					Aa = A / i;
					Bb = B / i;
				}
			}
		}
		System.out.println(min);
		System.out.println(min * Aa * Bb);
	}

}
