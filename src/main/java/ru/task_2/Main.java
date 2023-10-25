package ru.task_2;

import java.util.Arrays;
import java.util.List;

/*
 * Домашнее задание
 * Developer dev = new FrontendDeveloper();
 * if (dev instanceof Frontender) {
 *      ((Frontender) dev).developGUI();
 */
public class Main {
    public static void main(String[] args) {
        FullSteck dev = new DeveloperFull();
        BackEnder devBack = new DeveloperBack();
        FrontEnder devFront = new DeveloperFront();
//        dev.createServer();
//        dev.createFront();
//        devBack.createServer();

        List<Object> devList = Arrays.asList(dev, devBack, devFront);

        for (Object item : devList) {
            if (item instanceof FrontEnder) {
                ((FrontEnder) item).createFront();
            }
            if (item instanceof BackEnder) {
                ((BackEnder) item).createServer();
            }
        }

    }
}

interface BackEnder {
    void createServer();
}

interface FrontEnder {
    void createFront();
}

interface FullSteck extends BackEnder, FrontEnder {

}

class DeveloperFull implements FullSteck {

    @Override
    public void createServer() {
        System.out.println("Сделал сервер");
    }

    @Override
    public void createFront() {
        System.out.println("Сделал главную страницу сайта");
    }
}

class DeveloperBack implements BackEnder {

    @Override
    public void createServer() {
        System.out.println("Уранил сервер");
    }
}

class DeveloperFront implements FrontEnder {

    @Override
    public void createFront() {
        System.out.println("Сломал главную страницу сайта");
    }

}
