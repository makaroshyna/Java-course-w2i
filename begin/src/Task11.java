import java.util.Scanner;

public class Task11 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        a = Math.abs(a);
        b = Math.abs(b);

        double sum = a + b;
        double sub = Math.abs(a - b);
        double mul = a * b;
        double div = a / b;

        System.out.println(sum + " " + sub + " " + mul + " " + div);
    }
}
