package Tree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    public Boolean checkSame(Node first, Node second){
        if(first==null && second==null){
            return true;
        }
        else if(first==null || second==null){
            return false;
        }
        else{
            return (first.data==second.data) && (checkSame(first.left, second.left)) && checkSame(first.right,second.right);
        }
    }

    public void size(){
        if(root==null){
            System.out.println("Size of tree is 0");
        }
        else{
            System.out.println("Size of tree is : " + sizeHelper(root));
        }
    }

    private int sizeHelper(Node node){
        if(node==null){
            return 0;
        }else{
            int left = sizeHelper(node.left);
            int right = sizeHelper(node.right);
            return left+right+1;
        }
    }

    public void height(){
        if(root==null){
            System.out.print("Height of Tree: 0");
        }
        else{
            System.out.println("Height of Tree is: " +heightHelper(root));
        }
    }

    private int heightHelper(Node node){
        if(node==null){
            return 0;
        }else{
            int left = heightHelper(node.left);
            int right = heightHelper(node.right);
            return 1 + Math.max(right, left);
        }
    }

    public void rootToLeafSum(int sum){
        if(root==null){
            System.out.println("Sum not present");
        }else{
            List<Integer> result = new ArrayList<>();
            System.out.println("The Sum : " + sum + " present: " + rootToLeafSumHelper(root, sum, result));
            for(int i : result){
                System.out.println("Element: " + i);
            }
            System.out.println();
        }
    }

    private Boolean rootToLeafSumHelper(Node node, int sum, List<Integer> result){
        if(node==null){
            return false;
        }
        else if(node.left==null && node.right==null){
            if(node.data==sum){
                result.add(node.data);
                return true;
            }else{
                return false;
            }
        }

        if(rootToLeafSumHelper(node.left, sum-node.data, result)){
            result.add(node.data);
            return true;
        }
        if(rootToLeafSumHelper(node.right, sum-node.data, result)){
            result.add(node.data);
            return true;
        }

        return false;
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
}
