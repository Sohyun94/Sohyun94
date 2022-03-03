package Basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class C1084 {
	public static void main(String[] args) throws IOException {
//		int r = sc.nextInt();
//		int g = sc.nextInt();
//		int b = sc.nextInt();
//		for (int i = 0; i < r; i++) {
//			for (int j = 0; j < g; j++) {
//				for (int k = 0; k < b; k++) {
//					System.out.println(i + " " + j + " " + k);
//				}
//			}
//		}
//		System.out.println(r*g*b);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String rgb[] = br.readLine().split(" ");
		int r = Integer.parseInt(rgb[0]);
		int g = Integer.parseInt(rgb[1]);
		int b = Integer.parseInt(rgb[2]);
		int count = r*g*b;
		
		for(int i = 0; i <r ;i ++) {
			for(int j = 0; j <g; j++) {
				for(int k = 0; k <b; k++) {
					bw.write(i+ " " + j + " " + k + "\n");
				}
			}
		}
		
		bw.write(String.valueOf(count));
		
		bw.flush();
		bw.close();
		br.close();
	}

}
