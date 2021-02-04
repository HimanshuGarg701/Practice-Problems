package DynamicProgramming;

import java.util.Arrays;

public class UnboundedKnapSack extends Thread{

    public static int amount = 0;
    public static void main(String[] args){
        UnboundedKnapSack myThread = new UnboundedKnapSack();
        myThread.start();
        while(myThread.isAlive()){
            System.out.println("Waiting");
        }
        amount++;
        System.out.println(amount);
        amount++;
        System.out.println(amount);

    }

    public void run(){
        amount++;
    }
}
