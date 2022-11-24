import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon11004_시간초과 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] num = new int[N];
		StringTokenizer sr = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++)
			num[i] = Integer.parseInt(sr.nextToken());
		Arrays.sort(num);
		bw.write(num[K-1]+"\n");
		bw.flush();
		bw.close();
	}	


}
