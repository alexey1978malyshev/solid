package srp2.model;

import java.util.Scanner;

public class OrderView {
//    Order order;
//
//    public OrderView(Order order) {
//        this.order = order;
//    }

    public Order inputFromConsole(){

        return new Order(prompt("Client name: "),prompt("Product: "),Integer.parseInt(prompt("Quantity: ")),Integer.parseInt(prompt("Price: ")));
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
