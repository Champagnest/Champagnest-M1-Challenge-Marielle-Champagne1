package com.company;




public class Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

    }
    public int add(int a, int b) {
        System.out.println("The answer to is 1+1= " + Integer.sum(1,1));
        return a + b;
    }

    public double add(double a, double b) {
        System.out.println("The answer to is 3.4+2.3= " + Double.sum(3.4, 2.3));
        return a + b;

    }

    public int subtract(int a, int b) {
        System.out.println("The answer to is 23 - 52 = " + Math.subtractExact(23, 52));
        return a - b;
    }

    public double subtract(double a, double b) {
        System.out.println("The answer to 5.5-0.5 = " + subtract(5.5, 0.5));
        return a - b;
    }

    public int multiply(int a, int b) {
        System.out.println("The answer to 34*2= " + multiply(34, 2));
        return a * b;
    }

    public double multiply(double a, double b) {
        System.out.println("The answer to 6.7*4.4= " + multiply(6.7, 4.4));
        return a * b;
    }

    public int divide(int a, int b) {
        System.out.println(" The answer to 12/3= " + divide(12,3));
        return a / b;
    }

    public int divide2(int a, int b) {
        System.out.println(" The answer to 12/7= " + divide2(12,7));
        return a / b;
    }

    public double divide(double a, double b) {
        System.out.println("The answer to 10.8/2.2= " + divide(10.8, 2.2));
        return a / b;
    }


}
