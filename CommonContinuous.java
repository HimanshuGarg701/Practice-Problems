
package leetcode.practice;

/**
 *
 * @author Himanshu Garg
 */
public class CommonContinuous {
    public static String getSubStr(String x, String y){
        int[][] T = new int[x.length()+1][y.length()+1];
        
        int length = 0;
        int lastIndex = 0;
        
        for(int i=1; i<=x.length(); i++){
            for(int j=1; j<=y.length(); j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    T[i][j] = T[i-1][j-1] + 1;
                    if(T[i][j]>length){
                        length = T[i][j];
                        lastIndex = i;
                    }
                }
            }
        }
        return x.substring(lastIndex-length, lastIndex);
    }
    
    public static void main(String[] args){
        String x = "ABAB";
        String y = "ABAC";
        System.out.println(getSubStr(x, y));
    }
}
