package com.epam.olki;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by olki on 5/19/15.
 */
public class MatrixStore implements Iterable<ArraylistMatrix> {


    static private MatrixStore singletonInstance = null;

    /* Collection of <code>Matrix</code> objects.*/
    private ArrayList<ArraylistMatrix> matrices;

    /**
     * Constructs a <code>MatrixFactory</code> object.
     * <p>
     * Creates an empty collection of matrices.
     * </p>
     */
    private MatrixStore() {
        this.matrices = new ArrayList<ArraylistMatrix>();
    }

    /**
     * Obtains the single instance of class
     * <code>MatrixFactory</code>
     *
     * @return the single instance  of class
     *         <code>MatrixFactory</code>
     */
    static public MatrixStore getSingletonInstance() {

        if (singletonInstance == null) {
            singletonInstance = new MatrixStore();
        }

        return singletonInstance;
    }

    /**
     * Adds a matrix to this Factory.
     *
     * @param matrix  the {@link ArraylistMatrix} object.
     */
    public void addMatrix(ArraylistMatrix matrix)  {

        this.matrices.add(matrix);
    }

    public ArraylistMatrix getMatrixByName(String name)  {

        for (Iterator<ArraylistMatrix>  mtxIterator = this.iterator();
             mtxIterator.hasNext(); ) {

            ArraylistMatrix mtx = mtxIterator.next();

            if (mtx.getName().equals(name)) {
                return mtx;
            }
        }
        // *** need to throw Exception ***
        return null;
    }



    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    public Iterator<ArraylistMatrix> iterator() {
        return this.matrices.iterator();
    }

    /**
     * Returns the number of matrix of this factory.
     *
     * @return  the number of matrix of this factory.
     */
    public int  getNumberOfMatrices()  {

        return this.matrices.size();
    }
}
