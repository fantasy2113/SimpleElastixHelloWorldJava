package de.jos;

import org.itk.simple.*;

public class HelloWorld {

    public static void main(String[] args) {
        var fixed = SimpleITK.readImage("HE_PHH3/Bio5_HE.png", PixelIDValueEnum.sitkUInt8);
        var moving = SimpleITK.readImage("HE_PHH3/Bio5_PHH3.png", PixelIDValueEnum.sitkUInt8);
        var resultImage = SimpleITK.elastix(fixed, moving, "translation");
        SimpleITK.writeImage(SimpleITK.cast(resultImage, PixelIDValueEnum.sitkUInt8), "resultImage.png");
    }
}
