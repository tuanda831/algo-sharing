**Description:**

There is a road consisting of N segments, numbered from 0 to N-1, represented by a string S. Segment S[K] of the road may contain a pothole, denoted by a single uppercase "X" character, or may be a good segment without any potholes, denoted by a single dot ".".

For example, string ".X..X" means that there are two potholes in total in the road: one is located in segment S[1] and one in segment S[4]. All other segments are good.

The road fixing machine can patch over three consecutive segments at once with asphalt and repair all the potholes located within each of these segments. Good or already repaired segments remain good after patching them.

Your task is to compute the minimum number of patches required to repair all the potholes in the road.

**Write a function:**

```c
int solution(char *S);
```

that, given a string S of length N, returns the minimum number of patches required to repair all the potholes.

**Examples:**

1. Given S = ".X..X", the function should return 2. The road fixing machine could patch segments 0-2 and 2-4.
2. Given S = "X.XXXXX.X", the function should return 3. The road fixing machine could patch segments 0-2, 3-5 and 6-8.
3. Given S = "XX.XXX", the function should return 2. The road fixing machine could patch segments 0-2 and 3-5.
4. Given S = "XXXX", the function should return 2. The road fixing machine could patch segments 0-2 and 1-3.

**Assumptions:**

- N is an integer within the range [3..100,000];
- string S is made only of the characters '.' and/or 'X'.