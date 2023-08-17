class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int maxIndex = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        
        answer[0] = array[maxIndex];
        answer[1] = maxIndex;
        
        return answer;
    }
}