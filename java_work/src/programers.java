public class programers {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}


/**
 * @breif  홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 구하시오.
 * @details 단, 첫 번째 원소를 1번 원소라고 한다.
 * @param int Array num_list
 * @return Integer answer
 */

/**
 *
 */
class data {
    public static void main(String[] args) {
        Solution num_list = new Solution();
        int[] answer;
        int[] a;
        a = new int[]{2, 4, 6, 7, 9};
        answer = num_list.solution(a, 4);

        for (int i = 0; i < answer.length; i++) {
            System.out.println("원소배열" + answer[i]);
        }
    }
}

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        int num = 0;

        for (int i = 0; i < n; i++) {
            answer[num] = num_list[i];
            System.out.println("answer[" + num + "] = " + answer[num]);
            num++;
        }

        return answer;
    }
}

//class Solution {
//    public int solution(int[] num_list) {
//        int answer = 0;
//        int answer1 = 0;
//        int answer2 = 0;
//
//        for(int i = 1; i < num_list.length + 1; i++) {
//            System.out.println("배열 원소" + num_list[i-1]);
//            if(i % 2 != 0) {
//                answer1 += num_list[i - 1];
//            } else if (i % 2 == 0) {
//                answer2 += num_list[i - 1];
//            }
//        }
//
//        if (answer1 > answer2) {
//            answer = answer1;
//        } else if (answer1 < answer2) {
//            answer = answer2;
//        } else if (answer1 == answer2) {
//            answer = answer1;
//        }
//
//        return answer;
//    }
//}

