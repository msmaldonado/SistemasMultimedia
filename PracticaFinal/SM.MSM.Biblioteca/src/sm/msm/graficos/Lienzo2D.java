/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.msm.graficos;


import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import sm.msm.Figura.*;


/**
 *
 * @author Miguel
 */
public class Lienzo2D extends javax.swing.JPanel {

   private Point2D punto ;
    protected ArrayList<Figura> TodasFiguras;
    private Figura figuraActual;
    private Point2D PuntoAyuda ;
    
    protected int tipoActual;
    protected boolean editar;
    
    protected boolean continua;
    protected Color colorTrazo;
    protected float grosorTrazo;
    
    protected int tipoRelleno;
    protected Color colorRelleno;
    protected Color colorGradiente;
    protected int tipoGradiente;
    
    protected boolean alisar;
    protected float transparencia ;
    
    protected int MaxPControl = 0;
    protected int ControlPuntos = 0;
    
   private Shape shape;
    
   
   /**
    * Constructor del Lienzo2D que inicializa todos los parametros por defecto
    */
    public Lienzo2D(){
        this.transparencia = 1.0f;
        this.alisar = false;
        this.punto = new Point (0,0);
        this.PuntoAyuda = new Point (0,0);
        this.TodasFiguras = new ArrayList ();
        this.figuraActual =null;
        

        this.tipoActual = 0 ;//Punto
        this.editar = false;
        
        this.continua = true;
        this.colorTrazo = Color.BLACK ;
        this.grosorTrazo = 1;
        
        
        this.tipoRelleno = 0;//Sin relleno
        this.colorRelleno = Color.BLACK;
        this.colorGradiente = Color.MAGENTA;
        this.tipoGradiente = 0;//Gradiente horizontal

        initComponents();
    }
    /**
     * Getter el punto
     * @return punto
     */
    public Point2D getPunto() {
        return punto;
    }
    /**
     * SetPunto 
     * @param punto nuevo valor del punto
     */
    public void setPunto(Point2D punto) {
        this.punto = punto;
    }
    /**
     * Devuelve el vector con todas las figuras del Lienzo
     * @return todasFiguras
     */
    public ArrayList<Figura> getTodasFiguras() {
        return TodasFiguras;
    }
    /**
     * set Vector de todas las figuras
     * @param TodasFiguras nuevo vector con todas las figuras
     */
    public void setvShape(ArrayList<Figura> TodasFiguras) {
        this.TodasFiguras = TodasFiguras;
    }
    /**
     * get Figura actual
     * @return figura actual
     */
    public Figura getFiguraActual() {
        return figuraActual;
    }
    /**
     * Set la figura actual 
     * @param figuraActual nueva figura en la actual
     */
    public void setFiguraActual(Figura figuraActual) {
        this.figuraActual = figuraActual;
    }
    /**
     * Get punto de ayuda
     * @return punto de ayuda
     */
    public Point2D getPuntoAyuda() {
        return PuntoAyuda;
    }
    /**
     * Set del punto de ayuda
     * @param PuntoAyuda punto de ayuda
     */
    public void setPuntoAyuda(Point2D PuntoAyuda) {
        this.PuntoAyuda = PuntoAyuda;
    }
    /**
     * Get del tipoActual
     * @return TipoActual
     */
    public int getTipoActual() {
        return tipoActual;
    }
    /**
     * setter del tipo actual
     * @param tipoActual el tipo de figura
     */
    public void setTipoActual(int tipoActual) {
        this.tipoActual = tipoActual;
    }
    /**
     * get edicion
     * @return booleano si editamos
     */
    public boolean getEditar() {
        return editar;
    }
    /**
     * set del boleeano de edicion
     * @param editar valor de edicion
     */
    public void setEditar(boolean editar) {
        this.editar = editar;
    }
    /**
     * get Continua
     * @return si es trazo continuo
     */
    public boolean getContinua() {
        return continua;
    }
    /**
     * Setter del trazo 
     * @param continua nuevo valor del trazo
     */
    public void setContinua(boolean continua) {
        this.continua = continua;
    }
    /**
     * get Color del trazo
     * @return color del trazo
     */
    public Color getColorTrazo() {
        return colorTrazo;
    }
    /**
     * Set del color del trazo
     * @param colorTrazo nuevo valor del color del trazo
     */
    public void setColorTrazo(Color colorTrazo) {
        this.colorTrazo = colorTrazo;
    }
    /**
     * get del grosor del trazo
     * @return grosro del trazo
     */
    public float getGrosorTrazo() {
        return grosorTrazo;
    }
    /**
     * Setter del grosor del trazo
     * @param grosorTrazo nuevo grosor de trazo
     */
    public void setGrosorTrazo(float grosorTrazo) {
        this.grosorTrazo = grosorTrazo;
    }
    /**
     * getter del tipo de relleno
     * @return tipo de relleno
     */
    public int getTipoRelleno() {
        return tipoRelleno;
    }
    /**
     * setter del tipo de relleno
     * @param tipoRelleno nuevo tipo de relleno
     */
    public void setTipoRelleno(int tipoRelleno) {
        this.tipoRelleno = tipoRelleno;
    }
    /**
     * Get el color de relleno
     * @return colorRelleno
     */
    public Color getColorRelleno() {
        return colorRelleno;
    }
    /**
     * setColorRelleno de la figura
     * @param colorRelleno nuevo color de relleno
     */
    public void setColorRelleno(Color colorRelleno) {
        this.colorRelleno = colorRelleno;
    }
    /**
     * get color del gradiente
     * @return color del gradiente
     */
    public Color getColorGradiente() {
        return colorGradiente;
    }
    /**
     * Setter del color de gradiente
     * @param colorGradiente neuvo color del gradiente
     */
    public void setColorGradiente(Color colorGradiente) {
        this.colorGradiente = colorGradiente;
    }
    /**
     * get del tipo de gradiente
     * @return tipo de gradiente
     */
    public int getTipoGradiente() {
        return tipoGradiente;
    }
    /**
     * set del tipo del gradiente
     * @param tipoGradiente tipo de gradiente
     */
    public void setTipoGradiente(int tipoGradiente) {
        this.tipoGradiente = tipoGradiente;
    }
    /**
     * get alisado
     * @return alisado
     */
    public boolean getAlisar() {
        return alisar;
    }
    /**
     * set alisado
     * @param alisar nuevo valor del alisado
     */
    public void setAlisar(boolean alisar) {
        this.alisar = alisar;
    }
    /**
     * get Grado de transparencia de la figura
     * @return grado de transparencia
     */
    public float getTransparencia() {
        return transparencia;
    }
    /**
     * Set del grado de transparencia
     * @param transparencia nuevo valor de las transparencia
     */
    public void setTransparencia(float transparencia) {
        this.transparencia = transparencia;
    }
    /**
     * get Maximo Puntos de control
     * @return MaxPuntosControl
     */
    public int getMaxPControl() {
        return MaxPControl;
    }
    /**
     * Set maximo de puntos de control
     * @param MaxPControl nuevo valor de cota de puntos de control
     */
    public void setMaxPControl(int MaxPControl) {
        this.MaxPControl = MaxPControl;
    }
    /**
     * get  punto de control
     * @return ControlPuntos
     */
    public int getControlPuntos() {
        return ControlPuntos;
    }
    /**
     * Set punto de control
     * @param ControlPuntos nuevo punto de control
     */
    public void setControlPuntos(int ControlPuntos) {
        this.ControlPuntos = ControlPuntos;
    }

    /**
     * get mi shape
     * @return shape
     */
    public Shape getShape() {
        return shape;
    }
    /**
     * setter shape
     * @param shape neuva figura
     */
    public void setShape(Shape shape) {
        this.shape = shape;
    }
    
    /**
     * Cambiar el relleno de la figura
     * @param tipoRelleno nuevo tipo de relleno
     * @param colorRelleno nuevo color de relleno
     * @param tipoDegradado nuevo tipo de gradiente
     * @param colorGradiente nuevo color de gradiente
     */
     public void actualizaRellenoFigura(int tipoRelleno,Color colorRelleno,  int tipoDegradado,Color colorGradiente){
     if (figuraActual != null){
         figuraActual.setTipoRelleno(tipoRelleno);
         figuraActual.setColorRelleno(colorRelleno);
         if ( tipoRelleno == 2){//Si es degradado
                figuraActual.setColorGradiente(colorGradiente);
                figuraActual.setTipoGradiente(tipoGradiente);
         }
     }
     this.repaint();
     }
     
     
     public void actualizaTrazoFigura(boolean continua, float grosorTrazo,Color color){
         if (figuraActual != null){
             figuraActual.setContinua(continua);
             figuraActual.setGrosorTrazo(grosorTrazo);
             figuraActual.setColorTrazo(color);
         }
         this.repaint();
     }
     
     /**
      * Cambia el color del trazo
      * @param color neuvo color del trazo
      */
     public void actualizaColorTrazoFigura(Color color){
         if (figuraActual !=null)
             figuraActual.setColorTrazo(color);     
         this.repaint();             
     }
     /**
      * Cambiar grosor del trazo
      * @param grosorTrazo nuevo grosor del trazo
      */
     public void actualizaGrosorTrazoFigura(float grosorTrazo){
         if(figuraActual != null)
             figuraActual.setGrosorTrazo(grosorTrazo);         
         this.repaint();
     }
     /**
      * Cambiar el tipo de trazo
      * @param continua si el trazo es continuo
      */
     public void actualizaTipoTrazoFigura(boolean continua){
         if (figuraActual != null)
             figuraActual.setContinua(continua);         
         this.repaint();
     }
     /**
      * Cambiar la transparencia
      * @param transparencia nuevo valor de la transparencia
      */
     public void actualizaTransparenciaFigura(float transparencia){
         if (figuraActual != null)
             figuraActual.setGradoTransparencia(transparencia);
         this.repaint();
     }
     /**
      * CambiarAlisado
      * @param alisado si la figura esta alisada
      */
     public void actualizaAlisarFigura(boolean alisado){
         if (figuraActual != null)
             figuraActual.setAlisado(alisado);
         this.repaint();
     }
    
    
    /**
     * metodo para pintar en el lienzo todas las figuras con sus atributos correctanmente
     * @param g el graphics
     */
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        if (getShape() != null)
            g2d.clip(shape);        
        
        for ( Figura s:TodasFiguras)//Recorro las figuras y las dibujo
            s.dibujar(g2d);        
        if (getEditar() && figuraActual != null)
            figuraActual.dibujarRectanguloFrame(g2d);        
    }
    /**
     * Nos devulve la figura que contenga al punto
     * @param punto coordenadas que pertenecen a la figura
     * @return la figura a la que pertece el punto
     */
    private Figura getFiguraSeleccionada(Point2D punto){ 
        Figura figura = null ;
        for ( Figura s:TodasFiguras)//Recorro todas las figuras 
            if(s.detectarFigura(punto))//Compruebo si pertenece el punto
                figura = s;  //Me quedo con la ultima que lo contenga del vector, que es la ultima dibujada     
        return figura;
    }
   
    /**
     * Metodo para crear una figura teniendo en cuenta todos sus atributos.
     * Primero vemos que tipo de figura es y a continuación vemos los atributos para asignarselos a la figura
     */
    public void CrearFigura(){
        //Vamos a ver el tipo de figura
        if (tipoActual == 0)//Si es un punto
            figuraActual = new Punto(punto);
        else if (tipoActual == 1)//linea
            figuraActual = new LineaRecta(punto,punto);
        else if (tipoActual == 2)//Rectangulo
            figuraActual = new Rectangulo(punto,punto);
        else if (tipoActual == 3)//Elipse
            figuraActual = new Elipse(punto,punto);
        else if (tipoActual ==4)//La curva con punto de control
            figuraActual = new CurvaPControl(punto,punto,punto);
        else//Poligono
            figuraActual = new Poligono(punto,punto);
        
        //Realizamos el relleno
        figuraActual.setTipoRelleno(tipoRelleno);
        if ( tipoRelleno == 1)//Liso
            figuraActual.setColorRelleno(colorRelleno);
        else if (tipoRelleno == 2){//Degradado
            figuraActual.setColorRelleno(colorRelleno);
            figuraActual.setColorGradiente(colorGradiente);
            GradientPaint gradiente = new GradientPaint(punto, colorRelleno, punto, colorGradiente);
            figuraActual.setGradiente(gradiente);
        }        
        //Trabajamos con el trazo
        figuraActual.setContinua(continua);
        figuraActual.setGrosorTrazo(grosorTrazo);
        figuraActual.setColorTrazo(colorTrazo);  
        //Transparencia
        figuraActual.setGradoTransparencia(transparencia);        
        MaxPControl = figuraActual.getPuntosControl();
        ControlPuntos = 0;
        TodasFiguras.add(figuraActual);//Añado al vector de figuras
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(204, 204, 204));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
/**
 * Metodo para pressed del mouse,
 * si no estamos editando crea una nueva figura
 * sino mira para seleccionarla
 * @param evt pressed del mouse
 */
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        punto = evt.getPoint();//Almacenos donde realizo el click
        if(!editar){
            if (ControlPuntos == 0){
                CrearFigura();
            }else {
                if (figuraActual != null){
                    if(figuraActual instanceof CurvaPControl)
                        figuraActual.set1Punto(ControlPuntos-1, punto);
                    if(figuraActual instanceof Poligono){
                        Poligono poli = (Poligono) figuraActual ;
                        poli.ponerPuntos(punto);                        
                    }
                }                     
            }                
        }
        else {
            figuraActual = getFiguraSeleccionada(punto);
            if ( figuraActual != null)
                PuntoAyuda = figuraActual.get1Punto(0);
        }
        this.repaint();
            

    }//GEN-LAST:event_formMousePressed
/**
 * 
 * @param evt  Released del mouse
 */
    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        formMouseDragged(evt);
        //Si la curva de control está activada y se ha pintado la línea pero  el punto de control NO.
        if (MaxPControl != 0) {
            if (ControlPuntos++ == MaxPControl) {
                ControlPuntos = 0;
            }
        }
        this.repaint();
    }//GEN-LAST:event_formMouseReleased
/**
 * 
 * @param evt dragged del mouse
 */
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Point pEvt = evt.getPoint();
        if (!editar){
            if (ControlPuntos == 0) 
                figuraActual.actualizarFigura(punto, pEvt);
            else {
                if(figuraActual instanceof CurvaPControl)
                    figuraActual.set1Punto(ControlPuntos - 1, pEvt);
                if(figuraActual instanceof Poligono)
                    figuraActual.actualizarFigura(punto, pEvt);
            }
        }
        else {
            if(figuraActual != null){
                figuraActual.moverFiguras(new Point2D.Double(pEvt.x - (punto.getX() - PuntoAyuda.getX()), pEvt.y - (punto.getY() - PuntoAyuda.getY())));
                setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            }
        }
        this.repaint();
    }//GEN-LAST:event_formMouseDragged
    /**
     * clicked del muose, si hay dos click paramos el control de puntos
     * @param evt clicked del mouse
     */
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
       if (evt.getClickCount() == 2) 
            ControlPuntos = 0;
    }//GEN-LAST:event_formMouseClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
