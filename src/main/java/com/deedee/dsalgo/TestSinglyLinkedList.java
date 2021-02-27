package com.deedee.dsalgo;

public class TestSinglyLinkedList {

    private TestNode head;
    private TestNode tail;
    private int size = 0;

    public void addToFront(String testData)
    {
        TestNode testNode = new TestNode(testData);
        if(head == null) //empty list
        {
            tail = testNode; //set the tail, same as head
        }
        testNode.setNext(head);
        head = testNode;
        size++;
    }
    public void addtoTail(String testData)
    {
        TestNode testNode = new TestNode(testData);

        if(head == null) //empty list
        {
            head = testNode;
            tail = testNode;
        }
        else {
            tail.setNext(testNode);
            tail = testNode;
        }
        size++;
    }

    public TestNode getHead()
    {
        return head;
    }

    public TestNode getTail()
    {
        return tail;
    }

    public int getSize(){ return size;}

    public boolean isEmpty()
    {
        return head == null && tail == null;
    }

    public TestNode removeFromFront()
    {
        if(isEmpty()) return null;

        TestNode toBeRemoved = head;
        head = head.getNext();
        size--;
        toBeRemoved.setNext(null);
        return  toBeRemoved;
    }

    public void printList()
    {
        TestNode currentNode = head;
        System.out.print("HEAD -> ");
        while (currentNode != null)
        {
            System.out.print(currentNode + " -> ");
            currentNode = currentNode.getNext();
        }
        System.out.print("null");
    }
}
