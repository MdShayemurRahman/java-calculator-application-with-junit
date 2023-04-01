import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


@RunWith(JUnit4.class)
public class AdvancedCalculationsTest {
    @Test
    public void testSqrtPositiveNumber() {
        double num = 9.0;
        double expected = 3.0;
        double result = AdvancedCalculations.sqrt(num);
        assertThat(result, is(equalTo(expected)));
    }

    @Test
    public void testSqrtZero() {
        double num = 0.0;
        double expected = 0.0;
        double result = AdvancedCalculations.sqrt(num);
        assertThat(result, is(equalTo(expected)));
    }

    @Test
    public void testSqrtNegativeNumber() {
        double num = -1.0;
        double result = AdvancedCalculations.sqrt(num);
        assertThat(Double.isNaN(result), is(true));
    }

    @Test
    public void testCubicRootPositiveNumber() {
        double num = 8.0;
        double expected = 2.0;
        double result = AdvancedCalculations.cubicRoot(num);
        assertThat(result, is(equalTo(expected)));
    }

    @Test
    public void testCubicRootZero() {
        double num = 0.0;
        double expected = 0.0;
        double result = AdvancedCalculations.cubicRoot(num);
        assertThat(result, is(equalTo(expected)));
    }

    @Test
    public void testCubicRootNegativeNumber() {
        double num = -1.0;
        double expected = -1.0;
        double result = AdvancedCalculations.cubicRoot(num);
        assertThat(result, is(equalTo(expected)));
    }

    @Test
    public void testExponentialPositiveBasePositiveExponent() {
        double base = 2.0;
        double exponent = 3.0;
        double expected = 8.0;
        double result = AdvancedCalculations.exponential(base, exponent);
        assertThat(result, is(equalTo(expected)));
    }

    @Test
    public void testExponentialZeroBasePositiveExponent() {
        double base = 0.0;
        double exponent = 3.0;
        double expected = 0.0;
        double result = AdvancedCalculations.exponential(base, exponent);
        assertThat(result, is(equalTo(expected)));
    }

    @Test
    public void testExponentialNegativeBaseNegativeExponent() {
        double base = -2.0;
        double exponent = -3.0;
        double expected = -0.125;
        double result = AdvancedCalculations.exponential(base, exponent);
        assertThat(result, is(equalTo(expected)));
    }

    @Test
    public void testLogarithmPositiveBasePositiveNumber() {
        double base = 2.0;
        double num = 8.0;
        double expected = 3.0;
        double result = AdvancedCalculations.logarithm(base, num);
        assertThat(result, is(equalTo(expected)));
    }

    @Test
    public void testLogarithmBase10Of100() {
        assertEquals(2.0, AdvancedCalculations.logarithm(10.0, 100.0), 0.0001);
    }

    @Test
    public void testLogarithmBase3Of27() {
        assertEquals(3.0, AdvancedCalculations.logarithm(3.0, 27.0), 0.0001);
    }

    @Test
    public void testFactorialZero() {
        assertEquals(1, AdvancedCalculations.factorial(0), 0.001);
    }
    @Test
    public void testFactorialPositiveNumber() {
        assertEquals(24, AdvancedCalculations.factorial(4), 0.001);
    }

    @Test
    public void testFactorialPositive() {
        double result = AdvancedCalculations.factorial(100);
        assertEquals(9.33262154439441E157, result, 0.001);
    }
}
