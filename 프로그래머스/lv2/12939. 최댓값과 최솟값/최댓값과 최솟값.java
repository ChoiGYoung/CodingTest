import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] numbers = s.split(" "); 
        int[] intNumbers = new int[numbers.length];
        
      
        for (int i = 0; i < numbers.length; i++) {
            intNumbers[i] = Integer.valueOf(numbers[i]);
        }
        
        Arrays.sort(intNumbers);
        
       
        String minMaxString = intNumbers[0] + " " + intNumbers[intNumbers.length - 1];
        
        return minMaxString;
    }
}
