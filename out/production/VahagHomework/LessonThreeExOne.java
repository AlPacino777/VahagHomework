public class LessonThreeExOne {
    public static void main(String[] args) {
        double weight = 2.9;
        int number = 3;

        switch (number) {
            case 1:
                System.out.println(weight);
                break;
            case 2:
                System.out.println((weight * 0.000001));
                break;
            case 3:
                System.out.println(weight * 0.001);
                break;
            case 4:
                System.out.println(weight * 1000);
                break;
            case 5:
                System.out.println(weight * 100);
                break;
            default:
                System.out.println("input only 1-5");
                break;
        }
    }
}
