package ru.fsv67;

public class ServerListenerImplemented implements ServerListaner {

    @Override
    public void onMessageResived(String message) {
        System.out.println("Message: " + message);
    }

}