
package leetcode.practice.TreeBinary;
import java.util.*;
/**
 *
 * @author Himanshu Garg
 */
public class Tree {
    
    public Tree(){
        //empty constructor
    }
    public NodeBinary root = null;
    
    public void addNode(int data){
        if(root==null){
            root = new NodeBinary(data);
        }else{
            addHelper(root, data);
        }   
    }
    
    private NodeBinary addHelper(NodeBinary node, int data){
        
        if(node==null){
            return new NodeBinary(data);
        }
        
        if(data < node.getData()){
            node.setLeftChild(addHelper(node.getleftChild(), data));
        }
        
        else if( data > node.getData()){
            node.setRightChild(addHelper(node.getRightChild(), data));
        }
        
        else{
            // Already exists
        }
        
        return node;
    }
    
    public void printTree(){
        if(root!=null){
            printHelper(root);
        }
    }
    
    
    // Inorder traversal
    private void printHelper(NodeBinary node){
        if(node!=null){
            printHelper(node.getleftChild());
            System.out.println(node.getData());
            printHelper(node.getRightChild());
        }
    } 
    
    public boolean search(int data){
        if(root==null){
            return false;
        }
        else{
            return searchHelper(root, data);
        }
    }
    
    private boolean searchHelper(NodeBinary node, int data){
        if(node==null){
            return false;
        }
        else if(data == node.getData()){
            return true;
        }
        else{
            return data < node.getData()? searchHelper(node.getleftChild(), data): searchHelper(node.getRightChild(),data);
        }
    }
    
    public void delete(int data){
        root = deleteHelper(root, data);
    }
    
    private NodeBinary deleteHelper(NodeBinary node, int data){
        if(node==null){
            return node;
        }
        else if(data<node.getData()){
            node.setLeftChild( deleteHelper(node.getleftChild(), data)); 
        }
        else if(data>node.getData()){
            node.setRightChild( deleteHelper(node.getRightChild(), data)); 
        }
        else{
            // If leaf
            if(node.getleftChild()==null && node.getRightChild()==null){
                return null;
            }
            
            // If one child only
            if(node.getleftChild()==null){
                return node.getRightChild();
            }
            
            else if(node.getRightChild()==null){
                return node.getleftChild();
            }
            
            // If two children
            else{        
                int newVal = findMin(node.getRightChild());
                node.setData(newVal);
                node.setRightChild(deleteHelper(node.getRightChild(), newVal));
            }
            
        }
        return node;
    }
    
    private int findMin(NodeBinary node){
        return node.getleftChild()==null ? node.getData() : findMin(node.getleftChild());
    }
    
    public boolean isEqual(Tree a, Tree b){
        return equalHelper(a.root, b.root);
    }
    
    private boolean equalHelper(NodeBinary a, NodeBinary b){
        if(a == null && b==null){
            return true;
        }
        return (a!=null && b!=null) && (a.getData()==b.getData()) && (equalHelper(a.getRightChild(), b.getRightChild()))
                && equalHelper(a.getleftChild(), b.getleftChild());
    }
    
    
    public void levelOrder(){
        HashMap<Integer, ArrayList<Integer>> m = new HashMap<>();
        
        levelHelper(root, 1, m);
        
        m.keySet().forEach((i) -> {
            System.out.println(m.get(i));
        });
    }
    
    public void levelHelper(NodeBinary node,int level, HashMap<Integer, ArrayList<Integer>> m){
        if(node==null){
            
        }
        else{
            if(!m.containsKey(level)){
                m.put(level, new ArrayList<>());
            }
            
            m.get(level).add(node.getData());
            
            levelHelper(node.getleftChild(), level+1, m);
            levelHelper(node.getRightChild(), level+1, m);
        }
    }
    
    public void sumTree(){
        helperSumTree(root);
    }
    
    public int helperSumTree(NodeBinary node){
        if(node==null){
            return 0;
        }
        else{
            int left = helperSumTree(node.getleftChild());
            int right = helperSumTree(node.getRightChild());
            
            int current = node.getData();
            
            node.setData(left+right);
            return node.getData() + current;
        }
    }
    
    public void checkSameTree(Tree t1, Tree t2){
        System.out.println("The fact about same tree is : " + checkSameTreeHelper(t1.root, t2.root));
    }
    
    public boolean checkSameTreeHelper(NodeBinary r1, NodeBinary r2){
        if(r1==null && r2==null){
            return true;
        }
        if(r1==null || r2 == null){
            return false;
        }
        return (r1.getData()==r2.getData()) &&
                checkSameTreeHelper(r1.getleftChild(), r2.getleftChild()) &&
                checkSameTreeHelper(r1.getRightChild(), r2.getRightChild());
    }
    ArrayList<Integer> answer = new ArrayList<>();
    public boolean rootToLeafSum(int sum){
        
        boolean present = rootToLeafHelper(root, sum);
        for(int x : answer){
            System.out.println(x);
        }
        return present;
    }
    
    private boolean rootToLeafHelper(NodeBinary node, int sum){
        if(node == null){
            
            return false;
        }
        
        if(node.getleftChild()==null  && node.getRightChild()==null){
            if(sum==node.getData()){
                answer.add(sum);
                return true;
            }else{
                return false;
            }
        }
        if(rootToLeafHelper(node.getleftChild(), sum-node.getData())){
            
            answer.add(node.getData());
            return true;
        }
        if(rootToLeafHelper(node.getRightChild(), sum-node.getData())){
            
            answer.add(node.getData());
            return true;
        }
        return false;
    }
    
    public boolean isBST(){
        return isBSThelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    private boolean isBSThelper(NodeBinary node, int min, int max){
        if(node==null){
            return true;
        }
        
        if(node.getData() >max && node.getData()<min){
            return false;
        }
        
        return (isBSThelper(node.getleftChild(), min, node.getData()) &&
                (isBSThelper(node.getRightChild(), node.getData(), max)));
    }
    
    public void levelOrderWithQueue(NodeBinary node){
        if(node==null){
            return;
        }
        Queue<NodeBinary> x = new LinkedList<>();
        x.add(node);
        while(!x.isEmpty()){
            NodeBinary n = x.poll();
            System.out.println(n.getData());
            if(n.hasLeftChild()){
                x.add(n.getleftChild());
            }
            if(n.hasRightChild()){
                x.add(n.getRightChild());
            }
        }
    }
    
    public void iterativePostOrder(NodeBinary node){
        
        if(node==null){
            return;
        }
        Stack<NodeBinary> s1 = new Stack<>();
        Stack<NodeBinary> s2 = new Stack<>();
        
        s1.push(node);
        while(!s1.isEmpty()){
            NodeBinary removed = s1.pop();
            s2.push(removed);
            if(removed.hasLeftChild()){
                s1.push(removed.getleftChild());
            }
            if(removed.hasRightChild()){
                s1.push(removed.getRightChild());
            }
        }
        while(!s2.isEmpty()){
            NodeBinary removed = s2.pop();
            System.out.println(removed.getData());
        }
    }
}
