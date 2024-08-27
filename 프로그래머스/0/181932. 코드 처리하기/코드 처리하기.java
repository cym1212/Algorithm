class Solution {
    public String solution(String code) {
        boolean mode = false;
        String ret = "";
        
    
        for(int i =0; i<code.length(); i++){
            char currentChar = code.charAt(i);
            if(currentChar == '1'){
            mode = !mode;
            }
            else if(!mode){
                if(i % 2 ==0){
                    ret += currentChar;
                }
            }
            else{
                if(i %2 !=0){
                    ret += currentChar;
                }
            }
            
        }
        if(ret.isEmpty()){
                return "EMPTY";
            }
        return ret;
    }
}