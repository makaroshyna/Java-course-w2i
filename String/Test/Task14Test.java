import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task14Test {

    @Test
    void run() {
        Task14 task14 = new Task14();

        String actual = "This Is the Test FOR the CAPITAL Letters";
        Assertions.assertEquals(14, task14.run(actual));
    }
}