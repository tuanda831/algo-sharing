# Task description

There is an array A of N integers and three tiles. Each tile can cover two neighbouring numbers from the array but cannot intersect with another tile. It also cannot be placed outside the array, even partially.

Write a function:

```c
int solution(int A[], int N);
```

that, given an array A of N integers, returns the maximum sum of numbers that can be covered using at most three tiles.

## Examples:

1. Given A = [2, 3, 5, 2, 3, 4, 6, 4, 1], the function should return 25. There is only one optimal placement of tiles: (3, 5), (3, 4), (6, 4).

2. Given A = [1, 5, 3, 2, 6, 6, 10, 4, 7, 2, 1], the function should return 35. One of the three optimal placements of tiles is (5, 3), (6, 10), (4, 7).

3. Given A = [1, 2, 3, 3, 2], the function should return 10. There is one optimal placement of tiles: (2, 3), (3, 2). Only two tiles can be used because A is too small to contain another one.

4. Given A = [5, 10, 3], the function should return 15. Only one tile can be used.

Write an efficient algorithm for the following assumptions:

• N is an integer within the range [2..100,000];
• each element of array A is an integer within the range [0..1,000,000].