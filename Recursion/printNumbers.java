package Recursion;

public class printNumbers {
    public static void main(String[] args){
        printToN(15);
    }

    private static void printToN(int num){
        if(num == 0){
            return;
        }else{
            printToN(num-1);
            System.out.println(num);
        }
    }
}
