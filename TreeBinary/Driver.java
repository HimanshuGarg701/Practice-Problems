
package leetcode.practice.TreeBinary;

/**
 *
 * @author Himanshu Garg
 */
public class Driver {
    public static void main(String[] args){
        Tree obj = new Tree();
        Tree obj1 = new Tree();
        
        obj.addNode(10);
        obj.addNode(5);
        obj.addNode(18);
        obj.addNode(4);
        obj.addNode(6);
        obj.addNode(15);
        obj.addNode(20);
        //obj.addNode(11);
        
        obj1.addNode(6);
        obj1.addNode(4);
        obj1.addNode(8);
        obj1.addNode(3);
        obj1.addNode(5);
        obj1.addNode(7);
        obj1.addNode(9);
        //obj1.addNode(11);
        //obj.printTree();
        System.out.println("-------------------------------");
       //obj.delete(8);
//        obj.levelOrder();
//        System.out.println(obj1.isEqual(obj, obj1));
//        obj.printTree();
//        obj.sumTree();
//        obj.printTree();
//        
//        obj.checkSameTree(obj1, obj);
        //System.out.println(obj.rootToLeafSum(19));
       // System.out.println("IS BST? : -->" + obj.isBST());
       
       obj1.levelOrderWithQueue(obj1.root);
       
       System.out.println("-------------------------------");
       obj1.iterativePostOrder(obj1.root);
    }
}
