package programmers.해시;

import java.util.HashMap;

public class Lv2전화번호목록 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"119", "97674223", "1195524421"}));
        System.out.println(solution(new String[]{"123","456","789"}));
        System.out.println(solution(new String[]{"12","123","1235","567","88"}));
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        // 해시맵 선언
        HashMap<String, Integer> map = new HashMap<>();

        // 해시맵에 값 넣기 (value=1로 해서 그 전화번호가 있다 정도로만 표기)
        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], 1);
        }

        // 모든 전화번호의 접두어가 해시맵에 있는지 확인
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 1; j < phone_book[i].length(); j++) {
                // 전화번호의 접두어가 map에 존재하는지 확인하기
                if (map.containsKey(phone_book[i].substring(0, j))) {   // i번째 전화번호의 처음부터 j번째까지의 substring이 있는지
                    return false;   // 있다면 false
                }
            }
        }

        // for문을 다 통과했다면 접두어가 없다는 것 == true
        return answer;
    }
}
