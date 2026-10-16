# [Sum of upper and lower triangles](https://www.geeksforgeeks.org/problems/sum-of-upper-and-lower-triangles-1587115621/1)
## Easy
Given a square matrix mat[][]&nbsp;of size n*n, return&nbsp;an array of two elements containing two values: the sum of Upper Triangle elements and the sum of Lower Triangle elements. Upper Triangle consists of elements on the diagonal and above it. The lower triangle consists of elements on the diagonal and below it.&nbsp;
Examples:
Input: n = 3, mat[][] = [[6, 5, 4],
&nbsp;                      [1, 2, 5],
&nbsp;                      [7, 9, 7]]
Output: [29, 32]
Explanation: Upper triangular matrix:
6 5 4
&nbsp;&nbsp;2 5
&nbsp;&nbsp;&nbsp; 7
Sum of these elements is 6 + 5 + 4 + 2 + 5 + 7 = 29.Lower triangular matrix:
6
1 2
7 9 7
Sum of these elements is 6 + 1 + 2 + 7 + 9 + 7 = 32.
Input: n = 2, mat[][] = [[1, 2],
&nbsp;                      [3, 4]]
Output: [7, 8]
Explanation: Upper triangular matrix:
1 2
&nbsp; 4
Sum of these elements are 1 + 2 + 4 = 7.
Lower triangular matrix:
1
3 4
Sum of these elements are 1 + 3 + 4 = 8.
Constraints:&nbsp;1&nbsp;≤&nbsp;n ≤ 5001&nbsp;≤ mat[i][j]&nbsp;≤ 1000