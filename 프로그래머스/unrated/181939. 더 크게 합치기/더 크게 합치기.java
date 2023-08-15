class Solution {
    public int solution(int a, int b) {
        int answer ;
        String result1 = String.valueOf(a)+String.valueOf(b);
        String result2 = String.valueOf(b)+String.valueOf(a);
        if(Integer.valueOf(result1)>=Integer.valueOf(result2)){
            answer = Integer.valueOf(result1);
        }else{
            answer = Integer.valueOf(result2);
        }
        
        return answer;
    }
}