public class LessonTwoExThree {
    public static void main(String[] args) {
        double[] arr = {2, 6.9, 9, 8, 42.5, 20, 36, 43, -20, 123};
        double sum = 0;

        for (double v : arr) {
            sum += v;
        }
        System.out.println(sum / arr.length);

    }
}
