package DynamicProgramming;

public class MinimumEdits {
    public static void main(String[] args){
        String x = "abcdef";
        String y = "azced";

        int[][] matrix = new int[x.length()+1][y.length()+1];
        for(int i=0; i<matrix[0].length; i++){
            matrix[0][i] = i;
        }
        for(int i=0; i<matrix.length; i++){
            matrix[i][0] = i;
        }

        System.out.println("Edits required: " + findEdits(matrix, x, y));
    }

    public static int findEdits(int[][] matrix, String x, String y){
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    matrix[i][j] = matrix[i-1][j-1];
                }else{
                    int min1 = Math.min(matrix[i-1][j-1], matrix[i-1][j]);
                    int min = Math.min(min1, matrix[i][j-1]);
                    matrix[i][j] = min+1;
                }
            }
        }
        return matrix[matrix.length-1][matrix[0].length-1];
    }
}
