import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task13Test {

    @Test
    void run() {
        Task13 task13 = new Task13();

        String actual = "fh4 hfgj6 dhfh38hfhf382l";
        Assertions.assertEquals(7, task13.run(actual));
    }
}