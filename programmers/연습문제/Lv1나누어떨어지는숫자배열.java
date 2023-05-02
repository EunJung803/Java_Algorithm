package programmers.연습문제;
import java.util.*;

public class Lv1나누어떨어지는숫자배열 {

    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        System.out.println(solution(arr, divisor));
    }

    public static ArrayList<Integer> solution(int[] arr, int divisor) {
//        int[] answer = {};
         ArrayList<Integer> ans_arraylist = new ArrayList<>();

         Arrays.sort(arr);

        for(int i=0; i<arr.length; i++) {
            if(arr[i] % divisor == 0) {
                ans_arraylist.add(arr[i]);
            }
        }

        if(ans_arraylist.size() == 0) {
            ans_arraylist.add(-1);
        }

        System.out.println(ans_arraylist);

        return ans_arraylist;
    }

}