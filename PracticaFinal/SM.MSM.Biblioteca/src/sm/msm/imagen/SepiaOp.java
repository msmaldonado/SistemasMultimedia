/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.msm.imagen;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import static java.lang.Math.min;
import java.util.ArrayList;
import sm.image.BufferedImageOpAdapter;
import sm.image.BufferedImagePixelIterator;

/**
 *
 * @author Miguel
 */
public class SepiaOp extends BufferedImageOpAdapter{
    
    public SepiaOp () {
    }
    /**
     * Metodo para realizar el filtro
     * @param src imagen de entrada
     * @param dest imagen de salida
     * @return imagen
     */
    @Override
    public BufferedImage filter(BufferedImage src, BufferedImage dest){
    if (src == null) {
        throw new NullPointerException("src image is null");
    }
    if (dest == null) {
        dest = createCompatibleDestImage(src, null);
    }
    WritableRaster destRaster = dest.getRaster();
    BufferedImagePixelIterator.PixelData pixel;
    for(BufferedImagePixelIterator it=new BufferedImagePixelIterator(src); it.hasNext();) {
       pixel = it.next();
       int SepiaR = min(255 ,(int) (0.393*pixel.sample[0] + 0.769*pixel.sample[1] + 0.189*pixel.sample[2]));
       int SepiaG = min(255 ,(int) (0.349*pixel.sample[0] + 0.686*pixel.sample[1] + 0.168*pixel.sample[2]));
       int SepiaB = min(255 ,(int) (0.272*pixel.sample[0] + 0.534*pixel.sample[1] + 0.131*pixel.sample[2]));
       pixel.sample[0] = SepiaR;
       pixel.sample[1] = SepiaG;
       pixel.sample[2] = SepiaB;
       
       destRaster.setPixel(pixel.col, pixel.row, pixel.sample);
    }
    return dest;
    }
}
    

