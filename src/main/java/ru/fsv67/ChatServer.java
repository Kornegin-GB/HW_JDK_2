package ru.fsv67;

public class ChatServer {
    private boolean serverStatus;

    private final ServerListaner listaner;

    private final ServerSocketThreadListener serverSocket;
    private final SocketThreadListener socket;

    public ChatServer(boolean serverStatus, ServerListaner listaner, ServerSocketThreadListener serverSocket,
            SocketThreadListener socket) {
        this.serverStatus = serverStatus;
        this.listaner = listaner;

        this.serverSocket = serverSocket;
        this.socket = socket;
    }

    public void startServer() {
        if (serverStatus) {
            listaner.onMessageResived("Server alredy started");
        } else {
            serverSocket.onStart();
            listaner.onMessageResived("Server started");
            serverStatus = true;
        }
    }

    public void stopServer() {
        if (serverStatus) {
            serverSocket.onStop();
            listaner.onMessageResived("Server stoped");
            serverStatus = false;
        } else {
            listaner.onMessageResived("Server off");
        }
    }

}

interface ServerListaner {
    void onMessageResived(String message);
}

interface ServerSocketThreadListener {
    void onStart();

    void onStop();
}

interface SocketThreadListener {
    void pressBtnState(String message, String btnName);
}
