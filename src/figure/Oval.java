/*
 * Oval.java 2026-03-24
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
public class Oval extends Figure {
    
    // Attributes
    /** Description of attribute2 */
    private int radius1;

    /** Description of attribute2 */
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

    // Getters and Setters
    
    /**
     * Gets the value of radius1.
     *
     * @return radius1
     */
    public int getRadius1() {
        return radius1;
    }
    
    /**
     * Sets the value of radius1.
     *
     * @param radius1 the radius1 to set
     */
    public void setRadius1(int radius1) {
        this.radius1 = radius1;
    }

    /**
     * Gets the value of radius2.
     *
     * @return radius2
     */
    public int getRadius2() {
        return radius2;
    }
    
    /**
     * Sets the value of radius2.
     *
     * @param radius2 the radius2 to set
     */
    public void setRadius2(int radius2) {
        this.radius2 = radius2;
    }

    /**
     * Module.
     *
     * @return module
     */
    @Override
    public double module() {
        return Math.sqrt(Math.pow(radius1, 2) + Math.pow(radius2, 2));
    }

    /**
     * Area.
     *
     * @return area
     */
    public double area() {
        return Math.PI * radius1 * radius2;
    }

    /**
     * Perimeter.
     *
     * @return perimeter
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