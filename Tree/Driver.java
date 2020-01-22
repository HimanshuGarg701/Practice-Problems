package Tree;

public class Driver {
    public static void main(String[] args){
        Tree x = new Tree();

        x.iterativeAdd(15);
        x.iterativeAdd(5);
        x.iterativeAdd(20);

        System.out.println("-----------Traversal using recursion----------------");
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

        x.rootToLeafSum(20);
        x.rootToLeafSum(35);
        x.rootToLeafSum(45);

        x.validBinaryTree();

        x.levelOrder();
    }
}
