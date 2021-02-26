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
        System.out.println("Initial Array : " + arrayToString(initialArr));

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
        System.out.println("Array after Bubble Sort (ASC) : " + arrayToString(initialArr));
        return initialArr;
    }

    public int[] bubbleSortDesc()
    {
        //sorts in Ascending order
        int[] initialArr = {21, 1, 4, 2, 10, 3, 6, 15};
        System.out.println("Initial Array : " + arrayToString(initialArr));

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
        System.out.println("Array after Bubble Sort (DESC): " + arrayToString(initialArr));
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


    //-------------------Insertion Sort------------------------------
    public int[] insertionSort()
    {
        int[] initialArr = {21, 1, 4, 2, 10, 3, 6, 15};
        System.out.println("Initial Array : " + arrayToString(initialArr));

        int arrSize = initialArr.length;

        for(int unsortedIndex = 1; unsortedIndex < arrSize ; unsortedIndex++)
        {
            int currentElement = initialArr[unsortedIndex];
            int sortedIndex;

            for(sortedIndex = unsortedIndex; sortedIndex > 0 && initialArr[sortedIndex -1] > currentElement; sortedIndex--)
            {
               initialArr[sortedIndex] = initialArr[sortedIndex-1];
            }
            initialArr[sortedIndex] = currentElement;

        }
        System.out.println("Array after Insertion Sort (ASC): " + arrayToString(initialArr));
        return initialArr;
    }

    public int[] insertionSortDesc()
    {
        int[] initialArr = {21, 1, 4, 2, 10, 3, 6, 15};
        System.out.println("Initial Array : " + arrayToString(initialArr));

        int arrSize = initialArr.length;

        for(int unsortedIndex = arrSize - 2; unsortedIndex > 0 ; unsortedIndex--)
        {
            int currentElement = initialArr[unsortedIndex];
            int sortedIndex;

            for(sortedIndex = unsortedIndex; (sortedIndex < arrSize - 1) && (initialArr[sortedIndex + 1] > currentElement); sortedIndex++)
            {
                initialArr[sortedIndex] = initialArr[sortedIndex+1];
            }
            initialArr[sortedIndex] = currentElement;

        }
        System.out.println("Array after Insertion Sort (DESC): " + arrayToString(initialArr));
        return initialArr;
    }


    //-------------------Shell Sort------------------------------
    public int[] shellSort()
    {
        int[] initialArr = {21, 1, 4, 2, 10, 3, 6, 15};
        System.out.println("Initial Array : " + arrayToString(initialArr));

        int arrSize = initialArr.length;

        for(int gap = arrSize/2; gap > 0; gap/=2) //create the gap; the gap for comparison reduces on every iteration
        {
            //you compare every element upwards using the gap process; starting from the index of the first gap value
            for(int comparisonIndex = gap; comparisonIndex < arrSize; comparisonIndex++)
            {
                //gap process starts here
                int currentElement = initialArr[comparisonIndex]; //get the item to compare

                //you keep comparing every gap neighbour until you hit the front of the array; starting from the current index
                int repeatComparisonIndex = comparisonIndex;
                while(repeatComparisonIndex >= gap && initialArr[repeatComparisonIndex - gap] > currentElement)
                {
                    initialArr[repeatComparisonIndex] = initialArr[repeatComparisonIndex-gap]; //shift the element
                    repeatComparisonIndex -= gap; //find the next gap neighbor to compare with
                }
                //at this point, you should have found the insertion point for the item
                initialArr[repeatComparisonIndex] = currentElement;
            }

            //after this process, the gap reduces and the iteration happens again. until gap is 1 (last iteration)

        }
        System.out.println("Array after Shell Sort (ASC): " + arrayToString(initialArr));
        return initialArr;
    }

    public int[] shellSortDesc()
    {
        int[] initialArr = {21, 1, 4, 2, 10, 3, 6, 15};
        System.out.println("Initial Array : " + arrayToString(initialArr));

        int arrSize = initialArr.length;

        for(int gap = arrSize/2; gap > 0; gap/=2) //create the gap; the gap for comparison reduces on every iteration
        {
            //you compare every element upwards using the gap process; starting from the index of the first gap value
            for(int comparisonIndex = gap; comparisonIndex < arrSize; comparisonIndex++)
            {
                //gap process starts here
                int currentElement = initialArr[comparisonIndex]; //get the item to compare

                //you keep comparing every gap neighbour until you hit the front of the array; starting from the current index
                int repeatComparisonIndex = comparisonIndex;
                while(repeatComparisonIndex >= gap && initialArr[repeatComparisonIndex - gap] < currentElement) //switch > to <
                {
                    initialArr[repeatComparisonIndex] = initialArr[repeatComparisonIndex-gap]; //shift the element
                    repeatComparisonIndex -= gap; //find the next gap neighbor to compare with
                }
                //at this point, you should have found the insertion point for the item
                initialArr[repeatComparisonIndex] = currentElement;
            }

            //after this process, the gap reduces and the iteration happens again. until gap is 1 (last iteration)

        }
        System.out.println("Array after Shell Sort (DESC): " + arrayToString(initialArr));
        return initialArr;
    }


    //-------------------Merge Sort------------------------------
    public int[] mergeSort()
    {
        int[] initialArr = {21, 1, 4, 2, 10, 3, 6, 15};
        System.out.println("Initial Array : " + arrayToString(initialArr));

        int arrSize = initialArr.length;
        mergeSplit(initialArr, 0, arrSize,0);

        System.out.println("Array after Merge Sort : " + arrayToString(initialArr));

        return initialArr;
    }
    private void mergeSplit(int[] array, int startIndex, int endIndex, int sortOrder)
    {
        //this will only happen when you have your single element sub array, end the recursion here;
        if((endIndex-startIndex) < 2) return;

        int midPoint = (startIndex+endIndex)/2; //get the midpoint to divide the given array into two
        mergeSplit(array, startIndex, midPoint,sortOrder); //split left half, the partition is 1 higher than the count
        mergeSplit(array, midPoint, endIndex,sortOrder); //split right half till you get to single element array;

        if (sortOrder == 0)
        {
            merge(array, startIndex, midPoint, endIndex) ;
        }
        else {
            mergeDesc(array, startIndex, midPoint, endIndex);
        }

    }
    private void merge(int[] array, int startIndex, int midPoint, int endIndex)
    {
        //condition to stop the recursion; it means the array is sorted
        //compare right and left partitions
        //midPoint is the start of the right partition; midPoint - 1 is the end of the left partition
        if (array[midPoint-1] <= array[midPoint]) return;

        int i = startIndex; //this is the starting cursor to go through the left partition
        int j = midPoint; //this is the starting cursor to go through the right partition

        //we compare items in the left array with the right array to determine the sort position
        //and then write the correct sorted elements into the temporary array

        int[] temp = new int[endIndex-startIndex];
        int tempIndex = 0;
        //we create a temp array big enough to accommodate elements from left and right partitions
        //the temp index shows the position we're at while inserting values into the temp array

        //loop go through each index to cover both partitions
        while(i < midPoint && j < endIndex)
        {
            temp[tempIndex++] = (array[i] <= array[j]) ? array[i++] : array[j++];
            //this compares items in both partitions and copies them to temp array
        }

        //if there are elements remaining in the left array, we copy them to the temp array
        //if there are elements left in the right array, we do nothing

        //source array, start position in source, destination array, start position in destination,No of elements to copy
        int leftOvers = midPoint - i;
        System.arraycopy(array, i, temp, tempIndex, leftOvers);

        //copy temp array back to original array
        //the number of items to copy is tempIndex plus whatever was leftOvers we had earlier in the left array
        System.arraycopy(temp, 0, array, startIndex, tempIndex+leftOvers);


    }
    public int[] mergeSortDesc()
    {
        int[] initialArr = {21, 1, 4, 2, 10, 3, 6, 15};
        System.out.println("Initial Array : " + arrayToString(initialArr));

        int arrSize = initialArr.length;
        mergeSplit(initialArr, 0, arrSize,1);

        System.out.println("Array after Merge Sort (DESC): " + arrayToString(initialArr));

        return initialArr;
    }
    private void mergeDesc(int[] array, int startIndex, int midPoint, int endIndex)
    {
        //condition to stop the recursion; it means the array is sorted
        //compare right and left partitions
        //midPoint is the start of the right partition; midPoint - 1 is the end of the left partition
        if (array[midPoint-1] >= array[midPoint]) return; //change to >=

        int i = startIndex; //this is the starting cursor to go through the left partition
        int j = midPoint; //this is the starting cursor to go through the right partition

        //we compare items in the left array with the right array to determine the sort position
        //and then write the correct sorted elements into the temporary array

        int[] temp = new int[endIndex-startIndex];
        int tempIndex = 0;
        //we create a temp array big enough to accommodate elements from left and right partitions
        //the temp index shows the position we're at while inserting values into the temp array

        //loop go through each index to cover both partitions
        while(i < midPoint && j < endIndex)
        {
            temp[tempIndex++] = (array[i] >= array[j]) ? array[i++] : array[j++]; //change to >=
            //this compares items in both partitions and copies them to temp array
        }

        //if there are elements remaining in the left array, we copy them to the temp array
        //if there are elements left in the right array, we do nothing

        //source array, start position in source, destination array, start position in destination,No of elements to copy
        int leftOvers = midPoint - i;
        System.arraycopy(array, i, temp, tempIndex, leftOvers);

        //copy temp array back to original array
        //the number of items to copy is tempIndex plus whatever was leftOvers we had earlier in the left array
        System.arraycopy(temp, 0, array, startIndex, tempIndex+leftOvers);


    }


    //-------------------Quick Sort------------------------------
    public int[] quickSort()
    {
        int[] initialArr = {21, 1, 4, 2, 10, 3, 6, 15};
        System.out.println("Initial Array : " + arrayToString(initialArr));

        int arrSize = initialArr.length;

        initialArr = quickSort(initialArr, 0 , arrSize-1,0);
        System.out.println("Array after Quick Sort (ASC): " + arrayToString(initialArr));

        return initialArr;
    }
    private int[] quickSort(int[] array, int startIndex, int endIndex, int sortIndex)
    {
        int i = startIndex; //initiate left end cursor
        int j = endIndex; //initiate right end cursor

        int mid = startIndex + ((endIndex-startIndex)/2);
        int pivot = array[mid];

        while(i<=j)
        {
            if(sortIndex == 0) //Asc
            {
                while(array[i] < pivot) i++; //increment cursor i until you find a value higher than the pivot
                while(array[j] > pivot) j--; //decrement cursor j until you find a value lower than the pivot
            }
            else
            {
                while(array[i] > pivot) i++; //increment cursor i until you find a value higher than the pivot
                while(array[j] < pivot) j--; //decrement cursor j until you find a value lower than the pivot
            }

            //once i and j have been found, we swap the positions.
            //assuming i is still less than j
            if(i<=j)
            {
                swap(array, i, j);
                i++; //continue to the next index
                j--;
            }
        }

        //once the i and j cursors have crossed, the loop above ends
        //now we check to sort both sides of the pivot
        if(i < endIndex) quickSort(array, i, endIndex,sortIndex); //i has moved to the right side. check if it has reached the end
        if(j > startIndex) quickSort(array, startIndex, j, sortIndex); //j has crossed to the left, check if it has reached the start

        return array;
    }
    public int[] quickSortDesc()
    {
        int[] initialArr = {21, 1, 4, 2, 10, 3, 6, 15};
        System.out.println("Initial Array : " + arrayToString(initialArr));

        int arrSize = initialArr.length;

        initialArr = quickSort(initialArr, 0 , arrSize-1,1);
        System.out.println("Array after Quick Sort (DESC): " + arrayToString(initialArr));

        return initialArr;
    }


    //-------------------Counting Sort------------------------------
    public int[] countingSort()
    {
        int[] initialArr = {10, 1, 4, 2, 10, 3, 6, 8};
        System.out.println("Initial Array : " + arrayToString(initialArr));

        initialArr = countSort(initialArr, 1, 10);

        System.out.println("Array after Counting Sort (ASC): " + arrayToString(initialArr));

        return initialArr;
    }
    private int[] countSort(int[] array, int minRange, int maxRange)
    {
        int[] counter = new int[(maxRange - minRange) + 1]; //this helps to get the size of counter array to create
        int arrSize = array.length;

        for(int i = 0; i < arrSize; i++) //go through each element and increment the counter in the relative position
        {
            counter[array[i] - minRange]++; //the value at i minus the min will give the relative index on the counter
        }

        //after counting, rewrite the array based on the counts
        int j = 0; //index for the original array
        for(int i = minRange; i <= maxRange; i++) //starting at min, so we can get the exact values
        {
            while (counter[i - minRange] > 0) //subtract the min from the value to get the relative index
            {
                array[j++] = i;
                counter[i - minRange]--; //decrement the count to 0; this helps to write the exact amount in the original arr
            }
        }

        return  array;
    }

    public int[] countingSortDesc()
    {
        int[] initialArr = {10, 1, 4, 2, 10, 3, 6, 8};
        System.out.println("Initial Array : " + arrayToString(initialArr));

        initialArr = countSortDesc(initialArr, 1, 10);

        System.out.println("Array after Counting Sort (DESC): " + arrayToString(initialArr));

        return initialArr;
    }
    private int[] countSortDesc(int[] array, int minRange, int maxRange)
    {
        int[] counter = new int[(maxRange - minRange) + 1]; //this helps to get the size of counter array to create
        int arrSize = array.length;

        for(int i = 0; i < arrSize; i++) //go through each element and increment the counter in the relative position
        {
            counter[array[i] - minRange]++; //the value at i minus the min will give the relative index on the counter
        }

        //after counting, rewrite the array based on the counts
        int j = arrSize-1; //index for the original array
        for(int i = minRange; i <= maxRange; i++) //starting at min, so we can get the exact values
        {
            while (counter[i - minRange] > 0) //subtract the min from the value to get the relative index
            {
                array[j--] = i;
                counter[i - minRange]--; //decrement the count to 0; this helps to write the exact amount in the original arr
            }
        }

        return  array;
    }



    //-------------------Radix Sort------------------------------
//    public int[] radixSort()
//    {
//        int[] initialArr = {1456, 8763, 2364, 7836, 4449, 5887};
//        System.out.println("Initial Array : " + arrayToString(initialArr));
//
//        initialArr = countSort(initialArr, 1, 10);
//
//        System.out.println("Array after Radix Sort (ASC): " + arrayToString(initialArr));
//
//        return initialArr;
//    }


    //------------------Privates-------------------------------------
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
