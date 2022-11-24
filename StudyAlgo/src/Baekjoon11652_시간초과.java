import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 아마 시간 초과
public class Baekjoon11652_시간초과 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Long [] num = new Long[N];
		for(int i = 0; i < N; i++) {
			num[i] = Long.parseLong(br.readLine());
		}
		
		Arrays.sort(num);
		
		int cnt = 1;
		int maxCnt = 1;
		int maxIdx = 0;
		for(int i = 1; i < N; i++) {
			if(num[i-1] == num[i]) {
				cnt++;
			} else {
				cnt = 1;
			}
			if(maxCnt < cnt) {
				maxCnt = cnt;
				maxIdx = i;
			}
		}
		System.out.println(num[maxIdx]);

	}

}
