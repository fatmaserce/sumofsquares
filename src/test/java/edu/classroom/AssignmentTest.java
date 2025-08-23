package edu.classroom;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssignmentTest {

    @Test
    void testZeroAndNegative() {
        assertEquals(0, Assignment.sumOfSquares(0));
        assertEquals(0, Assignment.sumOfSquares(-10));
    }

    @Test
    void testSmallNumbers() {
        assertEquals(1, Assignment.sumOfSquares(1));
        assertEquals(5, Assignment.sumOfSquares(2));
        assertEquals(14, Assignment.sumOfSquares(3));
    }

    @Test
    void testMediumNumber() {
        assertEquals(55, Assignment.sumOfSquares(5));
    }

    @Test
    void testLargerNumber() {
        int n = 1000;
        long expected = (long)n * (n+1) * (2L*n+1) / 6L;
        assertEquals((int) expected, Assignment.sumOfSquares(n));
    }
}
