/*
 * Oval.java 2026-03-29
 *
 * ©Copyright 2026 Carles Conesa Mañosa <a251158cc@correu.escoladeltreball.org>
 *
 * This is free software, licensed under the MIT license.
 */

package figure;
/**
 * A class to describe an oval, including the module, area and perimeter values.
 *
 * @author Carles Conesa Mañosa
 * @version 1.0
 * @since 2026-03-29
 */
public class Oval extends Figure {
    
    // Attributes

    /** The radius1 of an oval */
    private int radius1;

    /** The radius2 of an oval */
    private int radius2;
    
    /**
     * Default constructor.
     * Initializes all attributes with default values.
     */
    public Oval(int x, int y, Color color, boolean isFilled, int radius1, int radius2) {
        super(x, y, color, isFilled);
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    /**
     * Parametized constructor.
     */
    public Oval(int x, int y, int radius1, int radius2) {
        super(x, y);
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    // Getters and Setters
    
    /**
     * Gets the value of the radius1 of an oval.
     *
     * @return the radius1 of an oval
     */
    public int getRadius1() {
        return radius1;
    }
    
    /**
     * Sets the value of the radius1 of an oval.
     *
     * @param radius1 the radius1 of an oval to set
     */
    public void setRadius1(int radius1) {
        this.radius1 = radius1;
    }

    /**
     * Gets the value of the radius2 of an oval
     *
     * @return the radius2 of an oval
     */
    public int getRadius2() {
        return radius2;
    }
    
    /**
     * Sets the value of the radius2 of an oval
     *
     * @param radius2 the radius2 of an oval to set
     */
    public void setRadius2(int radius2) {
        this.radius2 = radius2;
    }

    /**
     * Calculates the module of an oval.
     *
     * @return the module of and oval
     */
    @Override
    public double module() {
        return Math.sqrt(Math.pow(radius1, 2) + Math.pow(radius2, 2));
    }

    /**
     * Calculates the area of an oval.
     *
     * @return the area of an oval
     */
    public double area() {
        return Math.PI * radius1 * radius2;
    }

    /**
     * Calculates the perimeter of an oval.
     *
     * @return the perimeter of an oval
     */
    public double perimeter() {
        return 2 * Math.PI * Math.sqrt((Math.pow(radius1, 2) + Math.pow(radius2, 2)) / 2);
    }

    /**
     * Returns a string representation of an oval.
     *
     * @return a string representation of an oval
     */
    @Override
    public String toString() {
        return "Oval{" + super.toString() +", radius1=" + radius1 + ", radius2=" + radius2 + "}";
    }
}