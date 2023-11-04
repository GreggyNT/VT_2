package task9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {
    @Test
    void checkBallsAmount() {
        Basket b  = new Basket(6);
        assertEquals(b.AllBallsWeight(), 12);
    }

}