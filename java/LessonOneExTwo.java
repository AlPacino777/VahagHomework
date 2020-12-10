import java.util.Scanner;

public class LessonOneExTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y;

        if (x > 0) {
            y = 3 * x - 5;
        } else if (x == 0) {
            y = 0;
        } else {
            y = -x - 1;
        }
        System.out.println(y);
    }
}
