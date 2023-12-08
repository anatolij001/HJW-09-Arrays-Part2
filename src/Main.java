import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    //---   Задача № 1   ---
    private static void task1() {
        System.out.println("---   Задача № 1   --- ");
        int[] arr = generateRandomArray();
        int sum = 0; // Сумма трат за месяц.
        for (int elem : arr) {
            sum += elem;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей\n");
    }

    private static void task2() {
        System.out.println("---   Задача № 2   ---");
        int[] arr = generateRandomArray();
        int min = arr[0], max = arr[1], chg = 0;


        System.out.println("Вариант решения № 1: Ввести две переменные - min и max. Переменной min присвоить значение элемента с индексом 0, переменной max - с индексом 1.");
        System.out.println("Сравнить значения переменных min и max и поменять местами в случае необходимости. В цикле начать сверять каждый элемент элемент, начиная с  третьего с max и min,");
        System.out.println("именять их значения местами в случае необходимости.");
        if (min > max) {
            chg = max;
            max = min;
            min = chg;
        }
        for (int i : arr) {
            if (i > max) {
                max = i;
            } else if (i < min) {
                min = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей\n");


        System.out.println("Вариант решения № 2: Arrays.Sort");
        Arrays.sort(arr);
        System.out.println("Минимальная сумма трат за день составила " + arr[0] + " рублей. Максимальная сумма трат за день составила " + arr[arr.length - 1] + " рублей\n");

    }

    private static void task3() {
        int[] arr = generateRandomArray();
        int arrSumma = 0;
        DecimalFormat df = new DecimalFormat("0.00");
        float averageExpenses = 0.00f;
        System.out.println("---   Задача № 3   ---");
        for (int i : arr) {
            arrSumma += i;
        }
        averageExpenses = arrSumma / (float) arr.length;
        System.out.println(averageExpenses);
        System.out.println("Средняя сумма трат за месяц составила " + df.format(averageExpenses) + " рублей");
    }

    private static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println("---   Задача № 4   ---");
        for (int i = reverseFullName.length - 1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }
    }
}