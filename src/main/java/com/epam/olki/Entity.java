package com.epam.olki;

/**
 * This class models a entity of matrix.
 *
 * @author olki
 * @version 1.0.0
 */
public class Entity {

    /* value of the entity*/
    private double value;
    /* previous value of the entity*/
    private double previousValue;
    /* color of the entity (for future)*/
    private String color ;

    /**
     * Creates a new <code>Entity</code> object with an
     * initial value is random.
     */
    public Entity() {
        randomizeValue();
        this.previousValue = this.value;
    }

    public Entity(double value) {
        this.value = value;
        this.previousValue = value;

    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.previousValue = this.value;
        this.value = value;
    }

    public void addValue(double value) {
        this.value += value;
    }

    /**
     * Returns the value of this entity.
     *
     * @return the value of this entity
     */
    public double getPreviousValue() {
        return previousValue;
    }

    /**
     * Returns the color of this entity.
     *
     * @return the color of this entity
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "   " + this.getValue();
    }

    public void randomizeValue() {
        setValue((Math.random()*10.0));
    }
}
