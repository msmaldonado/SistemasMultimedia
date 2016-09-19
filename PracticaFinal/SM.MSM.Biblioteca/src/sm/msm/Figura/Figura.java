/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.msm.Figura;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;

/**
 *
 * @author Miguel
 * @version Septiembre 2016
 */

public interface Figura {
    
    /**
     * Getter del tipo de relleno de la figura
     * @return tipo de relleno
     */
    public int getTipoRelleno() ;
    /**
     * Setter del tipo de relleno de la figura
     * @param TipoRelleno nuevo valor para relleno
     */
    public void setTipoRelleno(int TipoRelleno) ;
    /**
     * Getter del color de Relleno de la figura
     * @return el color de relleno
     */
    public Color getColorRelleno() ;
    /**
     * Setter del color de Relleno de la figura
     * @param ColorRelleno nuevo color de relleno
     */
    public void setColorRelleno(Color ColorRelleno) ;
    /**
     * Getter del color de Gradiente de la figura
     * @return color del gradiente
     */
    public Color getColorGradiente() ;
    /**
     * Setter del color de Gradiente de la figura
     * @param ColorGradiente nuevo valor del gradiente
     */
    public void setColorGradiente(Color ColorGradiente) ;
    /**
     * Getter de la continuidad del trazo
     * @return booleano con la continuidad del trazo
     */
    public boolean getContinua() ;
    /**
     * Setter de la continuidad del trazo de la figura
     * @param continua nuevo valor de la continuidad del trazo
     */
    public void setContinua(boolean continua) ;
    /**
     * Getter del grosor del trazo de la figura
     * @return grosor del trazo
     */
    public float getGrosorTrazo() ;
    /**
     * Setter del grosor del trazo de la figura
     * @param GrosorTrazo neuvo valor del grosor del trazo
     */
    public void setGrosorTrazo(float GrosorTrazo) ;
    /**
     * Getter del Color del trazo de la figura
     * @return color del trazo
     */
    public Color getColorTrazo() ;
    /**
     * Setter del color del trazo de la figura
     * @param ColorTrazo nuevo color del trazo
     */
    public void setColorTrazo(Color ColorTrazo) ;
    /**
     * Getter de si esta activo el alisado en la figura
     * @return booleano del alisado
     */
    public boolean getAlisado() ;
    /**
     * Setter del alisado de la figura
     * @param alisado nuevo valor del alisado
     */
    public void setAlisado(boolean alisado) ;
    /**
     * Getter del grado de transparencia de la figura
     * @return grado de transparencia
     */
    public float getGradoTransparencia() ;
    /**
     * Setter del grado de transparencia de la figura
     * @param gradoTransparencia nuevo valor de la transparencia
     */
    public void setGradoTransparencia(float gradoTransparencia) ;
    
   /**
    * metodo para dibujar la figura.
    * Se tendrá en cuenta todos los atributos que forman la figura como grosor, color, continuidad....
    * @param g2d el graphics2d que pintamos
    */
    public void dibujar(Graphics2D g2d);
    /**
     * metodo para mover la figura hasta un punto
     * @param punto valor donde desplazamos la figura
     */
    public void moverFiguras(Point2D punto);
    /**
     * Metodo para detectar si un punto pertenece a la figura
     * @param punto coordenadas que queremos ver si pertenecen a la figura
     * @return booleano si pertenece o no
     */
    public boolean detectarFigura(Point2D punto);
    /**
     * Metodo para actualizar la figura a partir del punto inicial y final
     * @param PrimerPunto punto inicial
     * @param SegundoPunto punto final
     */
    public void actualizarFigura(Point2D PrimerPunto, Point2D SegundoPunto);
    /**
     * Metodo para obtener un punto de la figura que esté en la posición del indice
     * @param indice para seleccionar que punto queremos de la figura
     * @return punto correspondiente a ese indice
     */
    public Point2D get1Punto(int indice);
    /**
     * Metodo para cambiar el valor de un punto de la figura que esté en la posición del indice
     * @param indice indicar que punto queremos cambiar
     * @param punto nuevo valor del punto de la figura
     */
    public void set1Punto(int indice, Point2D punto);
    /**
     * Getter para obtener cuantos puntos de control tiene la figura
     * @return numero de puntos de puntos de control
     */
    public int getPuntosControl();
    /**
     * Getter para obtener todos los puntos de la figura
     * @return vector con todos los puntos
     */
    public ArrayList<Point2D> getVectorPuntos();
    /**
     * Setter del vector de puntos de la figura
     * @param v_Puntos nuevo vector de puntos de la figura
     */
    public void setVectorPuntos(ArrayList<Point2D> v_Puntos);
    /**
     * Metodo para crear un gradiente de la figura a partir de los dos puntos
     * @param punto1 punto inicial
     * @param punto2 punto final
     */
    public void crearGradiente(Point2D punto1, Point2D punto2);
    /**
     * Actualizar el gradiente de la figura a partir de dos puntos
     * @param punto1 punto inicial
     * @param punto2 punto final
     */
    public void actualizarGradiente(Point2D punto1, Point2D punto2);
    /**
     * Getter del gradiente de la figura
     * @return el gradiente de la figura
     */
    public GradientPaint getGradiente();
    /**
     * Setter del tipo de Gradiente de la figura
     * @param tipoGradiente nuevo valor del gradiente
     */
    public void setTipoGradiente(int tipoGradiente);
    /**
     * Metodo para crear un gradiente en la figura con los valores actuales
     * 
     */
    public void actualizarGradiente();
    /**
     * Setter del gradiente de la figura
     * @param miGradiente nuevo valor del gradiente
     */
    
    public void setGradiente(GradientPaint miGradiente) ;
    /**
     * Metodo para dibujar un rectangulo sobre la figura cuando la seleccionamos
     * Pintará un rectangulo de grosor 1, discontinuo, rojo y sin relleno
     * @param g2d el graphics para pintar la figura
     */
    public void dibujarRectanguloFrame(Graphics2D g2d);
    /**
     * Getter para obtener la coordenada x del punto sobre el que se obtiene la figura
     * @return coordenada x
     */
    public double getX();
    /**
     * Getter para obtener la coordenada y del punto sobre el que se obtiene la figura
     * @return coordenada y
     */
    public double getY();
    
     

}
