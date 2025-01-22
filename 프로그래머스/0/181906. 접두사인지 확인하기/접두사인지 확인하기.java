class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String[] prefix = new String[my_string.length()];
        for(int i=0; i<my_string.length(); i++){
            prefix[i] = my_string.substring(0,i);
        }
        for(int j=0; j< prefix.length; j++){
            if(is_prefix.equals(prefix[j])){
                answer =1;
                break;
            }
        }
        return answer;
    }
}