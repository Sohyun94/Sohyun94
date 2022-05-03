package 카펫;

class Solution {
    public int[] solution(int brown, int yellow) {
        // 카펫의 가로, 새로 길이 출력
        int[] answer = new int[2];
        
        int block = brown + yellow;
        // 가로와 세로 3 이상이어야 갈색 블록이 노란색 블록을 감싼 상태가 됨
        // *** 이런 형태
        // *-*
        // ***
        // 2씩 차이 난다
        
        // 노랑 블록의 가로, 세로
        int y_w = 0;
        int y_h = 0;
        
        // 블록 전체 개수 = (노랑 블럭 가로 + 2) * (노랑 블럭 세로 + 2)
        while(block != (y_w +2) * (y_h +2)) {
            y_w++;
            y_h = 0;
            
            // 노랑 블록 개수 = 노랑 가로 * 노랑 세로
            while(yellow != y_w * y_h) {
                y_h++;
                
                // 세로 길이가 가로 길이보다 길면 중단
                if(y_h >= y_w)
                    break;
            }
        }
        answer[0] = 2 + y_w;
        answer[1] = 2 + y_h;
        return answer;
    }
}
