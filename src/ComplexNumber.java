public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        setReal(real);
        setImaginary(imaginary);
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setReal(double real) {
        if (Double.isNaN(real)) {
            this.real = 0;
        } else {
            this.real = real;
        }
    }

    public void setImaginary(double imaginary) {
        if (Double.isNaN(imaginary)) {
            this.imaginary = 0;
        } else {
            this.imaginary = imaginary;
        }
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(getReal() + other.getReal(), getImaginary() + other.getImaginary());
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double real = getReal() * other.getReal() - getImaginary() * other.getImaginary();
        double imaginary = getReal() * other.getImaginary() + getImaginary() * other.getReal();
        return new ComplexNumber(real, imaginary);
    }

    @Override
    public String toString() {
        return getReal() + " + " + getImaginary() + "i";
    }
}
