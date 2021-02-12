import java.util.HashMap;
import java.util.Map;

public class ConvertToNumber {
    public static void main(String[] args){
        String given = "XXX";
        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int answer = 0;
        for(int i=0; i<given.length(); i++){
            char fetchCharacter = given.charAt(i);
            if(i>0 && map.get(fetchCharacter) > map.get(given.charAt(i-1))){
                answer += map.get(fetchCharacter) - (2 * map.get(given.charAt(i-1)));
            }else{
                answer += map.get(fetchCharacter);
            }
        }
        System.out.println("The answer is: " + answer);
    }
}
