import java.util.Scanner;

public class Task12 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double a2 = a * a;
        double b2 = b * b;
        double ab = a2 + b2;
        double c = Math.sqrt(ab);

        double P = a + b + c;

        System.out.println(c + " " + P + " ");
    }
}
