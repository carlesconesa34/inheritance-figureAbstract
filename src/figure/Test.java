/*
 * Test.java 2026-03-29
 *
 * ©Copyright 2026 Carles Conesa Mañosa <a291158cc@correu.escoladeltreball.org>
 *
 * This is free software, licensed under the MIT license.
 */

package figure;

import java.util.ArrayList;
import java.util.List;

/**
 * A test class to verify the behaviour of all Figure subclasses.
 *
 * @author Carles Conesa Mañosa
 * @version 1.0
 * @since 2026-03-29
 */
public class Test {
    /**
     * Tests all Figure subclasses by instantiating them with both constructors,
     * printing their info, resetting their position, and calculating their
     * module, area and perimeter individually.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        System.out.println("=== INSTANCIACIÓ AMB CONSTRUCTOR PARAMÈTRIC (x, y, ...) ===\n");

        // Triangle - constructor paramètric
        Triangle triangle1 = new Triangle(10, 20, 100, 50);
        System.out.println(triangle1);

        // Triangle - constructor complet
        Triangle triangle2 = new Triangle(10, 20, Color.CYAN, true, 100, 50, false);
        System.out.println(triangle2);

        // Rectangle - constructor paramètric
        Rectangle rectangle1 = new Rectangle(30, 40, 200, 150);
        System.out.println(rectangle1);

        // Rectangle - constructor complet
        Rectangle rectangle2 = new Rectangle(30, 40, Color.MAGENTA, true, false, 200, 150);
        System.out.println(rectangle2);

        // Square - constructor paramètric
        Square square1 = new Square(50, 60, 100);
        System.out.println(square1);

        // Square - constructor complet
        Square square2 = new Square(50, 60, Color.YELLOW, false, true, 100);
        System.out.println(square2);

        // Oval - constructor paramètric
        Oval oval1 = new Oval(70, 80, 60, 40);
        System.out.println(oval1);

        // Oval - constructor complet
        Oval oval2 = new Oval(70, 80, Color.BLACK, true, 60, 40);
        System.out.println(oval2);

        // Circle - constructor paramètric
        Circle circle1 = new Circle(90, 100, 50);
        System.out.println(circle1);

        // Circle - constructor complet
        Circle circle2 = new Circle(90, 100, Color.CYAN, true, 50);
        System.out.println(circle2);

        System.out.println("\n=== RESET POSITION ===\n");

        triangle1.resetPosition();
        System.out.println("Triangle després de resetPosition: " + triangle1);

        rectangle1.resetPosition();
        System.out.println("Rectangle després de resetPosition: " + rectangle1);

        oval1.resetPosition();
        System.out.println("Oval després de resetPosition: " + oval1);

        System.out.println("\n=== CÀLCULS INDIVIDUALS (mòdul, àrea, perímetre) ===\n");

        System.out.println("--- Triangle2 ---");
        System.out.printf("  Mòdul:     %.2f%n", triangle2.module());
        System.out.printf("  Àrea:      %.2f%n", triangle2.area());
        System.out.printf("  Perímetre: %.2f%n", triangle2.perimeter());

        System.out.println("--- Rectangle2 ---");
        System.out.printf("  Mòdul:     %.2f%n", rectangle2.module());
        System.out.printf("  Àrea:      %.2f%n", rectangle2.area());
        System.out.printf("  Perímetre: %.2f%n", rectangle2.perimeter());

        System.out.println("--- Square2 ---");
        System.out.printf("  Mòdul:     %.2f%n", square2.module());
        System.out.printf("  Àrea:      %.2f%n", square2.area());
        System.out.printf("  Perímetre: %.2f%n", square2.perimeter());

        System.out.println("--- Oval2 ---");
        System.out.printf("  Mòdul:     %.2f%n", oval2.module());
        System.out.printf("  Àrea:      %.2f%n", oval2.area());
        System.out.printf("  Perímetre: %.2f%n", oval2.perimeter());

        System.out.println("--- Circle2 ---");
        System.out.printf("  Mòdul:     %.2f%n", circle2.module());
        System.out.printf("  Àrea:      %.2f%n", circle2.area());
        System.out.printf("  Perímetre: %.2f%n", circle2.perimeter());

        System.out.println("\n=== LLISTA DE FIGURES (polimorfisme) ===\n");

        List<Figure> figures = new ArrayList<>();
        figures.add(triangle1);
        figures.add(triangle2);
        figures.add(rectangle1);
        figures.add(rectangle2);
        figures.add(square1);
        figures.add(square2);
        figures.add(oval1);
        figures.add(oval2);
        figures.add(circle1);
        figures.add(circle2);

        for (Figure figure : figures) {
            System.out.println(figure);
            System.out.printf("  Mòdul: %.2f%n", figure.module());

            // area() i perimeter() no estan a Figure, cal fer cast
            if (figure instanceof Triangle t) {
                System.out.printf("  Àrea: %.2f | Perímetre: %.2f%n", t.area(), t.perimeter());
            } else if (figure instanceof Rectangle r) {
                System.out.printf("  Àrea: %.2f | Perímetre: %.2f%n", r.area(), r.perimeter());
            } else if (figure instanceof Oval o) {
                System.out.printf("  Àrea: %.2f | Perímetre: %.2f%n", o.area(), o.perimeter());
            }
            System.out.println();
        }
    }
}
