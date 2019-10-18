
package leetcode.practice;

/**
 *
 * @author Himanshu GARG
 */

/*
    Replace every "a" with "dd" and remove all encounters of "b"
*/
public class RemoveAndReplace {
    public static char[] removeReplace(char[] arr){
        int size = arr.length;
        for(int i=0; i<arr.length; i++){
            if(arr[i]== 'a'){
                size++;
            }
            else if(arr[i]=='b'){
                size--;
            }
        }
        char[] answer = new char[size];
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]=='a'){
                answer[j] = 'd';
                answer[j+1] = 'd';
                j += 2;
            }
            else if(arr[i]!='b'){
                answer[j] = arr[i];
                j++;
            }
        }
        return answer;
    }
    
    public static void main(String[] args){
        char[] arr = {'a', 'b', 'd', 'e', 'f', 'a', 'a', 'b', 'c'};
        for(char x : removeReplace(arr)){
            System.out.print(x + " ");
        }
    }
}
