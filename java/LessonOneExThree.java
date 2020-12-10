import java.util.Scanner;

public class LessonOneExThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input (x,y) coordinates");
        double x = scan.nextDouble();
        double y = scan.nextDouble();

        if (x < -1 || x > 1 || y < -1 || y > 1 || (x > 0 && y > 0) || (x < 0 && y < 0)) {
            System.out.println("point isn't in range");
        } else if(x * x + y * y <= 1) {
            System.out.println("point is in range");
        }

    }
}
