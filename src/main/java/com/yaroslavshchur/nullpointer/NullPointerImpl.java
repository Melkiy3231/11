package main.java.com.yaroslavshchur.nullpointer;

public class NullPointerImpl {

    public void trowNewException() {
        try {
            createException();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public void createException() {
        throw new NullPointerException();
    }
}
