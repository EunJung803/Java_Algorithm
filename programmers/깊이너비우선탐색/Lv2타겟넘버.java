package programmers.깊이너비우선탐색;

import java.util.Scanner;

public class Lv2타겟넘버 {
    int[] numbers;
    int target;
    int answer;

    void dfs(int index, int sum) {
        // 1. 탈출 조건
        if(index == numbers.length) {   // 마지막 노드까지 탐색했으면
            if(sum == target) {         // 현재의 sum이 target과 같은지 비교
                answer++;
            }
            return;
        }

        // 2. 수행 동작
        dfs(index+1, sum+numbers[index]);   // 현재 노드를 더하고 다음 노드를 탐색
        dfs(index+1, sum-numbers[index]);   // 현재 노드를 빼고 다음 노드를 탐색 (덧셈 작업들이 모두 끝나면 넘어온다)
    }

    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        answer = 0;

        dfs(0,0);

        return answer;
    }
}
