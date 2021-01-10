package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class MinSubStrWithAllChars {
    public static void main(String[] args){
        String x = "abcbdefcghdieeffgghhiifabcdefghi";
        String answer = "";
        HashMap<Character, Integer> freqMap = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        int minLen = 0;
        for(char i: x.toCharArray()){
            set.add(i);
        }

        int desiredChars = set.size();
        int currentChars = 0;
        int start = 0;
        int end = 0;
        while(end<x.length()){
            while(end<x.length() && currentChars<desiredChars) {
                char getCharacter = x.charAt(end);
                freqMap.put(getCharacter, freqMap.getOrDefault(getCharacter, 0) + 1);
                if(set.contains(getCharacter) && freqMap.get(getCharacter)<=1){
                    currentChars++;
                }
                end++;
            }

            while(start<end && currentChars==desiredChars){
                if(minLen==0 || minLen>end-start){
                    minLen = end-start;
                    answer = x.substring(start, end);
                }
                char getCharacter = x.charAt(start);
                int freq = freqMap.get(getCharacter);
                if(freq==1){
                    freqMap.remove(getCharacter);
                }else{
                    freqMap.put(getCharacter, freqMap.get(getCharacter)-1);
                }

                if(set.contains(getCharacter) && !freqMap.containsKey(getCharacter)){
                    currentChars--;
                }
                start++;
            }
        }
        System.out.println(answer);
        System.out.println(minLen);
    }
}
