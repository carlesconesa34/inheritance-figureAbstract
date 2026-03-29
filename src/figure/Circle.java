/*
 * Circle.java 2026-03-29
 *
 * ©Copyright 2026 Carles Conesa Mañosa <a291158cc@correu.escoladeltreball.org>
 *
 * This is free software, licensed under the MIT license.
 */

package figure;

/**
 * A class to describe a circle, which extends the Oval class.
 *
 * @author Carles Conesa Mañosa
 * @version 1.0
 * @since 2026-03-29
 */
public class Circle extends Oval {
    /**
     * Default constructor.
     * Initializes all attributes with default values.
     */
    public Circle(int x, int y, int radius) {
        super(x, y, radius, radius);
    }
    
    /**
     * Parameterized constructor.
     */
    public Circle(int x, int y, Color color, boolean isFilled, int radius) {
        super(x, y, color, isFilled, radius, radius);
    }
}