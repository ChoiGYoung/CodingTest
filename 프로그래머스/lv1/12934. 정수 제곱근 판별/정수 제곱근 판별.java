class Solution {
    public long solution(long n) {
    
        long sqrtN = (long) Math.sqrt(n);

        if (sqrtN * sqrtN == n) {
            return (sqrtN + 1) * (sqrtN + 1);
        } else {
            return -1;
        }
    }
}