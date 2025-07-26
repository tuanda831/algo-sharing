# Problem Description

There is a string S of length N consisting of lowercase English letters (the letters are numbered from 1 to N). We are going to insert M `'$'` characters into the string in the order described by the contents of array C. The K-th `'$'` character (for K from 0 to M-1) is inserted after the C[K]-th letter in S. (the `'$'` character is not considered a letter). For example, given S = "aabcba" and C = [1, 3, 2], we will insert three `'$'` characters into S, thus obtaining following strings: "a$abcba" → "a$ab$cba" → "a$a$b$cba".

What is the minimum number of steps after which we can stop, such that there is at least one `'$'` character between every two occurrences of the same letter?

In the example above, after the first insertion there are no `'$'` characters between the two letters 'b' (3rd and 5th letters in S), but after the second insertion there is a `'$'` between every two occurrences of every letter, so the answer is 2.

Write a function:

```
function solution(S, C);
```

that, given a string S of length N and an array C of length M, returns an integer – the number of insertions after which there will be a `'$'` character between every two occurrences of the same letter. If the condition is not met after all the insertions have been made, return -1.

## Examples:

1. Given S = "aabcba" and C = [1, 3, 2], the function should return 2, as explained above.

2. Given S = "aaa" and C = [1, 2], the function should return 2:

   "aaa" → "a$aa" → "a$a$a".

3. Given S = "aabcddcb" and C = [3, 5, 1, 4, 7], the function should return 3. After the third insertion, all letters have a `'$'` character between their occurrences:

   "aabcddcb" → "aab$cddcb" → "aab$cd$dcb" → "a$ab$cd$dcb".

4. Given S = "wkwk" and C = [1], the function should return -1. After the only insertion, the letter 'k' doesn't have a `'$'` character between its occurrences: "w$kwk".

5. Given S = "abcd" and C = [1, 2], the function should return 0. There is no need to insert any `'$'` characters.

## Constraints

Write an efficient algorithm for the following assumptions:

• N is an integer within the range [2..50,000];
• M is an integer within the range [1..N-1];
• string S is made only of lowercase letters (a-z);
• the elements of C are all distinct;
• each element of array C is an integer within the range [1..N-1].