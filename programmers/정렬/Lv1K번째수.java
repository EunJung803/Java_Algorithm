package programmers.정렬;
import java.util.*;

public class Lv1K번째수 {

    // 테스트
    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1},{1, 7, 3}};
        System.out.println(solution(array , commands));
    }

    // 배열을 슬라이싱하는 메서드
    public static int[] getSlice(int[] array, int startIndex, int endIndex) {
        int[] slicedArray = new int[endIndex - startIndex];     // 자를 배열 init
        for (int i = 0; i < slicedArray.length; i++) {  // 기존 배열 슬라이싱하여 넣기
            slicedArray[i] = array[startIndex + i];
        }
        return slicedArray;
    }

    public static ArrayList<Integer> solution(int[] array, int[][] commands) {
        // int[] answer = {};
        ArrayList<Integer> answer = new ArrayList<>();

        int[] slice_array = {};     // 자른 배열을 담을 배열

        // array 배열의 i번째 숫자부터 j번째 숫자까지 자르고 정렬 -> k번째 숫자를 answer 배열에 담기
        int start_index;    // i번째 숫자
        int finish_index;   // j번째 숫자
        int k_index;        // k번째 숫자
        int answer_element; // 정답으로 옮겨 넣을 수

        for(int i=0; i<commands.length; i++) {
            start_index = (commands[i][0]) - 1; // i번째 수의 인덱스
            finish_index = (commands[i][1]);    // j번째 수의 인덱스
            slice_array = getSlice(array, start_index, finish_index);   // 슬라이싱

            Arrays.sort(slice_array);   // 슬라이싱 후 정렬
            k_index = (commands[i][2]) - 1;     // k번째 수의 인덱스
            answer_element = slice_array[k_index];  // 정답 추출

            answer.add(answer_element);     // answer 배열에 추가
        }

        return answer;
    }
}
