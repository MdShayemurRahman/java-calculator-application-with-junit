import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class TimeCalculatorTest {

    @Test
    public void testMinutesToHours() {
        assertThat(TimeCalculator.minutesToHours(60), equalTo(1.0));
        assertThat(TimeCalculator.minutesToHours(180), equalTo(3.0));
        assertThat(TimeCalculator.minutesToHours(120), equalTo(2.0));
        assertThat(TimeCalculator.minutesToHours(90), equalTo(1.5));
        assertThat(TimeCalculator.minutesToHours(240), equalTo(4.0));
    }

    @Test
    public void testHoursToDays() {
        assertThat(TimeCalculator.hoursToDays(24), equalTo(1.0));
        assertThat(TimeCalculator.hoursToDays(48), equalTo(2.0));
        assertThat(TimeCalculator.hoursToDays(72), equalTo(3.0));
        assertThat(TimeCalculator.hoursToDays(96), equalTo(4.0));
        assertThat(TimeCalculator.hoursToDays(120), equalTo(5.0));
    }

    @Test
    public void testSecondsToMinutes() {
        assertThat(TimeCalculator.secondsToMinutes(60), equalTo(1.0));
        assertThat(TimeCalculator.secondsToMinutes(180), equalTo(3.0));
        assertThat(TimeCalculator.secondsToMinutes(120), equalTo(2.0));
        assertThat(TimeCalculator.secondsToMinutes(90), equalTo(1.5));
        assertThat(TimeCalculator.secondsToMinutes(240), equalTo(4.0));
    }

    @Test
    public void testDaysToMinutes() {
        assertThat(TimeCalculator.daysToMinutes(1), equalTo(1440.0));
        assertThat(TimeCalculator.daysToMinutes(2), equalTo(2880.0));
        assertThat(TimeCalculator.daysToMinutes(3), equalTo(4320.0));
        assertThat(TimeCalculator.daysToMinutes(4), equalTo(5760.0));
        assertThat(TimeCalculator.daysToMinutes(5), equalTo(7200.0));
    }

    @Test
    public void testMinutesToSeconds() {
        assertThat(TimeCalculator.minutesToSeconds(1), equalTo(60.0));
        assertThat(TimeCalculator.minutesToSeconds(3), equalTo(180.0));
        assertThat(TimeCalculator.minutesToSeconds(2), equalTo(120.0));
        assertThat(TimeCalculator.minutesToSeconds(1.5), equalTo(90.0));
        assertThat(TimeCalculator.minutesToSeconds(4), equalTo(240.0));
    }

    @Test
    public void testHoursToSeconds() {
        assertThat(TimeCalculator.hoursToSeconds(1), equalTo(3600.0));
        assertThat(TimeCalculator.hoursToSeconds(3), equalTo(10800.0));
        assertThat(TimeCalculator.hoursToSeconds(2), equalTo(7200.0));
        assertThat(TimeCalculator.hoursToSeconds(1.5), equalTo(5400.0));
        assertThat(TimeCalculator.hoursToSeconds(4), equalTo(14400.0));
    }

    @Test
    public void testHoursToMinutes() {
        assertThat(TimeCalculator.hoursToMinutes(1), equalTo(60.0));
        assertThat(TimeCalculator.hoursToMinutes(3), equalTo(180.0));
        assertThat(TimeCalculator.hoursToMinutes(2), equalTo(120.0));
        assertThat(TimeCalculator.hoursToMinutes(1.5), equalTo(90.0));
        assertThat(TimeCalculator.hoursToMinutes(4), equalTo(240.0));
    }

    @Test
    public void testDaysToSeconds() {
        assertThat(TimeCalculator.daysToSeconds(1), equalTo(86400.0));
        assertThat(TimeCalculator.daysToSeconds(2), equalTo(172800.0));
        assertThat(TimeCalculator.daysToSeconds(3), equalTo(259200.0));
    }

    @Test
    public void testDaysToHours() {
        assertThat(TimeCalculator.daysToHours(1), equalTo(24.0));
        assertThat(TimeCalculator.daysToHours(2), equalTo(48.0));
        assertThat(TimeCalculator.daysToHours(3), equalTo(72.0));
    }


}
