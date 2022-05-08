import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task47Test {

    @Test
    void run() {
        Task47 task47 = new Task47();

        int[] array = new int[] {36, 1, 86, 34, 34, 34, 0, 1};
        Assertions.assertEquals(5, task47.run(array, 8));

        array = new int[] {64, 34, 24, 7, 0, 13, 0, 64, 7, 56, 0};
        Assertions.assertEquals(7, task47.run(array, 11));
    }
}