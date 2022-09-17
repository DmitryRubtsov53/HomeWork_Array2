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

        System.out.println();
        System.out.println("Задача 2 - Найти минимальную и максимальную трату в день.");

        Arrays.sort(arr);
        // Для себя - Распечатаем отсортированный по возрастанию массив для сравнения с MAX и MIN:
        System.out.println(Arrays.toString(arr));
        /* Вариант 1. С помощью сортировки.
        int maxTrata = arr[arr.length -1], minTrata = arr[0];
        System.out.println("Максимальная сумма трат за день составила " + maxTrata + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + minTrata + " рублей");
        */
        // Вариант 2. Классическим перебором элементов с сравнением.
        int maxEl = 0, minEl = 200_000;  // Переменные для хранения значений макс-ого и мин-ого значения элемента массива.
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > maxEl)  maxEl = arr[j];
            if (arr[j] < minEl)  minEl = arr[j];
        }
        System.out.println("Максимальная сумма трат в день составила " + maxEl + " рублей");
        System.out.println("Минимальная сумма трат в день составила " + minEl + " рублей");

        System.out.println();
        System.out.println("Задача 3 - Найти средную сумму трат за месяц.");

        int sumMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            sumMonth += arr[i];
        }
        double averageSum = sumMonth / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + Math.ceil(averageSum) + " рублей");

        System.out.println();
        System.out.println("Задача 4 - Исправить баг с выводом ФИО сотрудника.");

        char[] reverseFullName = {'n','a','v','I',' ','v','o','n','a','v','I'};


        System.out.println("Исправлено:");
        /* Вариант 1. С созданием "правильного" массива и его распечаткой.
        char[] fullName = new char[reverseFullName.length];
        int j = reverseFullName.length;

        for (int i = 0; i < fullName.length; i++) {

            fullName[i] = reverseFullName[j-1];
            j--;
            System.out.print(fullName[i]);
            }
        */
        // Вариант 2. Без созданием "правильного" массива, который мог бы использоваться потом бухгалтерией.
        for (int i = reverseFullName.length - 1; i >=0 ; i--) {
            System.out.print(reverseFullName[i]);
            }
    }
}