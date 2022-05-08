import java.util.Scanner;

public class Task33 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double a = sc.nextDouble();
        double one = x / a;
        double y = sc.nextDouble();
        double more = y * one;

        System.out.println(one + " " + more);
    }
}
