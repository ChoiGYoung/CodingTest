class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String a ="";
        String b ="";
        
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2==0){
                a+=Integer.toString(num_list[i]);
            }else {
                b += Integer.toString(num_list[i]);
            }
        }
        
        answer = Integer.valueOf(a) + Integer.valueOf(b);
        return answer;
    }
}