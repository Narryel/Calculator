package calculator;

import calculator.data.type.Matrix;

public class Calculator {
    public static void main(String[] args) {
//        Calculation complex = new Complex(3, 5);
//        System.out.println(complex.module());
        double a[][] = {{1,2}, {1,2}, {1,2}, {1,2}};


        Matrix matrix1 = new Matrix(a);

        double b[][] = matrix1.getMatrix();

        for (int i = 0; i<b.length; i++) {
            for (int j = 0; j < b[0].length ; j++){
                System.out.print((b[i][j])+ " ");
            }
            System.out.println();
        }



    }
}
