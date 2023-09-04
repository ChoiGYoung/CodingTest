class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long totalCost = 0;

        for (int i = 1; i <= count; i++) {
            totalCost += price * i;
        }

        answer = totalCost - money;
        if(answer>0){
            answer = totalCost - money;
        }else{
            answer = 0;
        }

        return answer;
    }
}