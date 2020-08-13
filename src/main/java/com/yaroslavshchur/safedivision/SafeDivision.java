package main.java.com.yaroslavshchur.safedivision;

import java.util.Scanner;

public class SafeDivision {
    Scanner scanner = new Scanner(System.in);
    int a = 0;
    int b = 0;

    public void calculateMethod() {
        inputNumberA();
        inputNumberB();
    }

    public void inputNumberB() {
        System.out.println("Please write some integer");
        b = scanner.nextInt();
        double result = 0;
        try {
            result = (double) a / b;
        } catch (ArithmeticException e) {
            System.out.println("Please, try to input some number, that not equal to zero");
            inputNumberB();
        }
        System.out.println(result);
        System.out.println("-----------");
    }

    public void inputNumberA() {
        System.out.println("Please write some integer");
        a = scanner.nextInt();
    }
}
