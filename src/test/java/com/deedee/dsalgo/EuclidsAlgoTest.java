package com.deedee.dsalgo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EuclidsAlgoTest {

    EuclidsAlgo euclidsAlgo;
    @Before
    public void setup()
    {
        euclidsAlgo = new EuclidsAlgo();
    }
    @Test
    public void gcdValidTest()
    {
        int divisor = euclidsAlgo.gcd(22,6);
        Assert.assertEquals(2, divisor);
    }

    @Test
    public void gcdInvalidTest()
    {
        int divisor = euclidsAlgo.gcd(6,22);
        Assert.assertEquals(0, divisor);
    }
}
