package com.deedee.dsalgo;

import java.util.*;

public class ListDS {
    /*
    This is a combination of all types implementing the List Interface
     */

    //--------------------ARRAYLISTS-------------------------------
    public ArrayList<String> aboutArrayList()
    {
        //Declaration without capacity; Uses default capacity of 10
        List<String> sampleList = new ArrayList<>();

        //Declaration with capacity
        ArrayList<Integer> sample2 = new ArrayList(24);

        //Inserting items into an arraylist
        sampleList.add("Hello");
        sampleList.add("Welcome");
        sampleList.add("Happy to have you here");
        sampleList.add("Amazing to see you");

        //Loop through each item in the list
        sampleList.forEach(sample -> System.out.println(sample));

        //get an item from the list
        String secondItem = sampleList.get(1);
        System.out.println(secondItem);

        //Check if the arrayList is empty
        System.out.println("Sample list empty : " + sampleList.isEmpty());
        System.out.println("Sample2 empty : " + sample2.isEmpty());

        //UpdatingValues in a List
        sampleList.set(3, "I'm excited to see you");

        //get the size of the list
        System.out.println("Sample List size  : " + sampleList.size());
        System.out.println("Sample2 size  : " + sample2.size());

        //add items to a specific index in the list (O(N) - items have to be shifted to accommodate the new addition
        sampleList.add(3, "Hey Hey there!");

        //check if the list contains an item
        System.out.println("Contains : " + sampleList.contains("I'm excited to see you"));

        //to find the index of an item in the list
        System.out.println("Index : " + sampleList.indexOf("I'm excited to see you"));

        //remove an item from the list
        sampleList.remove(4);


        return (ArrayList<String>)sampleList;
    }

    //--------------------VECTORS----------------------------------
    public Vector<Integer> aboutVectors()
    {
        //Declaration without capacity; Uses default capacity of 10
        List<Integer> sampleList = new Vector<>();

        //Declaration with capacity
        Vector<String> sample2 = new Vector(20); //cannot be replaced with another List implementation

        //Inserting items into an arraylist
        sampleList.add(89);
        sampleList.add(1000);
        sampleList.add(8473);
        sampleList.add(756535);

        //Loop through each item in the list
        sampleList.forEach(sample -> System.out.println(sample));

        //get an item from the list
        int secondItem = sampleList.get(1);
        System.out.println(secondItem);

        //Check if the arrayList is empty
        System.out.println("Sample list empty : " + sampleList.isEmpty());
        System.out.println("Sample2 empty : " + sample2.isEmpty());

        //UpdatingValues in a List
        sampleList.set(3, 635232);

        //get the size of the list
        System.out.println("Sample List size  : " + sampleList.size());
        System.out.println("Sample2 size  : " + sample2.size());

        //add items to a specific index in the list (O(N) - items have to be shifted to accommodate the new addition
        sampleList.add(2, 475);

        //check if the list contains an item
        System.out.println("Contains : " + sampleList.contains(475));

        //to find the index of an item in the list
        System.out.println("Index : " + sampleList.indexOf(475));

        //remove an item from the list
        sampleList.remove(4);

        return (Vector<Integer>)sampleList;
    }

    //--------------------LINKEDLISTS------------------------------
    public TestSinglyLinkedList aboutSinglyLinkedList()
    {
        TestSinglyLinkedList testList = new TestSinglyLinkedList();
        testList.addToFront("David");
        testList.addToFront("Esther");
        testList.addtoTail("Rochas");
        testList.addtoTail("Bridget");
        testList.addToFront("Kola");

        System.out.println("Removed Front : " + testList.removeFromFront().toString());

        testList.printList();

        System.out.println(testList.isEmpty());
        System.out.println("Tail is : " + testList.getTail().toString());
        System.out.println("Head is : " + testList.getHead().toString());

        return testList;
    }

    public TestDoublyLinkedList aboutDoublyLinkedList()
    {
        TestDoublyLinkedList testList = new TestDoublyLinkedList();
        testList.addToFront("David");
        testList.addToFront("Esther");
        testList.addtoTail("Rochas");
        testList.addtoTail("Bridget");
        testList.addToFront("Kola");

        System.out.println("Removed Front : " + testList.removeFromFront().toString());

        System.out.println("Removed Tail : " + testList.removeFromTail().toString());

        testList.printList();

        System.out.println(testList.isEmpty());
        System.out.println("Tail is : " + testList.getTail().toString());
        System.out.println("Head is : " + testList.getHead().toString());

        return testList;
    }

    public LinkedList<String> aboutJavaLinkedList()
    {
        LinkedList<String> testList = new LinkedList<String> ();
        testList.addFirst("David"); //add to front
        testList.addFirst("Esther");

        testList.addLast("Rochas"); //add to tail
        testList.addLast("Bridget");

        testList.add("Kola"); //by default adds to the end
        testList.add(3, "Deedee"); //add to a specific index - benefit of the list interface; uses 0 index

        System.out.println("Removed Front : " + testList.removeFirst());

        System.out.println("Removed Tail : " + testList.removeLast());

        System.out.println("Removed From Index : " + testList.remove(2));


        //Print out code
        Iterator listIterator = testList.iterator();
        System.out.print("HEAD -> ");
        while (listIterator.hasNext())
        {
            System.out.print(listIterator.next() + " <-> ");
        }
        System.out.print("null");

        System.out.println(testList.isEmpty());
        System.out.println("Tail is : " + testList.getLast());
        System.out.println("Head is : " + testList.getFirst());
        System.out.println("Element @ index 1 : " + testList.get(1));

        return testList;
    }
}
