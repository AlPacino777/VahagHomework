/*
В массиве из 30 элементов числа образуют неубывающую последовательность.
Найти количество различных чисел в массиве.
 */
public class LessonFourExThree {
    public static void main(String[] args) {
        int[] array = {-20, -17, -15, -15, -15, -9, -4, -4, 2, 3, 3, 3, 5, 8, 8,
                12, 14, 19, 20, 20, 20, 20, 20, 20, 74, 76, 88, 88, 153, 200};
        System.out.println("array size= " + array.length);
        int zero = array[0];
        int count = 1;
        System.out.print(zero + " ");

        for (int i = 1; i < array.length; i++) {

            if (array[i] != zero) {
                zero = array[i];
                count++;
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.println("count= " + count);
    }
}
