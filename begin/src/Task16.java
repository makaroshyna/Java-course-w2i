import java.util.Scanner;

public class Task16 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();

        double x = Math.abs(x2 - x1);

        System.out.println(x);
    }
}
