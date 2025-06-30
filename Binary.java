public class Binary{
    public static int countdigits(int n) {
        if (n == 0) return 1; // Special case for 0
        int count = 0;
        while (n > 0) {
            n /= 2; // Divide by 2 to shift right in binary
            count++;
        }
        return count;
    }
}

/* Time complexity :
Best Case: When n = 0
One if check, and returns immediately.

Worst Case: When n > 0
Runs the while loop floor(log₂(n)) + 1 times.

Average Case: Same as worst case — because for most numbers n, we will loop log₂(n) times.
Time Complexity: O(log n)

 Pseudo Code :
 FUNCTION countdigits(n):
    IF n == 0:
        RETURN 1
    SET count = 0
    WHILE n > 0:
        n = n / 2
        count = count + 1
    RETURN count
*/

