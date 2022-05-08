import java.util.Scanner;

public class Task26 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();

        double y = 4 * Math.pow(x - 3, 6) - 7 * Math.pow(x - 3, 3) + 2;

        System.out.println(y);
    }
}
