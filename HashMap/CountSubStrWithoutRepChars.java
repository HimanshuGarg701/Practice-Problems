package HashMap;

import java.util.HashMap;

public class CountSubStrWithoutRepChars {
    public static void main(String[] args){
        String word = "aabcbcdbca";
        int count = 0;
        int start = 0;
        int end = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(end<word.length()){
            char getCharacter = word.charAt(end);
            if(!map.containsKey(getCharacter)){
                map.put(getCharacter, 1);
                count += end-start+1;
            }else{
                map.put(getCharacter, map.get(getCharacter)+1);
                while(start<end && word.charAt(start)!=getCharacter){
                    map.remove(start);
                    start++;
                }
                map.put(getCharacter, map.get(getCharacter)-1);
                count += end-start;
            }
            end++;
        }

        System.out.println("Number of substring with all unique characters: " + count);
    }
}
