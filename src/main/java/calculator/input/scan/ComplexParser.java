package calculator.input.scan;

import calculator.DataTransportObject;
import calculator.data.type.Calculation;
import calculator.data.type.Complex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ComplexParser implements Parser{
    @Override
    public DataTransportObject parse(String string) throws Exception {
//        String string = "2+3i / 4-5i - 18-6i"; // -12 + 4i

        String[] split = string.split(" ");
        if (split.length % 2 == 0) {
            throw new Exception("Невалидная строка");
        }

        Pattern pattern = Pattern.compile("^(-?\\d*)([+-])((\\d*)i|i)$"); // пока не описан вариант Complex a = -3i (\d*[\D\s]\di)

        List<Complex> complexList = new LinkedList<>();
        List<Character> operationList = new ArrayList<>();

        for (int i = 0; i < split.length; i += 2) {
            Matcher matcher = pattern.matcher(split[i]);

            matcher.find();

            String re = matcher.group(1);
            String im = matcher.group(4);
            double doubleRe = Double.parseDouble(re);
            double doubleIm = Double.parseDouble(im);
            if (matcher.group(2).equals("-")) {
                doubleIm *= -1;
            }
            complexList.add(new Complex(doubleRe, doubleIm));
        }

        for (int i = 1; i < split.length; i += 2) {
            Pattern pattern1 = Pattern.compile("^[+]|[-]|[*]$");
            Matcher matcher1 = pattern1.matcher(split[i]);
            if (matcher1.find() == false) {
                throw new Exception("Не распознал операцию");
            }
            operationList.add(split[i].charAt(0));


        }

        System.out.println(complexList);
        System.out.println(operationList);

        return new DataTransportObject(complexList,operationList);

//        Complex result = complexList.get(0);
//        complexList.remove(0);
//
//        for (Character znak : operationList)
//            switch (znak) {
//                case '+':
//                    result = result.add(complexList.get(0));
//                    complexList.remove(0);
//                    break;
//
//                case '*':
//                    result = result.multiply(complexList.get(0));
//                    complexList.remove(0);
//                    break;
//                case '-':
//                    result = result.add(complexList.get(0).multiplyByConst(-1));
//                    complexList.remove(0);
//                    break;
//
//            }
//
//        System.out.println(result);
    }
}