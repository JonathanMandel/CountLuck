# CountLuck
A non-recursive solution to the HackerRank challenge Count Luck, written in Kotlin

Count Luck presents a 2D matrix of cells up to 100x100. Each cell contains "." an open cell, "X" a blocked cell, "M" the start cell, and "*" the end cell. 
There is always exactly one path from M to *. 

The challenge also passes k, a guess at the number of decision points (cells with more than one exit) required between M and *. 
If k is correct, returns "Impressed". If not, returns "Oops".

This solution is iterative, not recursive. It uses a stack to keep a history of decision points. 
