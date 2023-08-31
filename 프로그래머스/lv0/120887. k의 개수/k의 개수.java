class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0; 

        for (int num = i; num <= j; num++) {
            String numStr = Integer.toString(num); 
            
            
            for (int idx = 0; idx < numStr.length(); idx++) {
                if (numStr.charAt(idx) == (char)(k + '0')) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}