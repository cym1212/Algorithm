class Solution {
    public int solution(int a, int b) {
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);
        String str3 = "";
        str3 = (Integer.parseInt(str1 + str2) >Integer.parseInt(str2 + str1) ) ? str1 + str2 : str2 + str1;
        
        int answer = Integer.parseInt(str3);
        return answer;
    }
}