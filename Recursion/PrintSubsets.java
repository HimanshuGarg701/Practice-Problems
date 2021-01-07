package Recursion;

public class PrintSubsets {
    public static void main(String[] args){
        String x = "abc";
        printSubsets(x, "");
    }

    public static void printSubsets(String input, String output){
        if(input.length()==0){
            System.out.println(output);
            return;
        }

        String output1 = output;
        String output2 = output + input.charAt(0);
        String newInput = input.substring(1, input.length());
        printSubsets(newInput, output1);
        printSubsets(newInput, output2);
    }
}
