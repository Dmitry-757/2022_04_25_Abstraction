package org.dng;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        try {
            Triangle triangle = new Triangle(3,3,3);
            Rectangle rectangle = new Rectangle(2,4);
            Circle circle = new Circle(1);

            List<GeomFigure> fl = new ArrayList<>();
            fl.add(triangle);
            fl.add(rectangle);
            fl.add(circle);

            FigureScene fg = new FigureScene(fl);

            System.out.println();
            System.out.println("*************************************************************************************");
            System.out.println();
            System.out.println("lets print all figures...");
            System.out.println();
            fg.printAllFigures();
            System.out.println();
            System.out.println();

            System.out.println("*************************************************************************************");
            System.out.println();
            System.out.println("lets draw all figures...");
            fg.drawAllFigures();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
