import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Baekjoon1676_빅인티저사용 {
	// 시간 초과 안 나고 잘 풀렸다 신기하다

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		BigInteger num = new BigInteger("1");
		for (int i = 2; i <= n; i++) {
			num = num.multiply(BigInteger.valueOf(i));

		}
		String snum = String.valueOf(num);
		String[] strArr = snum.split("");
		int ans = 0;

		for (int i = strArr.length - 1; i >= 0; i--) {
			if (ans == 0) {
				if (strArr[i].equals("0"))
					ans++;
			} else if (ans >= 1) {
				if (strArr[i].equals("0")) {
					ans++;
				} else {
					break;
				}
			}
		}
		bw.write(ans + "");
		br.close();
		bw.flush();
		bw.close();
	}

}
