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
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.RectangularShape;
import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class Elipse extends Ellipse2D.Double implements Figura{
    
    
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
     * Constructor de Elipse a partir de un punto y las dimensiones 
     * @param punto1
     * @param ancho
     * @param alto 
     */
    
     public Elipse(Point2D punto1, double ancho, double alto){
        super(punto1.getX(),punto1.getY(), ancho, alto);
    }
    
    /**
     * Constructor de Elipse a partir de dos puntos.
     * @param punto1 Inicial
     * @param punto2 Final 
     */
    public Elipse(Point2D punto1, Point2D punto2){
        //Llamamos al constructor de Ellipse2D y pasamos el punto y las dimensiones calculadas a partir de los dos puntos
        super(punto1.getX(), punto1.getY(), Math.abs(punto1.getX() - punto2.getX()), Math.abs(punto1.getY() - punto2.getY()));
    }
    /**
     * Getter del tipo de Relleno de la Elipse
     * @return tipo de relleno
     */
    @Override
    public int getTipoRelleno() {
        return TipoRelleno;
    }
    /**
     * Setter del tipo de Relleno de Elipse
     * @param TipoRelleno nuevo tipo de Relleno
     */
    @Override
    public void setTipoRelleno(int TipoRelleno) {
        this.TipoRelleno = TipoRelleno;
    }
    /**
     * Getter del Color de Relleno de la Elipse
     * @return color de relleno
     */
    @Override
    public Color getColorRelleno() {
        return ColorRelleno;
    }
    /**
     * Setter del Color de Relleno de la elipse
     * Tendremos en cuenta si esta activo el degradado para actualizar el gradiente
     * @param ColorRelleno nuevo color de relleno
     */
    @Override
    public void setColorRelleno(Color ColorRelleno) {
        this.ColorRelleno = ColorRelleno;
    }
    /**
     * Getter del color de Gradiente
     * @return color de gradiente
     */
    @Override
    public Color getColorGradiente() {
        return ColorGradiente;
    }
    /**
     * Setter del color de Gradiente de la elipse
     * tenemos en cuenta si está activado el degradado 
     * @param ColorGradiente 
     */
    @Override
    public void setColorGradiente(Color ColorGradiente) {
        this.ColorGradiente = ColorGradiente;
        if (TipoRelleno == 2 ) //Si esta activo el degradado
            this.actualizarGradiente();
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
     * Setter del gradiente de la elipse
     * @param gradiente nuevo valor del gradiente
     */
    @Override
    public void setGradiente(GradientPaint gradiente) {
        this.gradiente = gradiente;
    }
    /**
     * Getter del tipo de gradiente de la elipse
     * @return tipo de gradiente
     */
    public int getTipoGradiente() {
        return TipoGradiente;       
        
    }
    /**
     * Setter del tipo de Gradiente de Elipse
     * tendremos en cuenta si estamos en degradado para actualizar el gradiente
     * @param TipoGradiente 
     */
    @Override
    public void setTipoGradiente(int TipoGradiente) {
        this.TipoGradiente = TipoGradiente;
        if (TipoRelleno == 2)//Si es degradado
            this.actualizarGradiente();
    }
    /**
     * Getter de si el trazo es continuo o no
     * @return booleano de continuidad
     */
    @Override
    public boolean getContinua() {
        return continua;
    }
    /**
     * Setter de la continuidad del trazo de Elipse
     * @param continua nuevo valor de la continuidad
     */
    @Override
    public void setContinua(boolean continua) {
        this.continua = continua;
    }
    /**
     * Getter del grosor del trazo de elipse
     * @return valor del grosor
     */
    @Override
    public float getGrosorTrazo() {
        return GrosorTrazo;
    }
    /**
     * Setter del Grosor del trazo
     * @param GrosorTrazo nuevo valor del grosor del trazo
     */
    @Override
    public void setGrosorTrazo(float GrosorTrazo) {
        this.GrosorTrazo = GrosorTrazo;
    }
    /**
     * Getter del color del trazo
     * @return Color del trazo
     */
    @Override
    public Color getColorTrazo() {
        return ColorTrazo;
    }
    /**
     * Getter de la coordenada x
     * @return el valor de la coordenada x del punto del rectangulo
     */
    @Override
    public double getX() {
        return super.getBounds2D().getX();
    }
    /**
     * Setter del valor de la coordenada x del punto
     * @param x nuevo valor de la coordenada x
     */
    public void setX(double x) {
        this.x = x;
    }
    /**
     * Getter de la coordenada y del punto
     * @return coordenada y del punto
     */
    @Override
    public double getY() {
        return super.getBounds2D().getY();
    }
    /**
     * Setter de la coordenada y del punto
     * @param y nuevo valor de la coordenada y
     */
    public void setY(double y) {
        this.y = y;
    }
    /**
     * Getter del ancho de las dimensiones
     * @return ancho
     */
    @Override
    public double getWidth() {
        return width;
    }
    /**
     * Setter del ancho de las dimensiones
     * @param width nuevo ancho
     */
    public void setWidth(double width) {
        this.width = width;
    }
    /**
     * Getter de la altura de las dimensiones de la elipse
     * @return altura
     */
    @Override
    public double getHeight() {
        return height;
    }
    /**
     * Setter de la altura de la elipse
     * @param height neuvo valor de la altura
     */
    public void setHeight(double height) {
        this.height = height;
    }
    /**
     * Setter del Color del trazo
     * @param ColorTrazo nuevo color del trazo
     */
    @Override
    public void setColorTrazo(Color ColorTrazo) {
        this.ColorTrazo = ColorTrazo;
    }
    /**
     * Getter del alisado
     * @return booleano de alisado
     */
    @Override
    public boolean getAlisado() {
        return alisado;
    }
    /**
     * Setter de Alisado 
     * @param alisado nuevo valor de alisado
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
     * Setter del Grado de TRansparencia
     * @param gradoTransparencia nuevo valor de la transparencia
     */
    @Override
    public void setGradoTransparencia(float gradoTransparencia) {
        this.gradoTransparencia = gradoTransparencia;
    }
    /**
     * Getter del rectangulo que selecciona a la figura
     * @return rectangulo frame
     */
    @Override
    public Rectangulo getFrame() {
        return frame;
    }
    /**
     * Setter del rectangulo frame que selecciona a la figura
     * @param frame nuevo rectangulo
     */
    public void setFrame(Rectangulo frame) {
        this.frame = frame;
    }
    /**
     * Metodo que dibuja a la figura con el valor de todos sus atributos
     * @param g2d 
     */
    @Override
    public void dibujar(Graphics2D g2d) {
       
        //Transparencia
        Composite comp = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, gradoTransparencia);
        g2d.setComposite(comp);
           //Alisado
        RenderingHints render;
        if(!alisado )//Si no esta el alisado pongo antialiasoff
            render = new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);
        else//Si estoy alisando pongo Antialiason
            render = new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
            
        g2d.setRenderingHints(render);
        
        //Trazo
         Stroke stroke;
        if (continua) //Si es continua
            stroke = new BasicStroke(GrosorTrazo);
        else{//Si es discontinua
            final float dash[] = {1.0f, 0.0f, 20.0f};//Creo las discontinuidades
            stroke = new BasicStroke(GrosorTrazo, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_ROUND, 5.0f, dash, 0.0f);
        }
        g2d.setStroke(stroke);//Pongo el tipo de trazo
        g2d.setColor(ColorTrazo);//Color
        g2d.draw(this);//Dibujo

        g2d.setColor(ColorRelleno);//Pongo el color de relleno 
        if (TipoRelleno == 1) //Si tiene relleno liso lo coloreo 
            g2d.fill(this);
        else if (TipoRelleno == 2) {//Si es degradado pongo el gradiente y lo coloreo
            g2d.setPaint(gradiente);
            g2d.fill(this);
        }
    }
    /**
     * Metodo para mover la figura a un punto
     * @param punto donde desplazo la figura
     */
    @Override
    public void moverFiguras(Point2D punto) {
        RectangularShape r = (RectangularShape) this;//Saco el rectangulo para tener las dimensiones
        r.setFrame(punto, new Dimension((int) r.getWidth(), (int) r.getHeight()));//lo creo en el punto con las dimensiones 
        if (TipoRelleno == 2) //Si tiene degradado lo pongo
            this.actualizarGradiente();        
    }
    /**
     * Metodo para ver si un punto pertene a la figura
     * Llamamos contains de Ellipse2D
     * @param punto punto que queremos ver si pertenece
     * @return si pertenece o no
     */
    @Override
    public boolean detectarFigura(Point2D punto) {
        return super.contains(punto);
    }
    /**
     * Metodo para actulizar un figura con dos puntos
     * @param PrimerPunto punto inicial
     * @param SegundoPunto punto final 
     */
    @Override
    public void actualizarFigura(Point2D PrimerPunto, Point2D SegundoPunto) {
        setFrameFromDiagonal(PrimerPunto, SegundoPunto);//Generamos la figura con los dos puntos
        if (TipoRelleno == 2) //Si tiene degradado pongo el gradiente
            this.actualizarGradiente();
    }
    /**
     * Getter para que nos de un punto de la elipse a partir de un indice
     * para indice 0 punto inicial
     * para indice 1 punto final
     * @param indice punto que queremos obtener
     * @return punto que esta en la posicion del indice
     */
    @Override
    public Point2D get1Punto(int indice) {        
        if ( indice == 0)
            return new Point2D.Double(this.getMinX(), this.getMinY());
        
      return new Point2D.Double(this.getMaxX(), this.getMaxY());       
    }
    /**
     * Metodo no necesario para la elipse ya que no cambiamos los valores de los puntos
     * @param indice
     * @param punto 
     */
    @Override
    public void set1Punto(int indice, Point2D punto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
    }
    /**
     * Getter de los puntos de control de la figura
     * @return puntos de control
     */
    @Override
    public int getPuntosControl() {
        return this.PuntosControl;
    }
    /**
     * Metodo no necesario para elipse
     * @return 
     */
    @Override
    public ArrayList<Point2D> getVectorPuntos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Metodo no necesario para elipse
     * @param v_Puntos 
     */
    @Override
    public void setVectorPuntos(ArrayList<Point2D> v_Puntos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Metodo para crear el gradiente a partir de dos puntos
     * tendremos en cuenta si el gradiente es horizontal o vertical
     * @param punto1 primer punto
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
     * Metodo para actualizar el gradiente
     * Creara el gradiente con el punto inicial y final
     */
    @Override
    public void actualizarGradiente() {
        this.crearGradiente(this.get1Punto(0),this.get1Punto(1));
    }

    /**
     *Metodo para dibujar el rectangulo frame para señalar cuando hemos detectado una figura para editar 
     * Creamos el rectangulo con las dimensiones de la figura y le ponemos los atributos
     * @param g2d
     */
    @Override
    public void dibujarRectanguloFrame(Graphics2D g2d) {
        //Creamos el rectagulo pero las dimensiones tengan en cuenta el grosor, si aumenta el grosor aumenta el rectangulo
        frame = new Rectangulo(this.getX() - this.getGrosorTrazo(), this.getY() - this.getGrosorTrazo(), this.getWidth() +2*this.getGrosorTrazo(), this.getHeight() + 2*this.getGrosorTrazo());
        frame.setGrosorTrazo(1);//grosor normal a 1
        frame.setContinua(false);//Discontinua
        frame.setColorTrazo(Color.RED);//Rojo
        frame.setTipoRelleno(0);//Sin rellenar
        frame.setGradoTransparencia(1.0f);//Sin transparencia
        frame.dibujar(g2d);//lo pintamos
    }
    /**
     * Metodo no necesario para esta figura
     * @param punto1
     * @param punto2 
     */
    @Override
    public void actualizarGradiente(Point2D punto1, Point2D punto2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
}
