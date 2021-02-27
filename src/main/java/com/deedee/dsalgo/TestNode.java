package com.deedee.dsalgo;

public class TestNode {
    private String data;
    private TestNode next;

    public TestNode(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public TestNode getNext() {
        return next;
    }

    public void setNext(TestNode next) {
        this.next = next;
    }

    public String toString()
    {
        return data;
    }
}
