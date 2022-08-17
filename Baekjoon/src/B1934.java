import java.util.Scanner;

public class B1934 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int max = 1;
		int Aa = 1;
		int Bb = 1;
		if(A > B) {
			for(int i = 1; i <= B; i++) {
				if(B % i == 0 && A % i== 0) {
					max = i;
					Aa = A / i;
					Bb = B / i;
				}
			}
		} else {
			for(int i = 1; i <= A; i++) {
				if(B % i == 0 && A % i== 0) {
					max = i;
					Aa = A / i;
					Bb = B / i;
				}
			}
		}
		System.out.println(max);
		System.out.println(max * Aa * Bb);
	}

}
