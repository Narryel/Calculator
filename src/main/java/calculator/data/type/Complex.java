package calculator.data.type;

public class Complex implements Calculation{
    /**
     * действительная часть комплексного числа
     */
    private double re;

    /**
     * мнимая часть комплексного числа
     */
    private double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }
//
//    public void setRe(double re) {
//        this.re = re;
//    }
//
//    public void setIm(double im) {
//        this.im = im;
//    }

    /**
     * Метод сложения комплексного числа на константу.
     *
     * @param calculation - комплексное число, с которым будем складывать
     * @return - Возвращаем новый обьект класса datatype.Complex
     */

    @Override
    public Complex add(Calculation calculation) {
        Complex complex = (Complex)calculation;
        return new Complex(this.re + complex.getRe(), this.im + complex.getIm());
    }

    /**
     * Метод умножения комплексного числа на константу.
     *
     * @param a - константа, на которую умножаем комплексное число
     * @return - Возвращаем новый обьект класса datatype.Complex
     */

    @Override
    public Complex multiplyByConst(double a) {
        return new Complex(this.re * a, this.im * a);
    }

    /**
     * Метод, возвращающий модуль комплексного числа
     *
     * @return - возвращаем double модуль
     */
    @Override
    public double module() {
        return Math.sqrt(Math.pow(this.getRe(), 2) + Math.pow(this.getIm(), 2));
    }

    /**
     * Метод, перемножающий текущее комплексное число на другое комплексное число
     *
     * @param calculation - комплексное число, на которое будем умножать
     * @return - новый обьект класса datatype.Complex
     */
    @Override
    public Complex multiply(Calculation calculation) {
        Complex complex = (Complex)calculation;
        return new Complex((this.re * complex.getRe()) - (this.im * complex.getIm()), (this.re * complex.getIm() + this.im * complex.getRe()));
    }

    //
    @Override
    public boolean equals(Object a) {
        if (this == a) {
            return true;
        }
        if (!(a instanceof Complex)) {
            return false;
        }
        if (((Complex) a).getIm() == im && ((Complex) a).getRe() == re)
            return true;

        return false;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(re);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(im);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Complex{" +
                re +(im>0 ? "+"+im : im) +"i}";
    }
}
