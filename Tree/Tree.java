package Tree;

import java.lang.reflect.Array;
import java.util.*;

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

    public boolean checkSame(Node root1, Node root2){
        if(root==null && root2==null){
            return true;
        }
        if(root1==null || root==null){
            return false;
        }

        return root1.data==root2.data && checkSame(root1.left, root2.left) && checkSame(root1.right, root2.right);
    }

    public void size(){
        int sizeOfTree = sizeHelper(root);
        System.out.println("Size of tree is: " + sizeOfTree);
    }

    public int sizeHelper(Node node){
        if(node==null){
            return 0;
        }else{
            int left = sizeHelper(node.left);
            int right = sizeHelper(node.right);
            return left+right+1;
        }
    }

    public void height(){
        int heightOfTree = heightHelper(root);
        System.out.println("Height of tree is: " + heightOfTree);
    }

    public int heightHelper(Node node){
        if(node==null){
            return 0;
        }else{
            int left = heightHelper(node.left);
            int right = heightHelper(node.right);
            return 1 + Math.max(left, right);
        }
    }

    public void rootToLeafSum(int sum){
        List<Integer> answer = new ArrayList<>();
        sumHelper(root, sum, answer);
    }

    public boolean sumHelper(Node node, int sum, List<Integer> answer){
        if(node==null){
            return false;
        }else if(node.left==null && node.right==null){
            if(sum==node.data){
                answer.add(node.data);
                return true;
            }
            return false;
        }

        if(sumHelper(node.right, sum-node.data, answer)){
            answer.add(node.data);
            return true;
        }
        if(sumHelper(node.left, sum-node.data, answer)){
            answer.add(node.data);
            return true;
        }
        return false;
    }

    public void iterativeAdd(int data){
        iterativeAddHelper(root, data);
    }

    private void iterativeAddHelper(Node node, int data){
        Node parent = null;
        Node current = node;
        Node newNode = new Node(data);
        if(current==null){
            root = newNode;
            return;
        }
        while(current!=null){
            parent = current;
            if(data < current.data){
                current = current.left;
            }else if(data > current.data){
                current = current.right;
            }
        }

        if(data < parent.data){
            parent.left = newNode;
        }else{
            parent.right = newNode;
        }
    }

    public void validBinaryTree(){
        System.out.println("Given tree is BST: " + validBinaryTreeHelper(root, Integer.MAX_VALUE, Integer.MIN_VALUE));
    }

    private boolean validBinaryTreeHelper(Node node, int max, int min){


        if(node==null){
            return true;
        }
        if(node.data<=min || node.data>=max){
            return false;
        }

        return validBinaryTreeHelper(node.left, node.data, min) &&
                validBinaryTreeHelper(node.right, max, node.data);

    }

    public void levelOrder(){
        Queue<Node> queue = new LinkedList<>();
        if(root!=null){
            queue.add(root);
        }

        while(!queue.isEmpty()){
            Node removed = queue.poll();
            System.out.print(removed.data + "  ");
            if(removed.left!=null)
                queue.add(removed.left);
            if(removed.right!=null)
                queue.add(removed.right);
        }
    }

    public void iterativePostOrder(){
        if(root!=null){
            Stack<Node> stack = new Stack<>();
            List<Node> list = new ArrayList<>();
            stack.push(root);
            while(!stack.isEmpty()){
                Node removed = stack.pop();
                list.add(removed);
                if(removed.left!=null){
                    stack.add(removed.left);
                }
                if(removed.right!=null){
                    stack.add(removed.right);
                }
            }
            System.out.println("\n-----------Iterative Post order-------------------");
            for(int i=list.size()-1; i>=0; i--){
                System.out.print(list.get(i).data + "  ");
            }
        }
    }

    public void iterativePreorder(){
        System.out.println("\n-----------PREORDER---------------");
        Stack<Node> stack = new Stack<>();
        if(root!=null){
            stack.push(root);
            while(!stack.isEmpty()){
                Node removed = stack.pop();
                System.out.print(removed.data + "\t");
                if(removed.right!=null){
                    stack.push(removed.right);
                }
                if(removed.left!=null){
                    stack.push(removed.left);
                }
            }
        }
    }

    public void iterativeInOrder(){
        System.out.println("\n----------Iterative InOrder-------------------");
        if(root!=null){
            iterativeInOrderHelper(root);
        }
    }

    private void iterativeInOrderHelper(Node node){
        Stack<Node> stack = new Stack<>();
        while (true){
            if(node!=null){
                stack.push(node);
                node = node.left;
            }else{
                if(stack.isEmpty())
                    break;
                node = stack.pop();
                System.out.print(node.data + "   ");
                node = node.right;
            }
        }
    }

    public void reverseTree(){
        if(root!=null)
            reverseTreeHelper(root);
    }

    public void reverseTreeHelper(Node node){
        if(node==null){

        }
        else{
            Node left = node.left;
            Node right = node.right;
            node.left = right;
            node.right = left;
            reverseTreeHelper(node.left);
            reverseTreeHelper(node.right);
        }
    }
}
