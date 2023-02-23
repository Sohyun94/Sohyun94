
public class SolveMin {
	static int min3(int a, int b, int c) {
		int min = a;
		if (min > b)
			min = b;
		if (min > c)
			min = c;
		System.out.println(min);
		return min;
	}

	public static void main(String[] args) {
		min3(29380, 39483, 34341);
		min3(8882, 12324, 882);
	}

}
