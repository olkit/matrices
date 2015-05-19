package com.epam.olki;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class models a Matrix.
 *
 * @author olki
 * @version 1.0.0
 */
public class ArraylistMatrix  implements Matrix, Iterable<Entity>  {

    private final String name;
    private static int countOfMatrix = 0;
    private int rows;
    private int columns;
    private ArrayList<Entity> data;

    public ArraylistMatrix(int rows, int columns) {
        this.name = "matrix" + countOfMatrix;
        this.rows = rows;
        this.columns = columns;
        this.data = new ArrayList<Entity>();
        countOfMatrix++;
        initZeroValues();
    }

    public ArraylistMatrix(String name, int rows, int columns) {
        this.name = name;
        this.rows = rows;
        this.columns = columns;
        this.data = new ArrayList<Entity>();
        countOfMatrix++;
        initZeroValues();
    }

    public void initZeroValues() {

        int size = rows * columns;
        for(int i = 0; i< size; i++) {
            data.add(new Entity(0.0));
        }

    }

    public void fillRandomValues() {

        for (Iterator<Entity>  dataIterator = this.data.iterator();
             dataIterator.hasNext(); ) {

            Entity data = dataIterator.next();
            data.randomizeValue();
        }

    }

    public Iterator<Entity> iterator() {

        return this.data.iterator();
    }

    public int getNumberOfEntities()  {

        return this.data.size();
    }

    public String getName() {
        return name;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public static int getCountOfMatrix() {
        return countOfMatrix;
    }

    public Entity getEntity(int i, int j) {
        // need to add exceptions
        return data.get((i * rows) + j);
    }

    public String toString() {

        String out = "";
        int count = 0;

        for (Iterator<Entity>  dataIterator = this.data.iterator();
             dataIterator.hasNext(); ) {

            Entity data = dataIterator.next();

            if (count++ % this.getColumns() == 0) {
                out += "\n";
            }
            out += "   " + data.toString();
        }
        return out;
    }
}
