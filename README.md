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
* Merge Sort  O(nlogn)
