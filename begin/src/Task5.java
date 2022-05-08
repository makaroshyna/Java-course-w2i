import java.util.Scanner;

public class Task5 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();

        double V = a * a * a;
        double S = 6 * a * a;

        System.out.println(V + " " + S);
    }
}
