import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File task3File = new File("/home/katya/study/java/w2i/file/src/task3.txt");
        FileOutputStream fos1 = new FileOutputStream(task3File);

        int a = sc.nextInt();
        int d = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            int res = a + (i * d);
            fos1.write(String.valueOf(res).getBytes());
        }

        fos1.close();
    }
}
