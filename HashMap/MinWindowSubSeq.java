package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MinWindowSubSeq {
    public static void main(String[] args){
        //Find minimum string with in s1 with all characters of s2
        String s1 = "abedcboamnpcba";
        String s2 = "abc";
        String answer = "";
        HashMap<Character, Integer> map2 = new HashMap<>();
        HashMap<Character, Integer> map1 = new HashMap<>();

        int currentStatus = 0;
        int desiredStatus = s2.length();
        for(char i: s2.toCharArray()){
            map2.put(i, map2.getOrDefault(i, 0)+1);
        }

        int start = 0;
        int end=0;
        while(end!=s1.length()){
            while(end<s1.length() && currentStatus<desiredStatus){
                char x = s1.charAt(end);
                map1.put(x, map1.getOrDefault(x,0)+1);
                if(map2.containsKey(x) && map1.get(x)<=map2.get(x)){
                    currentStatus++;
                }
                end++;
            }
            
            while(start<end && currentStatus==desiredStatus){
                String tempAnswer = s1.substring(start, end);
                if(answer.length()==0 || tempAnswer.length()<answer.length()){
                    answer = tempAnswer;

                }
                char x = s1.charAt(start);
                if(!map2.containsKey(x)){
                    map1.remove(x);
                }else{
                    int freq = map1.get(x);
                    if(freq==1){
                        map1.remove(x);
                    }else{
                        map1.put(x, map1.get(x)-1);
                    }
                }

                if(map2.containsKey(x) && !map1.containsKey(x)){
                    currentStatus--;
                }else if((map2.containsKey(x) && map1.containsKey(x)) && (map1.get(x)<map2.get(x)) ){
                    currentStatus--;
                }

                start++;
            }
        }

        System.out.println("Min len is: " + answer);
    }
}
