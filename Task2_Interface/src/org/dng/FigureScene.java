package org.dng;

import java.util.ArrayList;
import java.util.List;

public class FigureScene {
    private List<GeomFigure> figureList = new ArrayList<>();

    //constructors: empty, with one figure, with list of figures
    FigureScene(){
    }
    FigureScene(GeomFigure figure) {
        try {
            figureList.add(figure);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    FigureScene(List<GeomFigure> figureList) {
        try {
            this.figureList.addAll(figureList);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void addFigure(GeomFigure figure){
        try {
            figureList.add(figure);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void printAllFigures(){
        for(GeomFigure f:figureList){
            if(f instanceof IPrintable)
                ((IPrintable)f).print();
            else
                System.out.println(f.toString()+" has not implementation of printing interface!");
        }
    }

    public void drawAllFigures(){
        for(GeomFigure f:figureList){
            if(f instanceof IDrawable){
                System.out.println();
                System.out.println("Ladies and gentlemen, on stage there is: "+ ((IPrintable)f).toStringShort() );
                ((IDrawable)f).draw();
                System.out.println();
                System.out.println("***********************************************************************************");
                System.out.println();
            }
            else {
                System.out.println();
//                System.out.println("***************************************************************************************");
                System.out.println();
                FigureDraw.draw("u p s,  s o r r y");
                System.out.println();
                System.out.println(f.toString() + " has not implementation of draw interface!");
            }
        }
    }

}
