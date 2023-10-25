package ru.fsv67;

public class SocketImplementation implements SocketThreadListener {

    @Override
    public void pressBtnState(String message, String btnName) {
        System.out.printf("Clint logg: button pressed %s and message passed %s\n", btnName, message);
    }

}
