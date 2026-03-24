/*
 * Rectangle.java 2026-03-24
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
 * @since 2026-03-24
 */
public class Rectangle extends Figure {
    
    // Attributes
    /** Description of attribute2 */
    private int base;

    /** Description of attribute2 */
    private int height;

    /** Description of attribute2 */
    private boolean isRounded = false;
    
    /**
     * Default constructor.
     * Initializes all attributes with default values.
     */
    public Rectangle(int x, int y, Color color, boolean isFilled, int base, int height, boolean isRounded) {
        super(x, y, color, isFilled);
        this.base = base;
        this.height = height;
        this.isRounded = isRounded;
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
     * Module.
     *
     * @return module
     */
    @Override
    public double module() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    }

    /**
     * Area.
     *
     * @return area
     */
    public double area() {
        return base * height;
    }

    /**
     * Perimeter.
     *
     * @return perimeter
     */
    public double perimeter() {
        return 2 * (base + height);
    }

    /**
     * Returns a string representation of an oval.
     *
     * @return a string representation of an oval
     */
    @Override
    public String toString() {
        return "Rectangle{" + super.toString() +", base=" + base + ", height=" + height + ", isRounded=" + isRounded + "}";
    }
}