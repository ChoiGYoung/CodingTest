class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        if(my_string.length()<=5&&my_string.length()>=2){
            for(int i=0;i<my_string.length();i++){
                for(int j=0;j<n;j++){
                    answer+=my_string.charAt(i);
                }
            }
        }
        
        
        return answer;
    }
}