package Exercise;

import java.util.Scanner;

public class Matrix2DWithDynamicInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] numbers = new int[2][5];

            for(int i = 0; i <2 ; i ++)
            {
                for(int j = 0; j<5 ; j ++)
                {
                    System.out.println("Please write a number:");

                        numbers[i][j] = scanner.nextInt();
                }
            }

        for (int i = 0; i < 2 ; i ++)
        {
            for(int j = 0; j <5; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
