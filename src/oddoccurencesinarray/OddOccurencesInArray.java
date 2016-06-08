
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
