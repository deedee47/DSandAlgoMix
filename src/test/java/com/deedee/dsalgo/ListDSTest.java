package com.deedee.dsalgo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ListDSTest {
    private ListDS listDS;
    private ArrayList<String> testList;

    @Before
    public void setup()
    {
        listDS = new ListDS();
        testList = listDS.aboutArrayList();

    }

    @Test
    public void ArrayListTest() {
        Assert.assertEquals(testList.get(0), "Hello");
        Assert.assertTrue(!testList.isEmpty());
        Assert.assertFalse(testList.size() == 5);
    }
}
