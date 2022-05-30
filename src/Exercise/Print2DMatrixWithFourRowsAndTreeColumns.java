package Exercise;

public class Print2DMatrixWithFourRowsAndTreeColumns {
    public static void main(String[] args) {

        int [][] numbers = {
                {7,8,4},
                {8,7,5},
                {9,5,10},
                {100,20,4}
        };

        for (int i = 0; i < 4 ; i ++)
        {
            for(int j = 0; j <3; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
