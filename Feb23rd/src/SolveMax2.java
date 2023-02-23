
public class SolveMax2 {
	static int max_3(int a, int b, int c) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		System.out.println(max);
		return max;
	}
	public static void main(String[] args) {
		max_3(108, 34, 75);
		max_3(239729, 347394723, 28372937);
	}
}
