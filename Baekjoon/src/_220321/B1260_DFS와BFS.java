package _220321;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B1260_DFS와BFS {
	static int[][] graph;
	static boolean[] visit;
	//와 어렵당 ^^ 특히 큐로 구현하는 건 생각도 못 함 (풀이 참고)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //정점 개수
		int M = sc.nextInt(); //간선 개수
		int V = sc.nextInt(); //탐색 시작할 정점 번호
		graph = new int[N+1][N+1]; //1부터 시작하니까 넉넉하게 +1로
		
		for(int i = 1 ; i <= M; i++) {
			int x = sc.nextInt(); //간선이 연결하는 정점 번호
			int y = sc.nextInt();
			graph[x][y] = 1; //양방향 연결
			graph[y][x] = 1;
		}
		//dfs
		visit = new boolean[N+1];
		dfs(V);
		System.out.println();
		
		//bfs
		visit = new boolean[N+1];
		bfs(V);

	}//main
	
	//dfs 함수 구현
	public static void dfs(int V) {
		visit[V] = true; //정점에서 잘 시작했을 떼
		System.out.print(V + " "); //정점부터 방문한 점 출력
		if(V == graph.length) { //그래프 전체 길이까지 방문했음 끝
			return;
		}
		for(int i = 1; i < graph.length; i++) {
			if(graph[V][i] == 1 && visit[i] == false) {  //간선으로 연결된 데에 정점 있고 방문 안 했으면
				dfs(i);
			}
		}
	}//dfs 끝
	
	//bfs 함수 구현
	public static void bfs(int V) {
		Queue<Integer> q = new LinkedList<>();
		
		q.add(V); //quque에 시작점 넣어주기
		visit[V] = true;
		System.out.print(V + " ");
		
		while(!q.isEmpty()) { //queue가 빌 떄까지
			int tmp = q.peek();
			q.poll(); //top에서 꺼내기
			
			for(int i = 1; i < graph.length; i++) {
				if(graph[tmp][i] == 1 && visit[i] == false) { //위랑 똑같은 조건
					q.add(i); //i 큐에 넣어주기
					visit[i] = true; //방문했으면 출력
					System.out.print(i + " ");
				}
			}
		}
	} //bfs 끝

}
