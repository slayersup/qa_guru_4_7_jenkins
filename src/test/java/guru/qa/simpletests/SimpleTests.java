package guru.qa.simpletests;

import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleTests {

    static int result;

    @Test
    void assertSimpleSuccessTest() {
        step("Set \"result\" to 2 + 2", () -> {
            result = 2 + 2;
        });
        step("Compare \"result\" with 4 via assertEquals", () -> assertEquals(4, result));
        step("Add 1 to \"result\"", () -> {
            result++;
        });
        step("Compare \"result\" with 5 via assertTrue", () -> assertTrue(result == 5));
        step("Add 10 to \"result\"", () -> {
            result += 10;
        });
        step("Compare \"result\" with 10 via assertFalse", () -> assertFalse(result == 10));
    }

    @Test
    void assertSimpleFailedTest() {
        step("Set \"result\" to 2 + 2", () -> {
            result = 2 + 2;
        });
        step("Compare \"result\" with 5 via assertTrue", () -> assertTrue(result == 5));
    }

    @Test
    void assertSimpleSuccessWithHamcrestTest() {
        step("Set \"result\" to 2 + 2", () -> {
            result = 2 + 2;
        });
        step("Compare \"result\" with 4 via assertThat", () -> assertThat(result, equalTo(4)));
    }

    @Test
    void assertSimpleFailedWithHamcrestTest() {
        step("Set \"result\" to 2 + 2", () -> {
            result = 2 + 2;
        });
        step("Compare \"result\" with 5 via assertTrue", () -> assertThat(result, equalTo(5)));
    }
}
