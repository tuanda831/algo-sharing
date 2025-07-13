**Description:**

There is an array A of N integers sorted in non-decreasing order. In one move, you can either:
- Remove an integer from A, or
- Insert an integer before or after any element of A

The goal is to achieve an array where all values X that are present in the array occur exactly X times.

**Examples:**

1. Given A = [1, 1, 3, 4, 4, 4], the function should return 3:
   - Remove one 1 (now: 1 occurrence)
   - Remove one 3 (removed entirely)
   - Insert one 4 (now: 4 occurrences)
   - Result: [1, 4, 4, 4, 4]

2. Given A = [1, 2, 2, 2, 5, 5, 5, 8], return 4:
   - Remove one 2 (now: 2 occurrences)
   - Remove 8 (removed entirely)
   - Insert two 5s (now: 5 occurrences)
   - Result: [1, 2, 2, 5, 5, 5, 5, 5]
3. Given A = [1, 1, 1, 1, 3, 3, 4, 4, 4, 4, 4], the function should return 5
4. Given A = [10, 10, 10], return 3:
   - Remove all elements (empty array is valid)

**Assumptions:**
- N is an integer within [1..100,000]
- Elements are integers within [1..100,000,000]
- Array is sorted in non-decreasing order