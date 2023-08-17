class Solution {
    public int solution(int order) {
        int answer = 0;
        String a = String.valueOf(order);
        
         for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);
            if (b == '3' || b == '6' || b == '9') {
                answer++;
            }
        }
        
        return answer;
    }
}