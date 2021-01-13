package HashMap;

import java.util.HashMap;

public class LongestSubstringWithAtmostKDistinct {
    public static void main(String[] args){
        String x = "abcdgiaiiaigiigiiigpqrs";
        int begin = 0;
        int start = 0;
        int end = 0;
        HashMap<Character, Integer> freqMap = new HashMap<>();
        int k=3;
        int maxLen = 0;

        while(true){
            //flags to keep track if we are grabbing and releasing products
            boolean flag1 = false;
            boolean flag2 = false;

            //loop to grab elements
            while(end<x.length()){
                flag1 = true;
                char getCharacter = x.charAt(end);
                freqMap.put(getCharacter, freqMap.getOrDefault(getCharacter, 0) + 1);
                end++;
                if(freqMap.size()>k){
                    break;
                }else{
                    if(maxLen<end-start){
                        begin = start;
                    }
                    maxLen = Math.max(maxLen, end-start);
                }
            }

            //loop to release elements
            while(start<end){
                flag2 = true;
                char getCharacter = x.charAt(start);

                if(freqMap.get(getCharacter)==1){
                    freqMap.remove(getCharacter);
                }else{
                    freqMap.put(getCharacter, freqMap.get(getCharacter)-1);
                }
                start++;
                if(freqMap.size()==k){
                    maxLen = Math.max(maxLen, end-start);
                    break;
                }

            }

            if(!flag1 && !flag2)
                break;
        }
        System.out.println("The maximum length is: " + maxLen);
        System.out.println("Answer string is: " + x.substring(begin, begin+maxLen));
    }
}
