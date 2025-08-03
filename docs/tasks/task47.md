# Task description

You are given a string consisting of lowercase letters of the English alphabet. You must split this string into a minimal number of substrings in such a way that no letter occurs more than once in each substring.

For example, here are some correct splits of the string 'abcdec': ('a', 'bac', 'dec'), ('a', 'bacd', 'ec') and ('ab', 'ac', 'dec').

Write a function:

```
int solution(char *S);
```

that, given a string S of length N, returns the minimum number of substrings into which the string has to be split.

## Examples:

1. Given 'world', your function should return 1. There is no need to split the string into substrings as all letters occur just once.

2. Given 'dddd', your function should return 4. The result can be achieved by splitting the string into four substrings ('d', 'd', 'd', 'd').

3. Given 'cycle', your function should return 2. The result can be achieved by splitting the string into two substrings ('cy', 'cle') or ('c', 'ycle').

4. Given 'abba', your function should return 2. The result can be achieved by splitting the string into two substrings ('ab', 'ba').

Write an efficient algorithm for the following assumptions:
• N is an integer within the range [1..1,000,000];
• string S is made only of lowercase letters (a-z).