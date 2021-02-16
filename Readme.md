# Data Structures and Algorithms in Computer Science
This project shows the implementation of various algorithms as well 
as relevant data structures.
It explains : 
- What they are
- When they can be used
- How they can be used

## Introduction
**Data Structures** are used for effective & efficient data organization and storage. Each has its strenghts and weaknesses.
Data organization differs from one DS to another. A data structure may affect the output of your product 
in general, hence it is important to know when and how to apply specific data structures.

**Algorithms** are steps to perform in order to accomplish a specific task. 
There can be many algorithms to accomplish the same task. There can also be many implementations of the same algorithm.
Algorithms also affect the output of your product especially the relative time taken to process given varying data input.

**Big-O-Notation** is a measure of performance for any algorithm in consideration of the increasing input (especially in the worst
 case scenarios) and irrespective of hardware influence. This is called the runtime complexity. 
 There are **two types** of complexities. 
1. **Time Complexity** measures how long it takes to go through each step of an algorithm from start to completion. 
2. **Space/Memory complexity** measures the amount or memory required to successfully execute an algorithm.



## 1. Arrays
An array is a static data structure which holds homogenous data and can have variable length. It is not a dynamic DS.
i.e it is created with a defined size which cannot be changed later in your program. The Memory allocated is just enough 
for the array size specified.

### Types of Arrays
Arrays come in different types based on the dimension

1. One Dimensional Array - Data is represented in a row
2. Two Dimensional Array - This is known as array of arrays (Matrix). 
3. MultiDimensional Array - Nested Arrays with >= 3 dimensions

### Operations on Arrays
Item 3 and 4 are algorithms performed on arrays
Each operation has its own specific Time and Space Complexity

1. **Write** 
    a. In an array with space - Insert, Update (at the end of an array or with indexing) - **O(1)** : Constant time
    b. In a full array - This will require recreating another array with extra space and copying the content of the old array
    into the new one before adding the new element - **O(N)**
    
    
2. **Read** 
    a. **O(1)** - with Indexing : Constant time
    b. **O(N)** - without Indexing : Linear time
    
    
3. **Sort** 
This involves arranging items in the array in either natural order or descending order. Sorts can be **stable or unstable**.
A sort is stable if the natural order is preserved in the case of duplicate items. An unstable sort will not preserve the 
order if duplicate items are present in an array.

    * **Bubble Sort** : Simplest Sort Algorithm. It involves continuous swapping of elements (the current element and the next) if 
    the order is misplaced while going through each element in the array. At the end of this process, the largest element is 
    at the end of the loop. This process is repeated (without considering the already sorted element(s) at the end of the array)
    hence partitioning it into a sorted partition and unsorted partition. It is an in-place sort algorithm.
    
    Runtime Complexity - O(N2) : Stable Sort
     
    * **Selection Sort** :  This involves swapping the largest element in the array to the end of the array on every traversal 
    through the array until it becomes sorted. It also requires that the array is partitioned into sorted and unsorted
    areas. the largest element ends up at the end of the array. An index is maintained in the process i.e the index of the 
    highest item in the array while looping through. If you encounter a higher item, the index is updated. Once you reach the end
    of the loop, you swap the item at the end of the array (minding the sorted partition) with the item in the stored index.
    
    It does not swap as much as Bubble sort.
    
    Runtime Complexity - O(N2) : Unstable Sort
    
    * Insertion Sort
    * Merge Sort
    * Quick Sort
    
    
4. **Search** 

### Advantages of Arrays
1. It takes constant time to find an element in an array given the specific index.

### Disadvantages of Arrays
1. Searching without the use of the array index is expensive. O(N)