package calculator;

import calculator.data.type.Calculation;
import calculator.data.type.Matrix;
import calculator.input.scan.Parser;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Parser parser;
        Calculation result;

        System.out.println("Введите строку с выражением");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        switch (string.charAt(0)) {
            case '[': {
                parser = ParserFactory.getParserInstance("MATRIXPARSER");
                break;
            }
            case '{': {
                parser = ParserFactory.getParserInstance("VECTORPARSER");
                break;
            }
            default: {
                parser = ParserFactory.getParserInstance("COMPLEXPARSER");
                break;
            }
        }
        DataTransportObject dto = null;
        try {
            dto = parser.parse(string);

        } catch (Exception e) {
            e.printStackTrace();
        }
        result = dto.getObjectList().get(0);
        dto.getObjectList().remove(0);

        for (Character operation : dto.getOperationList()) {
            switch (operation) {
                case '+':
                    result = result.add(dto.getObjectList().get(0));
                    dto.getObjectList().remove(0);
                    break;

                case '*':
                    result = result.multiply(dto.getObjectList().get(0));
                    dto.getObjectList().remove(0);
                    break;
                case '-':
                    result = result.add(dto.getObjectList().get(0).multiplyByConst(-1));
                    dto.getObjectList().remove(0);
                    break;
            }
        }
        System.out.println(result.toString());
    }

}
