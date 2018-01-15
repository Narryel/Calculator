package calculator;

import calculator.data.type.Calculation;

import java.util.List;

public class DataTransportObject{
    private List<? extends Calculation> objectList;
    private List<Character> operationList;

    public DataTransportObject(List<? extends Calculation> objectList, List<Character> operationList) {
        this.objectList = objectList;
        this.operationList = operationList;
    }

    public List<? extends Calculation> getObjectList() {
        return objectList;
    }

    public void setObjectList(List<? extends Calculation> objectList) {
        this.objectList = objectList;
    }

    public List<Character> getOperationList() {
        return operationList;
    }

    public void setOperationList(List<Character> operationList) {
        this.operationList = operationList;
    }


}
