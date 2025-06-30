public class Factorial {
    static int factorial (int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

/*
 Best Case
Condition: When n = 0
Time Complexity: O(1)
Explanation: Only the base condition is checked and returned.

 Worst Case
Condition: When n is a large positive integer
Time Complexity: O(n)
Explanation: The function recursively calls itself n times.

Average Case
Condition: When n is a moderate positive integer
Time Complexity: O(n)
Explanation: The number of recursive calls grows linearly with n.

Pseudocode
FUNCTION factorial(n):
    IF n == 0 THEN
        RETURN 1
    ELSE
        RETURN n * factorial(n - 1)
    END IF
END FUNCTION
 */