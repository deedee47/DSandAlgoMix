package com.deedee.dsalgo;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;

import java.util.LinkedList;

public class StackLinkedList<T> {

    /*
    This class is written to isolate the stack operations alone from all operations available in the linkedlist
    It is also generic in the sense that any object can be passed into it
     */

    private LinkedList<T> stack;

    public StackLinkedList()
    {
        stack = new LinkedList<T>();
    }

    public void push(T item)
    {
        stack.push(item);
    }

    public void pop()
    {
        stack.pop();
    }

    public T peek()
    {
        return stack.peek();
    }

    public int size()
    {
        return stack.size();
    }

    public String toString() //prints from bottom up by default - when using linked list
    {
        return stack.toString();
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }
}
