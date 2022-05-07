package class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B2869_달팽이는올라가고싶다_ {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// bufferedreader를 썼다 안 썼다 하니까 헷갈린다 연습해야겠다
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		int up = Integer.parseInt(st.nextToken()); // 올라가는 길이
		int down = Integer.parseInt(st.nextToken()); // 내려가는 길이
		int length = Integer.parseInt(st.nextToken()); // 나무 막대 길이
		int day = (length - down) / (up - down); // 달팽이가 막대 전부 올라가는 데 소요되는 날
		// 딱 안 떨어지면 하루 더 더해 줘야 됨 (미끄러지는 거리)
		if ((length - down) % (up - down) != 0) {
			day++;
		}
		bw.write(day + "");
		bw.flush();
		bw.close();
	}

}
