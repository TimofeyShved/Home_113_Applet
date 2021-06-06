package com.AWT;

import javax.swing.*;

public class Main extends JApplet { // так как это аплет, то мы его наследуем и инициализируем

    @Override
    public void init() { // это вместо начало запуска Main
        super.init(); // наследуемая инициализация
        add(new JButton(getParameter("buttonName"))); // создание конопок
        add(new JButton("sub"));
    }
}
