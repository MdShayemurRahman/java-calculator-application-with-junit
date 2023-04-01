import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class TemperatureCalculatorTest {
    @Test
    public void testPositiveCelsius1() {
        double result = TemperatureCalculator.celsiusToFahrenheit(25);
        assertThat(result, equalTo(77.0));
    }

    @Test
    public void testNegativeCelsius1() {
        double result = TemperatureCalculator.celsiusToFahrenheit(-10);
        assertThat(result, equalTo(14.0));
    }

    @Test
    public void testZeroCelsius1() {
        double result = TemperatureCalculator.celsiusToFahrenheit(0);
        assertThat(result, equalTo(32.0));
    }
    @Test
    public void testPositiveFahrenheit1() {
        double result = TemperatureCalculator.fahrenheitToCelsius(68);
        assertThat(result, equalTo(20.0));
    }

    @Test
    public void testNegativeFahrenheit1() {
        double result = TemperatureCalculator.fahrenheitToCelsius(-4);
        assertThat(result, equalTo(-20.0));
    }

    @Test
    public void testZeroFahrenheit1() {
        double result = TemperatureCalculator.fahrenheitToCelsius(32);
        assertThat(result, equalTo(0.0));
    }
    @Test
    public void testPositiveCelsius2() {
        double result = TemperatureCalculator.celsiusToKelvin(25);
        assertThat(result, equalTo(298.15));
    }

    @Test
    public void testNegativeCelsius2() {
        double result = TemperatureCalculator.celsiusToKelvin(-10);
        assertThat(result, equalTo(263.15));
    }

    @Test
    public void testZeroCelsius2() {
        double result = TemperatureCalculator.celsiusToKelvin(0);
        assertThat(result, equalTo(273.15));
    }
    @Test
    public void testPositiveKelvin1() {
        double result = TemperatureCalculator.kelvinToCelsius(298.15);
        assertThat(result, equalTo(25.0));
    }

    @Test
    public void testNegativeKelvin1() {
        double result = TemperatureCalculator.kelvinToCelsius(263.15);
        assertThat(result, equalTo(-10.0));
    }

    @Test
    public void testZeroKelvin1() {
        double result = TemperatureCalculator.kelvinToCelsius(273.15);
        assertThat(result, equalTo(0.0));
    }
    @Test
    public void testPositiveFahrenheit2() {
        double result = TemperatureCalculator.fahrenheitToKelvin(68);
        assertThat(result, equalTo(293.15));
    }
}
