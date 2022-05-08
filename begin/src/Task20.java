import java.util.Scanner;

public class Task20 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double x = Math.abs(x1 - x2);
        double y = Math.abs(y1 - y2);

        double l = Math.sqrt((x * x) + (y * y));

        System.out.println(l);
    }
}
