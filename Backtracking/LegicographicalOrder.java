package Backtracking;

public class LegicographicalOrder {
    public static void main(String[] args){
        for(int i=1; i<=9; i++){
            printNumbers(i, 10000);
        }
    }

    public static void printNumbers(int i, int n){
        if(i>n){
            return;
        }

        System.out.println(i);
        for(int j=0; j<10; j++){
            printNumbers(10*i+j, n);
        }
    }
}
