package com.epam.olki;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class models a Matrix Factory.
 *
 * @author olki
 * @version 1.0.0
 */
public class ArraylistMatrixFactory {

    /**
     * Constructs a <code>MatrixFactory</code> object.
     */
    public ArraylistMatrixFactory() {}

    public static ArraylistMatrix getRandomFilledMatrix(int row, int column)  {

        ArraylistMatrix matrix = new ArraylistMatrix(row, column);
        matrix.fillRandomValues();
        return matrix;
    }
}
