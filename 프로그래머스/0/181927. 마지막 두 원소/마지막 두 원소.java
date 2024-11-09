class Solution {
    public int[] solution(int[] num_list) {
        
        int[] answer = new int[num_list.length + 1];
        for(int i =0; i<num_list.length; i++){
            answer[i] = num_list[i];
        }
        int numA = num_list[num_list.length-1];
        int numB = num_list[num_list.length -2];
        if(numA > numB){
            answer[answer.length -1] = (numA - numB);
        } else {
            answer[answer.length -1] = (numA *2);
        }
        return answer;
    }
}