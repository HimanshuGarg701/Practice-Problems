
package leetcode.practice;

/**
 *
 * @author Himanshu Garg
 */
public class PalindromicSequence {
    public static String findPali(String x){
        String y = new StringBuilder(x).reverse().toString();
        
        int len = x.length();
        int T[][] = lookUp(x, y, len, len);
        
        return findAns(x, y, len, len, T);
    }
    
    private static int[][] lookUp(String x, String y, int l1, int l2){
        int[][] T = new int[l1+1][l2+1];
        for(int i=1; i<=l1; i++){
            for(int j = 1; j<=l2; j++){
                if(x.charAt(i-1) == y.charAt(j-1)){
                    T[i][j] = T[i-1][j-1] + 1;
                }else{
                    T[i][j] = Math.max(T[i-1][j], T[i][j-1]);
                }
            }
        }
        return T;
    }
    
    private static String findAns(String x, String y, int l1, int l2, int T[][]){
        if(l1==0 || l2==0){
            return "";
        }else{
            if(x.charAt(l1-1) == y.charAt(l2-1)){
                return findAns(x, y, l1-1, l2-1, T) + x.charAt(l1-1);
            }else{
                if(T[l1-1][l2] > T[l1][l2-1]){
                    return findAns(x, y, l1-1, l2, T);
                }else{
                    return findAns(x, y, l1, l2-1, T);
                }
            }
        }
    }
    
    public static void main(String[] args){
        String x = "ABCDEDPC";
        
        System.out.println(findPali(x));
    }
}
