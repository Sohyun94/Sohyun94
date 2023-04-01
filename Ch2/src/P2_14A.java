import java.util.Scanner;

public class P2_14A {
	static final int VMAX = 21; // 시력 분포 (0.0 ~ 2.0)

	static class people {
		String name; // 이름
		int height; // 키
		double vision; // 시력

		// 생성자
		public people(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	class YMD {
		int y;
		int m;
		int d;
		
		YMD(int y, int m, int d) {
			this.y = y;
			this.m = m;
			this.d = d;
		}
	}

	// 키의 평균값
	static double aveHeight(people[] p) {
		double sum = 0;
		for (int i = 0; i < p.length; i++)
			sum += p[i].height;

		return sum / p.length;
	}

	// 시력 분포도
	static void distVision(people[] p, int[] dist) {
		dist[0] = 0;
		for (int i = 0; i < p.length; i++) {
			if (p[i].vision >= 0.0 && p[i].vision <= VMAX / 10.0) {
				dist[(int) (p[i].vision * 10)]++;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		people[] p = { new people("장원영", 173, 1.9), new people("안유진", 171, 1.7), new people("레이", 169, 1.5),
				new people("김가을", 164, 0.8), new people("이현서", 168, 0.6), new people("김지원", 170, 0.4), };

		int[] visionSort = new int[VMAX];

		System.out.println("신체 검사 리스트");
		System.out.println("이름    키    시력");
		System.out.println("------------------");

		for (int i = 0; i < p.length; i++)
			System.out.printf("%-8s%3d%5.1f\n", p[i].name, p[i].height, p[i].vision);

		System.out.printf("\n평균 키: %5.1fcm\n", aveHeight(p));

		distVision(p, visionSort);

		System.out.println("\n시력 분포");
		for (int i = 0; i < VMAX; i++) {
			System.out.printf("%3.1f~: ", i / 10.0);
			for(int j = 0; j < visionSort[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
