package Tree;

public class Driver {
    public static void main(String[] args){
        Tree x = new Tree();

        x.iterativeAdd(15);
        x.iterativeAdd(5);
        x.iterativeAdd(20);

        x.print();

        Tree y = new Tree();
        y.add(15);
        y.add(5);
        y.add(20);

        System.out.println("Trees are same? " + x.checkSame(x.root, y.root));
    }
}
