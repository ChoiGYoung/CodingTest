class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countp = 0;
        int county = 0;
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='p'){
                countp++;
            }else if(s.charAt(i)=='y'){
                county++;
            }
        }
        if(countp!=county){
            answer = false;
        }

       

        return answer;
    }
}