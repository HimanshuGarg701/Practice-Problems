package Tree;

public class Driver {
    public static void main(String[] args){
        Tree x = new Tree();

        x.iterativeAdd(15);
        x.iterativeAdd(5);
        x.iterativeAdd(20);

        System.out.println("-----------Traversal using recursion----------------");
        x.print();

        x.reverseTree();
        x.print();

        Tree y = new Tree();
        y.add(15);
        y.add(5);
        y.add(20);

        System.out.println("Trees are same? " + x.checkSame(x.root, y.root));

        System.out.println("-------------------Printing size of tree---------------------------");
        x.size();

        System.out.println("-------------------Height---------------------------");
        x.height();

        System.out.println("-------------------Check if root to leaf sum exists---------------------------");
        x.rootToLeafSum(20);
        x.rootToLeafSum(35);
        x.rootToLeafSum(45);

        System.out.println("-------------------Check valid BST---------------------------");
        x.validBinaryTree();

        System.out.println("-------------------Level order traversal---------------------------");
        x.levelOrder();

        x.iterativePostOrder();

        x.iterativePreorder();

        x.iterativeInOrder();
    }
}
