
package leetcode.practice.List;

/**
 *
 * @author Himanshu Garg
 */
public class Driver {
    public static void main(String[] args){
        MakeList obj = new MakeList();
        
        obj.add(11);
        obj.add(12);
        obj.add(13);
        obj.add(14);
        obj.add(5);
        obj.add(6);
        obj.add(7);
        obj.add(8);
        obj.add(9);
        obj.add(10);
        obj.add(10);
        System.out.println("__________ORIGINAL_LIST______________");
        obj.print();
        System.out.println("__________FINDING_3rd__FROM__LAST___________");
        obj.findElement(3);   // 3rd element from ths back
        System.out.println("_________SPLITTING_______________");
        obj.splitAt(9);
        System.out.println("__________REMOVING_DUPLICATE______________");
        obj.removeDuplicate();
        obj.print();
    }
}
