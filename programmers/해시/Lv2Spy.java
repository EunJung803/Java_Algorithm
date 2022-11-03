package programmers.해시;

import java.util.HashMap;

public class Lv2Spy {

    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        System.out.println(solution(clothes));
    }


    public static int solution(String[][] clothes) {

        // 종류별로 옷의 개수를 저장할 HashMap 선언
        HashMap<String, Integer> map = new HashMap<>();

        // 옷을 종류별로 구분하기 -> [옷 종류, 개수]
        for (int i = 0; i < clothes.length; i++) {
            String clothesType = clothes[i][1];  // 옷의 종류는 clothes 배열에서 [i][1] 위치에 존재한다. -> clotheType 변수에 넣어주기

            if (map.get(clothesType) == null) {  // 만약 처음 보는 종류이면
                map.put(clothesType, 1);         // 개수는 1개
            } else {  // 처음 보는 종류가 아닌, map에 이미 있는 종류라면
                map.put(clothesType, (map.get(clothesType) + 1));   // 해당 종류의 옷의 개수 +1 증가해서 업데이트
            }
        }

        int answer = 1;

        // 옷 조합의 수 구하기
        for (String c : map.keySet()) { // 옷 종류들 = key 값, 해당 종류에 대한 개수 = value 값
            answer *= (map.get(c) + 1);   // 각 종류 별 옷의 개수를 곱해나감
            // map.get(c)+1에서 +1의 이유는 아무것도 없는 경우까지 포함하여 곱해야 하는데 map에는 반영이 안되어있기 때문
        }

        answer = answer - 1; // 모든 종류를 입지 않았을 때의 경우의 수 1 제거

        return answer;
    }

}