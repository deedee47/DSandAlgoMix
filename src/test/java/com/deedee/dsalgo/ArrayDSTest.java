package com.deedee.dsalgo;

import org.junit.Assert;
import org.junit.Test;

public class ArrayDSTest {

    private ArrayDS arrayDS = new ArrayDS();

    @Test
    public void OneDimArrayDisplayValid()
    {
        arrayDS.OneDimArrayDisplay();
        Assert.assertEquals(arrayDS.secondArrStr[4],"Simple");
    }
}
