package com.epam.olki;

/**
 * Created by olki on 5/19/15.
 */
public interface Matrix {

    void initZeroValues();

    void fillRandomValues();

    int getRows();

    int getColumns();

    Entity getEntity(int i, int j);

    String toString();
}
