package Recursion;

import java.util.ArrayList;

public class MazePaths {
    public static void main(String[] args){

        ArrayList<String> result = printPaths(0, 0, 2, 2);
        System.out.println(result);
    }

    public static ArrayList<String> printPaths(int sr, int sc, int tr, int tc){
        if(sr==tr && sc==tc){
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }
        ArrayList<String> horizontalPath = new ArrayList<>();
        ArrayList<String> verticalPath = new ArrayList<>();
        if(sr<tr){
            horizontalPath = printPaths(sr+1, sc, tr, tc);
        }
        if(sc<tc){
            verticalPath = printPaths(sr,sc+1, tr, tc);
        }

        ArrayList<String> paths = new ArrayList<>();

        for(String i: horizontalPath){
            paths.add("h" + i);
        }

        for(String i: verticalPath){
            paths.add("v" + i);
        }

        return paths;
    }
}
