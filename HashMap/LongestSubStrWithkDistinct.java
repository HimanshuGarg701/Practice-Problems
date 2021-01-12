package HashMap;

import java.util.HashMap;

public class LongestSubStrWithkDistinct {
    public static void main(String[] args){
        String word = "abcdddddd";
        int k = 1;
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        int maxLen = 0;
        String answer = "";
        while(true){
            boolean flag1 = false;
            boolean flag2 = false;
            while(end<word.length()){
                flag1 = true;
                char getCharacter = word.charAt(end);
                map.put(getCharacter, map.getOrDefault(getCharacter, 0)+1);
                System.out.println(map);
                end++;
                if(map.size()==k){
                    if(maxLen < end-start){
                        maxLen = end-start;
                        answer = word.substring(start, end);
                    }
                }else if(map.size()>k){
                    break;
                }

            }

            while(start<end){
                flag2 = true;
                char getCharacter = word.charAt(start);
                System.out.println(map.get(getCharacter));
                if(map.get(getCharacter)==1){
                    System.out.println("Pre: " + map);
                    map.remove(getCharacter);
                    System.out.println("Post: " + map);
                }else{
                    map.put(getCharacter, map.get(getCharacter)-1);
                }
                start++;
                if(map.size()==k){
                    break;
                }
            }

            if(!flag1 && !flag2){
                break;
            }

        }

        System.out.println("Max len is: " + maxLen + " for the string "  + answer);
    }
}
