import java.util.*;
class Solution {
    public List<String> solution(String my_string) {
        List<String> answer = new ArrayList<>();
        
        for(int i =0; i< my_string.length(); i++){
            answer.add(my_string.substring(i));
        }
        answer.sort(null);
        return answer;
    }
}