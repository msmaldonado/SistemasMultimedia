/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.msm.Figura;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class LineaRecta extends Line2D.Double implements Figura {
    
        
     /* Atributos para Relleno
    Tipo de relleno
    Color de relleno
    Color de gradiente
    Tipo de Gradiente 
    Gradiente
    */
    protected int TipoRelleno;    
    protected Color ColorRelleno;
    protected Color ColorGradiente;
    private GradientPaint gradiente;
    protected int TipoGradiente;
    
     /*Atributos para el trazo
    Tipo de trazo
    Grosor
    Color    
    */
    protected boolean continua;
    protected float GrosorTrazo;
    protected Color ColorTrazo;
    /*Atributos Para alisar los bordes
    boleano para saber si está activo
    */
    protected boolean alisado;
    /*Atributos para la transparencia
    Grado de transparencia
    */
    protected float gradoTransparencia;
    
    /*Atributos para seleccionar
    Rectangulo para dibujar el frame de seleccion*/
    private Rectangulo frame;
    
    private final int PuntosControl = 0;
    
    /**
     * Constructor de la linea a partir de dos puntos
     * llamamos al constructor de line2D y le pasamos las coordenadas
     * @param punto1 punto inicial
     * @param punto2 punto final
     */
    public LineaRecta(Point2D punto1, Point2D punto2) {
        super(punto1.getX(), punto1.getY(), punto2.getX(), punto2.getY());
    }
    /**
     * Getter del tipo de relleno
     * @return el tipo de relleno
     */
    @Override
    public int getTipoRelleno() {
        return TipoRelleno;
    }
    /**
     * Setter del tipo de relleno 
     * @param TipoRelleno nuevo valor del tipo de relleno 
     */
    @Override
    public void setTipoRelleno(int TipoRelleno) {
        this.TipoRelleno = TipoRelleno;
    }
    /**
     * Getter del color de relleno
     * @return color de relleno
     */
    @Override
    public Color getColorRelleno() {
        return ColorRelleno;
    }
    /**
     * Setter del color de relleno
     * @param ColorRelleno nuevo color de relleno
     */
    @Override
    public void setColorRelleno(Color ColorRelleno) {
        this.ColorRelleno = ColorRelleno;
    }
    /**
     * Getter del color del gradiente
     * @return color del gradiente
     */
    @Override
    public Color getColorGradiente() {
        return ColorGradiente;
    }
    /**
     * Setter del Color del gradiente
     * @param ColorGradiente nuevo valor del color del gradiente
     */
    @Override
    public void setColorGradiente(Color ColorGradiente) {
        this.ColorGradiente = ColorGradiente;
    }
    /**
     * Getter de la continuidad del trazo
     * @return booleano si el trazo es continuo
     */
    @Override
    public boolean getContinua() {
        return continua;
    }
    /**
     * Setter de la continuidad del trazo
     * @param continua nuevo valor de la continuidad del trazo
     */
    @Override
    public void setContinua(boolean continua) {
        this.continua = continua;
    }
    /**
     * Getter del grosor del trazo
     * @return grosor del trazo
     */
    @Override
    public float getGrosorTrazo() {
        return GrosorTrazo;
    }
    /**
     * Setter del grosor del trazo
     * @param GrosorTrazo nuevo valor del grosor del trazo
     */
    @Override
    public void setGrosorTrazo(float GrosorTrazo) {
        this.GrosorTrazo = GrosorTrazo;
    }
    /**
     * Getter del color del trazo
     * @return color del trazo
     */
    @Override
    public Color getColorTrazo() {
        return ColorTrazo;
    }
    /**
     * Getter del tipo de gradiente
     * @return tipo de gradiente
     */
    public int getTipoGradiente() {
        return TipoGradiente;
    }
    /**
     * Setter del tipo de Gradiente
     * @param TipoGradiente nuevo valor del gradiente
     */
    @Override
    public void setTipoGradiente(int TipoGradiente) {
        this.TipoGradiente = TipoGradiente;
    }
    /**
     * Setter del color del trazo
     * @param ColorTrazo nuevo valor del color del trazo
     */
    @Override
    public void setColorTrazo(Color ColorTrazo) {
        this.ColorTrazo = ColorTrazo;
    }
    /**
     * Getter del alisado de la linea
     * @return booleano si está alisado
     */
    @Override
    public boolean getAlisado() {
        return alisado;
    }
    /**
     * Setter del alisado de la linea
     * @param alisado nuevo valor del alisado
     */
    @Override
    public void setAlisado(boolean alisado) {
        this.alisado = alisado;
    }
    /**
     * Getter del grado de transparencia
     * @return grado de transparencia
     */
    @Override
    public float getGradoTransparencia() {
        return gradoTransparencia;
    }
    /**
     * Setter del grado de transparencia
     * @param gradoTransparencia nuevo valor de la transparencia
     */
    @Override
    public void setGradoTransparencia(float gradoTransparencia) {
        this.gradoTransparencia = gradoTransparencia;
    }
    /**
     * Metodo para dibujar la linea 
     * Tendremos en cuenta los posibles valor de los atributos, como transparencia, alisado, trazo....
     * Para la linea no es necesario el gradiente
     * @param g2d graphics2d para dibujar la figura
     */
    @Override
     public void dibujar(Graphics2D g2d) {   
         //Transparencia
        Composite comp = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, gradoTransparencia);
        //Alisado
        RenderingHints render;        
        if(!alisado )//Si no esta alisado ponemos el antialiasoff
            render = new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);
        else // Si está alisado ponemos antialiason
            render = new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);            
        //Trazo
        Stroke stroke;
        //El grosor del trazo
        if (continua) 
            stroke = new BasicStroke(GrosorTrazo);
        //Discontinuidad del trazo
         else{
            final float dash[] = {1.0f, 0.0f, 20.0f};
            stroke = new BasicStroke(GrosorTrazo, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_ROUND, 5.0f, dash, 0.0f);
        }
        g2d.setComposite(comp); //Aplicamos la transparencia 
        g2d.setRenderingHints(render);//aplicamos el alisado 
        g2d.setStroke(stroke);//Aplicamos el tipo de trazo
        g2d.setColor(ColorTrazo);//Color del trazo
        g2d.draw(this);//La dibujamos

    }
    /**
     * Metodo para detectar si un punto pertenece a la figura
     * Como es una linea comprobamos que el punto este cerca de la linea
     * @param punto valor para comprobar si estamos en la linea
     * @return booleano si el punto pertenece a la linea
     */
    @Override
    public boolean detectarFigura(Point2D punto) {
        //Llamamos a la funcion de Line2D que mide la distancia entre el punto y la recta y la acotamos a que la distancia sea menor que 2
        return this.ptLineDist(punto) <= 2.0; 
    }
    /**
     * Metodo para mover la linea hasta un punto
     * Ese punto será el punto inicial de la nueva linea
     * @param punto valor donde desplazamos la linea
     */
    @Override
     public void moverFiguras(Point2D punto) {
        //Vemos la distancia de nuestro punto inicial al punto en coordenadas 
        double distanciaX = punto.getX() - this.getX1();
        double distanciaY = punto.getY() - this.getY1();
        //Nuestro punto final será el anterior mas las distancia anterior
        this.actualizarFigura(punto, new Point2D.Double(this.getX2() + distanciaX, this.getY2() + distanciaY));   
    }
     /**
      * Metodo para actualizar la linea a partir de dos puntos, el inicial y el final
      * @param PrimerPunto punto inicial
      * @param SegundoPunto punto final
      */
    @Override
     public void actualizarFigura(Point2D PrimerPunto, Point2D SegundoPunto) {
        this.setLine(PrimerPunto, SegundoPunto);
    }
     /**
      * Metodo para obtener el punto inicial o final de la linea
      * @param indice valor para saber que punto queremos
      * @return punto que ocupa la posición del indice
      */
    @Override
    public Point2D get1Punto(int indice) {
        if (indice==0) //Si el indice es 0 es el primer punto 
           return  this.getP1();
        
        return this.getP2();//Sino devuelvo el punto final
    } 
    /**
     * Getter del numero de puntos de control de la linea
     * @return numero de puntos de control
     */
    @Override
    public int getPuntosControl() {
        return this.PuntosControl;
    }
    /**
     * Metodo para dibujar un rectangulo sobre la linea 
     * El rectangulo será discontinuo, rojo y sin relleno
     * @param g2d Graphics para pintar la figura
     */
    @Override
    public void dibujarRectanguloFrame(Graphics2D g2d) {
        //Sacamos las coordenadas minimo para saber el punto donde pintamos el rectangulo
        double xmin = Math.min(this.getX1(), this.getX2());
        double ymin = Math.min(this.getY1(), this.getY2());
        //Sacamos amplitud y altura de nuestro rectangulo    
        double amplitud= Math.abs(this.getX1()- this.getX2());
        double altura= Math.abs(this.getY1()- this.getY2());

        frame = new Rectangulo(xmin - this.getGrosorTrazo(), ymin - this.getGrosorTrazo(), amplitud + 2*this.getGrosorTrazo(), altura + 2*this.getGrosorTrazo());
        frame.setGrosorTrazo(1);//Grosor1
        frame.setContinua(false);//Discontinuo
        frame.setColorTrazo(Color.RED);//Rojo
        frame.setTipoRelleno(0);//No rellenar
        frame.setGradoTransparencia(1.0f);//Sin transparencia
        frame.dibujar(g2d);//dibujar la figura
    }
    /**
     * Metodo no implementado ya que en mi caso no permito aumentar o disminuir una linea ya pintada 
     * @param indice
     * @param punto 
     */
    @Override
    public void set1Punto(int indice, Point2D punto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.        
    }
    /**
     * Metodo no necesario para la linea ya que los puntos son inicial y final
     * @return 
     */
    @Override
    public ArrayList<Point2D> getVectorPuntos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Metodo no necesario para la linea 
     * @param v_Puntos 
     */
    @Override
    public void setVectorPuntos(ArrayList<Point2D> v_Puntos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Metodo para crear un gradiente a partir de un punto inicial y final
     * no necesario para la linea
     * @param punto1 punto inicial
     * @param punto2 punto final
     */
    @Override
    public void crearGradiente(Point2D punto1, Point2D punto2) {
       
    }
    /**
     * Getter para el gradiente
     * No necesario para la linea
     * @return 
     */
    @Override
    public GradientPaint getGradiente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Setter del gradiente
     * No necesario para la linea
     * @param miGradiente nuevo valor del gradiente
     */
    @Override
    public void setGradiente(GradientPaint miGradiente) {
        gradiente = miGradiente;
    }
    /**
     * Getter de la coordenada x del punto inicial
     * 
     * @return coordenada x del primer punto
     */
    @Override
    public double getX() {
        return this.getX1();
    }
    /**
     * Getter de la coordenada y del punto inicial
     * 
     * @return coordenada y del primer punto
     */
    @Override
    public double getY() {
        return this.getY1();
    }
    /**
     * Metodo para actualizar el gradiente,
     * No necesario para la linea porque no tendrá gradiente
     */
    @Override
    public void actualizarGradiente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Metodo para actualziar el gradiente a partir de dos puntos
     * No necesario para la linea porque no tiene gradiente
     * @param punto1
     * @param punto2 
     */
    @Override
    public void actualizarGradiente(Point2D punto1, Point2D punto2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
}
