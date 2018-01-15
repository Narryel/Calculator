package calculator.data.type.test;

import calculator.data.type.Matrix;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {
    @Test
    public void equalsTest() {
        double a[][] = {{1, 2}, {4, 5}};
        double b[][] = {{1, 2}, {4, 5}};
        Matrix matrix1 = new Matrix(a);
        Matrix matrix2 = new Matrix(b);

        assertEquals(matrix1, matrix2);
    }

    @Test
    public void summTest(){
        double a[][] = {{1, 2}, {4, 5}};
        double b[][] = {{1, 2}, {4, 5}};
        double c[][] = {{2, 4}, {8, 10}};
        Matrix matrix1 = new Matrix(a);
        Matrix matrix2 = new Matrix(b);
        Matrix resultmatrix = new Matrix(c);

        assertEquals(resultmatrix,matrix1.add(matrix2));
    }

    @Test
    public void multiplyByConstTest(){
        double a[][] = {{1, 2, 3, 2.5}, {4, 5, -19, 87.2}};
        double b[][] = {{2, 4, 6, 5}, {8, 10, -38, 174.4}};
        double c = 2;
        Matrix matrix1 = new Matrix(a);
        Matrix resultmatrix = new Matrix(b);

        assertEquals(resultmatrix,matrix1.multiplyByConst(c));
    }


    @Test
    public void multiplyTest(){
        double a[][] = {{1, 2}, {4, 5}};
        double b[][] = {{1, 2}, {4, 5}};
        double c[][] = {{9, 12}, {24, 33}};
        Matrix matrix1 = new Matrix(a);
        Matrix matrix2 = new Matrix(b);
        Matrix resultmatrix = new Matrix(c);

        assertEquals(resultmatrix,matrix1.multiply(matrix2));
    }
}


