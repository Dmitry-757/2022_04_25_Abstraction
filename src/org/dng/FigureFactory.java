package org.dng;

public class FigureFactory {

    public static GeomFigure createFigure(FigureTypes ftype, double... args) {

        GeomFigure result = null;
        try {
            result = switch (ftype) {
                case TRIANGLE -> {
                    if (args.length == 3)
                        yield new Triangle(args[0], args[1], args[2]);
                    else
                        throw new Exception("Wrong arguments! Triangle must be defined by three sides!");
                }
                case PARALLELOGRAM -> {
                    if (args.length == 3)
                        yield new Parallelogram(args[0], args[1], (int) args[2]);
                    else
                        throw new Exception("Wrong arguments! Parallelogram must be defined by two sides and angle between it!");
                }
                case CIRCLE -> {
                    if (args.length == 1)
                        yield new Circle(args[0]);
                    else
                        throw new Exception("Wrong arguments! Circle must be defined by one parametr - radius!");
                }

                //default -> throw new Exception("Sorry, in our store is only circle, parallelogram and oarallelipiped.");
            };
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
}
