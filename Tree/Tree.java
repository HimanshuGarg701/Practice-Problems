package Tree;

public class Tree {

    public Node root = null;

    public void add(int data){
        if(root==null){
            root = new Node(data);
        }else{
            addHelper(root, data);
        }
    }

    private Node addHelper(Node node, int data){

        if(node == null){
            return new Node(data);
        }
        else if(data < node.data){
            node.left = addHelper(node.left, data);
        }
        else{
            node.right = addHelper(node.right, data);
        }
        return node;
    }

    public void print(){
        printHelper(root);
    }

    private void printHelper(Node node) {
        if (node != null) {
            printHelper(node.left);
            System.out.println(node.data);
            printHelper(node.right);
        }
    }
}
