import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MassCalculatorTest {
    @Test
    public void testKilogramsToGrams() {
        assertThat(MassCalculator.kilogramsToGrams(0), equalTo(0.0));
        assertThat(MassCalculator.kilogramsToGrams(1), equalTo(1000.0));
        assertThat(MassCalculator.kilogramsToGrams(2.5), equalTo(2500.0));
    }

    @Test
    public void testKilogramsToPounds() {
        assertThat(MassCalculator.kilogramsToPounds(0), equalTo(0.0));

    }

    @Test
    public void testPoundsToKilograms() {
        assertThat(MassCalculator.poundsToKilograms(0), equalTo(0.0));

    }

    @Test
    public void testKilogramsToTonnes() {
        assertThat(MassCalculator.kilogramsToTonnes(0), equalTo(0.0));
        assertThat(MassCalculator.kilogramsToTonnes(1000), equalTo(1.0));
        assertThat(MassCalculator.kilogramsToTonnes(2500), equalTo(2.5));
    }

    @Test
    public void testKilogramsToOunces() {
        assertThat(MassCalculator.kilogramsToOunces(0), equalTo(0.0));

    }
}
