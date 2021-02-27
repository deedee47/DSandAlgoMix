package com.deedee.dsalgo;

public class TestDoublyLinkedList {

    private TestNodeDouble head;
    private TestNodeDouble tail;
    private int size = 0;

    public void addToFront(String testData)
    {
        TestNodeDouble testNode = new TestNodeDouble(testData);
        testNode.setNext(head); //swap the positions, head is now second

        if(head == null) //empty list
        {
            tail = testNode; //set the tail, same as head
        }
        else
        {
            head.setPrevious(testNode); // what used to be the head node is now the second node.
        }
        head = testNode;
        size++;
    }
    public void addtoTail(String testData)
    {
        TestNodeDouble testNode = new TestNodeDouble(testData);

        if(tail == null) //empty list
        {
            head = testNode;
        }
        else {
            tail.setNext(testNode);
            testNode.setPrevious(tail);
        }
        tail = testNode;
        size++;
    }

    public TestNodeDouble getHead()
    {
        return head;
    }

    public TestNodeDouble getTail()
    {
        return tail;
    }

    public int getSize(){ return size;}

    public boolean isEmpty()
    {
        return head == null && tail == null;
    }

    public TestNodeDouble removeFromFront()
    {
        if(isEmpty()) return null;

        TestNodeDouble toBeRemoved = head;

        if(head.getNext() == null)  //removing the last node, update the tail to null
        {
            tail = null;
        }
        else
        {
            head.getNext().setPrevious(null);
        }
        head = head.getNext();
        size--;

        toBeRemoved.setNext(null);
        return  toBeRemoved;
    }

    public TestNodeDouble removeFromTail()
    {
        if(isEmpty()) return null;

        TestNodeDouble toBeRemoved = tail;

        if(tail.getPrevious() == null)  //removing the last node, update the tail to null
        {
            head = null;
        }
        else
        {
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        size--;

        toBeRemoved.setPrevious(null);
        return  toBeRemoved;
    }

    public void printList()
    {
        TestNodeDouble currentNode = head;
        System.out.print("HEAD -> ");
        while (currentNode != null)
        {
            System.out.print(currentNode + " -> ");
            currentNode = currentNode.getNext();
        }
        System.out.print("null");
    }
}
