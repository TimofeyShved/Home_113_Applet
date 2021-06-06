package com.AWT;

import javax.swing.*;
import java.applet.*;
import java.awt.*;

public class CheckerApplet extends JApplet {
    int squareSize = 50;   // размер

    @Override
    public void init () { // инициализируем и поиск ключевых моментов в HTML
        String squareSizeParam = getParameter ("squareSize");
        parseSquareSize (squareSizeParam);

        String colorParam = getParameter ("color");
        Color fg = parseColor (colorParam);

        setBackground (Color.black);
        setForeground (fg);
    }

    private void parseSquareSize (String param) { // получение и запись значения в параметры
        if (param == null) return;
        try {
            squareSize = Integer.parseInt (param);
        } catch (Exception e) {
            // Let default value remain
        }
    }
    private Color parseColor (String param) {
        if (param == null) {return Color.white;}
        try {
            return Color.BLUE;
        } catch (Exception e) {
            // Let default value remain
        }
        return null;
    }
    public void paint (Graphics g) {
        String Ssize="squareSize: "+squareSize;
        g.drawString (Ssize, 25, 50);
    }
}
