# Java_Data_Structure
Data Structure using Java

1. [Searching](#Searching)
	* [Linear Search](#Linear_Search)
	* [Binary Search](#Binary_Search)
	
2. [Sorting](#Sorting)
	* [Selection_Sort](#Selection_Sort)
	* [Bubble_Sort](#Bubble_Sort)
	* [Insertion_sort](#Insertion_sort)
	* [Quick_Sort](#Quick_Sort)
	* [Merge_Sort](#Merge_Sort)
	
3. [Stack & Queue](#Stack&Queue)
	* [Stack](#Stack)	
	* [Queue](#Queue)
	
4. [Tree](#Tree)
	* [BST](#BST)
	* [DFS](#DFS)
	* [BFS](#BFS)
	
	
5. [Graph](#Graph)
	* [DFS_Graph](#DFS_Graph)
	* [BFS_Graph](#BFS_Graph)
	* [Spanning_Tree](#Spanning_Tree)

6. [Questions](#Questions)

7. [Ref](#Ref)

## Searching

### Linear_Search

- O(n)
we can use it to search element in any sorted as well as un-sorted collection.
If collection contains less no. of elements, then linear search is efficient.

### Binary_Search

- O(log n)
To overcome limitation of linear search, use binary search.
We can use binary search on sorted collection/ array ONLY.
Binary search is based on divide & conquer technique.

## Sorting

### Selection_Sort

- O(n2)
The algorithm divides the input list into two parts; the sorted list which is built up to left-side and on right-side is rest of unsorted list. Initially sorted list is empty and unsorted list is the entire input list.
The algorithm proceeds by finding the smallest element in the unsorted sub-list, and swapping it with the leftmost element, and moving the sub-list boundaries one element to the right.

### Bubble_Sort

- O(n2)
Compares each pair of adjacent items and swap then if they are in wrong order.
The pass through the list is repeated until no swaps are needed, which indicates that the list is sorted.

### Insertion_sort

- O(n2)
Single element by default is sorted.
Hence we start comparison from second element, say key (i+1).
Now compare key (i+1) with first element (i) and swap if key (i+1) < (i).
If no element left to compare, then increment key (i+1) position.

efficient for small data sets.

### Quick_Sort

- O(n2)
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

### Merge_Sort

- O(nlog n)
Divide the whole array into two equal parts. Sort the two parts separately and Merge the two array in temporary array. Copy the temporary array into original array.

1. If single element or invalid partition, then stop
2. divide array into two equal partitions
3. apply merge sort to left partition (left to mid)
4. apply merge sort to right partition (mid+1 to right)
5. create temp. array to accommodate both partitions
6. merge both sorted partitions into temp array.
7. override temp array back to the main array.

## Stack&Queue

### Stack

- Stack is utility data structure/ helper data structure / adaptor data structure.
- Last-In-First-Out (LIFO)
- Operations: push(), pop(), peek(), isEmpty(), isFull()
- Purpose of stack is not to store data, rather to process the data. 
- Stack is implemented using array or linked list.
- push and pop operations are done from same end

### Queue 

- First-In-First-Out (FIFO)
- push and pop operations are done from different end (rear and front)

## Tree

### BST

![tree](https://github.com/rishabdesai/Java_Data_Structure/blob/5be5f2292ae79cbdc1d25c82c5ab82dc21e84bb5/images/Tree.png)

-  (Binary Search Tree) fro tree
- add,recPreOrder, recInOrder, recPostOrder, recHeight, recSearch, delTree  

### DFS

- (Depth First Search) for Tree
- use stack<Node>
- push root on stack
- pop a node from stack  - say trav
- visit trav and print
- if trav has right child, then push it on stack
- if trav has left child, then push it on stack
- repeat steps 2to5, until stack is empty. 

### BFS

- (Breadth First Search) for Tree
- Same as DFS, but use Queue and first push left on stack and then right.

## Graph

![graph](https://github.com/rishabdesai/Java_Data_Structure/blob/e2b2bc4f2be7aa73e3eb73acb223a8db2d0ea868/images/graphs.png)

### DFS_Graph 

- (Depth First Search) for Graph
1. create stack of vertices
2. Push start vertex on *stack* and mark it.
3. create an boolean array to mark the vertices.
4. Pop vertex from stack - say trav.
5. Print the vertex.
6. find all not marked vertices and push on stack and mark them. 
	(to find adjacent vertices, go through row of that vertex in adjacency matrix. If found 1 / True, then it is a neighbor.)
7. Repeat steps 4 to 6 until the stack is empty.


### BFS_Graph

- (Breadth First Search) for Graph 
- choose a vertex as start vertex.
- Push start vertex on *queue* and mark it.
- to mark, use an Boolean array with size = vertices
- Pop vertex from queue.
- Visit (Print) the vertex.
- Pull all non-visited neighbors of the vertex on the queue and mark them.
- to find adjacent vertices, go through row of that vertex in adjacency matrix. If found 1 / True, then it is a neighbor.
- Repeat steps 3 to 5 until the queue is empty.

### Spanning_Tree

- Tree is a graph without cycles.
- Spanning tree is connected sub-graph of the given graph, that contains all the vertices and sub-set of edges(V-1).
- It is a graph that can be formed after removing one or more edges so that sub-graph remains connected and does not contains a cycle.

## Questions

### RecursionQuestions

- How to find sum of digits of a positive integer number using recursion
- Find factorial of a number


## Ref

- [freeCodeCamp](https://www.youtube.com/watch?v=IJDJ0kBx2LM)