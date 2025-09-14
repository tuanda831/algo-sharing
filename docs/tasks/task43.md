# Task description

There is an array A consisting of N integers. Divide them into three non-empty groups. In each group we calculate the difference between the largest and smallest integer. Our goal is to make the maximum of these differences as small as possible.

For example, given A = [11, 5, 3, 12, 6, 8, 1, 7, 4], we can divide the elements into three groups:

• [3, 1, 4] – the difference between elements is 3;
• [5, 6, 8, 7] – the difference is also 3;
• [11, 12] – the difference is 1.

The maximum difference equals 3, which is the minimum possible result.

Write a function:

```
int solution(int A[], int N);
```

that, given an array A, returns the minimum possible result as explained above.

## Examples:

1. For A = [11, 5, 3, 12, 6, 8, 1, 7, 4], the function should return 3, as explained above.

2. For A = [10, 14, 12, 1000, 11, 15, 13, 1], the function should return 5. The elements of A should be divided into three groups as follows:
   • [1];
   • [10, 14, 12, 11, 15, 13];
   • [1000].

3. For A = [4, 5, 7, 10, 10, 12, 12, 12], the function should return 2. The elements of A could be divided into these three groups:
   • [4, 5];
   • [7];
   • [10, 10, 12, 12, 12]

4. For A = [5, 10, 10, 5, 5], the function should return 0. The first group may contain all elements with value 5; the second and the third groups may each contain one element with value 10.

Write an efficient algorithm for the following assumptions:

• N is an integer within the range [3..100,000];
• each element of array A is an integer within the range [0..1,000,000,000].
