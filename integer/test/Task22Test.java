import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task22Test {

    @Test
    void run() {

        Task22 task22 = new Task22();

        Assertions.assertEquals(12, task22.run(21612));
        Assertions.assertEquals(30, task22.run(3630));
        Assertions.assertEquals(59, task22.run(7259));
    }
}