package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	    String inputImagePath = "D:/ae.jpg";
	    String outputImagePath = "D:/ae_fixed.jpg";

        ImageResizer imageResizer = new ImageResizer();

        try{
            int scaledWidth = 1024;
            int scaledHeight = 768;
            imageResizer.resize(inputImagePath,outputImagePath,scaledWidth,scaledHeight);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
