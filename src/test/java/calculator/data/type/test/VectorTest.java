package calculator.data.type.test;

import calculator.data.type.Vector;
import org.junit.Test;

import static org.junit.Assert.*;

public class VectorTest {
    @Test
    public void equalsTest(){

        Vector vector1 = new Vector(3);
        Vector vector2 = new Vector(new double[] {0,0,0});

        assertTrue("Сравниваем вектора", vector1.equals(vector2));


    }








}
