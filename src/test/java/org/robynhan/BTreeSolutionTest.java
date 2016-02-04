package org.robynhan;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BTreeSolutionTest {
    BTreeSolution solution = new BTreeSolution();
    @Test
    public void should_traversal_tree_preorder() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        node1.left = node2;
        node2.left = node4;
        node1.right = node3;
        node2.right = node5;

        List<Integer> result = solution.preorderTraversal(node1);
        assertThat(result.get(0),is(1));
        assertThat(result.get(1),is(2));
        assertThat(result.get(2),is(4));
        assertThat(result.get(3),is(5));
        assertThat(result.get(4),is(3));
    }

    @Test
    public void should_traversal_tree_inorder() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node1.right = node2;
        node2.left = node3;

        List<Integer> result = solution.inorderTraversal(node1);
        assertThat(result.get(0),is(1));
        assertThat(result.get(1),is(3));
        assertThat(result.get(2),is(2));
    }

    @Test
    public void should_traversal_tree_postorder() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node1.right = node2;
        node2.left = node3;

        List<Integer> result = solution.postorderTraversal(node1);
        assertThat(result.get(0),is(3));
        assertThat(result.get(1),is(2));
        assertThat(result.get(2),is(1));
    }

    @Test
    public void should_print_tree_paths() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node5 = new TreeNode(5);
        node1.left = node2;
        node2.right = node5;
        node1.right = node3;

        List<String> result = solution.binaryTreePaths(node1);
        assertThat(result.size(),is(2));
    }
}
