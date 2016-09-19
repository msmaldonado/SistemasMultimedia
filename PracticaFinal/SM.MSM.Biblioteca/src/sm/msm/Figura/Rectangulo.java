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
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;
import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class Rectangulo extends Rectangle2D.Double implements Figura {
    
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
     * Constructor del rectangulo a partir de las coordenadas e un punto inicial y las dimensiones
     * Llamo al constructor de Rectangle2D
     * @param x coordenada x del punto
     * @param y coordenada y del punto
     * @param ancho ancho del rectangulo
     * @param alto alto del rectangulo
     */
    public Rectangulo(double x, double y, double ancho, double alto) {
        super(x, y, ancho, alto);
    }
    
   /**
    * Constructor del rectangulo a partir de dos puntos
    * Con los dos puntos saco las dimensiones del rectangulo
    * @param punto1 punto inicial
    * @param punto2 punto final
    */   
   public Rectangulo(Point2D punto1, Point2D punto2){
       //Creo el rectangulo con las coordenadas del primer punto y la anchura y altura calculada mediante los dos puntos
       super(punto1.getX(), punto1.getY(), Math.abs(punto1.getX() - punto2.getX()), Math.abs(punto1.getY() - punto2.getY()));
       
   }
   
   /**
    * Constructor del rectangulo a partir de otro rectangulo
    * @param rec nuevo rectangulo
    */
   public Rectangulo(Rectangle2D rec){
       super(rec.getX(), rec.getY(), rec.getWidth(), rec.getHeight());
   }
   /**
    * Metodo para dibujar el rectangulo con todos sus posibles atributos
    * @param g2d Graphics para poder dibujar la figura
    */
    @Override
   public void dibujar(Graphics2D g2d) {
        //Transparencia
        Composite comp = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, gradoTransparencia);
        
        //Alisado
        RenderingHints render;
        if(!alisado ) //No alisado antialiasOff
            render = new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);
        else //Aliasado antialiasOn
            render = new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);            
        
        //Trazo
        Stroke stroke;
        if (continua) //Trazo continuo
            stroke = new BasicStroke(GrosorTrazo);
        else{//Trazo discontinuo
            final float dash[] = {1.0f, 0.0f, 20.0f};
            stroke = new BasicStroke(GrosorTrazo, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_ROUND, 5.0f, dash, 0.0f);
        }
        g2d.setComposite(comp);//Transparencia
        g2d.setRenderingHints(render);//Alisado
        g2d.setStroke(stroke);//Trazo
        g2d.setColor(ColorTrazo);//Color del trazo
        g2d.draw(this); //Dibujamos la figura

        g2d.setColor(ColorRelleno);
        if (TipoRelleno == 1) //Relleno liso la coloreamos
            g2d.fill(this);
        else if (TipoRelleno == 2) {//Degradado, pongo el gradiente y coloreo
            g2d.setPaint(gradiente);
            g2d.fill(this);
        }
    }
    /**
     * Getter del tipo de relleno
     * @return tipo de relleno
     */
    @Override
    public int getTipoRelleno() {
        return TipoRelleno;
    }
    /**
     * Setter del tipo de Relleno
     * @param TipoRelleno nuevo valor del tipo de relleno
     */
    @Override
    public void setTipoRelleno(int TipoRelleno) {
        this.TipoRelleno = TipoRelleno;
    }
    /**
     * Getter del color de relleno
     * @return  color de relleno
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
     * Setter del color del gradiente
     * @param ColorGradiente nuevo color de gradiente
     */
    @Override
    public void setColorGradiente(Color ColorGradiente) {
        this.ColorGradiente = ColorGradiente;
        if (TipoRelleno == 2 ) //Degradado
            this.actualizarGradiente();
    }
    /**
     * Getter del tipo del gradiente
     * @return tipo de gradiente
     */
    public int getTipoGradiente() {
        return TipoGradiente;
    }
    /**
     * Setter del tipo de gradiente
     * @param TipoGradiente nuevo tipo de gradiente
     */
    @Override
    public void setTipoGradiente(int TipoGradiente) {
        this.TipoGradiente = TipoGradiente;
        if (TipoRelleno == 2) //Si es degradado
            this.actualizarGradiente();   
    }
    /**
     * Getter de la continuidad del trazo
     * @return booleano con la continuidad de trazo
     */
    @Override
    public boolean getContinua() {
        return continua;
    }
    /**
     * Setter de la continuidad del trazo
     * @param TipoTrazo nuevo valor de la continuidad
     */
    @Override
    public void setContinua(boolean TipoTrazo) {
        this.continua = TipoTrazo;
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
     * @param GrosorTrazo nuevo grosor del trazo
     */
    @Override
    public void setGrosorTrazo(float GrosorTrazo) {
        this.GrosorTrazo = GrosorTrazo;
    }
    /**
     * Getter del color del Trazo
     * @return color del trazo
     */
    @Override
    public Color getColorTrazo() {
        return ColorTrazo;
    }
    /**
     * Setter del color del trazo
     * @param ColorTrazo nuevo color del trazo
     */
    @Override
    public void setColorTrazo(Color ColorTrazo) {
        this.ColorTrazo = ColorTrazo;
    }
    /**
     * Getter del alisado del rectangulo
     * @return booleano con el alisado
     */
    @Override
    public boolean getAlisado() {
        return alisado;
    }
    /**
     * Setter del alisado del rectangulo
     * @param alisado nuevo alisado 
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
     * Setter del grado de Transparencia
     * @param gradoTransparencia nuevo grado de transparencia
     */
    @Override
    public void setGradoTransparencia(float gradoTransparencia) {
        this.gradoTransparencia = gradoTransparencia;
    }
    /**
     * Getter del rectangulo frame
     * @return rectangulo frame
     */
    @Override
    public Rectangulo getFrame() {
        return frame;
    }
    /**
     * Setter del rectangulo frame
     * @param frame nuevo rectangulo frame
     */
    public void setFrame(Rectangulo frame) {
        this.frame = frame;
    }
    /**
     * metodo para mover el rectangulo a un punto
     * @param punto valor donde queremos desplazar el rectangulo
     */
    @Override
    public void moverFiguras(Point2D punto) {
        //Sacamos las dimensiones del rectangulo y creamos uno en el punto donde nos desplazamos 
        RectangularShape rectangulo = (RectangularShape) this;
        rectangulo.setFrame(punto, new Dimension((int) rectangulo.getWidth(), (int) rectangulo.getHeight()));
        if (TipoRelleno == 2) 
            this.actualizarGradiente();        
    }
    /**
     * Metodo para actualizar la figura a dos puntos
     * @param PrimerPunto punto inicial
     * @param SegundoPunto punto final
     */
    @Override
    public void actualizarFigura(Point2D PrimerPunto, Point2D SegundoPunto) {
        //Creamos un rectangulo a partir de los dos puntos  
        setFrameFromDiagonal(PrimerPunto, SegundoPunto);
        if (TipoRelleno == 2) 
            this.actualizarGradiente(); 
        
    }
    /**
     * Obtener un punto del rectangulo a partir de un indice
     * el indice 0 será el punto inicial
     * el otro indice será el opuesto a la diagonal
     * @param indice lugar del punto que queremos
     * @return punto de la posición del indice
     */
    @Override
    public Point2D get1Punto(int indice) {
         //Tengo el las coordenadas del primer punto o de su esquina opuesta(diagonal)
        if(indice==0)
            return this.getBounds().getLocation();
       
        return new Point2D.Double(this.getBounds().x + this.getBounds().width, this.getBounds().y + this.getBounds().height);   
    }
    /**
     * Metodo para poner un punto en un lugar que ocupa el indice 
     * No implementado para nuestro rectangulo
     * @param indice
     * @param punto 
     */
    @Override
    public void set1Punto(int indice, Point2D punto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Getter del numero de puntos de Control
     * @return puntos de control
     */
    @Override
    public int getPuntosControl() {
        return this.PuntosControl;
    }
    /**
     * Getter del Vector de puntos
     * No implementado porque no trabajamos de forma externa con los puntos
     * @return 
     */
    @Override
    public ArrayList<Point2D> getVectorPuntos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Setter del vector de puntos del rectangulo
     * No necesario porque esta figura no trabaja con un vector para los vertices
     * @param v_Puntos 
     */
    @Override
    public void setVectorPuntos(ArrayList<Point2D> v_Puntos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Getter de la coordenada x del punto sobre el que pintamos el rectangulo aplicando las dimensiones
     * @return coordenada x del punto 
     */
    @Override
    public double getX() {
        return super.getBounds2D().getX();
    }
    /**
     * Getter de la coordenada y del punto sobre el que pintamos el rectangulo aplicando las dimensiones
     * @return coordenada y del punto 
     */
    @Override
    public double getY() {
        return super.getBounds2D().getY();
    }
    /**
     * metodo para crear el gradiente a partir de dos puntos
     * @param punto1 punto inicial
     * @param punto2 punto final
     */
    @Override
    public void crearGradiente(Point2D punto1, Point2D punto2) {        
        if (TipoGradiente == 0)//horizontal
            gradiente = new GradientPaint(new Point(0,(int) punto1.getY()), ColorRelleno,new Point(0,(int) punto2.getY()), ColorGradiente);
        else  //Vertical
            gradiente = new GradientPaint(new Point((int) punto1.getX(),0), ColorRelleno, new Point((int) punto2.getX(),0), ColorGradiente);
                                 
    }
    /**
     * Metodo para actualizar el gradiente teniendo en cuenta el punto inicial o el punto que esta en la diagonal
     */
    @Override
    public void actualizarGradiente() {
        this.crearGradiente(this.get1Punto(0),this.get1Punto(1));
    }
    /**
     * Getter del gradiente
     * @return gradiente
     */
    @Override
    public GradientPaint getGradiente() {
        return gradiente;
    }
    /**
     * Setter del gradiente 
     * @param miGradiente nuevo valor del gradiente
     */
    @Override
    public void setGradiente(GradientPaint miGradiente) {
        this.gradiente = miGradiente;
    }
    /**
     * metodo para dibujar un rectangulo frame sobre el rectangulo
     * discontinuo, rojo y sin relleno
     * @param g2d Graphics para dibujar la figura
     */
    @Override
    public void dibujarRectanguloFrame(Graphics2D g2d) {
        //Genero un rectangulo a partir del mio, pero tengo en cuenta el grosor del trazo
        frame = new Rectangulo(this.getX() - this.getGrosorTrazo(), this.getY() -  this.getGrosorTrazo(), this.getWidth() + 2*this.getGrosorTrazo(), getHeight() + 2*this.getGrosorTrazo());
        frame.setGrosorTrazo(1);//Grosor1
        frame.setContinua(false);//Discontinua
        frame.setColorTrazo(Color.RED);//Roja
        frame.setTipoRelleno(0);//Sin relleno
        frame.setGradoTransparencia(1.0f);//sin transparencia
        frame.dibujar(g2d);//Dibujo la figura
    }
    /**
     * Metodo para ver si un punto pertenece a la figura
     * @param punto Punto que queremos ver si pertenece al rectangulo
     * @return  booleano de si pertenece
     */
    @Override
    public boolean detectarFigura(Point2D punto) {
        //Llamamos a la funcion contains 
       return super.contains(punto);
    }
    /**
     * Metodo para actualizar el gradiente a partir de dos puntos 
     * @param punto1 primer punto 
     * @param punto2 punto final
     */
    @Override
    public void actualizarGradiente(Point2D punto1, Point2D punto2) {
        this.crearGradiente(punto1, punto2);
    }
              
    
}
