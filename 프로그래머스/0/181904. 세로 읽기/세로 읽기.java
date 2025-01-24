class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder result = new StringBuilder();
        for(int i =0; i< my_string.length(); i+=m) {
            int start = i;
            int end = Math.min(i+m, my_string.length());
            
            String row = my_string.substring(start,end);
            if(c-1 < my_string.length()){
                result.append(row.charAt(c-1));
            }
            
        }
        return result.toString();
    }
}