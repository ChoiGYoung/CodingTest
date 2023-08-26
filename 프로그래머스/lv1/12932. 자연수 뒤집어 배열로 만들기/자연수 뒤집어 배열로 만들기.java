class Solution {
    public int[] solution(long n) {
        String a = Long.toString(n);
        int[] answer = new int[a.length()];
        int index = 0;
        
        for(int i = a.length() - 1; i >= 0; i--) {
            answer[index++] = a.charAt(i) - '0';
        }
        
        return answer;
    }
}