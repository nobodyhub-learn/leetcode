package com.nobodyhub.leetcode;

/**
 * @author Ryan
 * @since 10/12/2017
 */
public class ComplexNumberMultiplication {
    class Complex {
        int real;
        int imaginary;

        Complex(String str) {
            String[] parts = str.split("\\+");
            this.real = Integer.parseInt(parts[0]);
            this.imaginary = Integer.parseInt(parts[1].substring(0, parts[1].length() - 1));
        }

        Complex(int real, int imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        @Override
        public String toString() {
            return real + "+" + imaginary + "i";
        }

        Complex multiply(Complex that) {
            int real = this.real * that.real;
            int imaginary = this.real * that.imaginary + this.imaginary * that.real;
            int reminder = this.imaginary * that.imaginary * -1;
            return new Complex(real + reminder, imaginary);
        }
    }

    public String complexNumberMultiply(String a, String b) {
        Complex aCom = new Complex(a);
        Complex bCom = new Complex(b);
        return aCom.multiply(bCom).toString();
    }
}
