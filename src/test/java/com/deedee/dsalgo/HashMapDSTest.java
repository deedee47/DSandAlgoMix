package com.deedee.dsalgo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Map;

public class HashMapDSTest {

    private HashMapDS hashMapDS;

    @Before
    public void setup() {
        hashMapDS = new HashMapDS();
    }

    @Test
    public void HashMapTest()
    {
        Map<Integer, String> sample = hashMapDS.aboutHashMaps();
        Assert.assertEquals(sample.get(2), "Hi");
        Assert.assertFalse(sample.containsValue("heeha"));
    }
}
