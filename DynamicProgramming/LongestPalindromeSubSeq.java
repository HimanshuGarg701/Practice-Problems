package DynamicProgramming;

public class LongestPalindromeSubSeq {
    public static void main(String[] args){
        String x = "agbdba";
        StringBuilder z = new StringBuilder(x);
        z.reverse();
        int[][] matrix = new int[x.length()+1][x.length()+1];

        for(int i=0; i<x.length(); i++){
            matrix[i][0] = 0;
            matrix[0][i] = 0;
        }
        System.out.println("The longest palindrome subseq is: " + findLonPal(x, z.toString(), matrix));
    }

    public static int findLonPal(String x, String y, int[][] matrix){
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    matrix[i][j] = matrix[i-1][j-1]+1;
                }else{
                    matrix[i][j] = Math.max(matrix[i-1][j], matrix[i][j-1]);
                }
            }
        }
        return matrix[matrix.length-1][matrix[0].length-1];
    }
}
