package _02_RecursionMath;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursionMathTest {
    
    @Test
    public void testMultiplication() {
        assertEquals(12, RecursionMath.recursiveMultiplication(3, 4));
        assertEquals(0, RecursionMath.recursiveMultiplication(3, 0));

        
        // Add more JUnit tests like the one above to test your method
        
    }

    @Test
    public void testDivision() {
        // Add JUnit tests to test your method
        assertEquals(10, RecursionMath.recursiveDivision(70, 7));
        assertEquals(2, RecursionMath.recursiveDivision(10, 4));

        assertEquals(5, RecursionMath.recursiveDivision(25, 5));

        assertEquals(0, RecursionMath.recursiveDivision(3, 4));


        
    }

    @Test 
    public void testPower() {
        // Add JUnit tests to test your method
        assertEquals(125, RecursionMath.recursivePower(5, 3));


    }
}
