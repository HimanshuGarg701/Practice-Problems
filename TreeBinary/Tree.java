
package leetcode.practice.TreeBinary;

/**
 *
 * @author Himanshu Garg
 */
public class Tree {
    
    public Tree(){
        //empty constructor
    }
    private NodeBinary root = null;
    
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
    
    private void printHelper(NodeBinary node){
        if(node!=null){
            printHelper(node.getleftChild());
            System.out.println(node.getData());
            printHelper(node.getRightChild());
        }
    } 
}
