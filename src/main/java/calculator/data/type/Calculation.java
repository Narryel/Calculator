package calculator.data.type;

public interface Calculation<Number>{
    Number add (Number number);
    Number multiplyByConst (double a);
    double module(); // тут был (Number number)
    Number multiply(Number number);

}
