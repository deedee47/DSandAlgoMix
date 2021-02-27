package com.deedee.dsalgo;

import java.util.Stack;

public class StackDS {

    //Stack with Arrays
    public Stack<String> aboutStackWithArrays()
    {
        Stack<String> sampleStack = new Stack<>(); //backed by a vector data structure - synchronous
        sampleStack.push("Deedee"); //adds top to bottom
        sampleStack.push("DevOps");
        sampleStack.push("Revoked");

        System.out.println("tostring stack : " + sampleStack.toString()); //prints top to bottom

        System.out.println(printStack(sampleStack)); //custom print for bottom up

        sampleStack.pop(); //removes last item

        System.out.print("After Pop : ");
        System.out.println(printStack(sampleStack));

        System.out.println("Peek Top Value : " + sampleStack.peek()); //peeks last item

        System.out.println("Size : " + sampleStack.size());

        return sampleStack;
    }

    private boolean printStack(Stack<String> stack) //print from bottom up
    {
        System.out.print("print stack (bottom up) : ");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.get(i) + " - ");
        }
        return true;
    }


    //Stack with LinkedList
    public StackLinkedList<String> aboutStackWithLinkedLists()
    {
        StackLinkedList<String> sampleStack = new StackLinkedList<>();

        sampleStack.push("Deedee"); //adds top to bottom
        sampleStack.push("DevOps");
        sampleStack.push("Revoked");

        System.out.println(sampleStack.toString()); //custom print for bottom up

        sampleStack.pop(); //removes last item

        System.out.print("After Pop : ");
        System.out.println(sampleStack.toString());

        System.out.println("Peek Top Value : " + sampleStack.peek()); //peeks last item

        System.out.println("Size : " + sampleStack.size());

        return sampleStack;

    }
}
