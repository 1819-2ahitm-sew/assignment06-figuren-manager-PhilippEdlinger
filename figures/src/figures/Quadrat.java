package figures;

import main.main;

public class Quadrat extends main {

    private double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public Quadrat(double a){
        setA(a);
    }

    @Override
    public double area() {
        return Math.pow(a , 2 );
    }

    @Override
    public double circumference() {
        return a * 4;
    }

    @Override
    public String output() {
        return "Quadrat mit Seitenlänge " + getA()  + ": Fläche -> " + area() + ", Umfang -> " + circumference();
    }
}
