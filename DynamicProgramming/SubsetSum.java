package DynamicProgramming;

import java.util.Arrays;

public class SubsetSum {
    public static void main(String[] args){
        int[] arr = {2,3,7,8,9};
        int element = 11;
        boolean[][] table = new boolean[arr.length][element+1];
        for(int i=0; i<table.length; i++){
            table[i][0] = true;
        }
        for(int i=1; i<table[0].length; i++){
            if(arr[0]==i){
                table[0][i] = true;
            }else{
                table[0][i] = false;
            }
        }
        checkIfPresent(arr, element, table);
        System.out.println(table[table.length-1][table[0].length-1]);
        System.out.println(Arrays.toString(table[0]));
        System.out.println(Arrays.toString(table[1]));
        System.out.println(Arrays.toString(table[2]));
        System.out.println(Arrays.toString(table[3]));
        System.out.println(Arrays.toString(table[4]));
    }

    public static void checkIfPresent(int[] arr, int element, boolean[][] table){
        for(int i=1; i<table.length; i++){
            for(int j=1; j<table[0].length; j++){
                if(table[i-1][j]){
                    table[i][j] = true;
                }
                if(arr[i]<=j){
                    if(table[i-1][j-arr[i]]){
                        table[i][j] = true;
                    }
                }
            }
        }
    }
}
