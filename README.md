// New Code for Data manipulation.

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class ArrayManipulation {
    private int[] numbers;

    public ArrayManipulation(int[] numbers) {
        this.numbers = numbers;
    }

    public void printArray() {
        System.out.print("Array Element: ");
        for (int i : numbers) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public int findSum() {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }

    public void doubleArray() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }
        printArray();
    }

    public int findMax() {
        int max = numbers[0];
        for (int i : numbers) {
            if (max < i) {
                max = i;
            }
        }
        return max;

    }

    public void reverseArray() {
        int start = 0, end = numbers.length - 1;
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }
        printArray();

    }

}

public class quiz {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the Size of the Array: ");
        int size = sc.nextInt();
        int Array[] = new int[size];
        ArrayManipulation am = new ArrayManipulation(Array);
        Random random = new Random();

        for (int i = 0; i < Array.length; i++) {
            Array[i] = random.nextInt(30) + 1;
        }

        am.printArray();
        System.out.println("Sum: " + am.findSum());
        System.out.print("Doubled: ");
        am.doubleArray();
        System.out.println("Max: " + am.findMax());
        System.out.print("Reversed: ");
        am.reverseArray();

    }

}
