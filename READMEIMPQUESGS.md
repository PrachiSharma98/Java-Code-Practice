1st question based on string or array manipulation. The logic was convertible between numbers and alphabets. I attempted the alphabet version.
2nd question – https://www.geeksforgeeks.org/trapping-rain-water/
3rd question – Merging intervals question. Link – https://www.geeksforgeeks.org/merging-intervals/
Stock buy and sell
Second largest number in an array.
Merge two sorted arrays.
Find the first non-repeating character in an array.
Ref: https://www.geeksforgeeks.org/given-a-string-find-its-first-non-repeating-character/

: Form the largest possible number from the array of number.
Ref: https://www.geeksforgeeks.org/given-an-array-of-numbers-arrange-the-numbers-to-form-the-biggest-number/

We are given an array asteroids of integers representing asteroids in a row.

For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.



 

Example 1:

Input: asteroids = [5,10,-5]
Output: [5,10]
Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.
Example 2:

Input: asteroids = [8,-8]
Output: []
Explanation: The 8 and -8 collide exploding each other.
Example 3:

Input: asteroids = [10,2,-5]
Output: [10]
Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.
 



Given a String and two words (which occur in the given string), find the minimum distance between two words. Distance between two words is defined as the number of characters between the given two words’ middle characters. The brute-force approach was already implemented but it had some logical bugs, and because of which sample test cases were failing. The objective was to find and fix those bugs and then to add some new test cases and write a code for those test cases as well.
Simple DFS + DP in a 2D matrix to find the minimum cost path.
