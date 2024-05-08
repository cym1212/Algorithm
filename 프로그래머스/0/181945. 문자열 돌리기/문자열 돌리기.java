import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] str = new String[a.length()];
        for(int i=0; i< a.length() ; i++){
            str[i]=String.valueOf(a.charAt(i));
            System.out.println(str[i]);
        }
    }
}