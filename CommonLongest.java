
package leetcode.practice;

/**
 *
 * @author Himanshu Garg
 */
public class CommonLongest {
    public static String getCommon(String x, String y){
        int[][] T = fillUp(x, y, x.length(), y.length());
        return maxStr(x, y, x.length(), y.length(), T);
    }
    
    private static int[][] fillUp(String x, String y, int s1, int s2){
        int[][] T = new int[s1+1][s2+1];
        for(int i=1; i<=s1; i++){
            for(int j=1; j<=s2; j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    T[i][j] = T[i-1][j-1] + 1;
                }else{
                    T[i][j] = Math.max(T[i-1][j], T[i][j-1]);
                }
            }
        }
        return T;
    }
    
    private static String maxStr(String x, String y, int s1, int s2, int[][] T){
        if(s1==0 || s2==0){
            return "";
        }else{
            if(x.charAt(s1-1) == y.charAt(s2-1)){
                return maxStr(x, y, s1-1, s2-1, T) + x.charAt(s1-1);
            }else{
                if(T[s1-1][s2] > T[s1][s2-1]){
                    return maxStr(x, y, s1-1, s2, T);
                }else{
                    return maxStr(x, y, s1, s2-1, T);
                }
            }
        }
    }
    
    public static void main(String[] args){
        String x = "ABCBDAB";
        String y = "BDCABA";
        
        System.out.println(getCommon(x, y));
    }
}
