package calculator;

import calculator.input.scan.ComplexParser;
import calculator.input.scan.MatrixParser;
import calculator.input.scan.Parser;
import calculator.input.scan.VectorParser;

public class ParserFactory {
    public Parser getParserInstance(String string){
        Parser parser = null;
        if (string.equals("MATRIXPARSER")){
            parser = new MatrixParser();
        }

        if (string.equals("VECTORPARSER")){
            parser = new VectorParser();
        }

        if (string.equals("MATRIXPARSER")){
            parser = new ComplexParser();
        }
        return parser;
    }


}
