package com.deedee.dsalgo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

public class QueueDSTest {

    private QueueDS queueDS;
    @Before
    public void setup()
    {
        queueDS = new QueueDS();
    }

    @Test
    public void StackArrayTest() {
        LinkedList<Integer> sample = queueDS.aboutLinkedListQueue();
        Assert.assertEquals(sample.element().intValue(), 987);
        Assert.assertFalse(sample.size() == 4);
    }
}
