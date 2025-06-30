public class MaxValue {
    public static int maxValue(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        
        int max = arr[0]; // Assume the first element is the maximum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger value is found
            }
        }
        return max; // Return the maximum value found in the array
    }
}

/*
 Best Case
Condition: The array is sorted in descending order (maximum is the first element).
Time Complexity: O(n) — the loop still checks each element, but max is never updated.

Worst Case
Condition: The maximum value is the last element.
Time Complexity: O(n) — all elements must be compared to max.

Average Case
Condition: Random distribution of values.
Time Complexity: O(n) — each element must be checked once.

Pseudocode
FUNCTION maxValue(arr):
    IF arr IS null OR arr.length = 0 THEN
        THROW "Array must not be null or empty"
    END IF

    max ← arr[0]
    FOR i FROM 1 TO length of arr - 1 DO
        IF arr[i] > max THEN
            max ← arr[i]
        END IF
    END FOR

    RETURN max
END FUNCTION
 */