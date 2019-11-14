
package leetcode.practice.TreeBinary;

/**
 *
 * @author Himanshu Garg
 */
public class NodeBinary {
    private int data;
    private NodeBinary leftChild;
    private NodeBinary rightChild;
    
    public NodeBinary(){
        // Empty Constructor
    }
    public NodeBinary(int data){
        this(data, null, null);
    }
    
    public NodeBinary(int data, NodeBinary leftChild, NodeBinary rightChild){
        this.data= data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
    
    public void setRightChild(NodeBinary rightChild){
        this.rightChild = rightChild;
    }
    
    public NodeBinary getRightChild(){
        return rightChild;
    }
    
    public void setLeftChild(NodeBinary leftChild){
        this.leftChild = leftChild;
    }
    
    public NodeBinary getleftChild(){
        return leftChild;
    }
    
    public boolean hasLeftChild(){
        return this.leftChild !=null;
    }
    
    public boolean hasRightChild(){
        return this.rightChild != null;
    }
    
    public void setData(int data){
        this.data = data;
    }
    
    public int getData(){
        return data;
    }
    
    public int getHeight(){
        return getHeight(this);
    }
    
    public int getHeight(NodeBinary node){
        int height = 0;
        
        if(node!=null){
            height = 1 + Math.max(node.getHeight(node.getleftChild()), node.getHeight(node.getRightChild()));
        }
        return height;
    }
    
    
}
