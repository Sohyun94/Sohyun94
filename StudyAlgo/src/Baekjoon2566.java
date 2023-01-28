import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon2566 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[][] arr = new int[9][9];
		int ans = Integer.MIN_VALUE;
		int ansX = 0;
		int ansY = 0;
		for(int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(ans < arr[i][j]) {
					ans = arr[i][j];
					ansX = i+1;
					ansY = j+1;
				}
			}
		}
		bw.write(String.valueOf(ans)+"\n");
		bw.write(String.valueOf(ansX)+" "+String.valueOf(ansY));
		br.close();
		bw.flush();
		bw.close();
	}

}
