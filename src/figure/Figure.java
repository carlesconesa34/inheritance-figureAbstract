/*
 * Figure.java 2026-03-29
 *
 * ©Copyright 2026 Carles Conesa Mañosa <a251158cc@correu.escoladeltreball.org>
 *
 * This is free software, licensed under the MIT license.
 */

package figure;

/**
 * A class to generally describe a figure, including the module, area and perimeter values.
 *
 * @author Carles Conesa Mañosa
 * @version 1.0
 * @since 2026-03-29
 */
public class Figure {
    
    // Attributes

    /** X coordinate */
    private int x;
    
    /** Y coordinate */
    private int y;
    
    /** Color of a figure */
    private Color color = Color.BLACK;

    /** isFilled */
    private boolean isFilled = false;

    /**
     * Default constructor.
     * Initializes all attributes with default values.
     */
    public Figure(int x, int y, Color color, boolean isFilled) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.isFilled = isFilled;
    }

    /**
     * Parametized constructor.
     */
    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters and Setters
    
    /**
     * Gets the value of the x coordinate.
     *
     * @return the x coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Sets the value of the x coordinate.
     *
     * @param x the x coordinate to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Gets the value of the y coordinate.
     *
     * @return  the y coordinate
     */
    public int getY() {
        return y;
    }
    
    /**
     * Sets the value of the y coordinate.
     *
     * @param y the y coordinate to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Gets the value of the color of a figure.
     *
     * @return the color of a figure.
     */
    public Color getColor() {
        return color;
    }
    
    /**
     * Sets the value of the color of a figure.
     *
     * @param color the color of a figure to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Gets the value of isFilled.
     *
     * @return the isFilled value
     */
    public boolean getIsFilled() {
        return isFilled;
    }
    
    /**
     * Sets the value of isFilled.
     *
     * @param isFilled the isFilled value to set
     */
    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    // Custom methods
    
    /**
     * Resets the x and y position of figure.
     */
    public void resetPosition() {
        setY(0);
        setX(0);
    }

    /**
     * Calculates the module of a figure.
     *
     * @return 1 by a default figure
     */
    public double module() {
        return 1;
    }

    /**
     * Returns a string representation of a figure.
     *
     * @return a string representation of a figure
     */
    @Override
    public String toString() {
        return "Figure{x=" + x + ", y=" + y + ", color=" + color + ", isFilled=" + isFilled + " }";
    }
}