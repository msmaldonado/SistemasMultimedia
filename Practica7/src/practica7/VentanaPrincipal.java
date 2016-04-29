/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica7;

import java.awt.Color;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author Miguel
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        //this.BotonLapiz.setSelected(true);
        this.setSize(1900,1000);
        VentanaInterna vi = new VentanaInterna(this);
        EscritorioDibujo.add(vi);
        vi.setVisible(true);
    }
    
    private final static int PUNTO = 1;
    private final static int LINEA = 2;
    private final static int RECTANGULO = 3;
    private final static int OVALO = 4;
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupHerramientas = new javax.swing.ButtonGroup();
        LabelBarraEstado = new javax.swing.JLabel();
        Panel = new javax.swing.JPanel();
        BarraFormas = new javax.swing.JToolBar();
        BotonLapiz = new javax.swing.JToggleButton();
        BotonLinea = new javax.swing.JToggleButton();
        BotonRectangulo = new javax.swing.JToggleButton();
        BotonOvalo = new javax.swing.JToggleButton();
        BarraAtributos = new javax.swing.JToolBar();
        PanelColores = new javax.swing.JPanel();
        BotonNegro = new javax.swing.JButton();
        BotonRojo = new javax.swing.JButton();
        BotonAzul = new javax.swing.JButton();
        BotonBlanco = new javax.swing.JButton();
        BotonAmarillo = new javax.swing.JButton();
        BotonVerde = new javax.swing.JButton();
        PanelGrosor = new javax.swing.JPanel();
        SpinnerGrosor = new javax.swing.JSpinner();
        PanelCheckBox = new javax.swing.JPanel();
        CheckBoxRelleno = new javax.swing.JCheckBox();
        CheckBoxTransparencia = new javax.swing.JCheckBox();
        CheckBoxAlisar = new javax.swing.JCheckBox();
        CheckBoxEditar = new javax.swing.JCheckBox();
        EscritorioDibujo = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        BotonArchivo = new javax.swing.JMenu();
        BotonNuevo = new javax.swing.JMenuItem();
        BotonAbrir = new javax.swing.JMenuItem();
        BotonGuardar = new javax.swing.JMenuItem();
        BotonEdicion = new javax.swing.JMenu();
        CheckBoxBarraEstado = new javax.swing.JCheckBoxMenuItem();
        CheckBoxBarraFormas = new javax.swing.JCheckBoxMenuItem();
        CheckBoxMenuBarraAtributos = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelBarraEstado.setText("Barra de Estado");
        getContentPane().add(LabelBarraEstado, java.awt.BorderLayout.PAGE_END);

        Panel.setLayout(new java.awt.BorderLayout());

        BarraFormas.setRollover(true);

        GroupHerramientas.add(BotonLapiz);
        BotonLapiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Lapiz.gif"))); // NOI18N
        BotonLapiz.setFocusable(false);
        BotonLapiz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonLapiz.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonLapiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLapizActionPerformed(evt);
            }
        });
        BarraFormas.add(BotonLapiz);

        GroupHerramientas.add(BotonLinea);
        BotonLinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Linea.gif"))); // NOI18N
        BotonLinea.setFocusable(false);
        BotonLinea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonLinea.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLineaActionPerformed(evt);
            }
        });
        BarraFormas.add(BotonLinea);

        GroupHerramientas.add(BotonRectangulo);
        BotonRectangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Rectangulo.gif"))); // NOI18N
        BotonRectangulo.setFocusable(false);
        BotonRectangulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonRectangulo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRectanguloActionPerformed(evt);
            }
        });
        BarraFormas.add(BotonRectangulo);

        GroupHerramientas.add(BotonOvalo);
        BotonOvalo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Ovalo.gif"))); // NOI18N
        BotonOvalo.setFocusable(false);
        BotonOvalo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonOvalo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonOvalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonOvaloActionPerformed(evt);
            }
        });
        BarraFormas.add(BotonOvalo);

        Panel.add(BarraFormas, java.awt.BorderLayout.PAGE_START);

        BarraAtributos.setRollover(true);

        PanelColores.setBorder(javax.swing.BorderFactory.createTitledBorder("Color"));
        PanelColores.setLayout(new java.awt.GridLayout(2, 3));

        BotonNegro.setBackground(new java.awt.Color(0, 0, 0));
        BotonNegro.setPreferredSize(new java.awt.Dimension(45, 35));
        BotonNegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNegroActionPerformed(evt);
            }
        });
        PanelColores.add(BotonNegro);

        BotonRojo.setBackground(new java.awt.Color(255, 0, 0));
        BotonRojo.setPreferredSize(new java.awt.Dimension(45, 35));
        BotonRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRojoActionPerformed(evt);
            }
        });
        PanelColores.add(BotonRojo);

        BotonAzul.setBackground(new java.awt.Color(0, 0, 255));
        BotonAzul.setPreferredSize(new java.awt.Dimension(45, 35));
        BotonAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAzulActionPerformed(evt);
            }
        });
        PanelColores.add(BotonAzul);

        BotonBlanco.setBackground(new java.awt.Color(255, 255, 255));
        BotonBlanco.setPreferredSize(new java.awt.Dimension(45, 35));
        BotonBlanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBlancoActionPerformed(evt);
            }
        });
        PanelColores.add(BotonBlanco);

        BotonAmarillo.setBackground(new java.awt.Color(255, 255, 0));
        BotonAmarillo.setPreferredSize(new java.awt.Dimension(45, 35));
        BotonAmarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAmarilloActionPerformed(evt);
            }
        });
        PanelColores.add(BotonAmarillo);

        BotonVerde.setBackground(new java.awt.Color(0, 204, 0));
        BotonVerde.setForeground(new java.awt.Color(0, 204, 0));
        BotonVerde.setPreferredSize(new java.awt.Dimension(45, 35));
        BotonVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVerdeActionPerformed(evt);
            }
        });
        PanelColores.add(BotonVerde);

        BarraAtributos.add(PanelColores);

        PanelGrosor.setBorder(javax.swing.BorderFactory.createTitledBorder("Grosor"));
        PanelGrosor.setLayout(new java.awt.GridLayout(2, 1));

        SpinnerGrosor.setModel(new javax.swing.SpinnerNumberModel(1.0f, 1.0f, null, 1.0f));
        SpinnerGrosor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpinnerGrosorStateChanged(evt);
            }
        });
        PanelGrosor.add(SpinnerGrosor);

        BarraAtributos.add(PanelGrosor);

        PanelCheckBox.setBorder(javax.swing.BorderFactory.createTitledBorder("  "));
        PanelCheckBox.setLayout(new java.awt.GridLayout(2, 2));

        CheckBoxRelleno.setText("Relleno");
        CheckBoxRelleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxRellenoActionPerformed(evt);
            }
        });
        PanelCheckBox.add(CheckBoxRelleno);

        CheckBoxTransparencia.setText("Trasparencia");
        CheckBoxTransparencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxTransparenciaActionPerformed(evt);
            }
        });
        PanelCheckBox.add(CheckBoxTransparencia);

        CheckBoxAlisar.setText("Alisar");
        CheckBoxAlisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxAlisarActionPerformed(evt);
            }
        });
        PanelCheckBox.add(CheckBoxAlisar);

        CheckBoxEditar.setText("Editar");
        CheckBoxEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxEditarActionPerformed(evt);
            }
        });
        PanelCheckBox.add(CheckBoxEditar);

        BarraAtributos.add(PanelCheckBox);

        Panel.add(BarraAtributos, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout EscritorioDibujoLayout = new javax.swing.GroupLayout(EscritorioDibujo);
        EscritorioDibujo.setLayout(EscritorioDibujoLayout);
        EscritorioDibujoLayout.setHorizontalGroup(
            EscritorioDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        EscritorioDibujoLayout.setVerticalGroup(
            EscritorioDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
        );

        Panel.add(EscritorioDibujo, java.awt.BorderLayout.CENTER);

        getContentPane().add(Panel, java.awt.BorderLayout.CENTER);

        BotonArchivo.setText("Archivo");

        BotonNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        BotonNuevo.setText("Nuevo");
        BotonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNuevoActionPerformed(evt);
            }
        });
        BotonArchivo.add(BotonNuevo);

        BotonAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        BotonAbrir.setText("Abrir");
        BotonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAbrirActionPerformed(evt);
            }
        });
        BotonArchivo.add(BotonAbrir);

        BotonGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        BotonGuardar.setText("Guardar");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });
        BotonArchivo.add(BotonGuardar);

        jMenuBar1.add(BotonArchivo);

        BotonEdicion.setText("Edicion");

        CheckBoxBarraEstado.setSelected(true);
        CheckBoxBarraEstado.setText("Ver barra de estado");
        CheckBoxBarraEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxBarraEstadoActionPerformed(evt);
            }
        });
        BotonEdicion.add(CheckBoxBarraEstado);

        CheckBoxBarraFormas.setSelected(true);
        CheckBoxBarraFormas.setText("Ver barra de formas");
        CheckBoxBarraFormas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxBarraFormasActionPerformed(evt);
            }
        });
        BotonEdicion.add(CheckBoxBarraFormas);

        CheckBoxMenuBarraAtributos.setSelected(true);
        CheckBoxMenuBarraAtributos.setText("Ver barra de atributos");
        CheckBoxMenuBarraAtributos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxMenuBarraAtributosActionPerformed(evt);
            }
        });
        BotonEdicion.add(CheckBoxMenuBarraAtributos);

        jMenuBar1.add(BotonEdicion);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAbrirActionPerformed
        // TODO add your handling code here:
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showOpenDialog(this);
        if( resp == JFileChooser.APPROVE_OPTION) {
            File f = dlg.getSelectedFile();
        }
    }//GEN-LAST:event_BotonAbrirActionPerformed

    private void CheckBoxBarraEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxBarraEstadoActionPerformed
        // TODO add your handling code here:
         this.LabelBarraEstado.setVisible(this.CheckBoxBarraEstado.isSelected());
    }//GEN-LAST:event_CheckBoxBarraEstadoActionPerformed

    private void CheckBoxBarraFormasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxBarraFormasActionPerformed
        // TODO add your handling code here:
        this.BarraFormas.setVisible(this.CheckBoxBarraFormas.isSelected());
    }//GEN-LAST:event_CheckBoxBarraFormasActionPerformed

    private void BotonLapizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLapizActionPerformed
        // TODO add your handling code here:
        VentanaInterna vinterna ;
        vinterna = (VentanaInterna)EscritorioDibujo.getSelectedFrame();
        if (vinterna != null){
        vinterna.getLienzo().setHerramienta(PUNTO);
        this.LabelBarraEstado.setText("Punto");
        }
        
    }//GEN-LAST:event_BotonLapizActionPerformed

    private void BotonBlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBlancoActionPerformed
        // TODO add your handling code here:
        VentanaInterna vinterna ;
        vinterna = (VentanaInterna)EscritorioDibujo.getSelectedFrame();
        if (vinterna != null){
        vinterna.getLienzo().setColor(Color.white);
        vinterna.getLienzo().repaint();
        this.LabelBarraEstado.setText("Blanco");
        }
    }//GEN-LAST:event_BotonBlancoActionPerformed

    private void BotonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNuevoActionPerformed
        // TODO add your handling code here:
        VentanaInterna vi = new VentanaInterna(this);
        EscritorioDibujo.add(vi);
        vi.setVisible(true);
    }//GEN-LAST:event_BotonNuevoActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        // TODO add your handling code here:
         JFileChooser dlg = new JFileChooser();
        int resp = dlg.showSaveDialog(this);
        if( resp == JFileChooser.APPROVE_OPTION) {
            File f = dlg.getSelectedFile();
        }
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void CheckBoxMenuBarraAtributosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxMenuBarraAtributosActionPerformed
        // TODO add your handling code here:
        this.BarraAtributos.setVisible(this.CheckBoxMenuBarraAtributos.isSelected());
    }//GEN-LAST:event_CheckBoxMenuBarraAtributosActionPerformed

    private void BotonRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRectanguloActionPerformed
        // TODO add your handling code here:
        VentanaInterna vinterna ;
        vinterna = (VentanaInterna)EscritorioDibujo.getSelectedFrame();
        if (vinterna != null){
        vinterna.getLienzo().setHerramienta(RECTANGULO);
        this.LabelBarraEstado.setText("Rectangulo");
        }
    }//GEN-LAST:event_BotonRectanguloActionPerformed

    private void BotonNegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNegroActionPerformed
        // TODO add your handling code here:
        VentanaInterna vinterna ;
        vinterna = (VentanaInterna)EscritorioDibujo.getSelectedFrame();
        if (vinterna != null){
        vinterna.getLienzo().setColor(Color.black);
        vinterna.getLienzo().repaint();
        
        this.LabelBarraEstado.setText("Negro");
        }
    }//GEN-LAST:event_BotonNegroActionPerformed

    private void BotonRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRojoActionPerformed
        // TODO add your handling code here:
        VentanaInterna vinterna ;
        vinterna = (VentanaInterna)EscritorioDibujo.getSelectedFrame();
        if (vinterna != null){
        vinterna.getLienzo().setColor(Color.red);
        vinterna.getLienzo().repaint();
        this.LabelBarraEstado.setText("Rojo");
        }
    }//GEN-LAST:event_BotonRojoActionPerformed

    private void BotonAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAzulActionPerformed
        // TODO add your handling code here:
        VentanaInterna vinterna ;
        vinterna = (VentanaInterna)EscritorioDibujo.getSelectedFrame();
        if (vinterna != null){
        vinterna.getLienzo().setColor(Color.blue);
        vinterna.getLienzo().repaint();
        this.LabelBarraEstado.setText("Azul");
        }
    }//GEN-LAST:event_BotonAzulActionPerformed

    private void BotonAmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAmarilloActionPerformed
        // TODO add your handling code here:
        VentanaInterna vinterna ;
        vinterna = (VentanaInterna)EscritorioDibujo.getSelectedFrame();
        if (vinterna != null){
        vinterna.getLienzo().setColor(Color.yellow);
        vinterna.getLienzo().repaint();
        this.LabelBarraEstado.setText("Amarillo");
        }
    }//GEN-LAST:event_BotonAmarilloActionPerformed

    private void BotonVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVerdeActionPerformed
        // TODO add your handling code here:
        VentanaInterna vinterna ;
        vinterna = (VentanaInterna)EscritorioDibujo.getSelectedFrame();
        if (vinterna != null){
        vinterna.getLienzo().setColor(Color.green);
        vinterna.getLienzo().repaint();
        this.LabelBarraEstado.setText("Verde");
        }
    }//GEN-LAST:event_BotonVerdeActionPerformed

    private void BotonLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLineaActionPerformed
        // TODO add your handling code here:
        VentanaInterna vinterna ;
        vinterna = (VentanaInterna)EscritorioDibujo.getSelectedFrame();
        if (vinterna != null){
        vinterna.getLienzo().setHerramienta(LINEA);
        this.LabelBarraEstado.setText("Linea");
        }
    }//GEN-LAST:event_BotonLineaActionPerformed

    private void BotonOvaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonOvaloActionPerformed
        // TODO add your handling code here:
        VentanaInterna vinterna ;
        vinterna = (VentanaInterna)EscritorioDibujo.getSelectedFrame();
        if (vinterna != null){
        vinterna.getLienzo().setHerramienta(OVALO);
        this.LabelBarraEstado.setText("Ovalo");
        }
    }//GEN-LAST:event_BotonOvaloActionPerformed

    private void CheckBoxRellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxRellenoActionPerformed
        // TODO add your handling code here:
        VentanaInterna vinterna ;
        vinterna = (VentanaInterna)EscritorioDibujo.getSelectedFrame();
        if (vinterna != null){
        vinterna.getLienzo().setRelleno(this.CheckBoxRelleno.isSelected());
        vinterna.getLienzo().repaint();        
        this.LabelBarraEstado.setText("Relleno");
        }
        
    }//GEN-LAST:event_CheckBoxRellenoActionPerformed

    private void CheckBoxAlisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxAlisarActionPerformed
        // TODO add your handling code here:
        VentanaInterna vinterna ;
        vinterna = (VentanaInterna)EscritorioDibujo.getSelectedFrame();
        if (vinterna != null){
        vinterna.getLienzo().setAlisar(this.CheckBoxAlisar.isSelected());
        vinterna.getLienzo().repaint();        
        this.LabelBarraEstado.setText("Alisar");
        }
    }//GEN-LAST:event_CheckBoxAlisarActionPerformed

    private void CheckBoxTransparenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxTransparenciaActionPerformed
        // TODO add your handling code here:
        VentanaInterna vinterna ;
        vinterna = (VentanaInterna)EscritorioDibujo.getSelectedFrame();
        if (vinterna != null){
        vinterna.getLienzo().setTransparencia(this.CheckBoxTransparencia.isSelected());
        vinterna.getLienzo().repaint();        
        this.LabelBarraEstado.setText("Transparencia");
        }
    }//GEN-LAST:event_CheckBoxTransparenciaActionPerformed

    private void CheckBoxEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxEditarActionPerformed
        // TODO add your handling code here:
        VentanaInterna vinterna ;
        vinterna = (VentanaInterna)EscritorioDibujo.getSelectedFrame();
        if (vinterna != null){
        vinterna.getLienzo().setMover(this.CheckBoxEditar.isSelected());
        vinterna.getLienzo().repaint();        
        this.LabelBarraEstado.setText("Editar");
        }
    }//GEN-LAST:event_CheckBoxEditarActionPerformed

    private void SpinnerGrosorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinnerGrosorStateChanged
        // TODO add your handling code here:
        VentanaInterna vinterna;
        vinterna = (VentanaInterna)EscritorioDibujo.getSelectedFrame();
        if (vinterna != null){
        vinterna.getLienzo().setGrosor((float) this.SpinnerGrosor.getValue());
        vinterna.getLienzo().repaint();
        this.LabelBarraEstado.setText("Grosor = " + this.SpinnerGrosor.getValue() );
        }
    }//GEN-LAST:event_SpinnerGrosorStateChanged
    public void RecuperarDatos(){
        //Funcion para almacenar que tiene dentro cada ventana interna, para cuando cambiamos de ventana y volvemos
        //Para cuando cambio de ventana saber que tenias pulsado
        VentanaInterna vInterna;
        vInterna = (VentanaInterna)EscritorioDibujo.getSelectedFrame();
        if (vInterna != null){
       //Vemos que checkbox están activados
        this.CheckBoxRelleno.setSelected(vInterna.getLienzo().isRelleno());
        this.CheckBoxAlisar.setSelected(vInterna.getLienzo().isAlisar());
        this.CheckBoxEditar.setSelected(vInterna.getLienzo().isMover());
        this.CheckBoxTransparencia.setSelected(vInterna.getLienzo().isTransparencia());
        this.SpinnerGrosor.setValue(vInterna.getLienzo().getGrosor());
        //Comprobamos que herramientas está activa
        if (vInterna.getLienzo().getHerramienta()==PUNTO)
            this.BotonLapiz.setSelected(true);
        if (vInterna.getLienzo().getHerramienta()==LINEA)
            this.BotonLinea.setSelected(true);
        if (vInterna.getLienzo().getHerramienta()==RECTANGULO)
            this.BotonRectangulo.setSelected(true);
        if (vInterna.getLienzo().getHerramienta()==OVALO)
            this.BotonOvalo.setSelected(true);
        
        }
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar BarraAtributos;
    private javax.swing.JToolBar BarraFormas;
    private javax.swing.JMenuItem BotonAbrir;
    private javax.swing.JButton BotonAmarillo;
    private javax.swing.JMenu BotonArchivo;
    private javax.swing.JButton BotonAzul;
    private javax.swing.JButton BotonBlanco;
    private javax.swing.JMenu BotonEdicion;
    private javax.swing.JMenuItem BotonGuardar;
    private javax.swing.JToggleButton BotonLapiz;
    private javax.swing.JToggleButton BotonLinea;
    private javax.swing.JButton BotonNegro;
    private javax.swing.JMenuItem BotonNuevo;
    private javax.swing.JToggleButton BotonOvalo;
    private javax.swing.JToggleButton BotonRectangulo;
    private javax.swing.JButton BotonRojo;
    private javax.swing.JButton BotonVerde;
    private javax.swing.JCheckBox CheckBoxAlisar;
    private javax.swing.JCheckBoxMenuItem CheckBoxBarraEstado;
    private javax.swing.JCheckBoxMenuItem CheckBoxBarraFormas;
    private javax.swing.JCheckBox CheckBoxEditar;
    private javax.swing.JCheckBoxMenuItem CheckBoxMenuBarraAtributos;
    private javax.swing.JCheckBox CheckBoxRelleno;
    private javax.swing.JCheckBox CheckBoxTransparencia;
    private javax.swing.JDesktopPane EscritorioDibujo;
    private javax.swing.ButtonGroup GroupHerramientas;
    private javax.swing.JLabel LabelBarraEstado;
    private javax.swing.JPanel Panel;
    private javax.swing.JPanel PanelCheckBox;
    private javax.swing.JPanel PanelColores;
    private javax.swing.JPanel PanelGrosor;
    private javax.swing.JSpinner SpinnerGrosor;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
