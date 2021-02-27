package com.deedee.dsalgo;

import java.util.LinkedList;

public class QueueDS {
    /*
    a queue can be implemented using an array or linkedlist
    Linkedlist in java already inherits from the queue interface
     */

    public LinkedList<Integer> aboutLinkedListQueue()
    {
        LinkedList<Integer> sample = new LinkedList<>();

        //this methods throw exception when the array is empty
        sample.add(12); //adds to queue from the end
        sample.add(28499);
        sample.add(987);
        sample.add(6483);

        sample.remove(); //removes item

        System.out.println("peek at : " + sample.element());

        //these methods return a boolean or null value where necessary; no exceptions thrown
        sample.offer(56383);

        sample.poll(); //removes item

        System.out.println("peek at : " + sample.peek());

        return sample;

    }
}
