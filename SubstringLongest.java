import java.util.ArrayList;

public class SubstringLongest {
    public static void main(String[] args){
        String x= "abcdaefb";
        findLongest(x);
    }

    public static void findLongest(String x){
        ArrayList<Character> store = new ArrayList<>();
        int i=0;
        while(i<x.length()){
            if(!store.contains(x.charAt(i))){
                store.add(x.charAt(i));
            }
        }
    }
}
