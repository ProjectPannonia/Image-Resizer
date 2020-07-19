package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageResizer {
    public static void resize(String inputImagePath, String outputImagePath,int scaleWidth, int scaleHeight) throws IOException {
        File inputFile = new File(inputImagePath);
        BufferedImage inputImage = ImageIO.read(inputFile);
        BufferedImage outputImage = new BufferedImage(scaleWidth,scaleHeight,inputImage.getType());
        Graphics2D g2d = outputImage.createGraphics();
        g2d.drawImage(inputImage,0,0,scaleWidth,scaleHeight,null);
        g2d.dispose();
        String formatName = outputImagePath.substring(outputImagePath.lastIndexOf(".") + 1);
        ImageIO.write(outputImage,formatName,new File(outputImagePath));
    }
    public static void resize(String inputImagePath, String outputImagePath,double percent) throws IOException{
        File inputFile = new File(inputImagePath);
        BufferedImage inputImage = ImageIO.read(inputFile);
        int scaledWith = (int) (inputImage.getWidth() * percent);
        int scaledHeight = (int) (inputImage.getHeight() * percent);
        resize(inputImagePath,outputImagePath,scaledWith,scaledHeight);
    }
}
