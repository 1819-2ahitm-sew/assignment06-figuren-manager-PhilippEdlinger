package main;

import figures.Dreieck;
import figures.Ellipse;
import figures.Kreis;
import figures.Quadrat;

import java.sql.SQLOutput;

public abstract class main {
    abstract public double area();
    abstract public double circumference();
    abstract public String output();

    public static void main(String[] args) {
        Dreieck triangle = new Dreieck(10,5,40);
        Quadrat square = new Quadrat(5);
        Ellipse ellipse = new Ellipse(10, 5);
        Kreis circle = new Kreis(5);

        System.out.println("\nDatenanzeige\n" +
                           "--------------");

        System.out.println(square.output());
        System.out.println(ellipse.output());
        System.out.println(circle.output());
        System.out.println(triangle.output());
    }


}
