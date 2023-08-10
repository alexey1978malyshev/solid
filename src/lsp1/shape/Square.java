package lsp1.shape;

import lsp1.Quadreliteral;

public class Square implements Quadreliteral {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (int) Math.pow(side, 2);
    }

    @Override
    public double getSideA() {
        return side;
    }

    @Override
    public double getSideB() {
        return side;
    }
}
