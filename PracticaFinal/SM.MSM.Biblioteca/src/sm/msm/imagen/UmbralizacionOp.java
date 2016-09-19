/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.msm.imagen;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import sm.image.BufferedImageOpAdapter;
import sm.image.BufferedImagePixelIterator;

/**
 *
 * @author Miguel
 */
public class UmbralizacionOp extends BufferedImageOpAdapter {
    
    private int umbral ;
    
    public UmbralizacionOp(int umbral){
        this.umbral = umbral;
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
        WritableRaster srcRaster = src.getRaster();
        WritableRaster destRaster = dest.getRaster();
        BufferedImagePixelIterator.PixelData pixel;
        
        for(BufferedImagePixelIterator it=new BufferedImagePixelIterator(src); it.hasNext();) {
            pixel = it.next();
            double xmedia;
            xmedia = (pixel.sample[0]+pixel.sample[1]+pixel.sample[2])/3;
            
            if (xmedia < umbral){
                for ( int i = 0; i<=2; i++){
                    pixel.sample[i] = 0;
                }
             }
            else{
                for ( int i = 0; i<=2; i++){
                    pixel.sample[i] = 255;
                }
                
            }
            destRaster.setPixel(pixel.col, pixel.row, pixel.sample);
        
        }
        return dest;
     }

    
}
