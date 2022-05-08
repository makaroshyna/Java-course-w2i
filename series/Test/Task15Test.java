import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task15Test {

    @Test
    void run() {
        Task15 task15 = new Task15();

        int[] actual = new int[] {26, 45, 2, 867, 245, 78, 24, 15, 0};
        Assertions.assertEquals(867, task15.run(67, actual));
        Assertions.assertEquals(0, task15.run(900, actual));
    }
}