package Backtracking;

public class ExecutionGame {
    public static void main(String[] args){
        System.out.println(findSurvivor(5, 3) + " survived");
    }

    public static int findSurvivor(int n, int k){
        if(n==1){
            return 0;
        }
        int a = findSurvivor(n-1, k);
        int b = (a+k)%n;
        return b;
    }
}
