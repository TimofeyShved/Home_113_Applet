package com.AWT;

import javax.swing.*;

public class Main extends JApplet {

    @Override
    public void init() {
        super.init();
        add(new JButton(getParameter("buttonName")));
        add(new JButton("sub"));
    }
}
