package Lesson_12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionTest {

    @Test
    void calculateAreaTriangle() {
        Function function = new Function();
        float actual = function.calculateAreaTriangle(2, 2, 2);
        float expected = 1.7320508f;
        assertEquals(expected, actual);
    }
}