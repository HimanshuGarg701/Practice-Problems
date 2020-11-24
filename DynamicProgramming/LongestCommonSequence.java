package DynamicProgramming;

public class LongestCommonSequence {
    public static void main(String[] args){
        String x = "acabdea";
        String y = "abcde";

        int[][] table = new int[x.length()+1][y.length()+1];
        for(int i=0; i<table[0].length; i++){
            table[0][i] = 0;
        }

        for(int j=0; j<table.length; j++){
            table[j][0] = 0;
        }
        findLongest(table, x, y);
        System.out.println("Maximum length of sequence is: " + table[table.length-1][table[0].length-1]);
    }

    public static void findLongest(int[][] table, String x, String y){
        for(int i=1; i<table.length; i++){
            for(int j=1;j<table[0].length; j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    table[i][j] = table[i-1][j-1] + 1;
                }else{
                    table[i][j] = Math.max(table[i-1][j], table[i][j-1]);
                }
            }
        }
    }
}
