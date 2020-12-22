import java.util.Arrays;
import java.util.Scanner;
/*
Заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [3, 15].

 */

public class LessonFourExOne {
    public static void main(String[] args) {
        System.out.println("input count of array");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        double[] array = new double[number];
        double max;
        double min;
        double average;
        double sum = 0;

        for (int i = 0; i < number; i++) {
            array[i] = (Math.random() * 12 + 3);
            sum += array[i];
        }
        average = sum / number;
        max = min = array[0];
        for (int i = 1; i < number; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("max: " + max);
        System.out.println("min: " + min);
        System.out.println("average: " + average);
    }
}