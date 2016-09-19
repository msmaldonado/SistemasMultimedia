/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.msm.graficos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.ByteLookupTable;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.awt.image.LookupOp;
import java.awt.image.LookupTable;
import java.awt.image.RescaleOp;
import static java.lang.Math.abs;
import static java.lang.Math.sin;
import sm.image.*;
import sm.msm.Figura.Figura;
import sm.msm.imagen.MsmOp;
import sm.msm.imagen.SepiaOp;
import sm.msm.imagen.UmbralizacionOp;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
/**
 *
 * @author Miguel
 */
public class Lienzo2DImagen extends Lienzo2D {

    BufferedImage image;
    BufferedImage imageFondo;
    public String coordenadas = "(0,0)";
    
    private boolean cambiarBrillo = false ;
    private boolean rotar = false ;
    private boolean umbralizar = false;
    /**
     * Constructor del Lienzo
     */
    public Lienzo2DImagen() {
        super();
        this.image = null;
        initComponents();

    }
    /**
     * Constructor del Lienzo con parametros
     * @param img el bufferedImage que tiene que tiene que cargar
     */
    public Lienzo2DImagen(BufferedImage img) {
        super();
        this.image = img;
        initComponents();

    }
    /**
     * Gett de las coordenadas
     * @return string de las coordenadas
     */
    public String getCoordenadas() {
        return coordenadas;
    }
    /**
     * Set de las coordenadas 
     * @param coordenadas neuvas coordenadas
     */
    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }
    /**
     * Metodo PaintComponent
     * @param g el graphic
     */
    @Override
    public void paintComponent(Graphics g){
       super.paintComponent(g);   
       super.setShape(new Rectangle(0,0,image.getWidth(),image.getHeight()));
        g.drawImage(image,0,0,this);
    }
    /**
     * Getter de la imagen 
     * @param drawVector el booleano de si hay figuras
     * @return la imagen
     */
    public BufferedImage getImage(boolean drawVector) {
            Graphics2D g2d = (Graphics2D) image.getGraphics();
            if (drawVector){
                for(Figura s:TodasFiguras)
                    s.dibujar(g2d);
            }
        return image;
    }
    /**
     * set de la imagen a partir de otra
     * @param imagen otra imagen
     */
    public void setImage(BufferedImage imagen) {
        this.image = imagen;
        if (imagen!=null){
            setPreferredSize(new Dimension(imagen.getWidth(),imagen.getHeight()));
        }
    }
    /**
     * Cambiar la imagen de atras
     * @param imagen nueva imgaen
     */
    public void setImageFondo(BufferedImage imagen) {
        this.imageFondo = imagen;
        
    }
    /**
     * Metodo para el filtro del brillo
     * @param brilloNuevo nuevo valor del brillo
     */
    public void brillo(int brilloNuevo){
        if (!cambiarBrillo){
           setImageFondo(this.image);
            cambiarBrillo=true;
            rotar=false;
        }
         BufferedImage imageAux= imageFondo;
         if(imageAux != null){
             try{
                  RescaleOp rop;
                 if (imageAux.getColorModel().hasAlpha() ){
                        float escala[] = {1.0f,1.0f,1.0f,1.0f};
                        float muevo[] = {brilloNuevo,brilloNuevo,brilloNuevo,0.0f};
                        rop = new RescaleOp(escala,muevo, null);                        
                 }else{
                        rop = new RescaleOp(1.0f, brilloNuevo, null);
                 }
                 this.setImage(rop.filter(imageAux, null));
                 this.repaint();
             }catch(IllegalArgumentException e){
                System.err.println("Error Brillo");
            }  
         } 
    }
    /**
     * Metodo para aplicar un filtro del checkbox
     * @param filtroAplicar el filtro que queremos aplicar
     */
    public void Filtro(int filtroAplicar){
         BufferedImage imageAux= image;
         Kernel kpro = KernelProducer.createKernel(filtroAplicar);
         ConvolveOp cop = new ConvolveOp(kpro,ConvolveOp.EDGE_NO_OP,null);//Hago la convolución con el filtro que le pasamos
         if(imageAux != null){
             try{                 
                BufferedImage imageDest = cop.filter(imageAux, null);
                this.setImage(imageDest);
                this.setImageFondo(imageDest);
                this.repaint();
            }catch(IllegalArgumentException e){
                System.err.println("Filtro");
            }
         } 
    }
    /**
     * Metodo para aplicar un contrate
     * @param contrasteAplicar nuevo contraste
     */
    public void Contraste(int contrasteAplicar){//Para cambiar el brillo
         BufferedImage imageAux= image;
         
         if(imageAux != null){
             try{
                LookupTable lookup = LookupTableProducer.createLookupTable(contrasteAplicar);
                LookupOp lop = new LookupOp(lookup, null);
                lop.filter( imageAux , imageAux);
                this.setImageFondo(imageAux);
                this.setImage(imageAux);
                repaint();  
            }catch(IllegalArgumentException e){
                System.err.println("Contraste");
            }  
         }
    }
    
    /**
     * Funcion ayuda para hacer el filtro del seno
     * @param w angulo del seno
     * @return lookuotable para aplicar en funcion seno
     */
    public static LookupTable seno(double w){
        double K = 255.0;
        byte look[] = new byte[256];
        for (int l=0; l<256; l++)
            look[l] = (byte)(K*abs(sin(w*(2*Math.PI*l/360.0))));
        return new ByteLookupTable(0,look);
    }
   /**
    * metodo para el filtro del seno
    * @param w angulo omega
    */
     public void vSeno(double w){//Aplica el seno
         BufferedImage imageAux= image;        
         if(imageAux != null){
             try{
                LookupTable look = seno(w);
                LookupOp lop = new LookupOp(look, null);
                lop.filter( imageAux , imageAux);
                this.setImageFondo(imageAux); 
                repaint();
            }catch(IllegalArgumentException e){
                System.err.println("Seno");
            }            
         } 
    }
    /**
     * Metodo para rotar la imagen un cierto angulo
     * @param rotacion angulo de rotacion
     * @param vVeces si se rota varias veces
     */ 
    public void rotar(int rotacion,boolean vVeces){
         if (!rotar){
            setImageFondo(this.image);
            cambiarBrillo=false;
            rotar=true;
            umbralizar=false;
         }
         BufferedImage imageAux= this.imageFondo;
         if(imageAux != null){
             try{
                 double r = Math.toRadians(rotacion);//metemos la rotación que queremos
                 Point p = new Point(imageAux.getWidth()/2, imageAux.getHeight()/2);
                 AffineTransform at = AffineTransform.getRotateInstance(r,p.x,p.y);
                 AffineTransformOp atop;
                 atop = new AffineTransformOp(at,AffineTransformOp.TYPE_BILINEAR);
                 BufferedImage imgdest = atop.filter(imageAux, null);
                 if(vVeces)//Para cuando pulsemos botón nos deje varias veces rotar
                     this.setImageFondo(imgdest);                
                 this.setImage(imgdest);
                 repaint();
            }catch(IllegalArgumentException e){
                System.err.println("Rotar");
            }            
         }       
    }
    /**
     * Metodo para aplicar el filtro de Sepia que se encuentra en SepiaOp
     */
    public void sepia(){
         BufferedImage imageAux= image;
         SepiaOp operacion = new SepiaOp();
         if(imageAux != null){
             try{
                SepiaOp sop = new SepiaOp();
                sop.filter( imageAux , imageAux);
                setImageFondo(imageAux);
                repaint();
            }catch(IllegalArgumentException e){
                System.err.println("Sepia");
            }            
         }      
    }
    /**
     * Metodo para escalar una imagen 
     * @param cx amplitud para la coordenada x
     * @param cy amplitud para la coordenada y
     */  
    public void Escalado(float cx, float cy){
          BufferedImage imageAux= image;
          if(imageAux != null){
             try{
                AffineTransform at = AffineTransform.getScaleInstance(cx, cy);
                AffineTransformOp atop = new AffineTransformOp(at,AffineTransformOp.TYPE_BILINEAR);
                BufferedImage imagedest = atop.filter(imageAux, null);
                this.setImage(imagedest);
                this.setImageFondo(imagedest);
                repaint();
             }
             catch(IllegalArgumentException e){
                System.err.println("Error escalado");
            }
          }   
                   
          
     }
    /**
     * Metodo para umbralizar la imagen bajo un umbral, filtro UmbralizacionOp
     * @param umbral valor sobre el que realizamos el umrbal
     */
    public void Umbralizar(int umbral){
          if (!umbralizar){
            setImageFondo(this.image);
            umbralizar=true;
            rotar=false;
            cambiarBrillo=false;
        }
        BufferedImage img = this.imageFondo;
        if(img!=null){
            try{
                UmbralizacionOp uop = new UmbralizacionOp(umbral);
                this.setImage(uop.filter(img, null));
                repaint();
            } catch(Exception e){
                System.err.println("Error umbralizar");
            }
        }
      }
      /**
       * Metodo para realizar un filtro propio implementeado en MsmOp
       */
      public void msm(){
        BufferedImage imgSource = image;
        if(imgSource!=null){
            try{
                MsmOp sop = new MsmOp();
                sop.filter( imgSource , imgSource);
                setImageFondo(imgSource);
                repaint();
            } catch(Exception e){
                System.err.println("Filtro propio");
            }
        }
    }
    /**
     * Metodo para realizar el filtro de negativo sobre una imagen
     */ 
    public void negativo(){
        Color color;
        int r,g,b;
        for(int i=0;i<image.getWidth();i++){
          for(int j=0;j<image.getHeight();j++){
                //se obtiene el color del pixel
                color = new Color(image.getRGB(i, j));
                //se extraen los valores RGB
                r = color.getRed();
                g = color.getGreen();
                b = color.getBlue();
                //se coloca en la nueva imagen con los valores invertidos
                image.setRGB(i, j, new Color(255-r,255-g,255-b).getRGB());                                                                    
          }
        }        
    }
    /**
     * metodo para realizar el escalado de grises sobre la imagen
     */  
    public void escaladegrises(){
      int width = image.getWidth();
      int height = image.getHeight();
       for(int i=0; i<height; i++){
         for(int j=0; j<width; j++){
           Color c = new Color(image.getRGB(j, i));
           int red = (int)(c.getRed() * 0.21);
           int green = (int)(c.getGreen() * 0.72);
           int blue = (int)(c.getBlue() *0.07);
           int sum = red + green + blue;
           Color newColor = new Color(sum,sum,sum);
           image.setRGB(j,i,newColor.getRGB());
         }
      }
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(204, 204, 204));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
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

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
         Point pEvt = evt.getPoint();
        if (image!= null && image.getHeight()<pEvt.y && image.getWidth()<pEvt.x){
            Color c = new Color(image.getRGB(pEvt.x, pEvt.y), true);
            this.setCoordenadas("("+pEvt.x+","+pEvt.y+")  RGB -> ("+c.getRed()+","+c.getGreen()+","+c.getBlue()+")");
        }
        else
            this.setCoordenadas("("+pEvt.x+","+pEvt.y+")");
        
        if(this.editar)
            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        else
            setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
    }//GEN-LAST:event_formMouseMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
