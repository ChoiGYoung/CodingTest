import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int a = numbers[numbers.length-1]*numbers[numbers.length-2];
        int b = numbers[0]*numbers[1];
        if(a>=b){
            answer = a;
        }else{
            answer = b;
        }
        return answer;
    }
}