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
}
