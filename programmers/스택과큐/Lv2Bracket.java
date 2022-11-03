package programmers.스택과큐;

import java.util.Stack;

public class Lv2Bracket {
    public static void main(String[] args) {
//        String s = "()))((()";
        String s = "()())";
        System.out.println(solution(s));
    }

    public static boolean solution(String s) {
        boolean answer = false;

        /*
        int left = 0, right = 0;

        ArrayList<Character> list = new ArrayList<>();

        for (int i=0; i<s.length(); i++) {
            list.add(s.charAt(i));
        }

        for (int i=0; i<list.size(); i++) {
            if (list.get(i) == '(') {
                left++;
            }
            if (list.get(i) == ')') {
                right++;
            }
        }

        if (left == right) {
            if (list.get(0) == ')') {    // 첫번째 문자
                answer = false;
            }
            if (list.get(list.size()-1) == '(') {     // 마지막 문자
                answer = false;
            }
            else {
                answer = true;
            }
        }
        */

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            }
            if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return answer;
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            return answer;
        }

        answer = true;
        return answer;
    }
}
