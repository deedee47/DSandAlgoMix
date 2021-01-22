package com.deedee.dsalgo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayDSTest {

    private ArrayDS arrayDS;

    @Before
    public void setup()
    {
        arrayDS = new ArrayDS();
    }

    @Test
    public void OneDimArrayDisplayValid()
    {
        arrayDS.OneDimArrayDisplay();
        Assert.assertEquals(arrayDS.secondArrStr[4],"Simple");
        Assert.assertFalse(arrayDS.secondArrStr[4].equals("Simples"));
    }
}
