package com.deedee.dsalgo;

import org.junit.Before;
import org.junit.Test;

public class TreeDSTest {
    private TreeDS treeDS;

    @Before
    public void setup() {
        treeDS = new TreeDS();
    }

    @Test
    public void BinarySearchTreeTest()
    {
        treeDS.aboutBinarySearchTrees();
    }
}
