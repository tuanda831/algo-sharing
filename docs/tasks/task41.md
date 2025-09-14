# Task description

Today our world is approaching an ecological crisis. Due to global warming, the sea level is rising. At the same time, the amount of drinkable water is decreasing. One idea about preventing the loss of drinkable water is the propagation of rainwater storage, in other words, equipping houses with a water tank for rainwater.

You are given a string S describing a street, in which 'H' denotes a house and '-' denotes an empty plot. You may place water tanks in empty plots to collect rainwater from nearby houses. A house can collect its own rainwater if there is a tank next to it (on either the left or the right side).

Your task is to find the minimum number of water tanks needed to collect rainwater from all of the houses.

For example, given S = "-H-HH-", you can collect rainwater from all three houses by using two water tanks. You can position one water tank between the first and second houses and the other after the third house. This placement of water tanks can be represented as "-HTHHT-", where 'T' denotes a water tank.

Write a function:

```
int solution(char *S);
```

that, given a string S of length N, returns the minimum number of water tanks needed.

If there is no solution, return -1.

**Examples:**

1. Given S = "-H-HH-", the function should return 2, as explained above.

2. Given S = "H", the function should return -1. There is no available plot on which to place a water tank.

3. Given S = "HH-HH", the function should return -1. There is only one plot to put a water tank, and it is impossible to collect rainwater from the first and last houses.

4. Given S = "-H-H-H-H-H", the function should return 3. One possible way of placing water tanks is "-HTH-HTHTH".

**Assume that:**
- N is an integer within the range [1, 20];
- string S is made only of the characters '-' and/or 'H'.

In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.