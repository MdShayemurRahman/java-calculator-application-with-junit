import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class CalculateMaxHeartRateParameterizedTest {
    private final int age;
    private final int expected;

    public CalculateMaxHeartRateParameterizedTest(int age, int expected) {
        this.age = age;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = {{20, 200}, {30, 190}, {40, 180}, {50, 170}};
        return Arrays.asList(data);
    }

    @Test
    public void testCalculateMaxHeartRate_parameterized() {
        int actual = FitnessCalculator.calculateMaxHeartRate(age);
        assertThat(actual, is(equalTo(expected)));
    }
}
