package Recursion;

public class Power {
    public static void main(String[] args){
        System.out.println(calculatePower(2, 4));
    }

    public static int calculatePower(int n, int p){
        if(p==0){
            return 1;
        }else{
            return n * calculatePower(n, p-1);
        }
    }
}
