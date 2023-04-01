import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GeometricsCalculatorTest {
    @Test
    public void testCalculateAreaOfCircle() {
        assertThat(GeometricsCalculator.calculateAreaOfCircle(0), equalTo(0.0));

    }

    @Test
    public void testCalculatePerimeterOfCircle() {
        assertThat(GeometricsCalculator.calculatePerimeterOfCircle(0), equalTo(0.0));
    }

    @Test
    public void testCalculateAreaOfRectangle() {
        assertThat(GeometricsCalculator.calculateAreaOfRectangle(0, 0), equalTo(0.0));
        assertThat(GeometricsCalculator.calculateAreaOfRectangle(1, 1), equalTo(1.0));
        assertThat(GeometricsCalculator.calculateAreaOfRectangle(2.5, 4), equalTo(10.0));
    }

    @Test
    public void testCalculatePerimeterOfRectangle() {
        assertThat(GeometricsCalculator.calculatePerimeterOfRectangle(0, 0), equalTo(0.0));
        assertThat(GeometricsCalculator.calculatePerimeterOfRectangle(1, 1), equalTo(4.0));
        assertThat(GeometricsCalculator.calculatePerimeterOfRectangle(2.5, 4), equalTo(13.0));
    }

    @Test
    public void testCalculateAreaOfTriangle() {
        assertThat(GeometricsCalculator.calculateAreaOfTriangle(0, 0), equalTo(0.0));
        assertThat(GeometricsCalculator.calculateAreaOfTriangle(1, 1), equalTo(0.5));
        assertThat(GeometricsCalculator.calculateAreaOfTriangle(2.5, 4), equalTo(5.0));
    }
}
