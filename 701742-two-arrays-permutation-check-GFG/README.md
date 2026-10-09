# [Two Arrays Permutation Check](https://www.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1)
## Easy
Given two arrays a[] and b[] of equal size, the task is to find whether the given arrays are permutation of each other. Two arrays are said to be permutation if both contain the same set of elements, arrangements of elements may be different though.Note: If there are repetitions, then counts of repeated elements must also be the same for two arrays to be permutation.Examples:Input: a[] = [1, 2, 5, 4, 0], b[] = [2, 4, 5, 0, 1]
Output: true
Explanation: Both arrays contain the same elements and can be rearranged to [0, 1, 2, 4, 5]. Therefore, the output is true.
Input: a[] = [1, 2, 5], b[] = [2, 4, 15]
Output: false
Explanation: a[] and b[] have only one common value, 2. All others elements are different so the arrays cannot be rearranged to become equal. Therefore, the output is false.