###Uses for XOR


Basic rule of XOR operation is that, when both inputs are equal result is Zero/False.

0 ^ N = N
N ^ N = 0
in terms of Binary Bits:


thus you can use XOR operation in following case:

If you are given an Array where every number is repeated twice(or even number of times) and except one. which appears exactly once.

approach: to find that number which appears exactly once(or odd number of times), you can use XOR on all elements of array. result will be the element that appears exactly once according to rule 2 above.

You can use XOR operation to find missing number from a given range of numbers from 1 to n.

approach: to find missing number, you first take XOR of all the elements in your array.
then you take XOR of all the numbers in range 1 to n. You then take XOR of these two results, to get the missing number.

You can use XOR operation to determine if your given array of Boolean elements contains odd number of True elements.

This is the same question that I had and I found this information on StackOverflow.




<b>References</b>

https://www.quora.com/In-which-cases-do-you-use-XOR
https://www.cs.umd.edu/class/sum2003/cmsc311/Notes/BitOp/xor.html
