package _11_Loops._06_Nested_loop;

public class _01_Nesting {
    public static void main(String[] args) {
        // Printing i (responsible for printing row number — vertical pattern (controls rows, not columns))
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Printing j (responsible for printing column numbers — horizontal pattern (controls columns, not rows))
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Printing i and j (shows both row and column positions)
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("i = " +  i + " j = " + j + " , ");
            }
            System.out.println();
        }

        System.out.println();

        // Printing k inside i and j
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                for (int k = 1; k <= 10; k++) {
                    System.out.print(k + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        // i controls the number of big blocks (10 blocks total).
        // j controls the rows within each block (10 rows per block).
        // k controls the values printed horizontally (1 to 10 in each row).

        System.out.println();

        // Printing l inside i, j and k
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 2; j++) {
                for (int k = 1; k <= 2; k++) {
                    for (int l = 1; l <= 2; l++) {
                        System.out.print(l + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
        // 2 i blocks
            // each has 2 j sub-blocks
                // each has 2 rows (from k)
                    // each row contains 1 2 (from l)
    }
}


// We should not use multiple nesting