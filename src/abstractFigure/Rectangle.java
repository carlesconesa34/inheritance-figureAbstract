/*
 * Rectangle.java 2026-03-29
 *
 * ©Copyright 2026 Carles Conesa Mañosa <a251158cc@correu.escoladeltreball.org>
 *
 * This is free software, licensed under the MIT license.
 */

package figure;
/**
 * A class to describe a rectangle, including the module, area and perimeter values.
 *
 *
 * @author Carles Conesa Mañosa
 * @version 1.0
 * @since 2026-03-29
 */
public class Rectangle extends Figure {
    
    // Attributes

    /** The base of a rectangle */
    private int base;

    /** The height of a rectangle */
    private int height;

    /** A value which says whether a rectangle is rounded or not */
    private boolean isRounded = false;
    
    /**
     * Default constructor.
     * Initializes all attributes with default values.
     */
    public Rectangle(int x, int y, Color color, boolean isFilled, boolean isRounded, int base, int height) {
        super(x, y, color, isFilled);
        this.base = base;
        this.height = height;
        this.isRounded = isRounded;
    }

    /**
     * Parameterized constructor.
     */
    public Rectangle(int x, int y, int base, int height) {
        super(x, y);
        this.base = base;
        this.height = height;
    }

    // Getters and Setters
    
    /**
     * Gets the value of the base of a rectangle.
     *
     * @return the base of a rectangle
     */
    public int getBase() {
        return base;
    }
    
    /**
     * Sets the value of the base of a rectangle
     *
     * @param base the base of a rectangle to set
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * Gets the value of the height of a rectangle.
     *
     * @return the height of a rectangle
     */
    public int getHeight() {
        return height;
    }
    
    /**
     * Sets the value of the height of a rectangle
     *
     * @param height the height of a rectangle to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Gets the value of isRounded.
     *
     * @return isRounded
     */
    public boolean isRounded() {
        return isRounded;
    }
    
    /**
     * Sets the value of isRounded.
     *
     * @param isRounded the isRounded to set
     */
    public void setRounded(boolean isRounded) {
        this.isRounded = isRounded;
    }


    /**
     * Calculates the module of a rectangle.
     *
     * @return the module of a rectangle
     */
    @Override
    public double module() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    }

    /**
     * Calculates the area of a rectangle.
     *
     * @return the area of a rectangle
     */
    public double area() {
        return base * height;
    }

    /**
     * Calculates the perimeter of a rectangle.
     *
     * @returnt the perimeter of a rectangle
     */
    public double perimeter() {
        return 2 * (base + height);
    }

    /**
     * Returns a string representation of a rectangle.
     *
     * @return a string representation of a rectangle
     */
    @Override
    public String toString() {
        return "Rectangle{" + super.toString() +", base=" + base + ", height=" + height + ", isRounded=" + isRounded + "}";
    }
}