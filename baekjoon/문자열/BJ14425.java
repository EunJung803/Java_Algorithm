package baekjoon.문자열;

import java.util.HashMap;
import java.util.Scanner;

public class BJ14425 {

    public static void main(String[] args) {
        int N;  // N개의 줄에는 집합 S에 포함되어 있는 문자열들이 주어진다.
        int M;  // M개의 줄에는 검사해야 하는 문자열들이 주어진다.

        String str_M;   // 검사해야할 문자열을 저장할 변수
        int ans = 0;    // 정답을 저장할 변수

        // 입력 받기
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        // HashMap 선언
        HashMap<String , Integer> map = new HashMap<>();

        // N개의 줄 입력받기 (집합 S에 포함된 문자열들)
        for (int i=0; i<N; i++) {
            map.put(sc.next(), 0);      // int value는 별로 안필요해서 그냥 0으로 설정하였다.
        }

        // M개의 줄 입력 받으며 검사하기
        for (int i=0; i<M; i++) {
            str_M = sc.next();      // 우선 입력받고

            // 입력 받은게 HashMap 에 존재하는지 검사
            // 해당 key가 존재하지 않으면 null을 리턴하므로 ,
            // str_M이 map안에 있는지는 null값을 갖는지 아닌지로 검사할 수 있다.
            if(map.get(str_M) != null) {
                // null이 아니면 동일한 문자열이 존재한다는 뜻!
                ans++;
            }
        }

        // 정답 출력
        System.out.println(ans);
    }

}
