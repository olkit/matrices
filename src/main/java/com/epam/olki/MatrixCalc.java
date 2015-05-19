package com.epam.olki;

/**
 * This class models a Matrix Calculations.
 *
 * @author olki
 * @version 1.0.0
 */
public class MatrixCalc {

    private MatrixCalc() {}

    public static Matrix multiplication(Matrix firstMatrix, Matrix secondMatrix) {

        if (firstMatrix.getColumns() != secondMatrix.getRows())
            throw new IllegalArgumentException("first Matrix:Rows: " + firstMatrix.getColumns() +
                    " did not match second Matrix:Columns " + secondMatrix.getRows() + ".");

        Matrix product;
        if (firstMatrix instanceof SimpleArrayMatrix) {
            product = new SimpleArrayMatrix(firstMatrix.getRows(), secondMatrix.getColumns());
        } else {
            product = new ArraylistMatrix(firstMatrix.getRows(), secondMatrix.getColumns());
        }

        for (int i = 0; i < firstMatrix.getRows(); i++) { // aRow
            for (int j = 0; j < secondMatrix.getColumns(); j++) { // bColumn
                for (int k = 0; k < firstMatrix.getColumns(); k++) { // aColumn
                    product.getEntity(i, j).addValue(
                            firstMatrix.getEntity(i, k).getValue() * secondMatrix.getEntity(k, j).getValue());
                }
            }
        }

        return product;
    }
}
