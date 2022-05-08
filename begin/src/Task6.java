import java.util.Scanner;

public class Task6 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double V = a * b * c;
        double S = 2 * (a * b + b * c + c * a);

        System.out.println(V + " " + S);
    }
}
