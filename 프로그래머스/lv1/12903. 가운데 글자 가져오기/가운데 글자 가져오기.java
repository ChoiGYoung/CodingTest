class Solution {
    public String solution(String s) {
        String answer = "";
        char[] charArr = s.toCharArray();
        if(charArr.length%2==0){
            answer += charArr[(charArr.length-1)/2];
            answer += charArr[charArr.length/2];
        }else{
            answer += charArr[(charArr.length-1)/2];
        }
        return answer;
    }
}