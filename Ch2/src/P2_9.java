
public class P2_9 {
	public static void main(String[] args) {
		for (int i = 2; i <= 10; i++) {
			int j;
			for (j = 2; j < i; j++) {
				if (i % j == 0)
					break;
			}
			if (j == i) {
				System.out.print("소수: ");
				System.out.println(i);
			}
		}
	}
}
