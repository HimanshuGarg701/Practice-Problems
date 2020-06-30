package DynamicProgramming;

public class LongSubString {
    public static void main(String[] args){
        String x = "abcdaf";
        String y = "zbcdf";
        int[][] matrix = new int[x.length()+1][y.length()+1];

        findLongestSubstring(x, y, matrix);
    }

    public static void findLongestSubstring(String x, String y, int[][] matrix){
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    matrix[i][j] = matrix[i-1][j-1] + 1;
                }else{
                    matrix[i][j] = 0;
                }
            }
        }

        int max=0;
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[i].length; j++){
                max = Math.max(max, matrix[i][j]);
            }
        }

        System.out.println("The longest sub string is of length: " + max);
    }
}
