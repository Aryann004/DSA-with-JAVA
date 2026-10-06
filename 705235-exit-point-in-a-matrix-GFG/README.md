# [Exit Point in a Matrix](https://www.geeksforgeeks.org/problems/exit-point-in-a-matrix0905/1)
## Medium
Given a matrix mat[][] of size n × m consisting of 0s and 1s. You start at the top-left cell (0, 0). Initially, you are positioned at (0, 0) and facing right (toward (0, 1)). Before each move, apply the rules based on the value of the current cell:

If the current cell contains 0, continue moving in the same direction.
If the current cell contains 1, change your direction to the right (clockwise turn), and update the cell value to 0.

You continue this process until you move outside the boundaries of the matrix. Determine the coordinates (row and column index) of the cell from which you exit the matrix.
Examples:
Input: mat[][] = [[0, 1, 0],
               [0, 1, 1],                [0, 0, 0]]
Output: [1, 0]
Explanation: From the image we can see that, enter the matrix at (0, 0) -&gt; then move towards (0, 1) -&gt;  1 is encountered -&gt; turn right towards (1, 1)  -&gt; again 1 is encountered -&gt; turn right again towards (1, 0) -&gt; now, the boundary of matrix will be crossed. Hence, exit point reached at [1, 0].

Input: mat[][] = [[1, 1],                 [0, 1]]
Output: [1, 0]Explanation:Enter the matrix at (0, 0) facing right
-&gt; 1 is encountered at (0, 0)
-&gt; turn right and move to (1, 0)
-&gt; 0 is encountered at (1, 0)
-&gt; continue moving down and cross the matrix boundary. Hence, the exit point is reached at [1, 0].
Constraints:1 ≤ n, m ≤ 100