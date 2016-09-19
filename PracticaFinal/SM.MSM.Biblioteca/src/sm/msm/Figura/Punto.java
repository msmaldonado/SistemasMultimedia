/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.msm.Figura;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Point2D;


/**
 *
 * @author Miguel
 */
public class Punto extends Rectangulo {
    /**
     * Constructor del punto a partir de un punto
     * Generamos un rectangulo con punto inicial y final el mismo punto
     * @param punto nuestro punto
     */
    public Punto(Point2D punto){
        super(punto,punto);
        
    }
    /**
     * Metodo para dibujar el punto con sus atributos de dibujo
     * @param g2d Graphics para dibujar la figura
     */
    @Override
    public void dibujar(Graphics2D g2d){
        Stroke stroke = new BasicStroke(GrosorTrazo);//Ponemos el grosor del trazo
        g2d.setStroke(stroke);
        g2d.setColor(ColorTrazo);//Ponemos el color del trazo
        g2d.draw(this);//Lo dibujamos 
        g2d.setColor(Color.BLACK);
        g2d.fill(this);//Lo rellenamos
    }
    /**
     * Get un punto que será el propio punto
     * @param indice para identificar que punto queremos
     * @return punto
     */
    @Override
    public Point2D get1Punto(int indice) {                 
          return  this.getBounds().getLocation() ;    
    }
    /**
     * Metodo para actualizar el punto, llamamos a actualizar de rectangulo con el primer punto
     * @param PrimerPunto punto inicial
     * @param SegundoPunto punto final 
     */
     @Override
    public void actualizarFigura(Point2D PrimerPunto, Point2D SegundoPunto) {
        super.actualizarFigura(PrimerPunto, PrimerPunto);
        
    }
    /**
     * Metodo para detectar si un punto pertenece al punto.
     * En nuestro caso miramos si el punto esta cercano a nuestro PUNTO
     * @param punto punto que quiero ver si pertenece
     * @return booleano pertenencia del punto
     */
    @Override
    public boolean detectarFigura(Point2D punto) {
        //Vemos si las distancia entre los dos puntos es menor que 3
       return  punto.distance(this.get1Punto(0)) <= 3.0;
        
    }
    
}
