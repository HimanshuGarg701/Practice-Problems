package HashMap;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args){
        String wordOne = "abcdef";
        String wordTwo = "bdcefa";
        if(wordOne.length()==wordTwo.length())
            checkAnagram(wordOne, wordTwo);
    }

    public static boolean checkAnagram(String wordOne, String wordTwo){
        HashMap<Character, Integer> mapOne = new HashMap<>();
        HashMap<Character, Integer> mapTwo = new HashMap<>();

        for(char i: wordOne.toCharArray()){
            mapOne.put(i, mapOne.getOrDefault(i, 0)+1);
        }

        for(char i: wordTwo.toCharArray()){
            mapTwo.put(i, mapTwo.getOrDefault(i, 0)+1);
        }

        for(char i : mapOne.keySet()){
            if(mapTwo.getOrDefault(i, 0) != mapOne.get(i)){
                System.out.println("Not valid anagrams");
                return false;
            }
        }

        System.out.println("Valid Anagrams");
        return true;
    }
}
