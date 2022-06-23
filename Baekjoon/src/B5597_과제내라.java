import java.util.Scanner;

public class B5597_과제내라 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] stu = new int[29];
		for (int i = 1; i <= 28; i++) {
			stu[i] = sc.nextInt();
		}
		int[] allStu = new int[31];
		for (int i = 1; i <= 30; i++) {
			for (int j = 1; j <= 28; j++) {
				if (i == stu[j])
					allStu[i]++;
			}
		}
		for (int i = 1; i <= 30; i++) {
			if (allStu[i] == 0)
				System.out.println(i);
		}
	}

}
