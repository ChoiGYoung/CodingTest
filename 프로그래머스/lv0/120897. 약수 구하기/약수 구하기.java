class Solution {
    public int[] solution(int n) {
        int count = 0; // 약수의 개수를 저장할 변수
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        
        int[] answer = new int[count]; // 약수의 개수만큼 배열을 생성
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer[index++] = i;
            }
        }
        return answer;
    }
}