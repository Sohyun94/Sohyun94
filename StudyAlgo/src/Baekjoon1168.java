import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
 
public class Baekjoon1168 {
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
 
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken()) - 1;
 
        List<Integer> list = new ArrayList<>();
 
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }
 
        int index = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i < N - 1; i++) {
            index += K;
            
            if (index >= list.size()) {
                index %= list.size();
            }
            
            sb.append(list.remove(index) + ", ");
        }
        sb.append(list.remove(0) + ">");
 
        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}