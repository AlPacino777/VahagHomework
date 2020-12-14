public class LessonTwoExTwo {
    public static void main(String[] args) {
        double A = 3.8;
        int N = 6;
        double sum = 1;
        double k = 1;

        for (int i = 0; i < N; i++) {
            k = -k * A;
            sum += k;
        }
        System.out.println(sum);
    }
}
