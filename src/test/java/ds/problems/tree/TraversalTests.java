package ds.problems.tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by sudeep on 07/06/17.
 */
public class TraversalTests {
    public BinaryTreeNode node;

    @Before
    public void setUp() {
        node = new BinaryTreeNode(1);
        BinaryTreeNode temp = new BinaryTreeNode(2);
        node.setLeft(temp);
        temp = new BinaryTreeNode(3);
        node.setRight(temp);
        temp = new BinaryTreeNode(4);
        node.getLeft().setLeft(temp);
        temp = new BinaryTreeNode(5);
        node.getLeft().setRight(temp);
        temp = new BinaryTreeNode(6);
        node.getRight().setLeft(temp);
        temp = new BinaryTreeNode(7);
        node.getRight().setRight(temp);
    }

    @Test
    public void testPreOrder() {
        node.preOrder(node);
    }

    @Test
    public void testPreorderTraversal() {
        ArrayList<Integer> result = node.preorderTraversal(node);
        System.out.println(result);
    }
}
