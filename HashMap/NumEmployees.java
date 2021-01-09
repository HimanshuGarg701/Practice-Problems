package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class NumEmployees {
    public static void main(String[] args){
        HashMap<Character, Character> employees = new HashMap<>();
        employees.put('A', 'C');
        employees.put('B', 'C');
        employees.put('C', 'F');
        employees.put('D', 'E');
        employees.put('E', 'F');
        employees.put('F', 'F');

        HashMap<Character, HashSet<Character>> tree = new HashMap<>();
        char head = '!';
        for(char i: employees.keySet()){
            char x = employees.get(i);
            if(i==employees.get(i)){
                head = i;
            }
            else if(tree.containsKey(x)){
                tree.get(x).add(i);
            }else{
                HashSet<Character> set = new HashSet<>();
                set.add(i);
                tree.put(x, set);
            }
        }
        System.out.println(head);

        HashMap<Character, Integer> result = new HashMap<>();

        findJuniors(tree, head, result);
        System.out.println(result);
        for(Character i : result.keySet()){
            System.out.println(i + " handles " + result.get(i) + " number of employees");
        }
    }

    public static int findJuniors(HashMap<Character, HashSet<Character>> tree, Character emp, HashMap<Character, Integer> result){
        if(!tree.containsKey(emp)){
            result.put(emp, 0);
            return 1;
        }

        int size = 0;
        for(Character i: tree.get(emp)){
            int res = findJuniors(tree, i, result);
            size += res;
        }
        result.put(emp, size);
        return size+1;
    }
}
