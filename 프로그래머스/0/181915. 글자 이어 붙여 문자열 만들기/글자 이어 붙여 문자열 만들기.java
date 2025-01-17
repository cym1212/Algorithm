class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        String[] my_string2 = new String[my_string.length()];
        for(int i=0; i<my_string.length();i++){
            my_string2[i] =String.valueOf(my_string.charAt(i));
        }
        for(int i =0; i< index_list.length; i++){
            answer += my_string2[index_list[i]];
        }
        return answer;
    }
}