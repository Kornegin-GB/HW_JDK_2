package ru.fsv67;

public class ServerSocketImplementation implements ServerSocketThreadListener {

    @Override
    public void onStart() {
        System.out.println("Logg: server started");
    }

    @Override
    public void onStop() {
        System.out.println("Logg: server stopped");
    }

}
