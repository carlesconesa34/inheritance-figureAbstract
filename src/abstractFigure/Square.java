/*
 * Square.java 2026-03-29
 *
 * ©Copyright 2026 Carles Conesa Mañosa <a291158cc@correu.escoladeltreball.org>
 *
 * This is free software, licensed under the MIT license.
 */

package abstractFigure;

/**
 * A class to describe a square, which extends the Rectangle class.
 *
 * @author Carles Conesa Mañosa
 * @version 1.0
 * @since 2026-03-29
 */
public class Square extends Rectangle {
    /**
     * Default constructor.
     * Initializes all attributes with default values.
     */
    public Square(int x, int y, int side) {
        super(x, y, side, side);
    }
    
    /**
     * Parameterized constructor.
     */
    public Square(int x, int y, Color color, boolean isFilled, boolean isRounded, int side) {
        super(x, y, color, isFilled, isRounded, side, side);
    }

    /**
     * Returns a string representation of a square.
     *
     * @return a string representation of a square
     */
    @Override
    public String toString() {
        return "Square{" + super.toString() + "}";
    }
}