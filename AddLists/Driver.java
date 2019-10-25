
package leetcode.practice.AddLists;

/**
 *
 * @author Himanshu Garg
 */
public class Driver {
    public static void main(String[] args){
        List list1 = new List();
        List list2 = new List();
        List obj = new List();
        // Lists are in reversed order, So the numbers are originally 921 + 921
        list1.add(1);
        list1.add(2);
        list1.add(9);
        list2.add(1);
        list2.add(2);
        list2.add(9);
        
        obj.addLists(list1, list2);
        
        List list3 = new List();
        
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        list3.add(3);
        list3.add(2);
        list3.add(1);
        
        list3.isPlaindrome();
        
        List list4 = new List();
        
        list4.add(1);
        list4.add(2);
        list4.add(3);
        list4.add(4);
        list4.add(4);
        list4.add(3);
        list4.add(2);
        list4.add(1);
        
        list4.isPlaindrome();
    }
}
