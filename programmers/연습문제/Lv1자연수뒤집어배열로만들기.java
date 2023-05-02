package programmers.연습문제;

import java.util.ArrayList;

public class Lv1자연수뒤집어배열로만들기 {
    public static void main(String[] args) {
        System.out.println(solution(12345));
    }

    public static ArrayList<Integer> solution(long n) {
        ArrayList<Integer> answer = new ArrayList<>();
        String s = String.valueOf(n);

        for(int i=s.length()-1; i>=0; i--) {
            answer.add((int)s.charAt(i) - 48);
        }

        return answer;
    }
}

