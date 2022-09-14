import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание урока Массивы 2 **********************************************");
        System.out.println(" ");
        System.out.println("Задача 1 - Расчет суммы затрат за месяц.");
        /* Ежедневные затраты сгенерировать случайным образом на каждый из 30 дней месяца. */

        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            //System.out.println(arr[i]);
        }

        int summa = 0;
        for (int j = 0; j < arr.length; j++) {
             summa += arr[j];
        }
        System.out.println("Сумма трат за месяц составила " + summa + " рублей");

        System.out.println(" ");
        System.out.println("Задача 2 - Найти минимальную и максимальную трату за день.");

        Arrays.sort(arr);
        // Распечатаем отсортированный по возрастанию массив для сравнения с MAX и MIN.
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int maxTrata = arr[arr.length -1], minTrata = arr[0];
        System.out.println("Минимальная сумма трат за день составила " + maxTrata + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + minTrata + " рублей");

        System.out.println(" ");
        System.out.println("Задача 3 - Найти средную сумму трат за месяц.");

        int sumMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            sumMonth += arr[i];
        }
        double sredaySum = sumMonth / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + Math.ceil(sredaySum) + " рублей");
    }
}

/*      К СОЖАЛЕНИЮ, С ВЫЗОВОМ МЕТОДА НИЧЕГО У МЕНЯ НЕ ВЫШЛО !!!
        Постоянно IDEA выдавала ошибку и я не поняд почему !!!!!

        int[] arr = generateRandomArray();

        public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            System.out.println(arr[i]);
        }
        return arr;
    }  */