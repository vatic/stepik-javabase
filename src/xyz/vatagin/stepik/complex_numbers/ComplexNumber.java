package xyz.vatagin.stepik.complex_numbers;

import java.util.Objects;

public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        ComplexNumber that = (ComplexNumber) o;
//        return Double.compare(that.re, re) == 0 &&
//                Double.compare(that.im, im) == 0;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(re, im);
//    }

    //    @Override
//    public boolean equals(Object obj) {
//        if (obj == this) {
//            return true;
//        }
//        if (obj == null || obj.getClass()!=getClass()) {
//            return false;
//        }
//        ComplexNumber cm = (ComplexNumber) obj;
//        return (this.getRe() == cm.getRe() && this.getIm() == cm.getIm());
//    }
//
//    @Override
//    public int hashCode() {
//        return Double.hashCode(this.re + this.im);
//    }
}
