package calculator.data.type;

public interface Calculation {
    Calculation add (Calculation calculation);
    Calculation multiplyByConst (double a);
    double module(); // тут был (Number number)
    Calculation multiply(Calculation calculation);

}
