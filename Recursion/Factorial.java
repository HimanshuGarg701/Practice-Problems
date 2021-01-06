package Recursion;

public class Factorial {
    public static void main(String[] args){
        System.out.println(findFactorial(5));
    }

    public static int findFactorial(int num){
        if(num==1){
            return 1;
        }else{
            return num * findFactorial(num-1);
        }
    }
}
