class Solution {
    public int solution(int n) {
        int answer = 1;
        for(int i=1;i<11;i++){
          n /= i;
            if(n<=i){
                answer = i;
                break;
            }
        }
        return answer;
    }
}