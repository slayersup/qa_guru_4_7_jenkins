package guru.qa.simpletests;

import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleTests {

    static int result;

    @Test
    void assertSimplePositiveTest() {
        result = 2 + 2;

        step("Compare \"result\" with 4 via assertEquals", () -> {
            assertEquals(4, result);
        });
        step("Add 1 to \"result\"", () -> {
            result++;
        });
        step("Compare \"result\" with 5 via assertTrue", () -> {
            assertTrue(result == 5);
        });
        step("Add 10 to \"result\"", () -> {
            result += 10;
        });
        step("Compare \"result\" with 10 via assertFalse", () -> {
            assertFalse(result == 10);
        });
    }

    @Test
    void assertSimpleNegativeTest() {
        result = 2 + 2;

        step("Compare \"result\" with 5 via assertTrue", () -> {
            assertTrue(result == 5);
        });
    }
}
