
package leetcode.practice.TreeBinary;

/**
 *
 * @author Himanshu Garg
 */
public class Driver {
    public static void main(String[] args){
        Tree obj = new Tree();
        
        obj.addNode(6);
        obj.addNode(4);
        obj.addNode(8);
        obj.addNode(3);
        obj.addNode(5);
        obj.addNode(7);
        obj.addNode(9);
        
        obj.printTree();
    }
}
