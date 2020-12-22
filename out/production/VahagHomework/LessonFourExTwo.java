/*
Дана последовательность ненулевых целых чисел, оканчивающаяся нулем.
Определить, сколько раз в этой последовательности меняется знак.
(Например,в последовательности 10, –4, 12, 56, –4 знак меняется 3 раза.)
 */
public class LessonFourExTwo {
    public static void main(String[] args) {
        int[] array = {10, -4, 12, 56, -4, -5, -8, 4, 0};
        int count = 0;
        int i = 0;

        while (array[i] != 0) {
            if (array[i] * array[i + 1] < 0) {
                System.out.println(array[i] + " -> " + array[i + 1]);
                count++;
            }
            i++;
        }
        System.out.println("count= " + count);
    }
}
