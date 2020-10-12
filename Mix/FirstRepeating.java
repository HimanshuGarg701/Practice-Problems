package Mix;

import java.util.ArrayList;
import java.util.List;

public class FirstRepeating {
    public static void main(String[] args){
        String x= "Hello World";
        List<Character> list = new ArrayList<>();
        for(int i=0; i<x.length(); i++){
            if(list.contains(x.charAt(i))){
                System.out.println("First repeating: " + x.charAt(i));
                break;
            }
            list.add(x.charAt(i));
        }
    }
}
