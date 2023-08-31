class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String intStr = my_string.replaceAll("[^0-9]+", " ");
        String[] numbers = intStr.trim().split(" "); // 공백을 기준으로 숫자를 분할

        for (int i = 0; i < numbers.length; i++) {
            String num = numbers[i];
            if (!num.isEmpty()) {
                answer += Integer.parseInt(num); 
            }
        }

        return answer;
    }
}