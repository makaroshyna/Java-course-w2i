import java.util.Scanner;

public class Task25 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();

        double y = 3 * Math.pow(x, 6) - 6 * (x * x) - 7;

        System.out.println(y);
    }
}
