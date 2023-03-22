import java.util.Scanner;

public class P2_14 {
	static final int VISION_SORT = 21; // 시력 분포 (0.0 ~ 2.0);

	static class Student {
		String name;
		int height;
		double vision;

		public Student() {
		}

		public Student(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}

	// 평균 키 구하는 메서드
	static double heightAvr(Student[] student) {
		double sum = 0;
		for (int i = 0; i < student.length; i++) {
			sum += student[i].height;
		}
		return sum / student.length;
	}

	// 시력 분포 구하는 메서드
	static void distVision(Student[] student, int[] dist) {
		dist[0] = 0;
		for (int i = 0; i < student.length; i++) {
			if (student[i].vision >= 0 && student[i].vision <= VISION_SORT / 10.0)
				dist[(int) (student[i].vision * 10)]++;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] student = {
				new Student("장원영", 173, 1.5),
				new Student("김레이", 169, 1.3),
				new Student("이현서", 165, 0.8),
				new Student("김가을", 162, 0.7),
				new Student("김채원", 164, 0.5),
				new Student("카즈하", 172, 1.2),
				new Student("김민지", 166, 0.9),
				new Student("팜하니", 161, 0.3),
				new Student("강해린", 163, 0.5)
		};
		
		int[] dist = new int[VISION_SORT];
		
		System.out.println("학생 목록");
		System.out.println("이름      키   시력");
		System.out.println("---------------------");
		
		for(int i = 0; i < student.length; i++) {
			System.out.printf("%-7s%3d%6.1f\n", student[i].name, student[i].height, student[i].vision);
		}
		
		System.out.println("\n---------------------");
		System.out.printf("평균 키: %5.1fcm\n", heightAvr(student));
		distVision(student, dist);
		
		System.out.println("---------------------");
		System.out.println("\n시력 분포");
		System.out.println("---------------------");
		
		for(int i = 0; i < VISION_SORT; i++)
			System.out.printf("%3.1f~ :%2d명\n", i / 10.0, dist[i]);
		
	}

}
