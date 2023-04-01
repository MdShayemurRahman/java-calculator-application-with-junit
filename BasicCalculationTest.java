import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

@RunWith(JUnit4.class)

public class BasicCalculationTest {

        @Test
        public void testAddWithPositiveNumbers() {
            double[] numbers = {1.0, 2.0, 3.0};
            assertEquals(6.0, BasicCalculation.add(numbers), 0.0);
        }

        @Test
        public void testAddWithNegativeNumbers() {
            double[] numbers = {-1.0, -2.0, -3.0};
            assertEquals(-6.0, BasicCalculation.add(numbers), 0.0);
        }

        @Test
        public void testAddWithEmptyArray() {
            double[] numbers = {};
            double result = BasicCalculation.add(numbers);
            assertThat(result, is(0.0));
        }

    @Test
    public void testSubtractWithPositiveNumbers() {
        double[] arr1 = {10.0, 2.0, 3.0};
        double expectedResult1 = 5.0; // (10.0 - 2.0 - 3.0)
        double actualResult1 = BasicCalculation.subtract(arr1);
        assert(expectedResult1 == actualResult1);
    }

    @Test
    public void testSubtractWithNegativeNumbers() {
        double[] arr2 = {-5.0, -2.0, -3.0};
        double expectedResult2 = -0.0; // (-5.0 - (-2.0) - (-3.0))
        double actualResult2 = BasicCalculation.subtract(arr2);
        assert(expectedResult2 == actualResult2);
    }

    @Test
    public void testSubtractWithPositiveAndNegativeNumber() {
        double[] arr3 = {5.0, -2.0, 1.5, -3.0};
        double expectedResult3 = 8.5; // (5.0 - (-2.0) - 1.5 - (-3.0))
        double actualResult3 = BasicCalculation.subtract(arr3);
        assert(expectedResult3 == actualResult3);
    }


    /////////////
    @Test
    public void testMultiplyWithPositiveNumbers() {
        double[] arr1 = {2.0, 3.0, 4.0};
        double expectedResult1 = 24.0; // (2.0 * 3.0 * 4.0)
        double actualResult1 = BasicCalculation.multiply(arr1);
        assert(expectedResult1 == actualResult1);

    }

    @Test
    public void testMultiplyWithNegativeNumbers() {
        double[] arr2 = {-2.0, 3.0, -4.0};
        double expectedResult2 = 24.0; // (-2.0 * 3.0 * (-4.0))
        double actualResult2 = BasicCalculation.multiply(arr2);
        assert(expectedResult2 == actualResult2);
    }

    @Test
    public void testMultiplyWithPositiveAndNegativeNumber() {
        double[] arr3 = {5.0};
        double expectedResult3 = 5.0; // the only element in the array
        double actualResult3 = BasicCalculation.multiply(arr3);
        assert(expectedResult3 == actualResult3);
    }


    @Test
    public void testDivideWithNonZeroNumbers() {
        double[] arr1 = {10.0, 2.0, 5.0};
        double expectedResult1 = 1.0; // (10.0 / 2.0 / 5.0)
        double actualResult1 = BasicCalculation.divide(arr1);
        assert(expectedResult1 == actualResult1);

    }

    @Test
    public void testDivideWithAZeroInNumbers() {
        double[] arr2 = {10.0, 0.0, 5.0};
        double actualResult2 = 0.0;
        try {
            BasicCalculation.divide(arr2);
        } catch (ArithmeticException e) {
            actualResult2 = 1.0;
        }
        assert(actualResult2 == 1.0);
    }

    @Test
    public void testDivideWithOnlyOneNumbers() {
        double[] arr3 = {10.0};
        double expectedResult3 = 10.0; // (10.0 / 1.0)
        double actualResult3 = BasicCalculation.divide(arr3);
        assert(expectedResult3 == actualResult3);
    }


    @Test
    public void testModulusWithAValidArray() {
        double[] arr3 = {10.0, 3.0};
        double expectedResult3 = 1.0; // (10.0 % 3.0)
        double actualResult3 = BasicCalculation.modulus(arr3);
        assert(expectedResult3 == actualResult3);
    }
}