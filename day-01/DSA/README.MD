### Assignment 1 — Array & Big-O Warm-up
1. What is the time complexity of accessing `arr[i]` in an array?
Array is a index based linear data structure.For accessing any element if index is given it takes constant time complexity to fetch data at that index. So time complexity for accessing `arr[i]` will take O(1) time complexity.

1. What is the time complexity of traversing an array of `n` elements?
If array has `n` elements it will take O(n) time complexity to traverse the whole array.

1. Why is inserting an element in the middle of an array potentially `O(n)`?
Array is a contiguous linear data structure if we insert any element in middle of an array.It copy data of index i to index i+1 and at index i stores the element. In worst case scenario the index i could be zero so it will take O(n) to do so.

1. What is the difference between time complexity and space complexity?
Time complexity :: tells how much time it will take to execute the operation in worst case scenario.
Space complexity :: tells how much space will be consumed to perform the operations in worst case scenario.

1. What do `O(1)`, `O(n)` and `O(n²)` mean intuitively?
O(1) :: If any task performs at once or need a single variable to be stored it is considered O(1).
O(n) :: If any task performs n times or need to store n variables in worst case scenario it is considered as O(n).
O(n²) :: If any taks performs nxn times or need to store nxn variable in worst case scenario it is considered as O(n²).

### Assignment 2 — LeetCode #1: Two Sum

Solve **Two Sum**.
- What is the input?
The method will get two input a size of n array of integers and a target value.
- What is the output?
The method wants a return of array of size two.
- What exactly are we being asked to find?
The question asked to return index of the two element which add up to target. The solution exist and only single solution is present.
- Are there any assumptions about duplicate values or reuse of the same element?
According to the question I cannot use any element twice means two indeces need to be distinct.

- Implement the straightforward approach first.
The brute force approach is to use nested for loop where first loop decides the first number and second loop decides the second number if both number's sum = target it will return indeces FYI indeces need not to be same as an additional condition.
- Why it works
It checked each posibilities to find sum of two number present in the same array. So in worst case scenario it will take O(n²) time complexity and constant space.
- Time complexity :: O(n²)
- Space complexity :: O(1)
Without looking at a solution, ask yourself:

> What information could I remember while scanning the array so that I don't have to repeatedly search the previous elements?
Document:
- Your idea
If I can get a element fix just need to find a single element it will take less time complexity.

- Why it should be faster
I can use hashmap to solve the problem
- Time complexity :: O(n)
- Space complexity :: O(n)
The optimized solution is 