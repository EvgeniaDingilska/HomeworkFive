package Exercise;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseTheList {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("The elements of the linked list before reversing: " + numbers);

        Collections.reverse(numbers);
        System.out.println("The elements of the linked list after reversing: " + numbers);
    }
}



