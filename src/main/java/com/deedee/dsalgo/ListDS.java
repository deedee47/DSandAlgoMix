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
}
