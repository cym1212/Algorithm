class Solution {
    public int solution(int[] num_list) {
        String sum1 ="", sum2="";
        for(int i =0; i<num_list.length; i ++){
            if(num_list[i] %2 !=0){
                sum1 += String.valueOf(num_list[i]);
            }else{
                sum2 += String.valueOf(num_list[i]);
            }
        }
        return Integer.valueOf(sum1) + Integer.valueOf(sum2);
    }
}