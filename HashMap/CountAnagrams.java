package HashMap;

import java.util.HashMap;

public class CountAnagrams {
    public static void main(String[] args){
        String word = "abcbaghbacdcab";
        String minVersion = "abc";
        int count = 0;
        HashMap<Character, Integer> srcMap = new HashMap<>();
        HashMap<Character, Integer> desMap = new HashMap<>();

        for(int i=0; i<minVersion.length(); i++){
            char getCharacter = minVersion.charAt(i);
            srcMap.put(getCharacter, srcMap.getOrDefault(getCharacter, 0)+1);
        }

        for(int i=0; i<minVersion.length(); i++){
            char getCharacter = word.charAt(i);
            desMap.put(getCharacter, desMap.getOrDefault(getCharacter, 0)+1);
        }

        int start = 0;
        int end = minVersion.length();
        while(end<word.length()){
            if(compare(srcMap, desMap)){
                count++;
            }

            char endChar = word.charAt(end);
            desMap.put(endChar, desMap.getOrDefault(endChar, 0)+1);
            char getChar = word.charAt(start);
            if(desMap.get(getChar)==1){
                desMap.remove(getChar);
            }else{
                desMap.put(getChar, desMap.get(getChar)-1);
            }
            end++;
            start++;
        }
        if(compare(srcMap, desMap)){
            count++;
        }
        System.out.println(count);
    }

    public static boolean compare(HashMap<Character, Integer> srcMap, HashMap<Character, Integer> desMap){
        for(char i: srcMap.keySet()){
            if(desMap.getOrDefault(i, 0)!=srcMap.get(i)){
                return false;
            }
        }
        return true;
    }
}
