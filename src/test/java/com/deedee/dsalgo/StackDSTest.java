package com.deedee.dsalgo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

public class StackDSTest {

    private StackDS stackDS;

    @Before
    public void setup()
    {
        stackDS = new StackDS();
    }

    @Test
    public void StackArrayTest() {
        Stack<String> sample = stackDS.aboutStackWithArrays();
        Assert.assertEquals(sample.peek(), "DevOps");
        Assert.assertFalse(sample.size() == 4);
    }

    @Test
    public void StackLinkedListTest() {
        StackLinkedList<String> sample = stackDS.aboutStackWithLinkedLists();
        Assert.assertEquals(sample.peek(), "DevOps");
        Assert.assertFalse(sample.size() == 4);
        Assert.assertTrue(sample.isEmpty());
    }
}
