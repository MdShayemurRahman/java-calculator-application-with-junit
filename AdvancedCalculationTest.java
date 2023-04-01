import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


@RunWith(JUnit4.class)

public class AdvancedCalculationTest {
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
}
