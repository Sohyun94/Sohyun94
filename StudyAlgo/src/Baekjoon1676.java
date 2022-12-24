import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 2 * 5 = 10이라서 소인수분해 했을 시 2*5를 가지고 있는지 판별하는 아주 쉬운 방법이 있었다 ^^
// 2의 개수는 늘 5의 개수보다 같거나 많기 때문에 정확히는 5를 몇 개 가지고 있는지만 세어주면 된다
public class Baekjoon1676 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int ans = 0;
		
		while(n >= 5) {
			ans += n / 5;
			n /= 5;
		}
		bw.write(String.valueOf(ans));
		br.close();
		bw.flush();
		bw.close();
	}

}
