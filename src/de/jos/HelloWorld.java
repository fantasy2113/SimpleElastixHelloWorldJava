package de.jos;

import org.itk.simple.*;

public class HelloWorld {

    public static void main(String[] args) {
        var resultImage = SimpleITK.elastix(
                SimpleITK.readImage("sae/he_phh3/Bio5_HE.png", PixelIDValueEnum.sitkInt8),
                SimpleITK.readImage("sae/he_phh3/Bio5_PHH3.png", PixelIDValueEnum.sitkInt8),
                "translation"
        );

        SimpleITK.show(resultImage, "Hello World: Python", true);
    }
}
