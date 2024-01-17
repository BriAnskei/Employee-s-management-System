// New Code for Data manipulation.


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
}
