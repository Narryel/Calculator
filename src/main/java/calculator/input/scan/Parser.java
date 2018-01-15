package calculator.input.scan;

import calculator.DataTransportObject;

public interface Parser {
    DataTransportObject parse(String string) throws Exception;

}
