import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


import static java.lang.Double.NaN;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(JUnit4.class)
public class GradeCalculatorTest {

        @Test
        public void testCalculateAverage_withEmptyArray() {
            double[] grades = new double[]{};
            double result = GradeCalculator.calculateAverage(grades);
            assertThat(result, equalTo(NaN));
        }

        @Test
        public void testCalculateAverage_withOneGrade() {
            double[] grades = new double[]{80.0};
            double result = GradeCalculator.calculateAverage(grades);
            assertThat(result, equalTo(80.0));
        }

        @Test
        public void testCalculateAverage_withMultipleGrades() {
            double[] grades = new double[]{75.0, 80.0, 85.0};
            double result = GradeCalculator.calculateAverage(grades);
            assertThat(result, equalTo(80.0));
        }



        @Test
        public void testCalculateGrade_withA() {
            char result = GradeCalculator.calculateGrade(95.0);
            assertThat(result, equalTo('A'));
        }

        @Test
        public void testCalculateGrade_withB() {
            char result = GradeCalculator.calculateGrade(85.0);
            assertThat(result, equalTo('B'));
        }

        @Test
        public void testCalculateGrade_withF() {
            char result = GradeCalculator.calculateGrade(55.0);
            assertThat(result, equalTo('F'));
        }



        @Test
        public void testCalculateGPA_withAllAs() {
            double[] grades = new double[] {90.0, 92.0, 95.0, 93.0};
            double result = GradeCalculator.calculateGPA(grades);
            assertThat(result, equalTo(4.0));
        }

        @Test
        public void testCalculateGPA_withAllBs() {
            double[] grades = new double[] {80.0, 83.0, 87.0, 85.0};
            double result = GradeCalculator.calculateGPA(grades);
            assertThat(result, equalTo(3.0));
        }

        @Test
        public void testCalculateGPA_withMixedGrades() {
            double[] grades = new double[] {90.0, 85.0, 70.0, 60.0, 80.0};
            double result = GradeCalculator.calculateGPA(grades);
            assertThat(result, equalTo(2.6));
        }


}

