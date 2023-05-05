package programmers.연습문제;

import java.util.Arrays;

public class Lv1최대공약수와최소공배수 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 12)));
        System.out.println(Arrays.toString(solution(2, 5)));
        System.out.println(Arrays.toString(solution(4, 18)));
        System.out.println(Arrays.toString(solution(6, 40)));
    }

    // 해결 코드
    public static int[] solution(int n, int m) {
        int[] answer = {0, 0};

        int gcd = 0;    // 최대공약수
        int lcm = 0;    // 최소공배수

        int max = Math.max(n, m); // a, 둘 중에 큰 수
        int min = Math.min(n, m); // b, 둘 중에 작은 수

        // 최대 공약수
        // 유클리드 호제법 : 2개의 자연수 a,b에 대해서 a를 b로 나눈 나머지를 r이라 하면 (단,a>b), a와 b의 최대공약수는 b와 r의 최대공약수와 같다.
        while(min != 0) {  // c
            int r = max % min;  // r = max 나누기 min 의 나머지
            max = min;
            min = r;
        }
        gcd = max;

        //최소 공배수 = 두수의 곱 / 최대공약수
        lcm = n * m / gcd;   // d

        answer[0] = gcd;
        answer[1] = lcm;

        return answer;
    }


    // 이전 코드
    /*
    public int[] solution(int n, int m) {
        int[] answer = {0, 0};
        int gcd = 0;
        int lcm = 0;

        if(m % n != 0) {
            // 4, 18 / 6, 40 / 공약수는 있지만 n이 최대공약수가 아닐 때
            // 2 2 9 / 2 3 20
            // 2, 5 / 공약수가 존재하지 않을 때

            int temp_n = n-1;
            int temp_m = m-1;
            for(int i=0; i<n; i++) {

            }

            if() {      // ??
                gcd = 1;
                lcm = m * n;
            }
        }
        else {
            // 3, 12 / 최대공약수가 n일때
            gcd = n;
            lcm = m;
        }

        answer[0] = gcd;
        answer[1] = lcm;

        return answer;
    }
    */
}
