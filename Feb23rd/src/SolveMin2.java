
public class SolveMin2 {
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if(min > b)
			min = b;
		if(min > c)
			min = c;
		if(min > d)
			min = d;
		
		System.out.println(min);
		return min;
	}
	public static void main(String[] args) {
		min4(343, -347294, 343434, -982932);
	}
}
