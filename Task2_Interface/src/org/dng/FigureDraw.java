package org.dng;

import java.awt.*;
import java.awt.image.BufferedImage;


public class FigureDraw {
//    public static void main(String[] args) {
//
//    }
    public static void draw(String s) {
        int width = 170;
        int height = 40;

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setFont(new Font("SansSerif", Font.PLAIN, 24) );
//        g.setFont(new Font("TimesRoman", Font.BOLD, 24) );
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        //char c = (char)9829;//heart
        //char c = (char)9650;//triangle
        //char c = (char)9660;//triangle
        //char c = (char)9674;//ромб
        //char c = (char)9675;//circle
        //char c = (char)186;//circle
        //char c = (char)9632;//square
        //char c = (char)9643;//square

        //String s = String.valueOf(c);

        graphics.drawString(s, 10, 20);


        for (int y = 0; y < height; y++) {
            StringBuilder sb = new StringBuilder();
            for (int x = 0; x < width; x++) {
                sb.append(image.getRGB(x, y) == -16777216 ? " " : "$");//если цвет фона - то пробел, иначе зачек $
            }
            if (sb.toString().trim().isEmpty()) {
                continue;
            }
            System.out.println(sb);
        }
        System.out.println();

    }
}
