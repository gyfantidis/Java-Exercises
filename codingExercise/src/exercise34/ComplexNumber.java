package exercise34;

public class ComplexNumber {
    private double real;
    private double imaginary;


    public void add(double real, double imaginary) {
        this.real = real + getReal();
        this.imaginary = imaginary + getImaginary();

    }

    public void add(ComplexNumber complexNumber) {
        this.real = complexNumber.getReal() + getReal();
        this.imaginary = complexNumber.getImaginary() + getImaginary();

    }

    public void subtract(double real, double imaginary) {
        this.real = getReal() - real;
        this.imaginary = getImaginary() - imaginary;

    }

    public void subtract(ComplexNumber complexNumber) {
        this.real = getReal() - complexNumber.getReal();
        this.imaginary = getImaginary() - complexNumber.getImaginary();

    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
}



