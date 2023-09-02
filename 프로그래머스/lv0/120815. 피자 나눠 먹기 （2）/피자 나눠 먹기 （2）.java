class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; ; i++) {
            if (i % n == 0 && i % 6 == 0) {
                answer = i;
                break;
            }
        }
        return answer/6;
    }
}