
package leetcode.practice;

/**
 *
 * @author Himanshu Garg
 */
public class StringSubstring {

/*
Given a string s and a string t, check if s is subsequence of t.
You may assume that there is only lower case English letters in both s and t.
t is potentially a very long (length ~= 500,000) string, and s is a short string (<=100).

A subsequence of a string is a new string which is formed from the original string by deleting some (can be none)
of the characters without disturbing the relative positions of the remaining characters.
(ie, "ace" is a subsequence of "abcde" while "aec" is not).
*/
    public static boolean isSubsequence(String s, String t) {
        String answer = "";
        int j = 0;
        if(!s.isEmpty()){
            for(int i=0; i<t.length(); i++){
                if(s.charAt(j)==t.charAt(i)){
                    answer += "" + s.charAt(j);
                    j++;
                    if(j==s.length()){
                        break;
                    }
                }
            }
        }
        if(answer.equals(s)){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isSubsequence("abc", "ahnbkic"));
    }
}
    

