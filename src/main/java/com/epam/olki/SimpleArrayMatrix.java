package com.epam.olki;

/**
 * Created by olki on 5/19/15.
 */
public class SimpleArrayMatrix implements Matrix {

    private Entity[][] data;

    public SimpleArrayMatrix(int rows, int columns) {

        this.data = new Entity[rows][columns];
        initZeroValues();
    }

    public void initZeroValues() {

        for (int i = 0; i < this.getRows(); i++ ) {
            for (int j = 0; j < this.getColumns(); j++ ) {
                data[i][j] = new Entity(0.0);
            }
        }

    }

    public void fillRandomValues() {

        for (int i = 0; i < this.getRows(); i++ ) {
            for (int j = 0; j < this.getColumns(); j++ ) {
                data[i][j].randomizeValue();
            }
        }

    }

    public int getRows() {
        return data.length;
    }

    public int getColumns() {
        return data[0].length;
    }

    public Entity getEntity(int i, int j) {
        // need to add exceptions
        return data[i][j];
    }

    public String toString() {

        String out = "";

        for (int i = 0; i < this.getRows(); i++ ) {
            out += "\n";
            for (int j = 0; j < this.getColumns(); j++ ) {
                out += "|\t" + data[i][j].toString();
            }
        }
        return out;
    }
}
