
package leetcode.practice.List;
import java.util.*;
/**
 *
 * @author Himanshu Garg
 */
public class MakeList {
    
    NodeList head = null;
    
    public MakeList(){
        //Empty constructor
    }
    
    public void add(int data){
        if(head==null){
            head = new NodeList(data);
        }
        else{
            NodeList n = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = new NodeList(data);
        }
    }
    
    public void removeDuplicate(){
        if(head!=null){
            this.removeDuplicate(head);
        }
    }
    private void removeDuplicate(NodeList node1){
        HashSet<Integer> container = new HashSet<>();
        NodeList previous = null;
        NodeList node = node1;
        if(node==null){
            return;
        }
        else{
            while(node!=null){
                if(container.contains(node.data)){
                    previous.next = node.next;
                }
                else{
                    container.add(node.data);
                    previous = node;
                }
                node = node.next;
            }
            
        }
    }
    
    public void print(){
        if(head!=null){
            this.printHelper(head);
        }
    }
    
    private void printHelper(NodeList node1){
        NodeList node = node1;
        while(node!=null){
            System.out.println(node.data);
            node = node.next;
        }
    }
    
    // Remove Kth element from the back
    
    public void findElement(int indexLast){
        if(head!=null){
            this.findHelper(head, indexLast);
        }
    }
    
    private int findHelper(NodeList a, int index){
        if(a==null){
            return 0;
        }
        int i = findHelper(a.next, index) + 1;
        if(i==index){
            
            System.out.println(a.data);
        }
        return i;
    }
    
    public void splitAt(int data){
        NodeList h = this.splitHelper(head, data);
        printHelper(h);
    }
    
    private NodeList splitHelper(NodeList node, int data){
        NodeList start = null;
        NodeList end = null;
        NodeList first  = null;
        NodeList itr = null;
        
        while(node!=null){
            NodeList nod = new NodeList(node.data);
            if(node.data< data){
                if(start==null){
                    start = nod;
                    first = start;
                }
                else{
                    start.next = nod;
                    start = nod;
                }
            }else{
                if(end == null){
                    end = nod;
                    itr = end;
                }
                else{
                    if(itr!=null){
                        itr.next = nod;
                        itr = nod;
                    } 
                }
            }
            node = node.next;
        }
        if (start!=null){
            start.next = end;
            return first;
        }
        else if(end!=null){
            return end;
        }
       return null;     
    }
    
    public int findNlast(int x){
        NodeList fast = head;
        NodeList slow = head;
        int fastPos = 1;
        int slowPos = 1;
        while(fast!=null){
            if(fastPos-slowPos<x){
                fast = fast.next;
                fastPos++;
            }else{
                fastPos++;
                fast = fast.next;
                slowPos++;
                slow = slow.next;
            }
        }
        if(fastPos-slowPos==x){
            return slow.data;
        }
        return -1;
    }
}
