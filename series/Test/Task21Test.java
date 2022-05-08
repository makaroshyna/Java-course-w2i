import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task21Test {

    @Test
    void run() {
        Task21 task21 = new Task21();

        int[] t = new int[] {1, 2, 4, 7, 25, 5475, 12435};
        assertTrue(task21.run(t));
        int[] f = new int[] {13, 25, 36, 47, 879, 23456, 3};
        assertFalse(task21.run(f));
    }
}