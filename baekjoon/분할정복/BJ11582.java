package baekjoon.분할정복;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BJ11582 {
    public static void main(String[] args) {
        // 변수 선언
        int N;      // N
        ArrayList<Integer> chickenRate = new ArrayList<>();  // N개의 치킨집의 맛의 수치 (1 5 2 4 2 9 7 3)
        int k;      // k

        // 치킨집의 개수, N 입력받기
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        // 치킨집 맛의 수치 입력받기
        for (int i = 0; i < N; i++) {
            chickenRate.add(sc.nextInt());
        }

        // 정렬을 진행 중인 회원들의 수, k 입력받기
        k = sc.nextInt();

        int index = N / k;    // N / k

        ArrayList<Integer> sortedRate = new ArrayList<>();

        // k개로 쪼개고 -> 쪼개진거 부분에서 정렬 -> 정답 리스트에 add
        int subIndex = index;
        for (int i = 0; i < N; i+=index) {
            List<Integer> temp = new ArrayList<>(chickenRate.subList(i, subIndex));     // 자르기
            Collections.sort(temp);     // 정렬하고
            sortedRate.addAll(temp);    // 정답 리스트에 쌓기

            // 다음번 subList 인덱스를 위해 계산
            subIndex += index;
        }

//        System.out.println(sortedRate);
        for (int i = 0; i < sortedRate.size(); i++) {
            System.out.printf(String.valueOf(sortedRate.get(i)) + " ");
        }
    }
}
