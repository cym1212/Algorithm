import java.util.*;
class Solution {
    public List solution(int n) {
        List<Integer> answer = new ArrayList<>();
        do {
            answer.add(n);
            if (n > 1) { 
                if (n % 2 == 0) {
                    n = n / 2; 
                } else {
                    n = 3 * n + 1;
                }
            } else{
                break;
            }
        } while (n >0);
        return answer;
    }
}