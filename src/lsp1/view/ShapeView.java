package lsp1.view;

import lsp1.Quadreliteral;
import lsp1.shape.Rectangle;

public class ShapeView {
    private final Quadreliteral quadroliteral;


    public ShapeView(Quadreliteral quadroliteral) {
        this.quadroliteral = quadroliteral;
    }

    public void showArea() {
        System.out.print("Area of rectangle equal:");
        System.out.println(quadroliteral.getArea());
    }
}
