package task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {
    @Test
    void checkOneNumber() {
        Logic calculation = new Logic(new int[]{1,5,3,4,8});
        calculation.calculate();
        assertEquals(calculation.deletedElement, 1);
    }

    @Test
    void checkNoNumber() {
        Logic calculation = new Logic(new int[]{1,2,3,4,8});
        calculation.calculate();
        assertEquals(calculation.deletedElement, 0);
    }

    @Test
    void checkTwoNumbers() {
        Logic calculation = new Logic(new int[]{9, 1, 2, 3, 2});
        calculation.calculate();
        assertEquals(calculation.deletedElement, 2);
    }
}