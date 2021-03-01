package com.deedee.oop;

import com.deedee.dsalgo.QueueDS;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestSequenceTest {

    private LongestSequence longestSequence;
    @Before
    public void setup()
    {
        longestSequence = new LongestSequence();
    }

    @Test
    public void TestFindLongestSequence()
    {
        Assert.assertEquals(longestSequence.findLongestSequence("longest sEquence"), 8);
        Assert.assertEquals(longestSequence.findLongestSequence("long"), 4);
        Assert.assertFalse(longestSequence.findLongestSequence("longest sEquence") != 8);
        Assert.assertTrue(longestSequence.findLongestSequence("blah blah blah blah") == 5);
    }
}
