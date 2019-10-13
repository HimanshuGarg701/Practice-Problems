
package ReverseNumbers;

/**
 *
 * @author Himanshu Garg
 */
public class ReverseList {
    public ListNode reverseNums(ListNode l){
        ListNode previous = null;
        ListNode head1 = l;
        ListNode next = null;
        while(head1!=null){
            next = head1.next;
            head1.next = previous;
            previous = head1;
            head1 = next;
        }
    l = previous;
    return l;
    }
}
