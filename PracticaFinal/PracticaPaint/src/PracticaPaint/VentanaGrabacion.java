/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaPaint;

import java.io.File;
import sm.sound.SMRecorder;
import sm.sound.SMSoundRecorder;

/**
 *
 * @author Miguel
 */
public class VentanaGrabacion extends javax.swing.JInternalFrame {
    SMRecorder recorder;
    /**
     * Constructor para una ventana de grabación a partir de una archivo
     * @param f fichero en el que se guardará la grabación
     */
    public VentanaGrabacion(File f) {
        initComponents();
        recorder = new SMSoundRecorder(f);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grabacion = new javax.swing.ButtonGroup();
        BotonGrabar = new javax.swing.JToggleButton();
        BotonStop = new javax.swing.JToggleButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
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
        getContentPane().setLayout(new java.awt.FlowLayout());

        Grabacion.add(BotonGrabar);
        BotonGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/record24x24.png"))); // NOI18N
        BotonGrabar.setMaximumSize(new java.awt.Dimension(48, 48));
        BotonGrabar.setMinimumSize(new java.awt.Dimension(48, 48));
        BotonGrabar.setPreferredSize(new java.awt.Dimension(48, 48));
        BotonGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGrabarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonGrabar);

        Grabacion.add(BotonStop);
        BotonStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/stop24x24.png"))); // NOI18N
        BotonStop.setMaximumSize(new java.awt.Dimension(48, 48));
        BotonStop.setMinimumSize(new java.awt.Dimension(48, 48));
        BotonStop.setPreferredSize(new java.awt.Dimension(48, 48));
        BotonStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonStopActionPerformed(evt);
            }
        });
        getContentPane().add(BotonStop);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGrabarActionPerformed
         if(recorder!=null) recorder.record();
        BotonGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/RecordDisabled_48x48.png")));
        BotonStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/StopNormalRed_48x48.png")));   
    
    }//GEN-LAST:event_BotonGrabarActionPerformed

    private void BotonStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonStopActionPerformed
       if(recorder!=null) recorder.stop();
        BotonGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/RecordPressed_48x48.png")));
        BotonStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/StopDisabled_48x48.png")));
            
    }//GEN-LAST:event_BotonStopActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        if(recorder!=null) recorder.stop();
    }//GEN-LAST:event_formInternalFrameClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BotonGrabar;
    private javax.swing.JToggleButton BotonStop;
    private javax.swing.ButtonGroup Grabacion;
    // End of variables declaration//GEN-END:variables
}
