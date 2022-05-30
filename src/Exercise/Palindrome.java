package Exercise;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write the word");
        StringBuilder words = new StringBuilder(scanner.next());
        String reverse = words.reverse().toString();

        if (reverse.equals(words))
        {
            System.out.println("The word is palindrome");
        }else
        {
            System.out.println("The word is not palindrome");
        }
    }
}
