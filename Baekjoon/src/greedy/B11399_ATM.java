package greedy;
import java.util.Arrays;
import java.util.Scanner;

public class B11399_ATM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] p = new int[N];
		int[] time = new int[N];
		int ans = 0;
		for(int i = 0; i < N; i++) {
			p[i] = sc.nextInt();
		}
		Arrays.sort(p);
		for(int i = 0; i < N; i++)  {
			for(int j = 0; j <= i; j++) {
				time[i] += p[j];
			}
		}
		for(int i = 0; i < N; i++) {
			ans += time[i];
		}
		System.out.println(ans);
	}

}
