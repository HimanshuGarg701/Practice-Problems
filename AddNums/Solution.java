/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.practice.AddNums;

/**
 *
 * @author rgarg
 */
public class Solution {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode head1 = l1;
        ListNode head2 = l2;
        ListNode node3 = new ListNode(0);
        ListNode head3 = node3;
        int a = 0;
        int b = 0;
        int carry = 0;
        int sum = 0;
        while(head1!=null || head2!=null){
            if(head1!=null){
                a = head1.val;
            }
            else{
                a = 0;
            }
            if(head2!=null){
                b = head2.val;
            }
            else{
                b = 0;
            }
            sum = carry + a + b;
            carry = sum/10;
            head3.next = new ListNode(sum%10);
            head3 = head3.next;
            if(head1!=null){
                head1 = head1.next;
            }
            if(head2!=null){
                head2 = head2.next;
            }
        }
        if(carry == 1){
            head3.next = new ListNode(1);
        }
        return node3.next;
    }
}
