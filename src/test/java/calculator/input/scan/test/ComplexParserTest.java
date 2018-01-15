package calculator.input.scan.test;

import calculator.data.type.Complex;
import calculator.input.scan.ComplexParser;
import org.junit.Test;

public class ComplexParserTest {
    @Test
    public void input() {
        String string = "(2+3i) + (4-5i)";

        Complex complex1 =  new Complex(2,3);
        Complex complex2 =  new Complex(4,-5);
        Complex result = new Complex(6,-2);
        ComplexParser parser = new ComplexParser();

        //assertEquals(parser.execute(string), result);



    }


}
