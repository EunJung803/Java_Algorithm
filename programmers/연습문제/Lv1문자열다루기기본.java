package programmers.연습문제;

public class Lv1문자열다루기기본 {
    public boolean solution(String s) {
        boolean answer = true;

        if(s.length() != 4 && s.length() != 6) {
            return false;
        }

        for(int i=0; i<s.length(); i++) {
            int value = (int)s.charAt(i) - 48;
            if(value >= 0 && value <= 9) {
                continue;
            }
            else {
                return false;
            }
        }

        return answer;
    }
}
