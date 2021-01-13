package HashMap;

import java.util.HashMap;

public class CheckAnagramWithKChanges {
    public static void main(String[] args){
        String desWord = "abcdefbac";
        String srcWord = "abcghi";
        int k = 3;

        HashMap<Character, Integer> srcMap = new HashMap<>();
        HashMap<Character, Integer> desMap = new HashMap<>();

        for(int i=0; i<srcWord.length(); i++){
            char getCharacter = srcWord.charAt(i);
            srcMap.put(getCharacter, srcMap.getOrDefault(getCharacter, 0)+1);
        }

        for(int i=0; i<srcWord.length(); i++){
            char getCharacter = desWord.charAt(i);
            desMap.put(getCharacter, desMap.getOrDefault(getCharacter, 0)+1);
        }

        int start = 0;
        int end = srcWord.length();
        int count = 0;
        compare(srcMap, desMap, k);
        while(end<desWord.length()){
            if(compare(srcMap, desMap, k)){
                count++;
            }

            char getLast = desWord.charAt(end);
            desMap.put(getLast, desMap.getOrDefault(getLast, 0)+1);

            char getFirst = desWord.charAt(start);
            if(desMap.get(getFirst)==1){
                desMap.remove(getFirst);
            }else{
                desMap.put(getFirst, desMap.get(getFirst)-1);
            }
            end++;
            start++;
        }
        if(compare(srcMap, desMap, k)){
            count++;
        }

        System.out.println("Answer is: " + count);

    }

    public static boolean compare(HashMap<Character, Integer> srcMap, HashMap<Character, Integer> desMap, int k){
        int differences = 0;
        for(char i: srcMap.keySet()){
            if(desMap.getOrDefault(i,0)!=srcMap.get(i)){
                differences++;
            }
        }
        return differences <= k;
    }
}
