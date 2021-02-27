package com.deedee.dsalgo;

public class TestNodeDouble {
    private String data;
    private TestNodeDouble next;
    private TestNodeDouble previous;

    public TestNodeDouble(String data) {
        this.data = data;
    }

    public TestNodeDouble getPrevious() {
        return previous;
    }

    public void setPrevious(TestNodeDouble previous) {
        this.previous = previous;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public TestNodeDouble getNext() {
        return next;
    }

    public void setNext(TestNodeDouble next) {
        this.next = next;
    }

    public String toString()
    {
        return data;
    }
}
