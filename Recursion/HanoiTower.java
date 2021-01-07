package Recursion;

public class HanoiTower {
    public static void main(String[] args){
        printTowerSteps(3, 1,2,3);
    }

    public static void printTowerSteps(int n, int t1, int t2, int t3){
        if(n==0){
            return;
        }

        printTowerSteps(n-1, t1, t3, t2);
        System.out.println(n + " " + t1 + " to " + t2);
        printTowerSteps(n-1, t3, t2, t1);
    }
}
