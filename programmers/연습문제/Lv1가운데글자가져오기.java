package programmers.연습문제;

public class Lv1가운데글자가져오기 {
    public String solution(String s) {
        String answer = "";

        for(int i=0; i<s.length(); i++) {
            if(s.length() % 2 != 0) {
                answer += s.charAt((s.length()-1) / 2);
                break;
            }
            else {
                answer += s.charAt((s.length() / 2) - 1);
                answer += s.charAt(s.length() / 2);
                break;
            }
        }

        return answer;
    }
}
