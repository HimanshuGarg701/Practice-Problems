package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

//Finding first negative number in every sub-array of size k
public class FirstNegative {
    public static void main(String[] args){
        int[] arr = {1,-1,2,-5, -6, 8, 9, 2, -3};
        int k = 3;
        printFirstNegatives(arr, k);
    }

    public static void printFirstNegatives(int[] arr, int k){
        List<Integer> listNegativeNumbers = new ArrayList();
        int start = 0;
        int end = 0;
        while(end<arr.length){
            if(arr[end]<0){
                listNegativeNumbers.add(arr[end]);
            }
            if(end-start+1<k){
                end++;
            }else if(end-start+1==k){
                if(listNegativeNumbers.size()>0){
                    System.out.println(listNegativeNumbers.get(0));
                }

                if(listNegativeNumbers.contains(arr[start])){
                    listNegativeNumbers.remove(new Integer(arr[start]));
                }
                start++;
                end++;
            }
        }
    }
}
