package HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class GroupAnagrams {
    public static void main(String[] args){
        String[] array = {"abbc", "aabc", "baac", "bbca", "abed", "deba", "aebd"};
        groupAnagrams(array);
    }

    public static void groupAnagrams(String[] words){
        HashMap<HashMap<Character, Integer>, ArrayList<String>> map = new HashMap<>();
        for(String word: words){
            HashMap<Character, Integer> innerMap = new HashMap<>();
            for(char i: word.toCharArray()){
                innerMap.put(i, innerMap.getOrDefault(i, 0)+1);
            }
            if(map.containsKey(innerMap)){
                map.get(innerMap).add(word);
            }else{
                ArrayList<String> list = new ArrayList<>();
                list.add(word);
                map.put(innerMap, list);
            }
        }

        System.out.println(map);
    }
}
