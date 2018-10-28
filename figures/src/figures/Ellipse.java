package figures;

import main.main;

public class Ellipse extends main{

    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Ellipse(int a, int b) {
        setA(a);
        setB(b);

    }

    @Override
    public double area() {
        return Math.PI * a *b;
    }

    @Override
    public double circumference() {
        return Math.PI * (Math.sqrt((2*(Math.pow(a,2)+ Math.pow(b,2)))));
    }

    @Override
    public String output() {
        return "Ellipse mit Hauptachse " + getA()+ " und Nebensache " + getB()+": Fläche -> "
                + area()+", Umfang -> "+ circumference() ;
    }
}
