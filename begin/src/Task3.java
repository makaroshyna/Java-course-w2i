import java.util.Scanner;

public class Task3 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double P = 2 * (a + b);
        double S = a * b;

        System.out.println(P + " " + S);
    }
}
