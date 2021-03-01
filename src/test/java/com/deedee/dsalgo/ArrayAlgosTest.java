package com.deedee.dsalgo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayAlgosTest {
    private ArrayAlgos arrayAlgos;
    private int[] testArrayAsc;
    private int[] testArrayDesc;

    @Before
    public void setup()
    {
        arrayAlgos = new ArrayAlgos();
        testArrayAsc = new int[]{1, 2, 3, 4, 6, 10, 15, 21};
        testArrayDesc = new int[]{21, 15, 10,6,4,3,2,1};
    }

    //-------------Bubble Sort---------------------------------------------
    @Test
    public void BubbleSortAsc()
    {
        Assert.assertArrayEquals(arrayAlgos.bubbleSort() , testArrayAsc);
    }
    @Test
    public void BubbleSortDesc()
    {
        Assert.assertArrayEquals(arrayAlgos.bubbleSortDesc() , testArrayDesc);
    }

    //-------------Selection Sort---------------------------------------------
    @Test
    public void SelectionSortAsc()
    {
        Assert.assertArrayEquals(arrayAlgos.selectionSort() , testArrayAsc);
    }
    @Test
    public void SelectionSortDesc()
    {
        Assert.assertArrayEquals(arrayAlgos.selectionSortDesc() , testArrayDesc);
    }

    //-------------Insertion Sort---------------------------------------------
    @Test
    public void InsertionSortAsc()
    {
        Assert.assertArrayEquals(arrayAlgos.insertionSort() , testArrayAsc);
    }
    @Test
    public void InsertionSortDesc()
    {
        Assert.assertArrayEquals(arrayAlgos.insertionSortDesc() , testArrayDesc);
    }

    //-------------Shell Sort---------------------------------------------
    @Test
    public void ShellSortAsc()
    {
        Assert.assertArrayEquals(arrayAlgos.shellSort() , testArrayAsc);
    }
    @Test
    public void ShellSortDesc()
    {
        Assert.assertArrayEquals(arrayAlgos.shellSortDesc() , testArrayDesc);
    }


    //-------------Merge Sort---------------------------------------------
    @Test
    public void MergeSortAsc()
    {
        Assert.assertArrayEquals(arrayAlgos.mergeSort() , testArrayAsc);
    }
    @Test
    public void MergeSortDesc()
    {
        Assert.assertArrayEquals(arrayAlgos.mergeSortDesc() , testArrayDesc);
    }

    //-------------Quick Sort---------------------------------------------
    @Test
    public void QuickSortAsc()
    {
        Assert.assertArrayEquals(arrayAlgos.quickSort() , testArrayAsc);
    }
    @Test
    public void QuickSortDesc()
    {
        Assert.assertArrayEquals(arrayAlgos.quickSortDesc() , testArrayDesc);
    }


    //-------------Counting Sort---------------------------------------------
    @Test
    public void CountingSortAsc()
    {
        Assert.assertArrayEquals(arrayAlgos.countingSort() , new int[] {1, 2, 3, 4, 6, 8, 10, 10});
    }
    @Test
    public void CountingSortDesc()
    {
        Assert.assertArrayEquals(arrayAlgos.countingSortDesc() , new int[] {10, 10, 8, 6, 4, 3, 2, 1});
    }


    ///-------------------------SEARCH----------------------------------------
    @Test
    public void LinearSearchTest()
    {
        Assert.assertTrue(arrayAlgos.linearSearch(3) ==  5);
    }

    @Test
    public void BinarySearchIterativeTest()
    {
        Assert.assertTrue(arrayAlgos.binarySearchIterative(3) ==  2);
        Assert.assertTrue(arrayAlgos.binarySearchIterative(11) ==  -1);
    }
    @Test
    public void BinarySearchRecursiveTest()
    {
        Assert.assertTrue(arrayAlgos.binarySearchRecursive(3) ==  2);
        Assert.assertTrue(arrayAlgos.binarySearchRecursive(21) ==  7);
        Assert.assertTrue(arrayAlgos.binarySearchRecursive(11) ==  -1);
    }
}
