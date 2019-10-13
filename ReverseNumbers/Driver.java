
package ReverseNumbers;

/**
 *
 * @author Himanshu Garg
 */
public class Driver {
    public static void main(String[] args){
        ListNode x = new ListNode(2);
        x.next = new ListNode(3);
        x.next.next = new ListNode(4);
        x.next.next.next = new ListNode(5);
        
        ReverseList k = new ReverseList();
        ListNode z = k.reverseNums(x);
        ListNode head = z;
        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
