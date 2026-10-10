# [Reading Books](https://www.geeksforgeeks.org/problems/reading-books3803/1?page=5&category=Arrays&difficulty=Basic&sortBy=submissions)
## Easy
Given two arrays arr1[] and arr2[], and an integer k, where arr1[i] represents the time required to read a book of kind i once and arr2[i] represents the points earned after reading it once.
Geek has k minutes and can choose exactly one kind of book. He may read the chosen book repeatedly within the available time, but cannot read books of different kinds.
Return the maximum possible points Geek can earn.
Examples:
Input: k = 10, arr1[] = [3, 4, 5], arr2[] = [4, 4, 5]
Output: 12
Explanation:Choosing the first kind allows Geek to read it ⌊10 / 3⌋ = 3 times and earn 3 × 4 = 12 points.
Choosing the second kind allows Geek to read it ⌊10 / 4⌋ = 2 times and earn 2 × 4 = 8 points.
Choosing the third kind allows Geek to read it ⌊10 / 5⌋ = 2 times and earn 2 × 5 = 10 points.
Therefore, the maximum points Geek can earn is 12.
Input: k = 12, arr1 = [8, 5], arr2 = [100, 5]
Output: 100
Explanation:Choosing the first kind allows Geek to read it ⌊12 / 8⌋ = 1 time and earn 1 × 100 = 100 points.
Choosing the second kind allows Geek to read it ⌊12 / 5⌋ = 2 times and earn 2 × 5 = 10 points.
Therefore, the maximum points Geek can earn is 100.
Constraints:1 ≤ arr.size() ≤ 1051 ≤ k, arr1[i]&nbsp;≤ 1040 ≤ arr2[i] ≤ 104 