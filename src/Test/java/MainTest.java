import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testFibonacci() {
        assertEquals(0, Fibonacci.fib(0));
        assertEquals(1, Fibonacci.fib(1));
        assertEquals(1, Fibonacci.fib(2));
        assertEquals(2, Fibonacci.fib(3));
        assertEquals(3, Fibonacci.fib(4));
        assertEquals(5, Fibonacci.fib(5));
        assertEquals(8, Fibonacci.fib(6));
        assertEquals(13, Fibonacci.fib(7));
        assertEquals(21, Fibonacci.fib(8));
        assertEquals(34, Fibonacci.fib(9));
    }
    @Test
    public void testFibonacciWithZero() {
        int result = Fibonacci.fib(0);
        assertEquals(0, result);
    }

    @Test
    public  void testFibonacciWithPositiveNumber() {
        int result = Fibonacci.fib(5);
        assertEquals(5, result);
    }

    @Test
    public void testFibonacciWithNegativeNumber() {
        int result = Fibonacci.fib(-3);
        assertEquals(0, result);
    }

    @Test
    public void testFibonacciWithLargeNumber() {
        int result = Fibonacci.fib(10);
        assertEquals(55, result);
    }

    @Test
    public void testFibonacciWithOne() {
        int result = Fibonacci.fib(1);
       assertEquals(1, result);
    }

}