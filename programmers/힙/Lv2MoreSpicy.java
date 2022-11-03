package programmers.힙;

import java.util.PriorityQueue;

public class Lv2MoreSpicy {

    public static void main(String[] args) {
        int[] scoville = {1,2,3,9,10,12};
        int sol = solution(scoville,7);
        System.out.println(sol);
    }

    public static int solution(int[] scoville, int K) {
        int count = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>();   // 우선순위 큐로 힙 구현하기 (최소 힙) -> 최소값 순으로 우선순위가 결정됨

        for (int i = 0; i < scoville.length; i++) {
            queue.add(scoville[i]);
        }

//        System.out.println(queue);

        while (queue.peek() < K) {
            int minScoville = queue.poll();    // 가장 맵지 않은 음식의 스코빌 지수
            int nextScoville = queue.poll();   // 두 번째로 맵지 않은 음식의 스코빌 지수

            int mixScoville = minScoville + (nextScoville * 2);  // 섞은 음식의 스코빌 지수

            queue.add(mixScoville);    // 섞은 값을 큐에 넣음 -> 자동으로 최소값 순으로 정렬됨
            count++;

            // 모든 음식이 K 이상이 된 경우
            if (queue.peek() >= K) {
                break;
            }

            // 모든 음식을 K 이상으로 만들 수 없는 경우
            if (queue.peek() < K) {
                if (queue.size() == 1) {
                    return -1;
                }
            }
        }

        return count;
    }
}
