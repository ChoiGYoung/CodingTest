class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = String.valueOf(a)+String.valueOf(b);
        int abValue = Integer.valueOf(ab);
        if(abValue>=2*a*b){
            answer=abValue;
        }else{
            answer=2*a*b;
        }
        return answer;
    }
}