package com.example.testjavaimagewidthheight;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class RunTest {
    public static void main(String[] args) {
        File image = new File("D:\\etc\\WIN_Pro.jpg");
        BufferedImage bufferedImage = null;
        try {
            bufferedImage = ImageIO.read(image);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (bufferedImage == null)
            return;
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        System.out.println(width);
        System.out.println(height);
    }
}
