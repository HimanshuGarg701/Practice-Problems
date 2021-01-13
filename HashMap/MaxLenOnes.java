package HashMap;

public class MaxLenOnes {
    public static void main(String[] args){
        int[] arr = {1,1,0,1,0,0,1,1,1,1,0,0,0};

        int count = 0;
        int k = 2;
        int maxLen = 0;
        int start = 0;
        int end = 0;
        while(end<arr.length){
            if(arr[end]==0){
                count++;
            }
            while(count>k){
                if(arr[start]==0){
                    count--;
                }
                start++;
            }
            end++;
            maxLen = Math.max(maxLen, end-start);
        }
        System.out.println("MaxLen is: " + maxLen);
    }
}
