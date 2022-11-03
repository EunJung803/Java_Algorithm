package baekjoon.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2460 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int max = 0;

        int[][] passenger = new int[10][2];    // 2차원 배열 생성 (그래프)

        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            passenger[i][0] = Integer.parseInt(st.nextToken());  // out 내리는 사람
            passenger[i][1] = Integer.parseInt(st.nextToken());  // in 타는 사람

            sum = sum - passenger[i][0] + passenger[i][1];

            if (max < sum) {
                max = sum;
            }
        }

        System.out.println(max);
    }
}