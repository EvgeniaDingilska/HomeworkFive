package Exercise;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte count = 0;
        double sum = 0;
        double[] numbers = new double[10];
        while (count<10){
            System.out.println("Please write "+ count+" numbers:");
            numbers[count] = scanner.nextDouble();
            sum += numbers[count];
            count++;
        }
        System.out.println("The sum of the numbers is:" + sum);
    }
}
