package Recursion;

import java.util.ArrayList;

public class LetterCombination {
    public static void main(String[] args){
        String x = "256";
        String[] mapping = {
                "",
                "",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz",
        };

        ArrayList<String> answer = new ArrayList<>();
        findResult(x, mapping, "", 0, answer);
        for(String i: answer){
            System.out.println(i);
        }
    }

    public static void findResult(String word, String[] mapping, String current, int index, ArrayList<String> result){
        if(index==word.length()){
            result.add(current);
            return;
        }

        String letters = mapping[word.charAt(index)-'0'];

        for(int i=0; i<letters.length(); i++){
            findResult(word, mapping, current+letters.charAt(i), index+1, result);
        }
    }
}
