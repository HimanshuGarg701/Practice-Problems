package String;

public class RotatedPalindrome {
    public static void main(String[] args){
        String x = "CBAABCD";
        String y = x;
        for(int i=0; i<x.length(); i++){
            y += "" + x.charAt(i);
        }
        findPalindrome(y, y, x.length());
    }

    public static void findPalindrome(String first, String second, int len){

    }
}
