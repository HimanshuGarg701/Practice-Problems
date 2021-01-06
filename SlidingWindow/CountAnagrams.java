package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class CountAnagrams {
    public static void main(String[] args){
        String word = "hello";
        String checkThis = "ollheolljnsclleohl";
        Map<Character, Integer> map = new HashMap();
        for(int i=0; i<word.length(); i++){
            if(map.containsKey(word.charAt(i))){
                map.put(word.charAt(i), map.get(word.charAt(i)+1));
            }else{
                map.put(word.charAt(i), 1);
            }
        }

        countAnagrams(map, word.length(), checkThis);
    }

    public static void countAnagrams(Map<Character, Integer> map, int len, String checkThis){
        int start = 0;
        int end = 0;
        int count = map.size();
        while(end<checkThis.length()){
            if(map.containsKey(checkThis.charAt(end))){

            }
        }
    }
}
