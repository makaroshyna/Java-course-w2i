import java.io.*;

public class Task8 {

    public static void main(String[] args) throws IOException {

        File firstFile = new File("/home/katya/study/java/w2i/file/src/task8-1.txt");
        FileOutputStream fos1 = new FileOutputStream(firstFile);
        DataOutputStream dos1 = new DataOutputStream(fos1);

        String firstFileInsides = "This is what will be inside the first file";
        dos1.writeUTF(firstFileInsides);
        fos1.close();
        dos1.close();

        FileInputStream fis1 = new FileInputStream(firstFile);
        DataInputStream dis1 = new DataInputStream(fis1);
        String textFromFirstFile = dis1.readUTF();

        File secondFile = new File("/home/katya/study/java/w2i/file/src/task8-2.txt");
        FileOutputStream fos2 = new FileOutputStream(secondFile);

        String secondFileInsides = textFromFirstFile.charAt(0) + "" + textFromFirstFile.charAt(textFromFirstFile.length() - 1);
        fos2.write(secondFileInsides.getBytes());

        fis1.close();
        dis1.close();
        fos2.close();
    }
}
