import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

public class Blur {
    public static void main(String[] args) throws IOException {
        BufferedImage image = ImageIO.read(new File("image.jpg"));
        WritableRaster raster = image.getRaster();

        int width = raster.getWidth();
        int height = raster.getHeight();

        BufferedImage resultImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        WritableRaster resultRaster = resultImage.getRaster();

        final int COLORS_COUNT_IN_RGB = 3;
        final int MIN_RGB = 0;
        final int MAX_RGB = 255;

        double[] pixel = new double[COLORS_COUNT_IN_RGB];

        double[][] matrix = {{1.0 / 25, 1.0 / 25, 1.0 / 25, 1.0 / 25, 1.0 / 25}, {1.0 / 25, 1.0 / 25, 1.0 / 25, 1.0 / 25, 1.0 / 25},
                {1.0 / 25, 1.0 / 25, 1.0 / 25, 1.0 / 25, 1.0 / 25}, {1.0 / 25, 1.0 / 25, 1.0 / 25, 1.0 / 25, 1.0 / 25},
                {1.0 / 25, 1.0 / 25, 1.0 / 25, 1.0 / 25, 1.0 / 25}};

        int indent = matrix.length / 2;

        for (int y =indent; y < height - indent; ++y) {
            for (int x = indent; x < width - indent; ++x) {
                double resultColorRed = 0;
                double resultColorGreen = 0;
                double resultColorBlue = 0;

                for (int i = 0; i < matrix.length; ++i) {
                    for (int j = 0; j < matrix.length; ++j) {
                        raster.getPixel((x - indent) + i, (y - indent) + j, pixel);

                        resultColorRed += pixel[0] * matrix[i][j];
                        resultColorGreen += pixel[1] * matrix[i][j];
                        resultColorBlue += pixel[2] * matrix[i][j];
                    }
                }

                pixel[0] = resultColorRed;
                pixel[1] = resultColorGreen;
                pixel[2] = resultColorBlue;

                for (int i = 0; i < pixel.length; ++i) {
                    if (pixel[i] < MIN_RGB) {
                        pixel[i] = MIN_RGB;
                    } else if (pixel[i] > MAX_RGB) {
                        pixel[i] = MAX_RGB;
                    }
                }

                resultRaster.setPixel(x, y, pixel);
            }
        }

        ImageIO.write(resultImage, "png", new File("blurryImage.png"));
    }
}