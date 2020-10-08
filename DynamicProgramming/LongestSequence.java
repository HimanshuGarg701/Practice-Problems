package DynamicProgramming;

public class LongestSequence {
    public static void main(String[] args){
        String x = "abcdefg";
        String y = "adeacfg";
        int[][] matrix = new int[x.length()+1][y.length()+1];
        System.out.println("Longest sequence is: " + findLongest(x, y, matrix));
    }

    public static int findLongest(String x, String y, int[][] matrix){
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[i].length; j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    matrix[i][j] = matrix[i-1][j-1] + 1;
                }else{
                    matrix[i][j] = Math.max(matrix[i-1][j], matrix[i][j-1]);
                }
            }
        }
        return matrix[matrix.length-1][matrix[0].length-1];
    }
}
