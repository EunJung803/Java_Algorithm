package baekjoon.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2460_buffer {

    public static void main(String[] args) throws IOException {
        int in, out = 0;
        int sum = 0;
        int max = 0;

        // buffer 선언
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<10; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());

            //StringTokenizer에 토큰으로 문자열을 나눠 저장했으니 변수에 넣을때는 형변환 해주기
            out = Integer.parseInt(st.nextToken());
            in = Integer.parseInt(st.nextToken());

            sum = sum - out + in;

            if(max < sum) {
                max = sum;
            }
        }

        System.out.println(max);
    }

}
