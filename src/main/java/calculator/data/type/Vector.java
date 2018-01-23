package calculator.data.type;

import java.util.Arrays;

public class Vector implements Calculation {
    /**
     * действительная часть комплексного числа
     */
    private int size;
    private double[] data;


    public Vector(int size) {

        this.size = size;
        data = new double[size];
        for (int i=0; i<size;i++) {
            data[i] = Math.random();
        }
    }

    public Vector(double[] data) {
        size = data.length;

        this.data = new double[size];

        for (int i = 0; i < size; i++) {
            this.data[i] = data[i];
        }

    }

    public int getSize() {
        return size;
    }

    public double[] getData() {
        return data;
    }

    @Override
    public Vector add(Calculation calculation) {
        return null;
    }

    @Override
    public Vector multiplyByConst(double a) {
        return null;
    }

    @Override
    public double module() {
        return 0;
    }

    @Override
    public Vector multiply(Calculation calculation) {
        return null;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Vector)) return false;

        if (this.size != ((Vector) o).getSize()) return false;

        for (int i = 0; i < data.length; i++)
            if (data[i] != ((Vector) o).getData()[i])
                return false;


//        if (Arrays.equals(this.calculator.data, ((datatype.Vector) o).getData())) return true;

        return true;
    }

    @Override
    public int hashCode() {
        int result = size;
        result = 31 * result + Arrays.hashCode(data);
        return result;
    }
}
