public class Application {

    public static void main(String[] args) {
        //Задача 1
        System.out.println(calculateNumbers(15));

        //Задача 2
        int[] numbers = {5, 6, 15, 32, 64, 22, 44, 55, 20};
        System.out.println(findLargestNumber(numbers));
    }

    public static int calculateNumbers(int n) {

        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }

        return sum;
    }

    public static int findLargestNumber(int[] numbers) {

        int maxNumber = 0;

        for (int num : numbers) {

            if (num > maxNumber) {
                maxNumber = num;
            }

        }
        return maxNumber;
    }
}
