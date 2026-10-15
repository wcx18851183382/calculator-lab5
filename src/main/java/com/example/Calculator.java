package com.example;

public class Calculator {
    //加法
    public double add(double a, double b){
        return a + b;
    }
    //减法
    public double subtract(double a, double b){
        return a - b;
    }
    //乘法
    public double multiply(double a, double b){
        return a * b;
    }
    //除法，处理除零异常
    public double divide(double a, double b){
        if(b == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println("10 + 2 = " + cal.add(10,2));
        System.out.println("10 - 2 = " + cal.subtract(10,2));
        System.out.println("10 * 2 = " + cal.multiply(10,2));
        System.out.println("10 / 2 = " + cal.divide(10,2));
    }
}
