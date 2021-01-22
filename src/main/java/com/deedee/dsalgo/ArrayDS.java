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
    // can also be updated by reassigning the value. The default values are written directly to memory
    public double[] thirdArr = new double[] {2.3,12.45,19.9,59.4}; //or double[] thirdArr = {2.3,12.45, 19.9,59.4}


    public void OneDimArrayDisplay()
    {
        //Write Operation : assigning values - for Method 1, the values are initialized separately
        firstArr[0] = 12;
        firstArr[1] = 156;
        secondArrStr[4] = "Simple";
        secondArrStr[3] = "Hello World";

        //Read Operation - reading from an array
        System.out.println("Index 1 from firstArr = " + firstArr[1]); //156
        System.out.println("Index 4 from secondArr = " + secondArrStr[4]); //Simple
        System.out.println("Index 0 from thirdArr = " + thirdArr[0]); //2.3
    }


    //---------------TWO DIMENSIONAL ARRAY------------------------------------------------------------------------------
    //Declarations :
    //Method 1 - row, col
    public char[][] fourthArr = new char[5][4];

    //Method 2 - Matrix
    public int[][] fifthArr = {
                                {12,14,16}, //row 1, index 0
                                {1, 100, 1000} //row 2, index 1
                              };

    //Initialization
    public void TwoDimArrayDisplay()
    {
        //Write Operation : assigning values - for Method 1, the values are initialized separately
        fourthArr[0][0] = 'a';
        fourthArr[1][0] = 'z';

        //Read Operation - reading from an array
        System.out.println("Index 0 from fourthArr = " + fourthArr[0][0]); //a
        System.out.println("Index row1,col0 from fifthArr = " + fifthArr[1][0]); //1
    }

}
