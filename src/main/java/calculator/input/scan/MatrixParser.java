package calculator.input.scan;

import calculator.DataTransportObject;
import calculator.data.type.Matrix;

public class MatrixParser implements Parser {
    @Override
    public DataTransportObject parse(String string) throws Exception {

        string = "[{1,2,3} {4,5,6}]";

        String[] split = string.split(" ");
        String[][] secondsplit = new String[split.length][split[0].split(",").length];
        double[][] matrix = new double[split.length][split[0].split(",").length];

        for (int i = 0; i < split.length; i++) {
            for (int j = 0; j < split.length; j++) {
                matrix[i][j] = Double.parseDouble(secondsplit[i][j]);
            }
        }

            for (int i = 0; i < split.length; i++) {
                for (int j = 0; j < split.length; j++) {
                    System.out.println(matrix[i][j]);;
                }



        }
        return null;
        //      return new Matrix[matrix];

    }
}

class TestMatrixParser {
    public static void main(String[] args) {

        String string = "[{1,2,3} {4,5,6}]";

        String[] split = string.split(" ");
        String[][] secondsplit = new String[split.length][split[0].split(",").length];
        double[][] matrix = new double[split.length][split[0].split(",").length];
        for (int i = 0; i < split.length; i++) {
            secondsplit[i]= split[i].split(",");
        }



        for (int i = 0; i < split.length; i++) {
            for (int j = 0; j < secondsplit.length; j++) {

                matrix[i][j] = Double.parseDouble(secondsplit[i][j]);
            }
        }

        for (int i = 0; i < split.length; i++) {
            for (int j = 0; j < split.length; j++) {
                System.out.println(matrix[i][j]);;
            }



        }

        //      return new Matrix[matrix];

    }
    }
