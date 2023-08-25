class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        int result = 0;
        String value = Integer.toString(num); 
        result = value.indexOf(Integer.toString(k)); 
        if(result == -1){
            answer = result;
        }else{
            answer = result+1;
        }
        return answer;
    }
}