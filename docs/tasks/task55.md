# Task Description

You are given an array A consisting of N positive integers. Consider subarrays of A, with at least two elements, whose first and last elements have the same value. Your task is to find the largest possible sum of such a subarray.

For example, for array A = [1, 3, 6, 1, 6, 6, 9, 9], the following subarrays meet the requirements:

• [1, 3, 6, 1]: first and last elements are equal to 1; the sum of the subarray is 11.
• [6, 1, 6]: first and last elements are equal to 6; the sum of the subarray is 13.
• [6, 1, 6, 6]: first and last elements are equal to 6; the sum of the subarray is 19.
• [6, 6]: first and last elements are equal to 6; the sum of the subarray is 12.
• [9, 9]: first and last elements are equal to 9; the sum of the subarray is 18.

The subarray with the largest sum is [6, 1, 6, 6] and its sum is 19.

## Write a function:

```
int solution(int A[], int N);
```

that, given an array A of N positive integers, returns the largest sum of a subarray whose first and last elements have the same value.

If there is no such subarray, return -1.

## Examples:

1. Given A = [1, 3, 6, 1, 6, 6, 9, 9], the function should return 19, as explained above.

2. Given A = [5, 1, 4, 3], the function should return -1. There is no subarray satisfying the requirements.

3. Given A = [2, 2, 2, 3, 2, 3], function should return 11. The subarray with the largest sum is [2, 2, 2, 3, 2].

## Write an efficient algorithm for the following assumptions:

• N is an integer within the range [2..100,000];
• each element of array A is an integer within the range [1..10,000].