package srp1;

import srp1.figure.Point;
import srp1.figure.Square;
import srp1.figure.SquareAreaCalculator;
import srp1.figure.SquarePainter;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        SquareAreaCalculator calc = new SquareAreaCalculator(square);
        SquarePainter painter = new SquarePainter(square);
        System.out.printf("Square area: %d \n", calc.getArea());
        painter.draw();
    }
}
