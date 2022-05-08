import java.util.Scanner;

public class Task31 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        double f = sc.nextDouble();
        double c = (f - 32) * 5 / 9;

        System.out.println(c);
    }
}
