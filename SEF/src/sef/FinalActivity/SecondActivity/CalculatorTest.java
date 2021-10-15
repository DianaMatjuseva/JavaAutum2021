package sef.FinalActivity.SecondActivity;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void testGetSum() {
        assertEquals("sum error", Calculator.sum(2, 6), 8);
        assertEquals("sum error", Calculator.sum(-2, -5), -7);
        assertEquals("sum error", Calculator.sum(9, 0), 9);
        assertEquals("sum error", Calculator.sum(1, 2), 3);
    }

    @Test
    public  void testGetDifference() {
        assertEquals("diff error", Calculator.sub(1, 2), -1);
        assertEquals("diff error", Calculator.sub(-2, -2), 0);
        assertEquals("diff error", Calculator.sub(5, 1), 4);
        assertEquals("diff error", Calculator.sub(4, 2), 2);
    }

    @Test
    public void testGetMultiply () {
        assertThat(12.0, equalTo(Calculator.multiply(6, 2)));
        assertThat(-6.0, equalTo(Calculator.multiply(3, -2)));
        assertThat(12.0, equalTo(Calculator.multiply(-6, -2)));
        assertThat(0.0, equalTo(Calculator.multiply(7, 0)));
    }

    @Test
    public void testGetDivide() {

        assertThat(2.0, equalTo(Calculator.divide(14, 7)));
        assertThat(-8.0, equalTo(Calculator.divide(16, -2)));
        assertThat(3.0, equalTo(Calculator.divide(-12, -4)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() throws IllegalArgumentException {
        assertThat(0, equalTo(Calculator.divide(0, -4)));
    }

}
