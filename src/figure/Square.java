/*
 * Square.java 2026-03-25
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
 * @since 2026-03-25
 */
public class Square extends Rectangle {
    /**
     * Default constructor.
     * Initializes all attributes with default values.
     */
    public Square(int x, int y, int radius) {
        super(x, y, radius, radius);
    }
    
    /**
     * Parameterized constructor.
     *
     * @param x description of parameter
     * @param y description of parameter
     * @param color description of parameter
     * @param isFilled description of parameter
     * @param radius description of parameter
     */
    public Square(int x, int y, Color color, boolean isFilled, int radius) {
        super(x, y, color, isFilled, radius, radius);
    }
}