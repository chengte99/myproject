package com.chengte99;

public class Ticket {
    // Model, JavaBean, POJO
    // Command + N 可以自動產生建構子，getter, setter
    int source;
    int destination;
    int price;

    public Ticket(int source, int destination, int price) {
        this.source = source;
        this.destination = destination;
        this.price = price;
    }

    public Ticket() {
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
