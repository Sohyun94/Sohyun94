import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon1924 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		int month = Integer.parseInt(st.nextToken());
		int day = Integer.parseInt(st.nextToken());
		String ans = "";
		if (month == 1 || month == 10) {
			switch (day % 7) {
			case 1:
				ans = "MON";
				break;
			case 2:
				ans = "TUE";
				break;
			case 3:
				ans = "WED";
				break;
			case 4:
				ans = "THU";
				break;
			case 5:
				ans = "FRI";
				break;
			case 6:
				ans = "SAT";
				break;
			case 0:
				ans = "SUN";
				break;
			}
		} else if (month == 5) {
			switch (day % 7) {
			case 1:
				ans = "TUE";
				break;
			case 2:
				ans = "WED";
				break;
			case 3:
				ans = "THU";
				break;
			case 4:
				ans = "FRI";
				break;
			case 5:
				ans = "SAT";
				break;
			case 6:
				ans = "SUN";
				break;
			case 0:
				ans = "MON";
			}
		} else if (month == 8) {
			switch (day % 7) {
			case 1:
				ans = "WED";
				break;
			case 2:
				ans = "THU";
				break;
			case 3:
				ans = "FRI";
				break;
			case 4:
				ans = "SAT";
				break;
			case 5:
				ans = "SUN";
				break;
			case 6:
				ans = "MON";
				break;
			case 0:
				ans = "TUE";
			}

		} else if (month == 2 || month == 3 || month == 11) {
			switch (day % 7) {
			case 1:
				ans = "THU";
				break;
			case 2:
				ans = "FRI";
				break;
			case 3:
				ans = "SAT";
				break;
			case 4:
				ans = "SUN";
				break;
			case 5:
				ans = "MON";
				break;
			case 6:
				ans = "TUE";
				break;
			case 0:
				ans = "WED";
			}
		} else if (month == 6) {
			switch (day % 7) {
			case 1:
				ans = "FRI";
				break;
			case 2:
				ans = "SAT";
				break;
			case 3:
				ans = "SUN";
				break;
			case 4:
				ans = "MON";
				break;
			case 5:
				ans = "TUE";
				break;
			case 6:
				ans = "WED";
				break;
			case 0:
				ans = "THU";
			}
		} else if (month == 9 || month == 12) {
			switch (day % 7) {
			case 1:
				ans = "SAT";
				break;
			case 2:
				ans = "SUN";
				break;
			case 3:
				ans = "MON";
				break;
			case 4:
				ans = "TUE";
				break;
			case 5:
				ans = "WED";
				break;
			case 6:
				ans = "THU";
				break;
			case 0:
				ans = "FRI";
			}
		} else if (month == 4 || month == 7) {
			switch (day % 7) {
			case 1:
				ans = "SUN";
				break;
			case 2:
				ans = "MON";
				break;
			case 3:
				ans = "TUE";
				break;
			case 4:
				ans = "WED";
				break;
			case 5:
				ans = "THU";
				break;
			case 6:
				ans = "FRI";
				break;
			case 0:
				ans = "SAT";
			}
		}
		bw.write(ans);
		bw.flush();
		bw.close();
	}
}
