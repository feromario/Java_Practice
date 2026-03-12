package Basics;
import java.util.Scanner;
import java.io.*;

public class Numbers {
    public static void main(String[] args) {
        System.out.println("Dealing with numbers!");
    }
}

class MultFloat{
    public static void main(String[] args) {
        float a = 1.5f;
        float b = 2.0f;
        System.out.println("Multiply 1.5f and 2.0f: " + (a * b));
    }
}

class Swap{
    public static void main(String[] args) {
        int m = 3, n = 4;
        System.out.println("Before swap: m = " + m + ", n = " + n);

        int temp = m;
        m = n;
        n = temp;
        System.out.println("After swap: m = " + m + ", n = " + n);
    }
}

class AddBinary{
    static String addBinary(String a, String b) {
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);

        int sum = num1 + num2;
        return Integer.toBinaryString(sum);
    }

    public static void main(String[] args) {
        String a = "00001111";
        String b = "00000001";
        System.out.println("Result: " + addBinary(a, b));
    }
}

class AddComplex{
    int real, imaginary;

    public AddComplex(int r, int i) {
        this.real = r;
        this.imaginary = i;
    }

    public void printResult() {
        System.out.println(this.real + " +i" + this.imaginary);
    }

    public static AddComplex add(AddComplex a, AddComplex b) {
        AddComplex result = new AddComplex(0, 0);
        result.real = a.real + b.real;
        result.imaginary = a.imaginary + b.imaginary;
        return result;
    }

    public static void main(String[] args) {
        AddComplex a = new AddComplex(4, 5);
        AddComplex b = new AddComplex(10, 5);

        System.out.println("First Complex number: ");
        a.printResult();
        System.out.println("Second Complex number: ");
        b.printResult();

        AddComplex result = add(a, b);
        System.out.println("Result: ");
        result.printResult();
    }
}















































