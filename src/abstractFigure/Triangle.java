/*
 * Triangle.java 2026-03-29
 *
 * ©Copyright 2026 Carles Conesa Mañosa <a251158cc@correu.escoladeltreball.org>
 *
 * This is free software, licensed under the MIT license.
 */

package abstractFigure;
/**
 * A class to describe a triangle, including the module, area and perimeter values. Assume only equilateral triangles.
 *
 * @author Carles Conesa Mañosa
 * @version 1.0
 * @since 2026-03-29
 */
public class Triangle extends Figure {
    
    // Attributes

    /** The base of a triangle */
    private int base;

    /** The height of a triangle */
    private int height;

    /** A value which says whether a triangle is rounded or not */
    private boolean isRounded = false;
    
    /**
     * Default constructor.
     * Initializes all attributes with default values.
     */
    public Triangle(int x, int y, Color color, boolean isFilled, int base, int height, boolean isRounded) {
        super(x, y, color, isFilled);
        this.base = base;
        this.height = height;
        this.isRounded = isRounded;
    }

    /**
     * Parameterized constructor.
     */
    public Triangle(int x, int y, int base, int height) {
        super(x, y);
        this.base = base;
        this.height = height;
    }

    // Getters and Setters
    
    /**
     * Gets the value of the base.
     *
     * @return base
     */
    public int getBase() {
        return base;
    }
    
    /**
     * Sets the value of the base.
     *
     * @param base the base to set
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * Gets the value of the height.
     *
     * @return the height
     */
    public int getHeight() {
        return height;
    }
    
    /**
     * Sets the value of the height.
     *
     * @param height the height to set
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
     * Calculates the module of a triangle.
     *
     * @return the module of a triangle
     */
    @Override
    public double module() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    }

    /**
     * Calculates the area of a triangle.
     *
     * @return the area of a triangle
     */
    public double area() {
        return base * height / 2;
    }

    /**
     * Caclulates the perimeter of a triangle.
     *
     * @return the perimeter of a triangle
     */
    public double perimeter() {
        return base * 3;
    }

    /**
     * Returns a string representation of an triangle.
     *
     * @return a string representation of a triangle.
     */
    @Override
    public String toString() {
        return "Triangle{" + super.toString() +", base=" + base + ", height=" + height + ", isRounded=" + isRounded + "}";
    }
}