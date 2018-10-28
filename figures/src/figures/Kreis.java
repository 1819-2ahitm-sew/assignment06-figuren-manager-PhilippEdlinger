package figures;

import main.main;

public class Kreis extends main {
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Kreis (double r){
        setR(r);
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(r,2);
    }

    @Override
    public double circumference() {
        return Math.PI * r * 2;
    }

    @Override
    public String output() {
        return "Kreis mit Radius " + getR() + " Fläche -> " + area() + ", Umfang -> " + circumference() ;
    }
}
