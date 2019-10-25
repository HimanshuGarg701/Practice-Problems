
package leetcode.practice.AddLists;
import java.util.*;
/**
 *
 * @author Himanshu Garg
 */
public class List {
    
    NodeList head = null;
    public List(){
        // Empty Constructor
    }
    
    public void add(int data){
        if(head ==null){
            head = new NodeList(data);
        }else{
            addHelper(head, data);
        }
    }
    
    private void addHelper(NodeList node, int data){
        while(node.next!=null){
            node = node.next;
        }
        node.next = new NodeList(data);
    }
    
    public void addLists(List l1, List l2){
        addLists(l1.head, l2.head);
    }
    
    private void addLists(NodeList l1, NodeList l2){
        NodeList l3 = null;
        NodeList itr = l3;
        int a = 0;
        int b = 0;
        int carry = 0;
        while(l1!=null || l2!=null){
            
            if(l1!=null){
                a = l1.data;
            }else{
                a = 0;
            }
            if(l2!=null){
                b = l2.data; 
            }else{
                b= 0;
            }
            int sum = carry + a + b;
             NodeList nod = new NodeList(sum%10);
             if(itr==null){
                 itr = nod;
             }else{
                 nod.next =  itr;
                 itr = nod;
             }
            //itr.next = new NodeList(sum%10);
            carry = sum/10;
            //itr = itr.next;
            
            if(l1!=null){
                l1 = l1.next;
            }
            if(l2!=null){
                l2 = l2.next;
            }
        }
        if(carry!=0){
            NodeList nod = new NodeList(carry);
            nod.next = itr;
            itr = nod;
            //itr = itr.next;
        }
        printHelper(itr);
    }
    
    public void print(){
        if(head!=null){
            printHelper(head);
        }
    }
    
    private void printHelper(NodeList node){
        while(node!=null){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println("");
    }
    
    public void isPlaindrome(){
        System.out.println(this.palindromeChecker(head));
    }
    
    private boolean palindromeChecker(NodeList node){
        Stack<Integer> stack = new Stack<>();
        NodeList slow = node;
        NodeList fast = node;
        while(fast!=null && fast.next!=null){
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }
        
        //Check if the list has odd number of elements
        
        if(fast!=null){
            //move one step ahed of slow
            // Ignore the middle element
            slow = slow.next;
        }
        
        while(slow!=null){
            int data = stack.pop();
            
            if(data!=slow.data){
                return false;
            }
            slow = slow.next;
        }
        return true;
    }
}
