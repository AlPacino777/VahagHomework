import java.util.Scanner;

public class LessonOneExOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num > 0) {
            num += 2;
        } else {
            num *= 2;
        }
        System.out.println(num);
    }
}
