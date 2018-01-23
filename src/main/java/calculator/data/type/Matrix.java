package calculator.data.type;

import java.util.Arrays;

public class Matrix implements Calculation {
private int dimension;
private double[][] matrix;

    public Matrix(int rows, int colums) {
//        double matrix[][] = new double[rows][colums];
        for (int i=0;i<rows;i++) {
            for (int j=0;i<colums;i++){
                this.matrix[i][j] = Math.random();
            }
        }

    }

    public double[][] getMatrix() {

        return matrix;
    }

    /**
     *   getter на Matrix[i][j]
     */


    /**
     *   setter на Matrix[i][j]
     */

    public Matrix(double a[][]) {
        int rows = a.length;
        int columns = a[0].length;
        matrix = new double[rows][columns];
//
//        for (int i=0;i<a.length;i++) {
//            for (int j=0;j<a[i].length;j++){
//               this.matrix[i][j] = Math.random();//
//            }
//
//        }
        for (int i=0; i<a.length;i++) {
            matrix[i] = Arrays.copyOf(a[i],a[i].length);
        }



    }

    @Override
    public Matrix add(Calculation calculation) {
        Matrix o = (Matrix)calculation;
        double newmatrix[][] = o.getMatrix();
        double resultmatrix[][] = new double[matrix.length][matrix[0].length];

        if (matrix.length != newmatrix.length) {
            System.out.println("Количество строк в матрицах не равно!");
        }
        if (matrix[0].length != newmatrix[0].length) {
            System.out.println("Количество столбцов в матрицах не равно!");
        }


        for (int i = 0; i < newmatrix.length; i++) {
            for (int j = 0; j < newmatrix[0].length; j++) {
                resultmatrix[i][j] = matrix[i][j] + newmatrix[i][j];
            }
        }

        return new Matrix(resultmatrix);

    }

    @Override
    public Matrix multiplyByConst(double a) {

        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                this.matrix[i][j] = this.matrix[i][j] * a;
            }
        }

        return new Matrix(this.matrix);
    }

    @Override
    public double module() {
        return 0;
    }

    @Override
    public Matrix multiply(Calculation calculation) {
        Matrix o = (Matrix)calculation;

        double[][] result = new double[matrix.length][o.getMatrix()[0].length];

        if (this.matrix[0].length != o.getMatrix().length) {
            System.out.println("Матрицы не согласованы!");
            return null;
        }

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j<o.getMatrix()[0].length;j++){
                for (int k = 0; k<o.getMatrix().length;k++) {
                    result[i][j] += this.matrix[i][k] * o.getMatrix()[k][j];

                }
            }
        }





    return new Matrix(result);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Matrix)) {
            return false;
        }

        Matrix matrix1 = (Matrix) o;

        return Arrays.deepEquals(matrix, matrix1.getMatrix());
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(matrix);
    }
}
