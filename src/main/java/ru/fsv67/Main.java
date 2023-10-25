package ru.fsv67;

/*
 * было описано окно сервера приложения, содержащее две кнопки (старт и стоп) и текстовое поле журнала. Необходимо вынести логику работы сервера
в класс ChatServer, а в обработчиках кнопок оставить только логику нажатия кнопки и
журналирования сообщений от сервера.
Для достижения цели необходимо описать интерфейс «слушатель сервера», с методом
«получить сообщение», вызывать его с одной стороны, и реализовать с другой.
 */

/*
 * Создать интерфейсы ServerSocketThreadListener и SocketThreadListener, содержащие методы, соответствующие событиям сервера и клиента чата.
 * Реализовать созданные интерфейсы простым логированием. Со стороны клиента – только SocketThreadListener,со стороны сервера – оба интерфейса. 
 */
public class Main {
    public static void main(String[] args) {

        ServerSocketThreadListener serverSocketThreadListener = new ServerSocketImplementation();

        SocketThreadListener socketThreadListener = new SocketImplementation();

        ServerListaner listaner = new ServerListenerImplemented();

        ChatServer server = new ChatServer(false, listaner, serverSocketThreadListener, socketThreadListener);

        new ServerWindows(server, socketThreadListener);

    }
}
