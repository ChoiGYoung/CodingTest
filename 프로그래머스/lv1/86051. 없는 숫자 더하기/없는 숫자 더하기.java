class Solution {
    public int solution(int[] numbers) {
        int totalSum = 45; 
        int arraySum = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            arraySum += numbers[i];
        }
        
        int missingSum = totalSum - arraySum;
        return missingSum;
    }
}