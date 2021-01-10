package HashMap;

import java.util.HashMap;

public class LongestSubStrWithoutRep {
    public static void main(String[] args){
        String word = "abcdefghiimn";
        char toRemove = '!';
        String answer = "";
        int maxLen = 0;
        HashMap<Character, Integer> freqMap = new HashMap<>();
        int start = 0;
        int end = 0;
        while(end < word.length()){
            char getCharacter = word.charAt(end);
            if(!freqMap.containsKey(getCharacter)){
                freqMap.put(getCharacter, 1);
                if(maxLen==0 || answer.length()<end-start+1){
                    answer = word.substring(start, end+1);
                    maxLen = end-start+1;
                }
            }else{
                freqMap.put(getCharacter, freqMap.get(getCharacter)+1);
                toRemove = getCharacter;
                while(start < end && toRemove!=word.charAt(start)){
                    freqMap.remove(word.charAt(start));
                    start++;
                }
                freqMap.put(toRemove, freqMap.get(toRemove)-1);
            }
            end++;
        }
        System.out.println("Answer string is: " + answer);
        System.out.println("Answer string is: " + maxLen);
    }
}
