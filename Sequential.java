public class Sequential {
    public static int sequential( int[] A, int b) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == b) {
                return i; // Return the index of the found element
            }
        }
        return -1; // Return -1 if the element is not found
    }
}

/*
  Best Case
Condition: The target element b is found at the first index (i.e., A[0]).
Time Complexity: O(1)
Explanation: Only one comparison is made.

 Worst Cas
Condition:
The target element b is not in the array, or
b is at the last index (i.e., A[A.length - 1])
Time Complexity: O(n)
Explanation: Every element in the array is checked.

Average Case
Condition: The target b is located somewhere in the middle or with equal probability at any index.
Time Complexity: O(n)
Explanation: On average, (n/2) elements are checked, but constants are dropped in Big O.

 Pseudocode
FUNCTION SequentialSearch(A, b)
    FOR i FROM 0 TO LENGTH(A) - 1 DO
        IF A[i] == b THEN
            RETURN i
        END IF
    END FOR
    RETURN -1
END FUNCTION

 */
