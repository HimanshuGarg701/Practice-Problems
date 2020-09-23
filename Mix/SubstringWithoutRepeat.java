package Mix;

import java.util.ArrayList;
import java.util.List;

public class SubstringWithoutRepeat {
    public static void main(String[] args){
        String word = "abcdbeghef";
        //Longest substring without repeating characters

        List<Character> list = new ArrayList<>();
        int max = 0;
        int current = 0;
        outer: for(int i=0; i<word.length(); i++){
            if(!list.contains(word.charAt(i))){
                list.add(word.charAt(i));
                current += 1;
                max = Math.max(max, current);
            }else{

                for(int j=0; j<list.size(); j++){
                    char temp = list.get(0);
                    System.out.println(list);
                    list.remove(0);
                    System.out.println(list);
                    current -=1;
                    if(temp ==word.charAt(i)){
                        list.add(temp);
                        current += 1;
                        max = Math.max(max, current);
                        continue outer;
                    }
                }
            }
        }

        System.out.println("Max length is: " + max);
    }
}
