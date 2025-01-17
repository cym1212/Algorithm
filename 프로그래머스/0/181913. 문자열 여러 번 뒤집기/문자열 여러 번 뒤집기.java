class Solution {
    public String solution(String my_string, int[][] queries) {

        StringBuilder sb = new StringBuilder(my_string);
        for(int i =0; i<queries.length; i++){
            StringBuilder rsb = new StringBuilder(sb.substring(queries[i][0], queries[i][1]+1)).reverse();
            sb.replace (queries[i][0], queries[i][1]+1, rsb.toString());
        }
        return sb.toString();
    }
}