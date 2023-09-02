class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int addx = 0;
        String a = String.valueOf(x);
        for(int i=0;i<a.length();i++){
            addx += Integer.valueOf(a.charAt(i)-'0');
        }
        if(x%addx!=0){
            answer = false;
        }
        return answer;
    }
}