package main.java.com.yaroslavshchur.executor;

import main.java.com.yaroslavshchur.exception.ExceptionsImpl;
import main.java.com.yaroslavshchur.nullpointer.NullPointerImpl;
import main.java.com.yaroslavshchur.safedivision.SafeDivision;

public class Executor {
    ExceptionsImpl exceptionsImpl = new ExceptionsImpl();
    SafeDivision safeDivision = new SafeDivision();
    NullPointerImpl nullPointerImpl = new NullPointerImpl();

    public void run() {
        exceptionsImpl.makeFirstException();
        exceptionsImpl.makeSecondException();
        exceptionsImpl.makeThirdException();
        safeDivision.calculateMethod();
        nullPointerImpl.trowNewException();
    }
}
