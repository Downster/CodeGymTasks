package com.codegym.task.task16.task1631;

import com.codegym.task.task16.task1631.common.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes type) {
        if (type == ImageTypes.JPG) {
            return new JpgReader();
        } else if (type == ImageTypes.BMP) {
            return new BmpReader();
        } else if (type == ImageTypes.PNG) {
            return new PngReader();
        } else {
            System.out.println("Unknown image type");
            throw new IllegalArgumentException();
        }
    }
}


