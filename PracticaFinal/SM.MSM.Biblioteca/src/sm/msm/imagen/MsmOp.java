/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.msm.imagen;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import static java.lang.Math.max;
import static java.lang.Math.min;
import sm.image.BufferedImageOpAdapter;
import sm.image.BufferedImagePixelIterator;

/**
 *
 * @author Miguel
 */
public class MsmOp extends BufferedImageOpAdapter{
    
    public MsmOp () {
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
    int ContadorAux = -1; 
    WritableRaster destRaster = dest.getRaster();
    BufferedImagePixelIterator.PixelData pixel;
    for(BufferedImagePixelIterator it=new BufferedImagePixelIterator(src); it.hasNext();) {
       pixel = it.next();
       ContadorAux ++ ;
       // Con Contador controlo una perioricidad 3 pixeles para el filtro
       if (ContadorAux / 3 == 0){  //Pixel rojo menores que 127 los pongo a 0         
            pixel.sample[0] = max(0,pixel.sample[0]-127);
            
       }else if (ContadorAux /3 == 1){ // pixel verde mayores que 127 los pongo a 255
          
           pixel.sample[1] = min(255,pixel.sample[1]+127);       
                     
       }else{ // Hago la media de los pixeles de los colores 
           int media = (pixel.sample[0]+pixel.sample[1] + pixel.sample[2]) /3;
            pixel.sample[0] = media;
            pixel.sample[1] = media;
            pixel.sample[2] = media;
           
       }
        
       destRaster.setPixel(pixel.col, pixel.row, pixel.sample);
    }
    return dest;
    }
}