package calculator.data.type.test;

import calculator.data.type.Complex;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexTest {
    @Test
    public void addComplexTest() {
        Complex complex1 = new Complex(1, 2);
        Complex complex2 = new Complex(3, 4);
        Complex correctSumm = new Complex(4, 6);

        assertEquals(correctSumm, complex1.add(complex2));

    }
    @Test
    public void multiplyByConstTest() {
        Complex complex1 = new Complex(1, 2);
        double a = 3;
        Complex correctResult = new Complex(3, 6);

        assertEquals(correctResult, complex1.multiplyByConst(a));
    }

    @Test
    public void moduleTest() {
        Complex complex = new Complex(1, 3);
        double a = Math.sqrt(10);
        double delta = 0.0;

        assertEquals(a,complex.module(), delta);
    }

    @Test
    public void multiplyTest () {
        Complex complex1 = new Complex(5, 3);
        Complex complex2 = new Complex(4, 7);
        Complex correctResult = new Complex(-1, 47);

        assertEquals(correctResult, complex1.multiply(complex2));
    }


}
