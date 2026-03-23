/*
 * Figure.java 2026-03-23
 *
 *
 * ©Copyright 2026 Carles Conesa Mañosa <a251158cc@correu.escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

package figure;

/**
 * Class description
 *
 * @author Carles Conesa Mañosa
 * @version 1.0
 * @since 2026-03-23
 */
public class Figure {
    
    // Attributes

    /** X */
    private int x;
    
    /** Y */
    private int y;
    
    /** Color */
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

    // Getters and Setters
    
    /**
     * Gets the value of x.
     *
     * @return x
     */
    public int getX() {
        return x;
    }

    /**
     * Sets the value of x.
     *
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Gets the value of y.
     *
     * @return y
     */
    public int getY() {
        return y;
    }
    
    /**
     * Sets the value of y.
     *
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Gets the value of color.
     *
     * @return color
     */
    public Color getColor() {
        return color;
    }
    
    /**
     * Sets the value of color.
     *
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Gets the value of isFilled.
     *
     * @return isFilled
     */
    public boolean getIsFilled() {
        return isFilled;
    }
    
    /**
     * Sets the value of isFilled.
     *
     * @param isFilled the isFilled to set
     */
    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    // Custom methods
    
    /**
     * Resets position.
     */
    public void resetPosition() {
        setY(0);
        setX(0);
    }

    /**
     * Module.
     *
     * @return return 1
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