package com.deedee.dsalgo;

public class ArrayDS {
    /*
    This class explains details about an arrays.
    The order of description is as follows
    - One dimensional
    - Two dimensional
    - Multi dimensional
     */

    /*
    Access Level - All elements in an array can be accessed via an index
    Indexes begin from 0 to N-1; N being the size of the Array
    both to assign data to and to read values from the array
     */

    //-------------ONE DIMENSIONAL ARRAY--------------------------------------------------------------------------------
    //Declarations - Arrays can be declared in various ways

    //Method 1 - declaration using the 'new' keyword and specifying the size of the array
    //All values are initially initialized to 0 (or "" depending on the data type) in memory
    public int[] firstArr = new int[5];
    public String[] secondArrStr = new String[5];

    //Method 2 - declaration and initialization in the same line; the data on any index
    // can also be updated by reassigning the value. The values are written directly to memory
    public double[] thirdArr = new double[]{2.3,12.45, 19.,59.4};

    private void OneDimArrayDisplay()
    {
        //assigning values - for Method 1, the values are initialized separately
        firstArr[0] = 12;
        firstArr[1] = 156;
        secondArrStr[4] = "Simple";
        secondArrStr[3] = "Hello World";

        //reading from an array
        System.out.println("Index 2 from firstArr = " + firstArr[1]);
        System.out.println("Index 5 from secondArr = " + secondArrStr[4]);
        System.out.println("Index 1 from thridArr = " + thirdArr[0]);
    }

    public static void main(String[] args)
    {

    }

}
