public class Unique {
    public static boolean unique (int[] G) {
        int n = G.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = i + 1; j < n; j++){
                if (G[i] == G[j]){
                    return false;
                }
            }
        }
        return true;
    }
}

/*
 Best Case
Condition: A duplicate is found early (e.g., at the beginning of the array).
Time Complexity: O(1) to O(n) depending on how soon the duplicate is found.
Explanation: The loop breaks as soon as a duplicate is found.

Worst Case
Condition: No duplicates in the array.
Time Complexity: O(n²)
Explanation: All pairs are compared without returning early.

Average Case
Condition: Duplicates are randomly distributed or near the middle.
Time Complexity: O(n²) in general case.
Explanation: The nested loops will still likely run a large portion of their total combinations before hitting a duplicate.

Pseudocode
FUNCTION unique(G):
    n ← length of G
    FOR i ← 0 TO n - 2 DO
        FOR j ← i + 1 TO n - 1 DO
            IF G[i] = G[j] THEN
                RETURN false
            END IF
        END FOR
    END FOR
    RETURN true
END FUNCTION
*/