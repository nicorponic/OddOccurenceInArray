/*
A non-empty zero-indexed array A consisting of N integers is given. The array 
contains an odd number of elements, and each element of the array can be paired 
with another element that has the same value, except for one element that is 
left unpaired.

For example, in array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the elements at indexes 0 and 2 have value 9,
the elements at indexes 1 and 3 have value 3,
the elements at indexes 4 and 6 have value 9,
the element at index 5 has value 7 and is unpaired.
Write a function:

class Solution { public int solution(int[] A); }
that, given an array A consisting of N integers fulfilling the above conditions,
returns the value of the unpaired element.

For example, given array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the function should return 7, as explained in the example above.

Assume that:

N is an odd integer within the range [1..1,000,000];
each element of array A is an integer within the range [1..1,000,000,000];
all but one of the values in A occur an even number of times.
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(1), beyond input storage (not counting
the storage required for input arguments).
Elements of input arrays can be modified.
Copyright 2009–2016 by Codility Limited. 
All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
 */
package oddoccurencesinarray;

public class OddOccurencesInArray {

    public static void main(String[] args) {

        int A[] = {9, 5, 5, 6, 3, 6, 3};

        // sets unpaired equal to A[0]. So 9 in this case
        int unPairedNum = A[0];

        for (int i = 1; i < A.length; i++) {
            // An exclusive OR (^), usually abbreviated XOR, will set a bit on if, 
            //and only if, the bits being compared are different.If they are the same
            //the the result is 0.
            // So in this case unpairednum will kinda "remember" all numbers as
            //long as they are not repeated twice. When that happens, unpairednum
            // forgets both numbers.
            unPairedNum = unPairedNum ^ A[i];
        }

        System.out.println(unPairedNum);
    }

}
