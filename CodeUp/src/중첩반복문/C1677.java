package 중첩반복문;

import java.util.Scanner;

public class C1677 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int column = sc.nextInt();
		int row = sc.nextInt();
		for(int i = 0 ; i < row; i++) {
			for(int j = 0; j < column; j++) {
				if(i == 0 || i == row - 1) {
					if(j == 0 || j == column -1) {
						System.out.print("+");
					} else {
						System.out.print("-");
					}
				} else {
					if(j == 0) {
						System.out.print("|");
					} else if(j != column -1){
						System.out.print(" ");
					} else {
						System.out.print("|");
					}
				}
			}
			System.out.println();
		}

	}

}
