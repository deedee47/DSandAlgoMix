# Data Structures and Algorithms in Computer Science
This project shows the implementation of various algorithms as well 
as relevant data structures.
It explains : 
- What they are
- When they can be used
- How they can be used

## Introduction
**Data Structures** are used for effective & efficient data organization and storage. Each has its strenghts and 
weaknesses. Data organization differs from one DS to another. A data structure may affect the output of your product 
in general, hence it is important to know when and how to apply specific data structures.

**Algorithms** are steps to perform in order to accomplish a specific task. 
There can be many algorithms to accomplish the same task. There can also be many implementations of the same algorithm.
Algorithms also affect the output of your product especially the relative time taken to process given varying data 
input.

**Big-O-Notation** is a measure of performance for any algorithm in consideration of the increasing input (especially 
in the worst case scenarios) and irrespective of hardware influence. This is called the runtime complexity. 
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
Item 3 and 4 are algorithms performed on arrays. 
Each operation has its own specific Time and Space Complexity

1. **Write** 
    * In an array with space - Insert, Update (at the end of an array or with indexing) - **O(1)** : Constant time
    * In a full array - This will require recreating another array with extra space and copying the content of the old 
    array into the new one before adding the new element - **O(N)**
    
    
2. **Read** 
    * **O(1)** - with Indexing : Constant time
    * **O(N)** - without Indexing : Linear time
    
    
3. **Sort** 
This involves arranging items in the array in either natural order or descending order. Sorts can be **stable or 
unstable**.
A sort is stable if the natural order is preserved in the case of duplicate items. An unstable sort will not preserve 
the order if duplicate items are present in an array.

    * **Bubble Sort** : Simplest Sort Algorithm. It involves continuous swapping of elements (the current element and 
    the next) if the order is misplaced while going through each element in the array. At the end of this process, 
    the largest element is at the end of the loop. This process is repeated (without considering the already sorted 
    element(s) at the end of the array) hence partitioning it into a sorted partition and unsorted partition. 
    It is an in-place sort algorithm.
    
    Runtime Complexity - O(N2) : Stable Sort
     
    * **Selection Sort** :  This involves swapping the largest element in the array to the end of the array on every 
    traversal through the array until it becomes sorted. It also requires that the array is partitioned into sorted and 
    unsorted areas. the largest element ends up at the end of the array. An index is maintained in the process i.e 
    the index of the highest item in the array while looping through. If you encounter a higher item, the index 
    is updated. Once you reach the end of the loop, you swap the item at the end of the array (minding the sorted 
    partition) with the item in the stored index. It does not swap as much as Bubble sort.
    
    Runtime Complexity - O(N2) : Unstable Sort
    
    * **Insertion Sort** : This is another in-place algorithm which required splitting the array into sorted and 
    unsorted partitions. It starts off by assuming the first item in the array is in its sorted position, and the 
    second to last items are in the unsorted partition. It requires looping through the unsorted partition, comparing 
    each item with the sorted partition in order to find the exact slot to insert the unsorted item. This means that 
    items in the sorted partition are moved to the right in other to make room for the new item.
    
    Runtime Complexity - O(N2) : Stable Sort
    
    This algorithm will require multiple swaps if the smallest number is at the end of the array.
    
    * **Shell Sort** : This is a variation of Insertion sort in order to cut down on the time it takes to sort the 
    array (i.e the number of shifts required in the process.) This algorithm uses a "gap value" to perform the 
    insertion of the element instead of comparing it with its immediate neighbour(s) step by step. For example, 
    if the gap value is 3, you compare the item with its third neighbour (swap where necessary, and continue the 
    process for the rest of the elements) until you hit the end of the array.
    
    As the algorithm continues, the gap value reduces until it becomes 1. The last iteration with the gap value of 1 
    is the normal insertion sort.
    
    There are many ways to get the gap value. This implementation uses (array.length/2 to calculate the gap value on 
    every iteration.
     
    Runtime Complexity - Variable : Unstable Sort
     
    * **Merge Sort** : This sort algorithm requires splitting an array into smaller sections and merging them back into 
    a sorted array. The sorting process happens during the merge. The splitting phase is executed by dividing the array 
    into 2 sub arrays. Each sub array is further divided into 2 and the process continues until you have a 1 element 
    sub array across. The merging phase is executed by comparing elements in sub arrays and re-positioning them in a 
    sorted fashion. The merge happens from the single element array until the entire array is reformed.
    
    It is mostly implemented using recursion. It is not an in-place sort algorithm, temporary arrays are created to 
    hold the sorted elements during the merge.
    
    Runtime Complexity - O(N Log N) : Stable Sort
    
    * **Quick Sort** : This is another divide and conquer algorithm that takes a pivot element. It puts everything less 
    than the pivot on the left and all elements greater than the pivot on the right while moving indexes from each end 
    of the array until they meet. The final meeting point of these indexes will be the position of the pivot. By doing 
    so, the pivot ends up in its sorted position. This process is repeated for the left and right side of the pivot. 
    Finally, the array will be sorted since all pivots end up in their sorted position. This is an inplace algorithm. 
    The selection of the pivot can affect the time the algorithm takes to execute.
    
    Runtime Complexity - O(N Log N) : Unstable Sort
    
    * **Counting Sort** : This algorithm requires counting the occurences of elements in an array and using it to 
    reform the array in a sorted manner. It assumes that the elements in the array are within a specific range of 
    values. Therefore, it does uses only distinct data types (no negatives, no floats, mostly whole numbers). 
    It is picky on data types. However, the benefits of using this method is seen if the values in the array is 
    closer to the length of the array. For e.g an array of size 10 has elements between 1 to 10. The counting sort 
    creates another array with the size of the highest number in the assumed range and places the number of occurence 
    for each element in the relate position in the new array. As in the example, all counts of value 1 will be in the 
    first position of the new array.
    
    Runtime Complexity : O(N) : Unstable Sort
    
    * **Radix Sort** : This algorithm also makes assumptions about the data it is trying to sort. Elements must be of 
    the same radix (i.e unique data sequence, digits have radix of 10 which is 0-9, alphabets have radix of 26 a-z, 
    binary has 2, 0-1) and width (i.e number of characters in the number or word. 1236 has width of 4, hello has width 
    of 5). It does not work with decimals or any data type that is not compliant with the regular radix system. 
    It is a stable sort because the stability helps to ensure that the final sort is correct. 
    
    The process involves analysing and sorting elements based on each digit or character in the same position. 
    In a number system, all numbers in the units position is analysed, then tens, the hundreds, then thousands 
    etc (from right to left) until you get to the leftmost digit. At the end of the process, the array is sorted.
     
    Runtime Complexity : O(N) - O(N Log N) : Stable Sort
    
4. **Search** 

### Advantages of Arrays
1. It takes constant time to find an element in an array given the specific index.

### Disadvantages of Arrays
1. Searching without the use of the array index is expensive. O(N)


## 2. Lists
The List is an Abstract Data Type - not exactly a concrete data structure. This means that an Interface is involved 
where other data structures inherit from. Data is ordered sequentially in Lists. There are many structures that 
implement the List interface. Some examples are : 

### a. ArrayList
This is a resizable array hence it can be extended and reduced at will. In contrast to a regular array, once created 
with an initial capacity, it cannot be modified, a new array has to be created. An ArrayList hass options of creating 
an object without a capacity (defaults to 10) or with capacity. Indexing is also 0-based just like arrays.

An arrayList is not synchronized i.e it does not perform seamlessly in a multi-threaded circumstance where various 
threads are manipulating the list. 

#### Advantages of Arraylist
* The arrayList is good for random access provided the index is given O(1). This happens in constant time. 
* It is also good for iterating through the elements in the list
* Adding items at the end of the list also performs in constant time.

#### Disadvantages of Arraylist
* Searching without an index is expensive - O(N)
* Inserting elements in a specific location is also expensive. This requires a result shift in other elements of 
accommodate the new entry.
* Removal also requires shifts to close the gap caused by deleting an element.

### b. Vector

A vector is **synchronized**, it works seamlessly in a multi-threaded environment. It has been available in the JDK since 
version 1.0 It is very similar to an ArrayList.

### c. LinkedList
A LinkedList is a data structure with a sequential list of objects where each object has a link/object reference to 
the next. Unlike arrays or DS backed by arrays where elements are not aware of each other. Each item in the list is 
called a NODE. The first item in the list is called the HEAD.  

The Java LinkedList implementation is indeed a Doubly LinkedList. It also implements the List interface therefore
all list related methods are available within. LinkedList already handles the node-node relationship hence there is 
no need to write a node class. This LinkedList is not synchronized.

#### Types of LinkedLists
In the code implementation, I have manually created a singly linkedlist, doubly linkedlist and finally made use of what 
Java's LinkedList implementation.

* **Singly LinkedList** : For this DS, each element has reference to only the next element. The last element points to 
null because there is no other element after it. It is advantageous to add or remove element (constant time)) from the 
front of the list. This is because the head of the array is always known and there is no requirement to traverse through
the whole list just to insert or remove. If eventually there is a need to add/remove items from any other location in
the list, this will increase the time taken to achieve it.

* **Doubly LinkedList** : Here, there is an extra reference to the previous element. The head node has a previous 
element of null and the tail node also has a next element of null. Every other node inbetween holds both the previous 
and next element's reference.

* **Circular LinkedList** : In this implementation (extended from Singly LinkedList), the tail's next reference points 
back to the head node to create a loop.

#### Advantages of LinkedList
* Singly LinkedList is good for adding items at the head or tail of the list
* Doubly LinkedList is good for adding items anywhere in the list
* It takes the sequence in which items were added.
* there is no requirement to give the initial capacity of the list. It grows and shrinks at runtime.
* Inserting and deleting elements does not require the overhead of shifting elements.
* Reverse traversal is easier in doubly linked list since there is a reference to the previous element

#### Disadvantages of LinkedList
* LinkedList requires a traversal through the list in order to search or insert an element anywhere else in the list
* It requires more storage space since it has to store the links to other elements
* Reverse traversal is difficult in singly linkedlist, however in doubly linkedlist, it requires more storage due to 
the links of the previous element.


## 3. Stacks



