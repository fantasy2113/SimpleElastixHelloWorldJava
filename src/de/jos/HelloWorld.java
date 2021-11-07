package de.jos;

import org.itk.simple.*;

public class HelloWorld {

    public static void main(String[] args) {
        var resultImage = SimpleITK.elastix(SimpleITK.readImage("fixedImage.png"), SimpleITK.readImage("movingImage.png"), "translation");

        SimpleITK.show(resultImage, "Hello World: Python", true);
    }
}
