
package leetcode.practice.AddNums;

/**
 *
 * @author Himanshu Garg
 */
public class Driver {
    public static void main(String[] args){
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        
        Solution obj1 = new Solution();
        ListNode l3 = obj1.addTwoNumbers(l1, l2);
        ListNode head = l3;
        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
