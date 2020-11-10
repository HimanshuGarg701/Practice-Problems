package DynamicProgramming;

public class KnapSack {
    public static void main(String[] args){
        int[] values = {1,4,5,7,9};
        int[] weight = {1,2,3,4,5};
        int availableWeight = 7;
        int[][] table = new int[weight.length][availableWeight+1];
        for(int i=0; i<=availableWeight; i++){
            table[0][i] = 0;
        }
        findMaxProfit(values, weight, availableWeight, table);
        System.out.println("Maximum profit is: " + table[table.length-1][table[0].length-1]);
    }

    public static void findMaxProfit(int[] values, int[] weight, int maxWeight, int[][] table){
        for(int i=1; i<table.length; i++){
            for(int j=0; j<table[0].length; j++){
                if(weight[i] <= j){
                    table[i][j] = Math.max(values[i] + table[i-1][j-weight[i]], table[i-1][j]);
                }else{
                    table[i][j] = table[i-1][j];
                }
            }
        }
    }
}
