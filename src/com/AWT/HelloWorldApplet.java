package com.AWT;

import java.applet.*;
import java.awt.*;

public class HelloWorldApplet extends Applet { // аплет
    public void paint (Graphics g) { // риует
        g.drawString ("Hello World", 25, 50); // текст
    } // но его необходимо запусть через  HelloWorld.html
}
