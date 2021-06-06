package com.AWT;

import java.applet.*;
import java.awt.*;
import java.net.*;

public class ImageDemo extends Applet {
    private Image image;
    private AppletContext context;

    public void init() { // инициализация
        context = this.getAppletContext();
        String imageURL = this.getParameter("image");
        if(imageURL == null) {
            imageURL = "java.jpg";
        }
        try {
            URL url = new URL(this.getDocumentBase(), imageURL);
            image = context.getImage(url); // получения его адресса
        } catch (MalformedURLException e) {
            e.printStackTrace();
            // статус картинки, если не смогли найти
            context.showStatus("Could not load image!");
        }
    }

    public void paint(Graphics g) {
        context.showStatus("Displaying image");
        g.drawImage(image, 0, 0, 200, 84, null); // отрисовка
        g.drawString("www.javalicense.com", 35, 100);
    }
}
