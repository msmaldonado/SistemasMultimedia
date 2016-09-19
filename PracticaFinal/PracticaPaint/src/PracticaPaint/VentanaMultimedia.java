/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaPaint;

import java.awt.Component;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.media.Buffer;
import javax.media.Manager;
import javax.media.MediaLocator;
import javax.media.Player;
import javax.media.control.FrameGrabbingControl;
import javax.media.format.VideoFormat;
import javax.media.util.BufferToImage;


/**
 *
 * @author Miguel
 */
public class VentanaMultimedia extends javax.swing.JInternalFrame {
    
    private Player player = null;

    /**
     * Creates new form VentanaInternaJMFPlayer
     */
    public VentanaMultimedia() {
        initComponents();
    }
    /**
     * ventana multimedia para reproducir archivos multimedia
     * @param f archivo
     */
    private VentanaMultimedia(File f){
        initComponents();
        this.setTitle(f.getName());
        MediaLocator ml = new MediaLocator("file:///" + f.getAbsolutePath());
        
        try{
            player = Manager.createRealizedPlayer(ml);            
            Component vc = player.getVisualComponent();
            if(vc!= null)
                add(vc,java.awt.BorderLayout.CENTER);            
            Component cpc = player.getControlPanelComponent();
            if(cpc!=null)
                add(cpc, java.awt.BorderLayout.SOUTH);            
            this.pack();
        }catch (Exception e){
            System.err.println("VentanaMultimedia: "+e);
            player = null;
            
        }
        
    }

    /**
     * get de la instancia de la ventana multimedia
     * @param f archivo para reproducir
     * @return la ventana multimedia
     */  
    public static VentanaMultimedia getInstance(File f){
        VentanaMultimedia v =new VentanaMultimedia(f);
        return v;
    }
    /**
     * Metodo para reproducir
     */
    public void play(){
        if ( player != null){
            try{
                player.start();
            } catch (Exception e) {
                System.err.println("VentanaMultimedia: "+e);
            }
        }
    }
    /**
     * Metodo para cerrar
     */
    public void close(){
        if (player != null){
            try{
                player.stop();
            }catch (Exception e) {
                System.err.println("VentanaMultimedia: "+e);
            }
        }
    }
    
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        this.close();
    }//GEN-LAST:event_formInternalFrameClosing

    
    public BufferedImage getFrame(){
        FrameGrabbingControl fgc;
        String claseCtr = "javax.media.control.FrameGrabbingControl";
        fgc = (FrameGrabbingControl)player.getControl(claseCtr);
        Buffer bufferFrame = fgc.grabFrame();
        BufferToImage bti;
        bti = new BufferToImage((VideoFormat)bufferFrame.getFormat());
        Image img = bti.createImage(bufferFrame);
        return (BufferedImage) img;
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
