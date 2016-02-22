package org.robynhan;

import org.junit.Test;
import org.robynhan.week4.BinarySearchSolution;
import org.robynhan.week4.BinaryTreeConvertSolution;
import org.robynhan.week4.CompareStringSolution;
import org.robynhan.week4.CosineSimilaritySolution;
import org.robynhan.week4.CountAndSaySolution;
import org.robynhan.week4.CountOnesSolution;
import org.robynhan.week4.DeleteNodeO1Solution;
import org.robynhan.week4.FizzBuzzSolution;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class week4Test {
    @Test
    public void should_compareStrings() {
        CompareStringSolution solution = new CompareStringSolution();
        assertTrue(solution.compareStrings("ABCD", "ACD"));
        assertFalse(solution.compareStrings("ABCD", "AABC"));
    }

    @Test
    public void should_convertBinaryTree() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        BinaryTreeConvertSolution solution = new BinaryTreeConvertSolution();
        TreeNode treeNode = solution.sortedArrayToBST(arr);
        assertThat(treeNode.val, is(4));
    }

    @Test
    public void should_cosineSimilarity() {
        int[] A = new int[]{1, 2, 3};
        int[] B = new int[]{2, 3, 4};
        CosineSimilaritySolution solution = new CosineSimilaritySolution();
        double r1 = solution.cosineSimilarity(A, B);
        assertThat(r1, is(0.9925833339709303));
    }

    @Test
    public void should_countOnes() {
        CountOnesSolution solution = new CountOnesSolution();
        assertThat(solution.countOnes(-1), is(32));
    }

    @Test
    public void should_countAndSay() {
        CountAndSaySolution solution = new CountAndSaySolution();
        assertThat(solution.countAndSay(5), is("111221"));
    }

    @Test
    public void should_binary_search() {
        int[] a = new int[]{1, 2, 3, 3, 4, 5, 10};
        BinarySearchSolution solution = new BinarySearchSolution();
        assertThat(solution.binarySearch(a, 3), is(2));
    }

    @Test
    public void should_fizz_buzz() {
        FizzBuzzSolution solution = new FizzBuzzSolution();
        solution.fizzBuzz(5);
    }


}
