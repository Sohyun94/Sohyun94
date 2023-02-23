
public class SolveMax3 {
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if (max < b)
			max = b;
		if (max < c)
			max = c;
		if (max < d)
			max = d;
		System.out.println(max);
		return max;
	}

	public static void main(String[] args) {
		max4(2739287, 384348, 5484258, 34834834);
		max4(84759275, 7398479, 759475984, 3493749);
	}
}
