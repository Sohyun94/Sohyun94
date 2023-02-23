
public class SolveMed {
	static int mid(int a, int b, int c) {
		if (a >= b) {
			if (b >= c)
				return b;
			else if (a <= c)
				return a;
			else
				return b;
		} else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}
	public static void main(String[] args) {
		System.out.println(mid(1, 9, 788));
	}
}
