
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
    
    public void deleteTree(Tree obj){
        deleteHelper(obj.root);
    }
    
    private void deleteHelper(NodeBinary node){
        if(node == null){
            
        }
        
        else{
            deleteHelper(node.getleftChild());
             deleteHelper(node.getRightChild());
        }
    }
}
