import java.util.Arrays;

public class LessonTwoExFour {
    void sortShuttle(int[] a) {
        int end = a.length - 1;

        for (int i = 0; i < end; i++) {
            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                System.out.print("+ ");
                System.out.println(Arrays.toString(a));


                for (int j = i; j > 0; j--) {
                    if (a[j] < a[j - 1]) {
                        temp = a[j - 1];
                        a[j - 1] = a[j];
                        a[j] = temp;
                        System.out.print("- ");
                        System.out.println(Arrays.toString(a));

                    }
                }
            }
        }
        System.out.print("sort:  ");
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        LessonTwoExFour obj = new LessonTwoExFour();
        int[] a = {7, 5, 2, 4, 10, 1, 6, 3};
        System.out.print("  ");
        System.out.println(Arrays.toString(a));
        obj.sortShuttle(a);
        System.out.println();
    }
}

