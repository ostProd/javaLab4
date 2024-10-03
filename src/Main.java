public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 6, 9, 12, 15, 20, 22};
        int sum = findSumOfMultiplesOfThree(numbers);
        System.out.println("Сума елементів, кратних 3: " + sum);
    }

    public static int findSumOfMultiplesOfThree(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (isMultipleOfThree(number)) {
                sum += number;
            }
        }
        return sum;
    }

    public static boolean isMultipleOfThree(int number) {
        return number % 3 == 0;
    }
}
