package Mix;

public class FindDuplicate {
    public static void main(String[] args){
        int[] nums= {1,2,3,3,4,5};
        int sum = (nums.length * (nums.length-1))/2;
        int given = 0;
        for(int i:nums){
            given += i;
        }

        System.out.println("Duplicate: " + (given-sum));
    }
}