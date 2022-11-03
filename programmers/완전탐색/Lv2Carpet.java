package programmers.완전탐색;

import java.util.Arrays;

public class Lv2Carpet {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10, 2)));
        System.out.println(Arrays.toString(solution(8, 1)));
        System.out.println(Arrays.toString(solution(24, 24)));
    }

    public static int[] solution(int brown, int yellow) {

        int[] answer = new int[2];

        int y_garo, y_sero;     // 노란색 격자의 가로, 세로 ( 카펫 내부 )
        int b_garo, b_sero;     // 갈색 격자의 가로, 세로 ( 즉, 카펫의 외각선인 가로와 세로 길이 ) -> 최종적으로 구해야함
        int sum;

        sum = brown + yellow;   // 카펫 격자 수의 합계

        // 최종 격자 수에 대한 여러 가로와 세로의 경우의 수를 따져가며 조건에 맞는 정답 찾기
        for (int i = 1; i <= sum; i++) {
            if (sum % i == 0) { // 총 카펫의 격자 수를 나눌 때, 나누어 떨어지는 수들의 경우만 따지기

                b_sero = i;         // 갈색 격자의 세로 ( 최종 세로 후보 )
                b_garo = sum / i;   // 갈색 격자의 가로 ( 최종 가로 후보 )

                if (b_garo < b_sero) {  // 가로가 세로보다 작으면 빠져나가기 ( 가로 >= 세로 규칙 존재 )
                    break;
                }

                y_garo = b_garo - 2;    // 내부에 있는 노란 격자의 가로
                y_sero = b_sero - 2;    // 내부에 있는 노란 격자의 세로

                if (y_garo * y_sero == yellow) {
                    answer[0] = b_garo;
                    answer[1] = b_sero;
                }
            }
        }

        return answer;
    }
}
