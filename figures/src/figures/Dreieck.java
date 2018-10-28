package figures;

import main.main;

public class Dreieck extends main {

    private double a;
    private double b;
    private double c;
    private double h;
    private double angle;


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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public Dreieck(double a,double b,double angle ){
        setA(a);
        setB(b);
        setAngle(angle);
        area();
    }


    @Override
    public double area() {
        setH(getB() * Math.sin(getAngle()));

        return ((getA() * getH()) / 2);
    }

    @Override
    public double circumference() {
        setC( Math.sqrt((Math.pow(getA(), 2) + Math.pow(getB(),2)) - (2*getA()*getB() * Math.cos(getAngle())) ));

        return (getA() + getB() + getC());
    }

    @Override
    public String output() {
        return "Dreieck mit Seite1 " + getA() + ", Seite2 " + getB() + " und eingeschlossenem Winkel " + getAngle() +
                ": Fläche -> " + area() + ", Umfang -> " + circumference();
    }
}
