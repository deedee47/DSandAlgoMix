package com.deedee.dsalgo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ListDSTest {
    private ListDS listDS;

    @Before
    public void setup()
    {
        listDS = new ListDS();


    }

    @Test
    public void ArrayListTest() {
        ArrayList<String> testList = listDS.aboutArrayList();
        Assert.assertEquals(testList.get(0), "Hello");
        Assert.assertTrue(!testList.isEmpty());
        Assert.assertFalse(testList.size() == 5);
    }

    @Test
    public void VectoTest() {
        Vector<Integer> testList = listDS.aboutVectors();
        Assert.assertEquals((int)testList.get(0), 89);
        Assert.assertTrue(!testList.isEmpty());
        Assert.assertFalse(testList.size() == 5);
    }

    @Test
    public void SinglyLinkedListTest() {
        TestSinglyLinkedList testList = listDS.aboutSinglyLinkedList();
        Assert.assertTrue(testList.getHead().toString().equals("Esther"));
        Assert.assertFalse(testList.getSize() == 5);
        Assert.assertTrue(testList.getSize() == 4);
    }

    @Test
    public void DoublyLinkedListTest() {
        TestDoublyLinkedList testList = listDS.aboutDoublyLinkedList();
        Assert.assertTrue(testList.getHead().toString().equals("Esther"));
        Assert.assertFalse(testList.getSize() == 5);
        Assert.assertTrue(testList.getSize() == 3);
    }

    @Test
    public void JavaDoublyLinkedListTest() {
        LinkedList<String> testList = listDS.aboutJavaLinkedList();
        Assert.assertTrue(testList.getFirst().equals("David"));
        Assert.assertFalse(testList.size() == 5);
        Assert.assertTrue(testList.size() == 3);
    }
}
