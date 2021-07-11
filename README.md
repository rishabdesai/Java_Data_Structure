# Java_Data_Structure
Data Structure using Java


## Searching

* Linear Search  O(n)

we can use it to search element in any sorted as well as un-sorted collection.
If collection contains less no. of elements, then linear search is efficient.

* Binary Search  O(logn)

To overcome limitation of linear search, use binary search.
We can use binary search on sorted collection/ array ONLY.
Binary search is based on divide & conquer technique.

## Sorting

* Selection Sort  O(n2)

The algorithm divides the input list into two parts; the sorted list which is built up to left-side and on right-side is rest of unsorted list. Initially sorted list is empty and unsorted list is the entire input list.
The algorithm proceeds by finding the smallest element in the unsorted sub-list, and swapping it with the leftmost element, and moving the sub-list boundaries one element to the right.

* Bubble Sort  O(n2)

Compares each pair of adjacent items and swap then if they are in wrong order.
The pass through the list is repeated until no swaps are needed, which indicates that the list is sorted.

* Insertion sort  O(n2)

Single element by default is sorted.
Hence we start comparison from second element, say key (i+1).
Now compare key (i+1) with first element (i) and swap if key (i+1) < (i).
If no element left to compare, then increment key (i+1) position.

efficient for small data sets.

* Quick Sort  O(n2)

Its implementation is based on divide & conquer technique.
Idea is to select any element in the list (say first) and call it pivot. Place the pivot element on the list so that all the numbers less than pivot will be on LHS and all the numbers greater then pivot will be on RHS of pivot. Hence we can partition the list in to two sub-lists. Now we can apply same procedure on each sub-list.

	1. If single element or invalid partition, then stop
	2. consider leftmost element as pivot
	3. from left find element greater than pivot (ith element)
	4. from right, find element less than or equal to pivot (jth element)
	5. if i & j not crossed, then swap ith element with jth element.
	6. repeat steps 2 to 4 till i & j cross each other.
	7. swap jth element with pivot.
	8. apply quick sort to left partition
	9. apply quick sort to right partition.

* Merge Sort  O(nlogn)

Divide the whole array into two equal parts. Sort the two parts separately and Merge the two array in temporary array. Copy the temporary array into original array.

	1. If single element or invalid partition, then stop
	2. divide array into two equal partitions
	3. apply merge sort to left partition (left to mid)
	4. apply merge sort to right partition (mid+1 to right)
	5. create temp. array to accommodate both partitions
	6. merge both sorted partitions into temp array.
	7. override temp array back to the main array.

* Stack

- Stack is utility data structure/ helper data structure / adaptor data structure.
- Last-In-First-Out (LIFO)
- Operations: push(), pop(), peek(), isEmpty(), isFull()
- Purpose of stack is not to store data, rather to process the data. 
- Stack is implemented using array or linked list.
- push and pop operations are done from same end

* Queue 

- First-In-First-Out (FIFO)
- push and pop operations are done from diffenent end (rear and front)