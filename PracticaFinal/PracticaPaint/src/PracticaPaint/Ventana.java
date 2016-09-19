/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaPaint;

import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Miguel
 */
public class Ventana {
    
    public Ventana(){
        
    }
    /**
     * Metodo para que el usuario nos de el ancho y alto de la ventana
     * @return ancho y alto de la ventana
     */
    public static ArrayList<Integer> showVentanaTamanio() {
        JTextField ancho = new JTextField(5);
        JTextField alto = new JTextField(5);

        JPanel myPanel = new JPanel();
        ancho.setText("640");
        myPanel.add(new JLabel("Ancho:"));
        myPanel.add(ancho);
        alto.setText("480");
        myPanel.add(Box.createHorizontalStrut(15));
        myPanel.add(new JLabel("Alto:"));
        myPanel.add(alto);
        boolean ValorCorrecto = false;
        int result = JOptionPane.showConfirmDialog(null, myPanel, "Nuevo Lienzo", JOptionPane.OK_CANCEL_OPTION);
        while (result == JOptionPane.OK_OPTION && !ValorCorrecto) {
            try {
                if (ancho.getText().equals("") || alto.getText().equals("")){                    
                    JOptionPane.showMessageDialog(null, "Introduce algun valor");
                    result = JOptionPane.showConfirmDialog(null, myPanel, "Nuevo Lienzo", JOptionPane.OK_CANCEL_OPTION);
                }else if (Integer.parseInt(ancho.getText()) <= 100 || Integer.parseInt(alto.getText()) <= 100) {
                    JOptionPane.showMessageDialog(null, "Introduce valores mayores que 100");
                    result = JOptionPane.showConfirmDialog(null, myPanel, "Nuevo Lienzo", JOptionPane.OK_CANCEL_OPTION);
                }else                  
                    ValorCorrecto = true;
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error: Introduzca un número");
                result = JOptionPane.showConfirmDialog(null, myPanel, "Introduzca el ancho y el alto del lienzo", JOptionPane.OK_CANCEL_OPTION);
            }
        }
        if (result == JOptionPane.OK_OPTION) {
            ArrayList<Integer> al = new ArrayList();
            al.add(Integer.parseInt(ancho.getText()));
            al.add(Integer.parseInt(alto.getText()));
            return al;
        }
        return null;
    }
    
}
