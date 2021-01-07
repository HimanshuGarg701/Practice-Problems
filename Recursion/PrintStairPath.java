package Recursion;

public class PrintStairPath {
    public static void main(String[] args){
        printPath(5, "");
    }

    public static void printPath(int stairs, String path){
        if(stairs<0){
            return;
        }else if(stairs==0){
            System.out.println(path);
            return;
        }

        printPath(stairs-1, path+"1");
        printPath(stairs-2, path+"2");
        printPath(stairs-3, path+"3");
    }
}
