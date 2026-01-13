import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
    public void testFactorialOfZero() {
        assertEquals(1, Factorial.computeFactorial(0));
    }
	
	@Test
    public void testFactorialOfOne() {
        assertEquals(1, Factorial.computeFactorial(1));
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(120, Factorial.computeFactorial(5));
    }
    
    @Test
    public void testFactorialOfPositiveNumber2() {
        assertEquals(720, Factorial.computeFactorial(6));
    }
    
    

}