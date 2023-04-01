import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;


@RunWith(JUnit4.class)
public class FitnessCalculatorTest {
    @Test
    public void testCalculateBMI_normalWeight() {
        double weight = 70.0;
        double height = 1.75;
        double expected = 22.86;
        double actual = FitnessCalculator.calculateBMI(weight, height);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testCalculateBMI_underweight() {
        double weight = 50.0;
        double height = 1.75;
        double expected = 16.33;
        double actual = FitnessCalculator.calculateBMI(weight, height);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testCalculateBMI_obese() {
        double weight = 100.0;
        double height = 1.75;
        double expected = 32.65;
        double actual = FitnessCalculator.calculateBMI(weight, height);
        assertEquals(expected, actual, 0.01);
    }
    @Test
    public void testCalculateIdealWeight_male() {
        double height = 175.0;
        String gender = "male";
        double expected = 70.56;
        double actual = FitnessCalculator.calculateIdealWeight(height, gender);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testCalculateIdealWeight_female() {
        double height = 165.0;
        String gender = "female";
        double expected = 56.96;
        double actual = FitnessCalculator.calculateIdealWeight(height, gender);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testCalculateIdealWeight_invalidGender() {
        double height = 180.0;
        String gender = "other";
        double expected = 0;
        double actual = FitnessCalculator.calculateIdealWeight(height, gender);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testCalculateCaloriesBurned_running() {
        double weight = 70.0;
        String activity = "running";
        int duration = 60;
        double expected = 2646.0;
        double actual = FitnessCalculator.calculateCaloriesBurned(weight, activity, duration);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testCalculateCaloriesBurned_swimming() {
        double weight = 70.0;
        String activity = "swimming";
        int duration = 60;
        double expected = 3528.0;
        double actual = FitnessCalculator.calculateCaloriesBurned(weight, activity, duration);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testCalculateCaloriesBurned_cycling() {
        double weight = 70.0;
        String activity = "cycling";
        int duration = 60;
        double expected = 1260.0;
        double actual = FitnessCalculator.calculateCaloriesBurned(weight, activity, duration);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testCalculateCaloriesBurned_invalidActivity() {
        double weight = 70.0;
        String activity = "walking";
        int duration = 60;
        double expected = 0;
        double actual = FitnessCalculator.calculateCaloriesBurned(weight, activity, duration);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testCalculateMaxHeartRate() {
        int age = 30;
        int expected = 190;
        int actual = FitnessCalculator.calculateMaxHeartRate(age);
        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateHeartRate() {
        int age = 30;
        int expected = 133;
        int actual = FitnessCalculator.calculateHeartRate(age);
        assertEquals(expected, actual);
    }

}

