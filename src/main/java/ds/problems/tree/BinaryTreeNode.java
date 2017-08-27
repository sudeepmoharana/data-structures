package ds.problems.tree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by sudeep on 07/06/17.
 */
public class BinaryTreeNode {
    public int data;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

    public void preOrder(BinaryTreeNode root) {
        if(root != null) {
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public ArrayList<Integer> preorderTraversal(BinaryTreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(root == null) {
            return result;
        }
        Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
        stack.push(root);
        if(!stack.isEmpty()) {
            BinaryTreeNode temp = stack.pop();
            result.add(temp.getData());
            if(temp.getRight() != null) {
                stack.push(temp.getRight());
            }
            if(temp.getLeft() != null) {
                stack.push(temp.getLeft());
            }
        }
        return result;
    }
}
