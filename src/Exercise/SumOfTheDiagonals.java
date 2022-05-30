package Exercise;

public class SumOfTheDiagonals {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3, 4},
                {5, 100, 7, 8},
                {1, 2, 3, 4},
                {5, 6, 7, 8}};

        int n = 4;
        int principal = 0, secondary = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j)
                    principal += numbers[i][j];

                if ((i + j) == (n - 1))
                    secondary += numbers[i][j];
            }
        }

        System.out.println("Principal Diagonal:"
                + principal);

        System.out.println("Secondary Diagonal:"
                + secondary);
    }
}
