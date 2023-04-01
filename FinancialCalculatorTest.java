import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;


@RunWith(JUnit4.class)

public class FinancialCalculatorTest {
    @Test
    public void testCalculateTax1() {
        double tax = FinancialCalculator.calculateTax(50000, 10);
        assertEquals(5000.0, tax, 0.01);
    }

    @Test
    public void testCalculateTax2() {
        double tax = FinancialCalculator.calculateTax(75000, 25);
        assertEquals(18750.0, tax, 0.01);
    }

    @Test
    public void testCalculateTax3() {
        double tax = FinancialCalculator.calculateTax(1000000, 40);
        assertEquals(400000.0, tax, 0.01);
    }
    @Test
    public void testCalculateSimpleInterest1() {
        double interest = FinancialCalculator.calculateSimpleInterest(10000, 5, 2);
        assertEquals(1000.0, interest, 0.01);
    }

    @Test
    public void testCalculateSimpleInterest2() {
        double interest = FinancialCalculator.calculateSimpleInterest(5000, 8, 3.5);
        assertEquals(1400.0, interest, 0.01);
    }

    @Test
    public void testCalculateSimpleInterest3() {
        double interest = FinancialCalculator.calculateSimpleInterest(25000, 2.5, 10);
        assertEquals(6250.0, interest, 0.01);
    }
    @Test
    public void testCalculateCompoundInterest1() {
        double interest = FinancialCalculator.calculateCompoundInterest(10000, 5, 2, 4);
        assertEquals(1044.86, interest, 0.01);
    }

    @Test
    public void testCalculateCompoundInterest2() {
        double interest = FinancialCalculator.calculateCompoundInterest(5000, 8, 3.5, 2);
        assertEquals(1579.66, interest, 0.01);
    }

    @Test
    public void testCalculateCompoundInterest3() {
        double interest = FinancialCalculator.calculateCompoundInterest(25000, 2.5, 10, 12);
        assertEquals(7092.28, interest, 0.01);
    }
    @Test
    public void testCalculatePayment1() {
        double payment = FinancialCalculator.calculatePayment(10000, 5, 2, 4);
        assertEquals(1321.33, payment, 0.01);
    }

    @Test
    public void testCalculatePayment2() {
        double payment = FinancialCalculator.calculatePayment(5000, 8, 3.5, 2);
        assertEquals(833.05, payment, 0.01);
    }

    @Test
    public void testCalculatePayment3() {
        double payment = FinancialCalculator.calculatePayment(25000, 2.5, 10, 12);
        assertEquals(235.67, payment, 0.01);
    }

    @Test
    public void testCalculatePresentValue1() {
        assertEquals(907.03, FinancialCalculator.calculatePresentValue(1000, 5, 2), 0.01);
        assertEquals(3104.61, FinancialCalculator.calculatePresentValue(5000, 10, 5), 0.01);
        assertEquals(1640.7, FinancialCalculator.calculatePresentValue(2000, 2, 10), 0.01);
    }

    @Test
    public void testCalculatePresentValue2() {
        double presentValue = FinancialCalculator.calculatePresentValue(10000, 5, 10);
        assertEquals(6139.13, presentValue, 0.01);

        presentValue = FinancialCalculator.calculatePresentValue(5000, 8, 3);
        assertEquals(3969.16, presentValue, 0.01);

        presentValue = FinancialCalculator.calculatePresentValue(20000, 2.5, 7);
        assertEquals(16825.30, presentValue, 0.01);
    }

    @Test
    public void testCalculateFutureValue() {
        double futureValue = FinancialCalculator.calculateFutureValue(10000, 5, 10);
        assertEquals(16288.95, futureValue, 0.01);

        futureValue = FinancialCalculator.calculateFutureValue(5000, 8, 3);
        assertEquals(6298.56, futureValue, 0.01);

        futureValue = FinancialCalculator.calculateFutureValue(20000, 2.5, 7);
        assertEquals(23773.71, futureValue, 0.01);
    }



}
