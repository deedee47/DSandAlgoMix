package com.deedee.dsalgo;

public class TreeDS {

    public TestTree aboutBinarySearchTrees()
    {
        TestTree sampleTree = new TestTree();
        sampleTree.insert(25);
        sampleTree.insert(20);
        sampleTree.insert(15);
        sampleTree.insert(27);
        sampleTree.insert(29);
        sampleTree.insert(26);
        sampleTree.insert(22);
        sampleTree.insert(32);
        sampleTree.insert(17);

        sampleTree.traverseInOrder();

        System.out.println();
        System.out.println(" Find 15 : " + sampleTree.get(15));
        System.out.println(" Find 500 : " + sampleTree.get(500));

        System.out.println(" Min Value : " + sampleTree.min());
        System.out.println(" Max Value : " + sampleTree.max());

        sampleTree.delete(17);

        System.out.print("In Order : ");
        sampleTree.traverseInOrder();

        System.out.println();
        System.out.print("Pre Order : ");
        sampleTree.traversePreOrder();

        System.out.println();
        System.out.print("Post Order : ");
        sampleTree.traversePostOrder();

        return sampleTree;
    }

//    public TreeMap aboutJavaBinarySearchTrees()
//    {
//
//    }
}
