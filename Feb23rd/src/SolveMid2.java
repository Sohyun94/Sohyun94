
public class SolveMid2 {
	static int mid(int a, int b, int c) {
		if (a >= b) {
			if (b >= c)
				return b;
			else if (c >= a)
				return a;
			else
				return c;
		} else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}
	public static void main(String[] args) {
		System.out.println(mid(2323, 333, 6666));
	}
}
