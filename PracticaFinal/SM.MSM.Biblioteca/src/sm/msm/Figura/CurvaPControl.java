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
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Point2D;
import java.awt.geom.QuadCurve2D;
import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class CurvaPControl extends QuadCurve2D.Double implements Figura{
    
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
    //Para controlar el punto donde se produce la curva y su valor
    private final int PuntosControl = 1;    
    private Point2D valorPuntoControl;

    /**
     * Constructor de la curva con punto de Control
     * @param punto1 punto de inicio
     * @param PControl punto donde curva
     * @param punto2 punto final de la linea
     */
    public CurvaPControl(Point2D punto1, Point2D PControl, Point2D punto2) {
        //Llamamos al constructor de QuadCurve2D pasando las coordenadas de los puntos
        super(punto1.getX(), punto1.getY(), PControl.getX(), PControl.getY(), punto2.getX(), punto2.getY());
        valorPuntoControl = PControl;//Actualizamos el valor del punto de control         
    }
    /**
     * Getter  del tipo de Relleno 
     * @return TipoRelleno de la Curva
     */
    @Override
    public int getTipoRelleno() {
        return TipoRelleno;
    }

    /**
     * Setter del tipo de Relleno 
     * @param TipoRelleno el nuevo tipo de relleno
     */
    @Override
    public void setTipoRelleno(int TipoRelleno) {
        this.TipoRelleno = TipoRelleno;
    }
    
    /**
     * Getter del Color de Relleno 
     * @return color de relleno de la curva
     */
    @Override
    public Color getColorRelleno() {
        return ColorRelleno;
    }
    /**
     * Setter del Color de Relleno 
     * @param ColorRelleno el nuevo color de relleno
     */
    @Override
    public void setColorRelleno(Color ColorRelleno) {
        this.ColorRelleno = ColorRelleno; //Actualizamos el color de relleno
    }
    /**
     * Getter del color de gradiente de la curva con punto de control
     * @return color del gradiente
     */
    @Override
    public Color getColorGradiente() {
        return ColorGradiente;
    }
    /**
     * Setter del Color de Gradiente 
     * @param ColorGradiente el nuevo color de gradiente
     */
    @Override
    public void setColorGradiente(Color ColorGradiente) {
        this.ColorGradiente = ColorGradiente;//Actualizamos el color de gradiente
        if (TipoRelleno == 2 ) //Comprobamos si tenemos activo el degradado
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
     * Setter del Gradiente 
     * @param gradiente nuevo gradiente
     */
    @Override
    public void setGradiente(GradientPaint gradiente) {
        this.gradiente = gradiente;
    }
    /**
     * Getter del tipo de gradiente 
     * @return el tipo de gradiente
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
        this.TipoGradiente = TipoGradiente;//Actualizamos el tipo de gradiente
        if (TipoRelleno == 2)//Si es degradado
            this.actualizarGradiente();                        
    }
    /**
     * Getter del Tipo de Trazo si es continua o no
     * @return si es continua
     */
    @Override
    public boolean getContinua() {
        return continua;
    }

    /**
     * Setter Continua de la Curva con Punto de Control
     * @param continua cambio de continuidad
     */
    @Override
    public void setContinua(boolean continua) {
        this.continua = continua;
    }
    /**
     * Getter del valor del punto de control
     * @return valor del punto de control
     */
    public Point2D getValorPuntoControl() {
        return valorPuntoControl;
    }
    /**
     * Setter del valor del punto de Control 
     * @param valorPuntoControl nuevo valor del punto de control
     */
    public void setValorPuntoControl(Point2D valorPuntoControl) {
        this.valorPuntoControl = valorPuntoControl;
    }

    /**
     * Getter del Grosor del trazo de la curva 
     * @return grosor del trazo
     */
    @Override
    public float getGrosorTrazo() {
        return GrosorTrazo;
    }

    /**
     * Setter del grosor del trazo de la curva con Punto de control
     * @param GrosorTrazo nuevo valor del grosor
     */
    @Override
    public void setGrosorTrazo(float GrosorTrazo) {
        this.GrosorTrazo = GrosorTrazo;
    }

    /**
     * Getter del color del Trazo de la curva con Punto de Control
     * @return  color del trazo
     */
    @Override
    public Color getColorTrazo() {
        return ColorTrazo;
    }
    /**
     * Setter del Color del trazo de la curva con Punto de Control
     * @param ColorTrazo nuevo color del trazo
     */
    @Override
    public void setColorTrazo(Color ColorTrazo) {
        this.ColorTrazo = ColorTrazo;
    }
    /**
     * Getter del alisado de la curva con punto de control
     * @return booleano si esta alisado
     */
    @Override
    public boolean getAlisado() {
        return alisado;
    }
    /**
     * Setter del nuevo alisado de la curva con punto de control
     * @param alisado el nuevo valor del alisado
     */
    @Override
    public void setAlisado(boolean alisado) {
        this.alisado = alisado;
    }
    /**
     * Getter del grado de transparencia de la curva con punto de control
     * @return valor del grado de transparencia
     */
    @Override
    public float getGradoTransparencia() {
        return gradoTransparencia;
    }
    /**
     * Setter del grado de Transparencia de la curva Con Punto de Control
     * @param gradoTransparencia nuevo grado de transparencia
     */
    @Override
    public void setGradoTransparencia(float gradoTransparencia) {
        this.gradoTransparencia = gradoTransparencia;
    }
    /**
     * Getter del rectangulo frame que usamos pa señalar la figura 
     * @return el rectangulo
     */
    public Rectangulo getFrame() {
        return frame;
    }
    /**
     * Setter del rectangulo frame en la Curva con punto de Control
     * @param frame nuevo rectangulo
     */
    public void setFrame(Rectangulo frame) {
        this.frame = frame;
    }   
    /**
     * Metodo dibujar de la Curva Con Punto de Control
     * Dibujamos nuestra figura teniendo en cuenta los atributos. 
     * @param g2d 
     */
    @Override
    public void dibujar(Graphics2D g2d) {
        //Miramos la transparencia 
        Composite comp = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, gradoTransparencia);
        g2d.setComposite(comp);
        //Vemos si esta alisado o no 
        RenderingHints render;
        if(!alisado )//Si no hay alisado ponemos el antialiasoff
            render = new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);
        else//Si tenemos el alisado ponemos antialiason
            render = new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
            
        g2d.setRenderingHints(render);
        
        //Para los trazos
        Stroke stroke;
        if (continua) //Si es continua
            stroke = new BasicStroke(GrosorTrazo);//Simplemente ponemos el grosor del trazo
        else{//Es discontinua
            final float dash[] = {1.0f, 0.0f, 20.0f};
            stroke = new BasicStroke(GrosorTrazo, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_ROUND, 5.0f, dash, 0.0f);
        }
        g2d.setStroke(stroke);//Ponemos el trazo
        g2d.setColor(ColorTrazo);//Seleccionamos el color
        g2d.draw(this);//Pintamos la figura
        
        g2d.setColor(ColorRelleno);//Ponemos el color de relleno
        if (TipoRelleno == 1) //Si el relleno es liso, coloreamos la figura
            g2d.fill(this);
        else if (TipoRelleno == 2) {//Si es degradado el relleno
            g2d.setPaint(gradiente);//Pintamos el gradiente 
            g2d.fill(this);//Coloreamos
        }
        
    }
    /**
     * Metodo mover figura a un punto de la Curva con Punto de control
     * @param punto el nuevo punto donde me desplazo
     */
    @Override
     public void moverFiguras(Point2D punto) {
        //Calculo la distancia en coordenadas del punto inicial de la linea al punto que me desplazo
        double distanciaX = punto.getX() - this.getX1();
        double distanciaY = punto.getY() - this.getY1();
        Point2D puntoDesplazado = new Point2D.Double(this.getX2() + distanciaX, this.getY2() + distanciaY);//El punto final de la linea lo desplazo la distancia
        Point2D puntoControl = new Point2D.Double(this.getCtrlX() + distanciaX, this.getCtrlY() + distanciaY);//El punto de control estará desplazado la distancia    
        valorPuntoControl = puntoControl;//Actualizado el valor del punto de control
        this.actualizarFigura(punto, puntoDesplazado);//Actualizo mi nueva curva en los puntos nuevos
    }
     /**
      * Metodo que detecta si el punto pertenece a la Curva 
      * @param punto que comprobamos si pertenece a la figura
      * @return 
      */
    @Override
    public boolean detectarFigura(Point2D punto) {
        return super.contains(punto);//Llamamos al metodo de QuadCurve para ver si el punto pertenece
    }
    /**
     * Metodo para actualizar la figura a partir de dos puntos
     * @param PrimerPunto punto inicial nuevo de la cruva
     * @param SegundoPunto punto final nuevo de la curva
     */
    
    @Override
    public void actualizarFigura(Point2D PrimerPunto, Point2D SegundoPunto) {
        this.setCurve(PrimerPunto, valorPuntoControl, SegundoPunto);
        if (TipoRelleno == 2) 
            this.crearGradiente(new Point(this.getBounds().x,this.getBounds().y), new Point(this.getBounds().x+this.getBounds().width,this.getBounds().y+this.getBounds().height));
    }
    /**
     * Metodo que nos devuelve uno de los puntos de la curva con punto de control que está en la posicion del indice
     * @param indice punto que queremos
     * @return punto del indice
     */
    @Override
    public Point2D get1Punto(int indice) {
        if(indice == 0)//Nos devuelve el punto inicial de la curva
            return this.getP1();
        else if (indice ==1)//Nos devuelve el punto de control
            return this.getValorPuntoControl();
       
        return this.getP2();    
 
    }
    /**
     * Metodo para cambiar el valor del punto de control de la curva
     * cambiar los otros valor de la curva, punto inicial o final se usaria si permitieramos que al seleccinar el punto en
     * vez de desplazar la curva la aumentemos o disminuimos
     * @param indice indica la posicion donde queremos cambiar el punto, en nuestro caso solo la 0
     * @param punto nuevo valor del punto en el indice
     */
    @Override
    public void set1Punto(int indice, Point2D punto) {
        if (indice ==0){ //Cambio el valor del punto de Control 
            this.setValorPuntoControl(punto);
            this.actualizarFigura(this.getP1(), this.getP2());//Actualizo la figura con el punto de control modificado
        }
    }
    /**
     * Getter del valor del punto de control de la curva con punto de control
     * @return 
     */
    @Override
    public int getPuntosControl() {
        return this.PuntosControl;
    }
    /**
     * Metodo no necesario para esta figura 
     * @return 
     */
    @Override
    public ArrayList<Point2D> getVectorPuntos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Metodo no necesario para esta figura
     * @param v_Puntos 
     */
    @Override
    public void setVectorPuntos(ArrayList<Point2D> v_Puntos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Metodo para crear el gradiente dependiendo del tipo que queremos
     * @param punto1 Punto sobre el que comienza la figura
     * @param punto2 Punto con el que acaba la figura
     */
    @Override
    public void crearGradiente(Point2D punto1, Point2D punto2) {
        if(TipoGradiente == 0)//Si el gradiente es Horizontal
            gradiente = new GradientPaint(new Point(0,(int) punto1.getY()), ColorRelleno,new Point(0,(int) punto2.getY()), ColorGradiente);                
        else if (TipoGradiente ==1) //Si el gradiente es Vertical
             gradiente = new GradientPaint(new Point((int) punto1.getX(),0), ColorRelleno, new Point((int) punto2.getX(),0), ColorGradiente);
    }

    /**
     * metodo que actualiza nuestro gradiente, creando uno nuevo con los puntos inicual y final de la linea
     */
    @Override
    public void actualizarGradiente() {
        this.crearGradiente(this.get1Punto(0),this.get1Punto(1));
    }
    /**
     * Metodo actualizar gradiente a partir de dos puntos que no es necesario para esta figura
     * @param punto1
     * @param punto2 
     */
    @Override
    public void actualizarGradiente(Point2D punto1, Point2D punto2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * metodo para dibujar un rectangulo sobre la curva que hemos seleccionado
     * @param g2d la figura 
     */
    @Override
    public void dibujarRectanguloFrame(Graphics2D g2d) {
        //Creo un nuevo rectangulo, a las coordenadas le quito el grosor del trazo y a las dimensiones se lo sumo multiplicado, para que aunque el grosor sea muy grande el rectangulo se quede fuera
        frame = new Rectangulo(this.getBounds2D().getX() - this.getGrosorTrazo(), this.getBounds2D().getY()-this.getGrosorTrazo(), this.getBounds2D().getWidth()+2*this.getGrosorTrazo(),this.getBounds2D().getHeight()+2*this.getGrosorTrazo());
        frame.setGrosorTrazo(1);//ponemos trazo 1
        frame.setContinua(false);//Discontinuo
        frame.setColorTrazo(Color.RED);//Rojo
        frame.setTipoRelleno(0);//Que no este relleno
        frame.setGradoTransparencia(1.0f);//sin Transparencia
        frame.dibujar(g2d);//lo dibujo
    }
/**
 * Metodo no necesario para esta figura
 * @return 
 */
    @Override
    public double getX() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Metodo no necesario para esta figura
     * @return 
     */
    @Override
    public double getY() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
}
