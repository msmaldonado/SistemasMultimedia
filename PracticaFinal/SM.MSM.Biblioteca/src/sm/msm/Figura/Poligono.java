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
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class Poligono extends Polygon implements Figura{
    
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
    
    
    private final int PuntosControl = 50;
    //Puntos del poligono
    private ArrayList<Point2D> VectorPuntos;
    
    /**
     * Contructor de un poligono a partir de dos puntos
     * llamamos al constructor de Polygon para crear la linea entre los dos puntos
     * Añadimos los dos puntos al vector de puntos del polígono
     * @param punto1 punto inicial 
     * @param punto2 punto final de la linea formada al crear un poligono
     */
    public Poligono(Point2D punto1, Point2D punto2){
        super();
        super.addPoint((int)punto1.getX(), (int)punto1.getY());
        super.addPoint((int)punto2.getX(), (int)punto2.getY());
        VectorPuntos = new ArrayList();
        VectorPuntos.add(punto1);
        VectorPuntos.add(punto2); 
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
     * Setter del tipo de relleno del poligono
     * Tendremos en cuenta si el relleno es degradado
     * @param TipoRelleno nuevo tipo de relleno
     */
    @Override
    public void setTipoRelleno(int TipoRelleno) {
        this.TipoRelleno = TipoRelleno;
    }
    /**
     * Getter del color de relleno
     * @return Color de relleno
     */
    @Override
    public Color getColorRelleno() {
        return ColorRelleno;
    }
    /**
     * Setter del color de Relleno
     * Tendremos en cuenta si el tipo de Relleno era degradado para actualizar el gradiente
     * @param ColorRelleno nuevo color de relleno
     */
    @Override
    public void setColorRelleno(Color ColorRelleno) {
        this.ColorRelleno = ColorRelleno;
    }
    /**
     * Getter del color de Gradiente
     * @return color del gradiente
     */
    @Override
    public Color getColorGradiente() {
        return ColorGradiente;
    }
    /**
     * Setter del color del Gradiente
     *
     * @param ColorGradiente 
     */
    @Override
    public void setColorGradiente(Color ColorGradiente) {
        this.ColorGradiente = ColorGradiente;
        if (TipoRelleno == 2 ) 
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
     * Setter del gradiente
     * @param gradiente nuevo valor del gradiente
     */
    @Override
    public void setGradiente(GradientPaint gradiente) {
        this.gradiente = gradiente;
    }
    /**
     * Getter del tipo de gradiente
     * @return tipo de gradiente
     */
    public int getTipoGradiente() {
        return TipoGradiente;
    }
    /**
     * Setter del tipo de gradiente
     * actualizamos gradiente porque hemos cambiado de tipo
     * @param TipoGradiente nuevo valor del tipo del gradiente
     */
    @Override
    public void setTipoGradiente(int TipoGradiente) {
        this.TipoGradiente = TipoGradiente;
        if (TipoRelleno == 2 ) 
            this.actualizarGradiente();
    }
    /**
     * Getter continuidad del trazo
     * @return booleano si es continuo el trazo
     */
    @Override
    public boolean getContinua() {
        return continua;
    }
    /**
     * Setter de la continuidad del trazo
     * @param continua nuevo valor para el tipo de trazo
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
     * @param GrosorTrazo neuvo valor del grosor del trazo
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
     * Setter del color del trazo
     * @param ColorTrazo nuevo color del trazo
     */
    @Override
    public void setColorTrazo(Color ColorTrazo) {
        this.ColorTrazo = ColorTrazo;
    }
    /**
     * Getter del alisado del poligono
     * @return booleano si esta alisada
     */
    @Override
    public boolean getAlisado() {
        return alisado;
    }
    /**
     * Setter del alisado
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
     * Setter del grado de Transparencia
     * @param gradoTransparencia nuevo valor de la transparencia
     */
    @Override
    public void setGradoTransparencia(float gradoTransparencia) {
        this.gradoTransparencia = gradoTransparencia;
    }
    /**
     * Getter del rectangulo frame para la figura
     * @return el rectangulo
     */
    public Rectangulo getFrame() {
        return frame;
    }
    /**
     * Setter del rectangulo frame
     * @param frame nuevo rectangulo
     */
    public void setFrame(Rectangulo frame) {
        this.frame = frame;
    }
    /**
     * Getter del vector de puntos del poligono
     * @return vector con los puntos del poligono
     */
    @Override
    public ArrayList<Point2D> getVectorPuntos() {
        return VectorPuntos;
    }
    /**
     * Setter del vector de puntos del poligonos
     * @param VectorPuntos nuevo vector de puntos del poligono
     */
    @Override
    public void setVectorPuntos(ArrayList<Point2D> VectorPuntos) {
        this.VectorPuntos = VectorPuntos;
    }
    /**
     * Metodo para añadir un punto al vector de puntos del poligono
     * @param p nuevo punto que añadimos
     */
    public void ponerPuntos(Point2D p) {
        this.VectorPuntos.add(p);
    }
    /**
     * obtener los limites del poligono
     * @return limites
     */
    @Override
    public Rectangle getBounds() {
        return bounds;
    }
    /**
     * Setter de los nuevos limites del poligono
     * @param bounds nuevos limites
     */
    public void setBounds(Rectangle bounds) {
        this.bounds = bounds;
    }
    /**
     * Metodo para dibujar el poligono
     * Tendremos en cuenta todos los atributos del poligono para dibujar, transparencia, alisado, trazo....
     * @param g2d Graphics para pintar la figura
     */
    @Override
    public void dibujar(Graphics2D g2d) {
         //Transparencia
        Composite comp = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, gradoTransparencia);
        
        //Alisado
        RenderingHints render;
        if(!alisado )//No alisado ponemos antialiasoff
            render = new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);
        else//Alisado ponemos AntialiasOn
            render = new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
            
        Stroke stroke;
        if (continua) 
            stroke = new BasicStroke(GrosorTrazo);
        else{
            final float dash[] = {1.0f, 0.0f, 20.0f};
            stroke = new BasicStroke(GrosorTrazo, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_ROUND, 5.0f, dash, 0.0f);
        }
        g2d.setComposite(comp);//Aplicamos la transparencia
        g2d.setRenderingHints(render);//Alisado
        g2d.setStroke(stroke);//Trazo
        g2d.setColor(ColorTrazo);//Color de trazo
        g2d.draw(this);//Dibujo la figura

        g2d.setColor(ColorRelleno);
        if (TipoRelleno == 1) //Relleno liso lo coloreo
            g2d.fill(this);
        else if (TipoRelleno == 2) {//Degradado pongo el gradiente y coloreo
            g2d.setPaint(gradiente);
            g2d.fill(this);
        }
    }
    /**
     * Metodo para mover el poligono hasta un punto
     * @param punto valor donde quiero desplazar el poligono
     */
    @Override
    public void moverFiguras(Point2D punto) {
        //Calculo las distancia del primer punto al punto donde me desplazo
        double distanciaX = punto.getX()- VectorPuntos.get(0).getX();
        double distanciaY = punto.getY()- VectorPuntos.get(0).getY();
        //Creo un vector donde almacenar todos los puntos desplazados
        ArrayList<Point2D> VPuntosDesplazados = new ArrayList();
        for ( Point2D i:VectorPuntos)//Para cada punto del vector lo desplazo la distancia
            VPuntosDesplazados.add(new Point2D.Double(i.getX()+ distanciaX, i.getY() + distanciaY));
        setVectorPuntos(VPuntosDesplazados);//Cambio el vector de Puntos originales por el desplazado
        this.reset();//Vuelvo a iniciar el Polygon a vacio
        
        for(Point2D t:VectorPuntos) //Meto a Polygon todos los puntos de mi poligono ya desplazado
            this.addPoint((int)t.getX(), (int)t.getY());
        
        if (TipoRelleno == 2) //Si esta en degradado actualizar el gradiente
            this.actualizarGradiente();       
    }
    /**
     * Metodo para detectar si un punto pertenece al poligono
     * Llamo a contains del Polygon 
     * @param punto punto que quiero ver si pertenece
     * @return booleano si el punto pertenece
     */
    @Override
    public boolean detectarFigura(Point2D punto) {
        return super.contains(punto);
    }
    /**
     * Metodo para actualizar la figura a partir de dos puntos
     * cambiamos el ultimo punto del poligono por el segundo punto
     * @param PrimerPunto primer punto no usado
     * @param SegundoPunto punto que cambiamos por el ultimo del poligono
     */
    @Override
    public void actualizarFigura(Point2D PrimerPunto, Point2D SegundoPunto) {
        this.reset(); //Vaciamos el Polygon
        VectorPuntos.set(VectorPuntos.size()-1, SegundoPunto);//En la ultima posicion del vector ponemos el segundo punto recibido
        for(Point2D i:VectorPuntos)//Recorremos el vector y lo añadimos al Polygon
            this.addPoint((int)i.getX(), (int)i.getY());
        if (TipoRelleno == 2) //Si es degradado actualizamos el gradiente
            this.actualizarGradiente();
    }
    /**
     * Obtener un vertice del poligono que se encuentra en la posición del indice
     * @param indice posición del vertice que queremos
     * @return punto que esta en el indice
     */
    @Override
    public Point2D get1Punto(int indice) {
        if(indice < VectorPuntos.size()) //Si el indice corresponde a un vertice nos lo devuelva 
            return this.VectorPuntos.get(indice);
        return this.VectorPuntos.get(this.VectorPuntos.size()-1);//En otro caso nos de el ultimo
    }
    /**
     * Metodo para cambiar el valor de un vertice que este en la posición del indice
     * @param indice donde queremos modificar el punto
     * @param punto nuevo valor del punto en el vertice 
     */
    @Override
    public void set1Punto(int indice, Point2D punto) {
        if(indice < VectorPuntos.size())
            this.VectorPuntos.set(indice, punto);
    }
    /**
     * Getter de los puntos de control 
     * @return numero de puntos de control que tengo para el poligono
     */
    @Override
    public int getPuntosControl() {
        return this.PuntosControl;
    }
    /**
     * Metodo para crear un gradiente a partir de dos puntos
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
     * Metodo para actualizar el gradiente del poligono
     * Compruebo cual es la coordenada x mayor y menos de todos los puntos y analago para coordenada de y y genero el gradiente
     */
    @Override
    public void actualizarGradiente() {  
        int x_max = 0, x_min = 10000000, y_max=0, y_min=100000000;
        for(int i=0; i<VectorPuntos.size(); i++) { //Busco el maximo el minimo de las dos coordenadas
            if (VectorPuntos.get(i).getX() > x_max) x_max = (int) VectorPuntos.get(i).getX();
            if (VectorPuntos.get(i).getX() < x_min) x_min = (int) VectorPuntos.get(i).getX();
            if (VectorPuntos.get(i).getY() > y_max) y_max = (int) VectorPuntos.get(i).getY();
            if (VectorPuntos.get(i).getY() < y_min) y_min = (int) VectorPuntos.get(i).getY();     
          }
        this.crearGradiente(new Point(x_min, y_max) , new Point(x_max, y_min));
    }
    /**
     * Metodo para dibujar un rectangulo frame sobre el poligono
     * @param g2d Graphics para dibujar la figura
     */
    @Override
    public void dibujarRectanguloFrame(Graphics2D g2d) {
        //Vamos a buscar el punto minimo y maximo de los poligonos
        int x_max = 0, x_min = 10000000, y_max=0, y_min=100000000;
        for(int i=0; i<VectorPuntos.size(); i++) {
            if (VectorPuntos.get(i).getX() > x_max) x_max = (int) VectorPuntos.get(i).getX();
            if (VectorPuntos.get(i).getX() < x_min) x_min = (int) VectorPuntos.get(i).getX();
            if (VectorPuntos.get(i).getY() > y_max) y_max = (int) VectorPuntos.get(i).getY();
            if (VectorPuntos.get(i).getY() < y_min) y_min = (int) VectorPuntos.get(i).getY();   
        }
        double ancho = x_max - x_min;
        double alto = y_max - y_min;
        //Generamos el rectangulo teniendo en cuenta el grosor del trazo
        frame = new Rectangulo(new Rectangle2D.Double(x_min - this.getGrosorTrazo(),y_min - this.getGrosorTrazo(),ancho+ 2*this.getGrosorTrazo(),alto+2*this.getGrosorTrazo()));
        frame.setGrosorTrazo(1);//Grosor 1
        frame.setContinua(false);//Discontinua
        frame.setColorTrazo(Color.RED);//Trazo rojo
        frame.setTipoRelleno(0);//Sin relleno
        frame.setGradoTransparencia(1.0f);//Sin transparencia
        frame.dibujar(g2d); //Dibuje la figura
    }
    /**
     * Metodo para obtener la coordenada x del primer punto del poligono
     * @return coordenada x del primer punto del poligono
     */
    @Override
    public double getX() {
        return this.VectorPuntos.get(0).getX();
    }
    /**
     * Metodo para obtener la coordenada y del primer punto del poligono
     * @return coordenada y del primer punto del poligono
     */
    @Override
    public double getY() {
        return this.VectorPuntos.get(0).getY();
    }
    /**
     * Metodo para actualizar el gradiente a partir de dos puntos
     * @param punto1 punto inicial 
     * @param punto2 punto final
     */
    @Override
    public void actualizarGradiente(Point2D punto1, Point2D punto2) {
        this.crearGradiente(new Point((int)this.getBounds2D().getMinX(), (int) this.getBounds2D().getMaxY()), new Point((int)this.getBounds2D().getMaxX(), (int) this.getBounds2D().getMinY()));
    }
    
}
