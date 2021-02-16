package com.deedee.dsalgo;

public class ArrayAlgos {
     /*
        Algorithms on Arrays
        - Sort : Bubble sort, Selection sort, Insertion sort, Quick sort, Merge sort
        - Search : Linear search, Binary Search,
     */

     /*
        -------------------------START SORT----------------------------------------------------------
     */

    //-------------------Bubble Sort--------------------------------
    public int[] bubbleSort()
    {
        //sorts in Ascending order
        int[] initialArr = {21, 1, 4, 2, 10, 3, 6, 15};
        System.out.println("Initial Array : " + initialArr);

        int arrSize = initialArr.length;
        for(int lastIndex = arrSize-1; lastIndex > 0; lastIndex--)
        {
            for(int unsortedIndex = 0; unsortedIndex < lastIndex; unsortedIndex++)
            {
                if(initialArr[unsortedIndex] > initialArr[unsortedIndex + 1])
                {
                    swap(initialArr, unsortedIndex, unsortedIndex+1);
                }
            }
        }
        System.out.println("Array after Bubble Sort (ASC) : " + initialArr);
        return initialArr;
    }

    public int[] bubbleSortDesc()
    {
        //sorts in Ascending order
        int[] initialArr = {21, 1, 4, 2, 10, 3, 6, 15};
        System.out.println("Initial Array : " + initialArr);

        int arrSize = initialArr.length;
        for(int lastIndex = arrSize-1; lastIndex > 0; lastIndex--)
        {
            for(int unsortedIndex = 0; unsortedIndex < lastIndex; unsortedIndex++)
            {
                if(initialArr[unsortedIndex] < initialArr[unsortedIndex + 1])
                {
                    swap(initialArr, unsortedIndex, unsortedIndex+1);
                }
            }
        }
        System.out.println("Array after Bubble Sort (DESC): " + initialArr);
        return initialArr;
    }



    //------------------Selection Sort------------------------------
    public int[] selectionSort()
    {
        int[] initialArr = {21, 1, 4, 2, 10, 3, 6, 15};
        System.out.println("Initial Array : " + arrayToString(initialArr));

        int arrSize = initialArr.length;

        for(int lastIndex = arrSize-1; lastIndex > 0; lastIndex--)
        {
            int highestIndex = 0;
            for(int currIndex = 0; currIndex <= lastIndex; currIndex++)
            {
                if(initialArr[currIndex] > initialArr[highestIndex])
                {
                    highestIndex = currIndex;
                }
            }
            swap(initialArr, highestIndex, lastIndex);

        }
        System.out.println("Array after Selection Sort (ASC): " + arrayToString(initialArr));
        return initialArr;
    }

    public int[] selectionSortDesc()
    {
        int[] initialArr = {21, 1, 4, 2, 10, 3, 6, 15};
        System.out.println("Initial Array : " + arrayToString(initialArr));

        int arrSize = initialArr.length;

        for(int lastIndex = 0; lastIndex < arrSize ; lastIndex++)
        {
            int highestIndex = lastIndex;
            for(int currIndex = arrSize - 1; currIndex >= lastIndex; currIndex--)
            {
                if(initialArr[currIndex] > initialArr[highestIndex])
                {
                    highestIndex = currIndex;
                }
            }
            swap(initialArr, highestIndex, lastIndex);

        }
        System.out.println("Array after Selection Sort (DESC): " + arrayToString(initialArr));
        return initialArr;
    }

    private void swap(int[] array, int index1, int index2)
    {
        if(index1 == index2) return;

        int tempValue = array[index1];
        array[index1] = array[index2];
        array[index2] = tempValue;
    }

    private String arrayToString(int[] arr)
    {
        String result = "";
        for (int i = 0; i < arr.length; i++)
        {
             result = (i == 0) ? result += arr[i] : result + ", " + arr[i];
        }
        return result;
    }
}
