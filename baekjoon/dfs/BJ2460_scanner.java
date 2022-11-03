package baekjoon.dfs;

import java.util.Scanner;

public class BJ2460_scanner {

    public static void main(String[] args) {
        int in, out = 0;    // in = 탄사람, out = 내린사람
        int sum = 0;    // 기차에 남아있는 사람을 저장할 변수
        int max = 0;    // 기차에 사람이 가장 많을 때의 값을 저장할 변수

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<10; i++) {
            out = sc.nextInt();
            in = sc.nextInt();

            sum = sum - out + in;

            if(max < sum) {
                max = sum;
            }
        }

        System.out.println(max);
    }

}
