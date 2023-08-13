import java.util.*;

public class Solution {
    public int solution(int n) {
        String answer = "";
        int result = 0;
        answer=String.valueOf(n);
        for(int i=0;i<answer.length();i++){
             result += Character.getNumericValue(answer.charAt(i));
        }

        

        return result;
    }
}