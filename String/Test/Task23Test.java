import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task23Test {

    @Test
    void run() {
        Task23 task23 = new Task23();

        String actual = "4+6-3-6+1-6+9";
        Assertions.assertEquals(5, task23.run(actual));
    }
}