package OOPDZ5_CALC.Model;

public class Complex {
    private double re;
    private double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public void setRe(double value){
        this.re = value;
    }

    public void setIm(double value){
        this.im = value;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public String toString() {

        if (im == 0 )
            return re + "";
        if (re == 0)
            return im + "i";
        if (im < 0)
            return re + " - " + (-im) + "i";
        return re + " + " + im + "i";
    }

}
