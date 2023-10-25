package ru.fsv67;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ServerWindows extends JFrame {
    private final ChatServer chatServer;
    private final SocketThreadListener threadListener;

    private static final int WINDOW_HEIGHT = 400;
    private static final int WINDOW_WIDTH = 400;
    private static final int WINDOW_POSX = 700;
    private static final int WINDOW_POSY = 200;

    ServerWindows(ChatServer chatServer, SocketThreadListener threadListene) {
        this.chatServer = chatServer;
        this.threadListener = threadListene;
        JButton btnStart = new JButton("Start");
        JButton btnStop = new JButton("Stop");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Server");
        setResizable(false);
        JPanel panBotton = new JPanel(new GridLayout(1, 1));
        panBotton.add(btnStart);
        panBotton.add(btnStop);
        add(panBotton, BorderLayout.CENTER);
        setVisible(true);
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                threadListener.pressBtnState("Нажата кнопка старт", btnStart.getText());
                chatServer.startServer();
            }
        });

        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                threadListener.pressBtnState("Нажата кнопка стоп", btnStop.getText());
                chatServer.stopServer();
            }
        });
    }

}
