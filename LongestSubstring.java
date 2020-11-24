
import java.util.*;
/**
 *
 * @author Himanshu Garg
 */
/*
    Find the length of longest substring without repeating characters
*/
public class LongestSubstring {
    public static int findMaxLength(String word){
        int index = 0;
        int max_Length = 0;
        ArrayList<Character> holder = new ArrayList<>();  
        
        if(word.length()>0){
            while(index<word.length()){
                char character = word.charAt(index);
                if(!holder.contains(character)){
                    holder.add(character);
                }
                else{
                    int size  = holder.size();
                    for(int x = 0; x<size; x++){
                        
                        if(holder.get(0) == character){
                            holder.add(holder.get(0));
                            holder.remove(holder.get(0));
                            break;
                        }
                        holder.remove(holder.get(0)); 
                    }
                }
                index++;
                if(holder.size()>max_Length){
                    max_Length = holder.size();
                }
            }
        }
        return max_Length;
    }
    
    public static void main(String[] args){
        long startTime= System.nanoTime();
        int len = findMaxLength("abrkaabcdefghijjxxx");
        long endTime = System.nanoTime();
        System.out.println("Time Taken is : " + (endTime - startTime));
        System.out.println(len);
    }
}
