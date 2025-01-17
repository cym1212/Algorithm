import java.util.*;
class Solution {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i =0; i< intStrs.length; i++){
            int a = Integer.parseInt(intStrs[i].substring(s,s+l));
            if (a > k){
                answer.add(a);
            }
        }
        return answer;
    }
}