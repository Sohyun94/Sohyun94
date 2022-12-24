import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// long 값에 다 못 담아서 실패 조금 더 고급스러운 방법이 필요할 것 같다
public class Baekjoon1676_실패 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		long num = 1;
		for (int i = 2; i <= n; i++) {
			num = num * i;
		}
		String snum = String.valueOf(num);
		String[] strArr = snum.split("");
		int ans = 0;
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		}

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
