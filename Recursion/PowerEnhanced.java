package Recursion;

public class PowerEnhanced {
    public static void main(String[] args){
        System.out.println(powerEnhanced(2, 4));
    }

    public static int powerEnhanced(int n, int p){
        if(p==0){
            return 1;
        }else{
            int subResult = powerEnhanced(n, p/2);
            int result = subResult * subResult;
            if(p%2!=0){
                result = result * n;
            }
            return result;
        }
    }
}
