public class task8 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;

        for (int number : numbers) {
            if (number % 3 == 0) {
                sum += number;
            }
        }

        System.out.println("Сума елементів, кратних 3: " + sum);
    }
}
