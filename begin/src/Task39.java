import java.util.Scanner;

public class Task39 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = Math.sqrt(b * b - 4 * a * c);
        double x1 = (- b - d) / 2 * a;
        double x2 = (- b + d) / 2 * a;

        System.out.println(x1 + " " + x2);
    }
}
