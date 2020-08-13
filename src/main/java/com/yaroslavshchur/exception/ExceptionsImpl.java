package main.java.com.yaroslavshchur.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionsImpl {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static final int LOW_AGE = 0;
    private static final int TOP_AGE = 130;

    public void makeFirstException() {
        System.out.println("Write negative age count to check a new Exception, or some char");
        int age = 0;
        try {
            age = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("It's IOException");
        }
        if (age < LOW_AGE) {
            try {
                throw new ExceptionA("Age is incorrect");
            } catch (ExceptionA e) {
                e.printStackTrace();
            }
        }
    }

    public void makeSecondException() {
        System.out.println("Write wrong(130+) age count to check a new Exception, or some char");
        int age = 0;
        try {
            age = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("It's IOException");
        }
        if (age > TOP_AGE) {
            try {
                throw new ExceptionB("Make sure that age is correct");
            } catch (ExceptionB e) {
                e.printStackTrace();
            }
        }
    }

    public void makeThirdException() {
        System.out.println("Press any key to throw NullPointerException");
        try {
            reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(((Object)null).toString());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}