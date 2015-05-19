package com.epam.olki;

/**
 * Created by olki on 5/19/15.
 */
public class SimpleArrayMatrixFactory {


    public SimpleArrayMatrixFactory() {
    }

    /**
     * Constructs a <code>MatrixFactory</code> object.
     */
    public static SimpleArrayMatrix getRandomFilledMatrix(int row, int column)  {

        SimpleArrayMatrix matrix = new SimpleArrayMatrix(row, column);
        matrix.fillRandomValues();
        return matrix;
    }
}
