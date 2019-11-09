
package leetcode.practice;
import java.util.*;
/**
 *
 * @author Himanshu Garg
 */
public class IsAnagram {
    public static void main(String[] args){
        String x = "race";
        String y = "care";
        
        System.out.println(isAnagram(x, y));
    }
    
    public static boolean isAnagram(String x, String y){
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        int len1 = x.length();
        int len2 = y.length();
        if(len1!=len2){
            return false;
        }
        else{
            for(int i=0; i<len1; i++){
                if(!map1.containsKey(x.charAt(i))){
                    map1.put(x.charAt(i), 1);
                }
                else{
                    map1.put(x.charAt(i), map1.get(x.charAt(i) + 1));
                }
                
            }
            for(int i=0; i<len2; i++){
                if(!map2.containsKey(y.charAt(i))){
                    map2.put(y.charAt(i), 1);
                }
                else{
                    map2.put(y.charAt(i), map2.get(y.charAt(i) + 1));
                }
                
            }
            
            for(char j : map1.keySet()){
                if(!map2.containsKey(j)){
                    return false;
                }else{
                    if(map1.get(j) != map2.get(j)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
