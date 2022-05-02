package org.dng;

public enum FigureType {
    TRIANGLE(9727), RECTANGLE(9632), CIRCLE(9675);

    private int asciiCode;
    FigureType(int asciiCode) {
        this.asciiCode = asciiCode;
    }

    //return one char for Draw-method ))
    public String getStr(){
        //char c = (char)9829;//heart
        //char c = (char)9650;//triangle
        //char c = (char)9660;//triangle
        //char c = (char)9674;//ромб
        //char c = (char)9675;//circle
        //char c = (char)186;//circle
        //char c = (char)9632;//square
        //char c = (char)9643;//square
        //String s = String.valueOf(c);

        return String.valueOf((char)asciiCode);
    }

}
