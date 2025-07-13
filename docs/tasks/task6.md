**Description:**

Write a function `solution` that, given a string S of length N, returns the length of the shortest unique substring of S, that is, the length of the shortest substring which occurs in S exactly once.

**Examples:**

1. Given S = "abaaba", the function should return 2. The shortest unique substring is "aa".
2. Given S = "zyzyzyz", the function should return 5. The shortest unique substring is "yyyyy" (note that overlapping occurrences count as multiple occurrences).
3. Given S = "aabbbabaaa", the function should return 3. All substrings of length 2 occur at least twice.

**Assumptions:**
- N is an integer within the range [1..200]
- String S consists only of lowercase letters (a-z)
- Focus on correctness (performance is not critical)