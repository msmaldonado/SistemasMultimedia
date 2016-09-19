/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaPaint;
import TipoArchivo.ArchivoAu;
import TipoArchivo.TodosArchivos;
import TipoArchivo.ArchivoAvi;
import TipoArchivo.ArchivoJpeg;
import TipoArchivo.ArchivoJpg;
import TipoArchivo.ArchivoMp3;
import TipoArchivo.ArchivoPng;
import TipoArchivo.ArchivoWav;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import sm.image.BlendOp;
import sm.image.KernelProducer;
import sm.image.LookupTableProducer;
import sm.image.SubtractionOp;

/**
 *
 * @author Miguel
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    /**
     * Constructor de la Ventana principal
     * Inicializa todo por defecto
     */
    public VentanaPrincipal() {
        initComponents();        
        this.jButtonColorRelleno.setVisible(false);//No podemos seleccionar color de releno
        this.jComboBoxDegradado.setVisible(false);//No podemos seleccionar tipo de degradado
        this.jButtonColorGradiente.setVisible(false);//No podemos seleecionar color de gradiente
        
    }
    /**
     * Get de la extension del archivo
     * @param f archivo que vemos la extension
     * @return extension
     */
    public static String getExtension(File f) {
        String ext = null;
        String s = f.getName();
        int i = s.lastIndexOf('.');

        if (i > 0 &&  i < s.length() - 1) 
            ext = s.substring(i+1).toLowerCase();
        return ext;
    }
    /**
     * cambiamso las coordenadas
     * @param coordenadas nuevo valor de las coordenadas
     */
    public void cambiarCoordenadas(String coordenadas){
        this.BarraEstado.setText(coordenadas);
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        GrupoHerramientas = new javax.swing.ButtonGroup();
        BarraEstado = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        PanelAtributos = new javax.swing.JPanel();
        ButtonNuevo = new javax.swing.JButton();
        ButtonAbrir = new javax.swing.JButton();
        ButtonGuardar = new javax.swing.JButton();
        ButtonCaptura = new javax.swing.JButton();
        ButtonMicrofono = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        Herramientas = new javax.swing.JPanel();
        jToggleButtonPunto = new javax.swing.JToggleButton();
        ToggleButtonLinea = new javax.swing.JToggleButton();
        ToggleButtonRectangulo = new javax.swing.JToggleButton();
        ToggleButtonOvalo = new javax.swing.JToggleButton();
        ToggleButtonCPControl = new javax.swing.JToggleButton();
        ToggleButtonPoligono = new javax.swing.JToggleButton();
        ToggleButtonEditar = new javax.swing.JToggleButton();
        jSeparator2 = new javax.swing.JSeparator();
        Trazo = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        ComboBoxTipoTrazo = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        SpinnerGrosor = new javax.swing.JSpinner();
        ButtonColorTrazo = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jPanelRelleno = new javax.swing.JPanel();
        jPanelTipo = new javax.swing.JPanel();
        jComboBoxTipoRelleno = new javax.swing.JComboBox<>();
        jComboBoxDegradado = new javax.swing.JComboBox<>();
        jPanelColorRelleno = new javax.swing.JPanel();
        jButtonColorRelleno = new javax.swing.JButton();
        jButtonColorGradiente = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jPanelAlisado = new javax.swing.JPanel();
        ButtonAlisado = new javax.swing.JToggleButton();
        jSeparator6 = new javax.swing.JSeparator();
        jPanelTransparencia = new javax.swing.JPanel();
        jSliderTransparencia = new javax.swing.JSlider();
        Escritorio = new javax.swing.JDesktopPane();
        jPanelInferior = new javax.swing.JPanel();
        jPanelBrillo = new javax.swing.JPanel();
        jSliderBrillo = new javax.swing.JSlider();
        jSeparator7 = new javax.swing.JSeparator();
        jPanelFiltro = new javax.swing.JPanel();
        jComboBoxFiltro = new javax.swing.JComboBox<>();
        jSeparator8 = new javax.swing.JSeparator();
        jPanelContraste = new javax.swing.JPanel();
        jButtonContrasteNormal = new javax.swing.JButton();
        jButtonContrasteBrillo = new javax.swing.JButton();
        jButtonContrasteOscurecer = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jButtonSinusoidal = new javax.swing.JButton();
        jButtonSepia = new javax.swing.JButton();
        jButtonNegativo = new javax.swing.JButton();
        jButtonDuplicado = new javax.swing.JButton();
        jButtonGrises = new javax.swing.JButton();
        jButtonPropia = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JSeparator();
        jPanelRotacion = new javax.swing.JPanel();
        jSliderRotacion = new javax.swing.JSlider();
        jButtonRotar90 = new javax.swing.JButton();
        jButtonRotar180 = new javax.swing.JButton();
        jButtonRotar270 = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JSeparator();
        jPanelEscala = new javax.swing.JPanel();
        jButtonEscalaMenos = new javax.swing.JButton();
        jButtonEscalaMas = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JSeparator();
        jPanelBinario = new javax.swing.JPanel();
        jButtonBinarioMenos = new javax.swing.JButton();
        jButtonBinarioMas = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JSeparator();
        jPanelUmbralizacion = new javax.swing.JPanel();
        jSliderUmbralizacion = new javax.swing.JSlider();
        MenuPrincipal = new javax.swing.JMenuBar();
        MenuArchivo = new javax.swing.JMenu();
        MenuNuevo = new javax.swing.JMenuItem();
        MenuAbrir = new javax.swing.JMenuItem();
        MenuGuardar = new javax.swing.JMenuItem();
        MenuEdicion = new javax.swing.JMenu();
        CheckBoxBarraEstado = new javax.swing.JCheckBoxMenuItem();
        CheckBoxBarraInferior = new javax.swing.JCheckBoxMenuItem();
        CheckBoxBarraAtributos = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BarraEstado.setText("Barra de Estado");
        getContentPane().add(BarraEstado, java.awt.BorderLayout.PAGE_END);

        jPanel1.setLayout(new java.awt.BorderLayout());

        ButtonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevo.png"))); // NOI18N
        ButtonNuevo.setToolTipText("Nuevo");
        ButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNuevoActionPerformed(evt);
            }
        });
        PanelAtributos.add(ButtonNuevo);

        ButtonAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/abrir.png"))); // NOI18N
        ButtonAbrir.setToolTipText("Abrir");
        ButtonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAbrirActionPerformed(evt);
            }
        });
        PanelAtributos.add(ButtonAbrir);

        ButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar.png"))); // NOI18N
        ButtonGuardar.setToolTipText("Guardar");
        ButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGuardarActionPerformed(evt);
            }
        });
        PanelAtributos.add(ButtonGuardar);

        ButtonCaptura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Capturar.png"))); // NOI18N
        ButtonCaptura.setToolTipText("Captura");
        ButtonCaptura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCapturaActionPerformed(evt);
            }
        });
        PanelAtributos.add(ButtonCaptura);

        ButtonMicrofono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/microfono.png"))); // NOI18N
        ButtonMicrofono.setToolTipText("Microfono");
        ButtonMicrofono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMicrofonoActionPerformed(evt);
            }
        });
        PanelAtributos.add(ButtonMicrofono);
        PanelAtributos.add(jSeparator1);

        Herramientas.setBorder(javax.swing.BorderFactory.createTitledBorder("Formas"));

        GrupoHerramientas.add(jToggleButtonPunto);
        jToggleButtonPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/punto.png"))); // NOI18N
        jToggleButtonPunto.setToolTipText("Punto");
        jToggleButtonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonPuntoActionPerformed(evt);
            }
        });
        Herramientas.add(jToggleButtonPunto);

        GrupoHerramientas.add(ToggleButtonLinea);
        ToggleButtonLinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/linea.png"))); // NOI18N
        ToggleButtonLinea.setToolTipText("Linea");
        ToggleButtonLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButtonLineaActionPerformed(evt);
            }
        });
        Herramientas.add(ToggleButtonLinea);

        GrupoHerramientas.add(ToggleButtonRectangulo);
        ToggleButtonRectangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/rectangulo.png"))); // NOI18N
        ToggleButtonRectangulo.setToolTipText("Cuadrado");
        ToggleButtonRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButtonRectanguloActionPerformed(evt);
            }
        });
        Herramientas.add(ToggleButtonRectangulo);

        GrupoHerramientas.add(ToggleButtonOvalo);
        ToggleButtonOvalo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/elipse.png"))); // NOI18N
        ToggleButtonOvalo.setToolTipText("Elipse");
        ToggleButtonOvalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButtonOvaloActionPerformed(evt);
            }
        });
        Herramientas.add(ToggleButtonOvalo);

        GrupoHerramientas.add(ToggleButtonCPControl);
        ToggleButtonCPControl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/quadcurve.png"))); // NOI18N
        ToggleButtonCPControl.setToolTipText("LineaPControl");
        ToggleButtonCPControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButtonCPControlActionPerformed(evt);
            }
        });
        Herramientas.add(ToggleButtonCPControl);

        GrupoHerramientas.add(ToggleButtonPoligono);
        ToggleButtonPoligono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/polygon.png"))); // NOI18N
        ToggleButtonPoligono.setToolTipText("Poligono");
        ToggleButtonPoligono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButtonPoligonoActionPerformed(evt);
            }
        });
        Herramientas.add(ToggleButtonPoligono);

        GrupoHerramientas.add(ToggleButtonEditar);
        ToggleButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/seleccion.png"))); // NOI18N
        ToggleButtonEditar.setToolTipText("Editar");
        ToggleButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButtonEditarActionPerformed(evt);
            }
        });
        Herramientas.add(ToggleButtonEditar);
        Herramientas.add(jSeparator2);

        PanelAtributos.add(Herramientas);

        Trazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Trazo"));
        Trazo.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo Trazo"));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        ComboBoxTipoTrazo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Continuo", "Discontinuo" }));
        ComboBoxTipoTrazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxTipoTrazoActionPerformed(evt);
            }
        });
        jPanel3.add(ComboBoxTipoTrazo, new java.awt.GridBagConstraints());

        Trazo.add(jPanel3, new java.awt.GridBagConstraints());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Grosor y Color"));

        SpinnerGrosor.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        SpinnerGrosor.setValue(1);
        SpinnerGrosor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpinnerGrosorStateChanged(evt);
            }
        });
        jPanel2.add(SpinnerGrosor);

        ButtonColorTrazo.setBackground(new java.awt.Color(0, 0, 0));
        ButtonColorTrazo.setToolTipText("Color");
        ButtonColorTrazo.setPreferredSize(new java.awt.Dimension(33, 33));
        ButtonColorTrazo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonColorTrazoMouseClicked(evt);
            }
        });
        jPanel2.add(ButtonColorTrazo);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        Trazo.add(jPanel2, gridBagConstraints);
        Trazo.add(jSeparator5, new java.awt.GridBagConstraints());

        PanelAtributos.add(Trazo);

        jPanelRelleno.setBorder(javax.swing.BorderFactory.createTitledBorder("Relleno"));
        jPanelRelleno.setLayout(new java.awt.GridBagLayout());

        jPanelTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo"));
        java.awt.GridBagLayout jPanelTipoLayout = new java.awt.GridBagLayout();
        jPanelTipoLayout.columnWidths = new int[] {1};
        jPanelTipo.setLayout(jPanelTipoLayout);

        jComboBoxTipoRelleno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Relleno", "Liso", "Degradado" }));
        jComboBoxTipoRelleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoRellenoActionPerformed(evt);
            }
        });
        jPanelTipo.add(jComboBoxTipoRelleno, new java.awt.GridBagConstraints());

        jComboBoxDegradado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Horizontal", "Vertical" }));
        jComboBoxDegradado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDegradadoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanelTipo.add(jComboBoxDegradado, gridBagConstraints);

        jPanelRelleno.add(jPanelTipo, new java.awt.GridBagConstraints());

        jPanelColorRelleno.setBorder(javax.swing.BorderFactory.createTitledBorder("Color"));
        jPanelColorRelleno.setLayout(new java.awt.GridBagLayout());

        jButtonColorRelleno.setBackground(new java.awt.Color(0, 0, 0));
        jButtonColorRelleno.setToolTipText("Color Relleno");
        jButtonColorRelleno.setMinimumSize(new java.awt.Dimension(20, 20));
        jButtonColorRelleno.setPreferredSize(new java.awt.Dimension(20, 20));
        jButtonColorRelleno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonColorRellenoMouseClicked(evt);
            }
        });
        jPanelColorRelleno.add(jButtonColorRelleno, new java.awt.GridBagConstraints());

        jButtonColorGradiente.setBackground(new java.awt.Color(255, 255, 255));
        jButtonColorGradiente.setToolTipText("Color Gradiente");
        jButtonColorGradiente.setPreferredSize(new java.awt.Dimension(20, 20));
        jButtonColorGradiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonColorGradienteMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanelColorRelleno.add(jButtonColorGradiente, gridBagConstraints);

        jPanelRelleno.add(jPanelColorRelleno, new java.awt.GridBagConstraints());
        jPanelRelleno.add(jSeparator4, new java.awt.GridBagConstraints());

        PanelAtributos.add(jPanelRelleno);

        jPanelAlisado.setBorder(javax.swing.BorderFactory.createTitledBorder("Alisado"));

        ButtonAlisado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/alisar.png"))); // NOI18N
        ButtonAlisado.setToolTipText("Alisado");
        ButtonAlisado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAlisadoActionPerformed(evt);
            }
        });
        jPanelAlisado.add(ButtonAlisado);
        jPanelAlisado.add(jSeparator6);

        PanelAtributos.add(jPanelAlisado);

        jPanelTransparencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Transparencia"));

        jSliderTransparencia.setMaximum(10);
        jSliderTransparencia.setMinorTickSpacing(1);
        jSliderTransparencia.setPaintTicks(true);
        jSliderTransparencia.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderTransparenciaStateChanged(evt);
            }
        });
        jPanelTransparencia.add(jSliderTransparencia);

        PanelAtributos.add(jPanelTransparencia);

        jPanel1.add(PanelAtributos, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1525, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        jPanel1.add(Escritorio, java.awt.BorderLayout.CENTER);

        jPanelBrillo.setBorder(javax.swing.BorderFactory.createTitledBorder("Brillo"));

        jSliderBrillo.setMaximum(255);
        jSliderBrillo.setMinimum(-255);
        jSliderBrillo.setValue(0);
        jSliderBrillo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderBrilloStateChanged(evt);
            }
        });
        jPanelBrillo.add(jSliderBrillo);
        jPanelBrillo.add(jSeparator7);

        jPanelInferior.add(jPanelBrillo);

        jPanelFiltro.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtro"));

        jComboBoxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Media", "Binomial", "Enfoque", "Relieve", "Laplaciano" }));
        jComboBoxFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFiltroActionPerformed(evt);
            }
        });
        jPanelFiltro.add(jComboBoxFiltro);
        jPanelFiltro.add(jSeparator8);

        jPanelInferior.add(jPanelFiltro);

        jPanelContraste.setBorder(javax.swing.BorderFactory.createTitledBorder("Contraste"));

        jButtonContrasteNormal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/contraste.png"))); // NOI18N
        jButtonContrasteNormal.setToolTipText("Contraste");
        jButtonContrasteNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContrasteNormalActionPerformed(evt);
            }
        });
        jPanelContraste.add(jButtonContrasteNormal);

        jButtonContrasteBrillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/iluminar.png"))); // NOI18N
        jButtonContrasteBrillo.setToolTipText("Brillo");
        jButtonContrasteBrillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContrasteBrilloActionPerformed(evt);
            }
        });
        jPanelContraste.add(jButtonContrasteBrillo);

        jButtonContrasteOscurecer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/oscurecer.png"))); // NOI18N
        jButtonContrasteOscurecer.setToolTipText("oscurecer");
        jButtonContrasteOscurecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContrasteOscurecerActionPerformed(evt);
            }
        });
        jPanelContraste.add(jButtonContrasteOscurecer);
        jPanelContraste.add(jSeparator9);

        jPanelInferior.add(jPanelContraste);

        jButtonSinusoidal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sinusoidal.png"))); // NOI18N
        jButtonSinusoidal.setToolTipText("Filtro seno");
        jButtonSinusoidal.setMaximumSize(new java.awt.Dimension(30, 30));
        jButtonSinusoidal.setMinimumSize(new java.awt.Dimension(30, 30));
        jButtonSinusoidal.setPreferredSize(new java.awt.Dimension(30, 30));
        jButtonSinusoidal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSinusoidalActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonSinusoidal);

        jButtonSepia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sepia.png"))); // NOI18N
        jButtonSepia.setToolTipText("Sepia");
        jButtonSepia.setMaximumSize(new java.awt.Dimension(25, 25));
        jButtonSepia.setMinimumSize(new java.awt.Dimension(25, 25));
        jButtonSepia.setPreferredSize(new java.awt.Dimension(25, 25));
        jButtonSepia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSepiaActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonSepia);

        jButtonNegativo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/negativo.png"))); // NOI18N
        jButtonNegativo.setToolTipText("Negativo");
        jButtonNegativo.setMaximumSize(new java.awt.Dimension(25, 25));
        jButtonNegativo.setMinimumSize(new java.awt.Dimension(25, 25));
        jButtonNegativo.setPreferredSize(new java.awt.Dimension(25, 25));
        jButtonNegativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNegativoActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonNegativo);

        jButtonDuplicado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/duplicar.png"))); // NOI18N
        jButtonDuplicado.setToolTipText("duplicar");
        jButtonDuplicado.setMaximumSize(new java.awt.Dimension(25, 25));
        jButtonDuplicado.setMinimumSize(new java.awt.Dimension(25, 25));
        jButtonDuplicado.setPreferredSize(new java.awt.Dimension(25, 25));
        jButtonDuplicado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDuplicadoActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonDuplicado);

        jButtonGrises.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/escaladegrises.png"))); // NOI18N
        jButtonGrises.setToolTipText("Escala de Grises");
        jButtonGrises.setMaximumSize(new java.awt.Dimension(25, 25));
        jButtonGrises.setMinimumSize(new java.awt.Dimension(25, 25));
        jButtonGrises.setPreferredSize(new java.awt.Dimension(25, 25));
        jButtonGrises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGrisesActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonGrises);

        jButtonPropia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/msm.png"))); // NOI18N
        jButtonPropia.setToolTipText("Filtro Propio");
        jButtonPropia.setMaximumSize(new java.awt.Dimension(30, 30));
        jButtonPropia.setMinimumSize(new java.awt.Dimension(30, 30));
        jButtonPropia.setPreferredSize(new java.awt.Dimension(30, 30));
        jButtonPropia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPropiaActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonPropia);
        jPanel4.add(jSeparator10);

        jPanelInferior.add(jPanel4);

        jPanelRotacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Rotacion"));

        jSliderRotacion.setMajorTickSpacing(90);
        jSliderRotacion.setMaximum(360);
        jSliderRotacion.setPaintTicks(true);
        jSliderRotacion.setValue(0);
        jSliderRotacion.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderRotacionStateChanged(evt);
            }
        });
        jPanelRotacion.add(jSliderRotacion);

        jButtonRotar90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/rotacion90.png"))); // NOI18N
        jButtonRotar90.setToolTipText("Rotar 90º");
        jButtonRotar90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRotar90ActionPerformed(evt);
            }
        });
        jPanelRotacion.add(jButtonRotar90);

        jButtonRotar180.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/rotacion180.png"))); // NOI18N
        jButtonRotar180.setToolTipText("rotar 180º");
        jButtonRotar180.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRotar180ActionPerformed(evt);
            }
        });
        jPanelRotacion.add(jButtonRotar180);

        jButtonRotar270.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/rotacion270.png"))); // NOI18N
        jButtonRotar270.setToolTipText("rotar 270º");
        jButtonRotar270.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRotar270ActionPerformed(evt);
            }
        });
        jPanelRotacion.add(jButtonRotar270);
        jPanelRotacion.add(jSeparator11);

        jPanelInferior.add(jPanelRotacion);

        jPanelEscala.setBorder(javax.swing.BorderFactory.createTitledBorder("Escala"));

        jButtonEscalaMenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/disminuir.png"))); // NOI18N
        jButtonEscalaMenos.setToolTipText("disminuir escala");
        jButtonEscalaMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEscalaMenosActionPerformed(evt);
            }
        });
        jPanelEscala.add(jButtonEscalaMenos);

        jButtonEscalaMas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/aumentar.png"))); // NOI18N
        jButtonEscalaMas.setToolTipText("aumentar escala");
        jButtonEscalaMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEscalaMasActionPerformed(evt);
            }
        });
        jPanelEscala.add(jButtonEscalaMas);
        jPanelEscala.add(jSeparator12);

        jPanelInferior.add(jPanelEscala);

        jPanelBinario.setBorder(javax.swing.BorderFactory.createTitledBorder("Binario"));
        jPanelBinario.setMinimumSize(new java.awt.Dimension(100, 76));

        jButtonBinarioMenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/resta.png"))); // NOI18N
        jButtonBinarioMenos.setToolTipText("operacion menos binaria");
        jButtonBinarioMenos.setMaximumSize(new java.awt.Dimension(40, 41));
        jButtonBinarioMenos.setMinimumSize(new java.awt.Dimension(40, 41));
        jButtonBinarioMenos.setPreferredSize(new java.awt.Dimension(40, 41));
        jButtonBinarioMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBinarioMenosActionPerformed(evt);
            }
        });
        jPanelBinario.add(jButtonBinarioMenos);

        jButtonBinarioMas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/suma.png"))); // NOI18N
        jButtonBinarioMas.setToolTipText("operacion mas binaria");
        jButtonBinarioMas.setMaximumSize(new java.awt.Dimension(40, 41));
        jButtonBinarioMas.setMinimumSize(new java.awt.Dimension(40, 41));
        jButtonBinarioMas.setPreferredSize(new java.awt.Dimension(40, 41));
        jButtonBinarioMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBinarioMasActionPerformed(evt);
            }
        });
        jPanelBinario.add(jButtonBinarioMas);
        jPanelBinario.add(jSeparator13);

        jPanelInferior.add(jPanelBinario);

        jPanelUmbralizacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Umbralizacion"));

        jSliderUmbralizacion.setMaximum(255);
        jSliderUmbralizacion.setMinorTickSpacing(1);
        jSliderUmbralizacion.setValue(127);
        jSliderUmbralizacion.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderUmbralizacionStateChanged(evt);
            }
        });
        jPanelUmbralizacion.add(jSliderUmbralizacion);

        jPanelInferior.add(jPanelUmbralizacion);

        jPanel1.add(jPanelInferior, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        MenuArchivo.setText("Archivo");

        MenuNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        MenuNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevo.png"))); // NOI18N
        MenuNuevo.setText("Nuevo");
        MenuNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuNuevoActionPerformed(evt);
            }
        });
        MenuArchivo.add(MenuNuevo);

        MenuAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        MenuAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/abrir.png"))); // NOI18N
        MenuAbrir.setText("Abrir");
        MenuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAbrirActionPerformed(evt);
            }
        });
        MenuArchivo.add(MenuAbrir);

        MenuGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        MenuGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar.png"))); // NOI18N
        MenuGuardar.setText("Guardar");
        MenuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuGuardarActionPerformed(evt);
            }
        });
        MenuArchivo.add(MenuGuardar);

        MenuPrincipal.add(MenuArchivo);

        MenuEdicion.setText("Edicion");

        CheckBoxBarraEstado.setSelected(true);
        CheckBoxBarraEstado.setText("Ver Barra Estado");
        CheckBoxBarraEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxBarraEstadoActionPerformed(evt);
            }
        });
        MenuEdicion.add(CheckBoxBarraEstado);

        CheckBoxBarraInferior.setSelected(true);
        CheckBoxBarraInferior.setText("Ver Panel Inferior");
        CheckBoxBarraInferior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxBarraInferiorActionPerformed(evt);
            }
        });
        MenuEdicion.add(CheckBoxBarraInferior);

        CheckBoxBarraAtributos.setSelected(true);
        CheckBoxBarraAtributos.setText("Ver Barra Atributos");
        CheckBoxBarraAtributos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxBarraAtributosActionPerformed(evt);
            }
        });
        MenuEdicion.add(CheckBoxBarraAtributos);

        MenuPrincipal.add(MenuEdicion);

        setJMenuBar(MenuPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuNuevoActionPerformed
        ArrayList<Integer> options = Ventana.showVentanaTamanio();
        if (options != null) {
            VentanaDibujo vi = new VentanaDibujo(this);
            vi.setTitle("Nueva");
            vi.setSize(options.get(0)+50, options.get(1)+50);
            Escritorio.add(vi);
            vi.setVisible(true);
            BufferedImage img;
            img = new BufferedImage(options.get(0), options.get(1),BufferedImage.TYPE_INT_RGB);
            Graphics g = img.getGraphics();
            g.setColor(Color.white);
            g.fillRect(0, 0, options.get(0), options.get(1));
            vi.getLienzo().setImage(img);
        }    
    }//GEN-LAST:event_MenuNuevoActionPerformed

    private void MenuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuGuardarActionPerformed
        VentanaDibujo vi=(VentanaDibujo) Escritorio.getSelectedFrame();
        if (vi != null) {
            JFileChooser dlg = new JFileChooser();
            dlg.setFileFilter(new ArchivoPng());
            dlg.addChoosableFileFilter(new ArchivoJpg());
            dlg.addChoosableFileFilter(new ArchivoJpeg());
            dlg.setAcceptAllFileFilterUsed(false);
            int resp = dlg.showSaveDialog(this);
            if (resp == JFileChooser.APPROVE_OPTION) {
                try {
                    BufferedImage img = vi.getLienzo().getImage(true);
                    if (img != null) {
                        File f = dlg.getSelectedFile();
                        ImageIO.write(img, "jpg", f);
                        vi.setTitle(f.getName());
                    }
                }catch (Exception ex) {
                    System.err.println("Error al guardar la imagen");
                }
            }
        }
    }//GEN-LAST:event_MenuGuardarActionPerformed
    
    private void CheckBoxBarraAtributosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxBarraAtributosActionPerformed
         JCheckBoxMenuItem cb;
        cb = (JCheckBoxMenuItem) evt.getSource();
        if (cb.isSelected()) 
            this.PanelAtributos.setVisible(true);
        else 
            this.PanelAtributos.setVisible(false);
    }//GEN-LAST:event_CheckBoxBarraAtributosActionPerformed

    private void CheckBoxBarraEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxBarraEstadoActionPerformed
        JCheckBoxMenuItem cb;
        cb = (JCheckBoxMenuItem) evt.getSource();
        if (cb.isSelected()) 
            this.BarraEstado.setVisible(true);
        else 
            this.BarraEstado.setVisible(false);
    }//GEN-LAST:event_CheckBoxBarraEstadoActionPerformed

    private void MenuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAbrirActionPerformed
        JFileChooser dlg = new JFileChooser();
        //Todos los archivos
        dlg.setFileFilter(new TodosArchivos());
        //Imagenes
        dlg.addChoosableFileFilter(new ArchivoPng());
        dlg.addChoosableFileFilter(new ArchivoJpg());
        dlg.addChoosableFileFilter(new ArchivoJpeg());
        //Sonido
        dlg.addChoosableFileFilter(new ArchivoMp3());
        dlg.addChoosableFileFilter(new ArchivoWav());
        dlg.addChoosableFileFilter(new ArchivoAu());
        //Video
        dlg.addChoosableFileFilter(new ArchivoAvi());
        
        dlg.setAcceptAllFileFilterUsed(false);
        int resp = dlg.showOpenDialog(this);
        if( resp == JFileChooser.APPROVE_OPTION) {
            try{
                File f = dlg.getSelectedFile();
                String extension = getExtension(f);
                if (extension != null) {
                    //Miramos si es imagen para tener en cuenta las dimensiones
                    if (extension.equals("jpeg") || extension.equals("jpg") ||extension.equals("png")) {
                        BufferedImage img = ImageIO.read(f);
                        VentanaDibujo vi = new VentanaDibujo(this);
                        vi.getLienzo().setImage(img);
                        vi.getLienzo().setImageFondo(img);
                        this.Escritorio.add(vi);
                        vi.setTitle(f.getName());
                        vi.setSize(img.getWidth(),img.getHeight());
                        vi.setVisible(true);
                    }
                    //Si es sonido o video lo abrimos con la multimedia
                    else if (extension.equals("wav") || extension.equals("mp3") ||extension.equals("au")||  extension.equals("avi") ) {
                        VentanaMultimedia vi = VentanaMultimedia.getInstance(f);
                        Escritorio.add(vi);
                        vi.setTitle(f.getName());                        
                        vi.setVisible(true);
                    }
                }
            }catch(Exception ex){
                System.err.println("Error al leer archivo");
            }
        }
    }//GEN-LAST:event_MenuAbrirActionPerformed

    private void jToggleButtonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonPuntoActionPerformed
        BarraEstado.setText("Punto");
        VentanaDibujo vi;
        vi = (VentanaDibujo)Escritorio.getSelectedFrame();
        if ( vi != null){
            vi.getLienzo().setTipoActual(0);//Ponemos el punto
            vi.getLienzo().setEditar(false);
        }
    }//GEN-LAST:event_jToggleButtonPuntoActionPerformed

    private void ToggleButtonLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButtonLineaActionPerformed
        BarraEstado.setText("Linea");
        VentanaDibujo vi;
        vi = (VentanaDibujo)Escritorio.getSelectedFrame();
        if ( vi != null){
            vi.getLienzo().setTipoActual(1);//Ponemos Linea
            vi.getLienzo().setEditar(false);
        }
    }//GEN-LAST:event_ToggleButtonLineaActionPerformed

    private void ToggleButtonRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButtonRectanguloActionPerformed
        BarraEstado.setText("Rectángulo");
        VentanaDibujo vi;
        vi = (VentanaDibujo)Escritorio.getSelectedFrame();
        if ( vi != null){
            vi.getLienzo().setTipoActual(2);//Ponemos Rectangulo
            vi.getLienzo().setEditar(false);
        }
    }//GEN-LAST:event_ToggleButtonRectanguloActionPerformed

    private void ToggleButtonOvaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButtonOvaloActionPerformed
        BarraEstado.setText("Elipse");
        VentanaDibujo vi;
        vi = (VentanaDibujo)Escritorio.getSelectedFrame();
        if ( vi != null){
            vi.getLienzo().setTipoActual(3);//Ponemos Elipse u Ovalo
            vi.getLienzo().setEditar(false);
        }
    }//GEN-LAST:event_ToggleButtonOvaloActionPerformed

    private void CheckBoxBarraInferiorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxBarraInferiorActionPerformed
        JCheckBoxMenuItem cb;
        cb = (JCheckBoxMenuItem) evt.getSource();
        if (cb.isSelected())
            this.jPanelInferior.setVisible(true);
        else 
            this.jPanelInferior.setVisible(false);        
    }//GEN-LAST:event_CheckBoxBarraInferiorActionPerformed

    private void ToggleButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButtonEditarActionPerformed
        VentanaDibujo vi;
        BarraEstado.setText("Editar");
        vi = (VentanaDibujo)Escritorio.getSelectedFrame();
        JToggleButton tb;
        tb = (JToggleButton) evt.getSource();
        if ( vi != null){
            if (tb.isSelected())
                vi.getLienzo().setEditar(true);
            else 
                vi.getLienzo().setEditar(false);
        }       
    }//GEN-LAST:event_ToggleButtonEditarActionPerformed

    private void jComboBoxFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFiltroActionPerformed
        VentanaDibujo vi;
        vi = (VentanaDibujo)Escritorio.getSelectedFrame();
        JComboBox cb;
        cb = (JComboBox) evt.getSource();
        int tipo = 0;
        if ( vi != null){            
            if(cb.getSelectedIndex()== 0) //Media
                tipo = KernelProducer.TYPE_MEDIA_3x3;
            else if (cb.getSelectedIndex()== 1)//Binomial
                tipo = KernelProducer.TYPE_BINOMIAL_3x3;
            else if(cb.getSelectedIndex()== 2)
                tipo = KernelProducer.TYPE_ENFOQUE_3x3;
            else if (cb.getSelectedIndex()== 3)
                tipo = KernelProducer.TYPE_RELIEVE_3x3;
            else
                tipo = KernelProducer.TYPE_LAPLACIANA_3x3;
            //Ponemos los otros valores por defecto
            vi.getLienzo().Filtro(tipo);
            this.jSliderBrillo.setValue(0);
            this.jSliderRotacion.setValue(0);
            this.jSliderUmbralizacion.setValue(127);
        }
    }//GEN-LAST:event_jComboBoxFiltroActionPerformed

    private void jSliderBrilloStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderBrilloStateChanged
        BarraEstado.setText("Brillo");
        VentanaDibujo vi;
        vi = (VentanaDibujo)Escritorio.getSelectedFrame();
        if ( vi != null){
            JSlider sl;
            sl = (JSlider) evt.getSource();
            vi.getLienzo().brillo(sl.getValue());           
            vi.getLienzo().repaint();
            this.jSliderRotacion.setValue(0);
            this.jSliderUmbralizacion.setValue(127);
          
        }
    }//GEN-LAST:event_jSliderBrilloStateChanged

    private void jSliderRotacionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderRotacionStateChanged
        BarraEstado.setText("Rotacion " );
        VentanaDibujo vi = (VentanaDibujo) (Escritorio.getSelectedFrame());
        if (vi != null) {
            vi.getLienzo().rotar(this.jSliderRotacion.getValue(),false);
            this.jSliderBrillo.setValue(0);
            this.jSliderUmbralizacion.setValue(127);
           
        }
    }//GEN-LAST:event_jSliderRotacionStateChanged

    private void jButtonRotar180ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRotar180ActionPerformed
        VentanaDibujo vi = (VentanaDibujo) (Escritorio.getSelectedFrame());
        if (vi != null) {
            vi.getLienzo().rotar(180,true);            
            this.jSliderBrillo.setValue(0);
            this.jSliderRotacion.setValue(0);
            this.jSliderUmbralizacion.setValue(127);
            
        }
    }//GEN-LAST:event_jButtonRotar180ActionPerformed

    private void jButtonContrasteNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContrasteNormalActionPerformed
        BarraEstado.setText("Contraste ");
        VentanaDibujo vi = (VentanaDibujo) (Escritorio.getSelectedFrame());
        if (vi != null) {
            vi.getLienzo().Contraste(LookupTableProducer.TYPE_SFUNCION);
            this.jSliderBrillo.setValue(0);
            this.jSliderRotacion.setValue(0);
            this.jSliderUmbralizacion.setValue(127);
            
        }
    }//GEN-LAST:event_jButtonContrasteNormalActionPerformed

    private void jButtonRotar90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRotar90ActionPerformed
       BarraEstado.setText("Rotacion ");
        VentanaDibujo vi = (VentanaDibujo) (Escritorio.getSelectedFrame());
        if (vi != null) {
            vi.getLienzo().rotar(90,true);            
            this.jSliderBrillo.setValue(0);
           // System.out.print(jSliderRotacion.getValue() + 90);
            this.jSliderRotacion.setValue((jSliderRotacion.getValue() + 90)/360);
            this.jSliderUmbralizacion.setValue(127);
            
        }
    }//GEN-LAST:event_jButtonRotar90ActionPerformed
    /**
     * 
     * @param evt 
     */
    private void jButtonRotar270ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRotar270ActionPerformed
        BarraEstado.setText("Rotacion ");
        VentanaDibujo vi = (VentanaDibujo) (Escritorio.getSelectedFrame());
        if (vi != null) {
            vi.getLienzo().rotar(270,true);            
            this.jSliderBrillo.setValue(0);
            this.jSliderRotacion.setValue(0);
            this.jSliderUmbralizacion.setValue(127);
            
        }
    }//GEN-LAST:event_jButtonRotar270ActionPerformed

    private void jButtonContrasteBrilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContrasteBrilloActionPerformed
        BarraEstado.setText("Contraste Brillo");
        VentanaDibujo vi = (VentanaDibujo) (Escritorio.getSelectedFrame());
        if (vi != null) {
            vi.getLienzo().Contraste(LookupTableProducer.TYPE_ROOT);            
            this.jSliderBrillo.setValue(0);
            this.jSliderRotacion.setValue(0);
            this.jSliderUmbralizacion.setValue(127);
            
        }
    }//GEN-LAST:event_jButtonContrasteBrilloActionPerformed

    private void jButtonContrasteOscurecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContrasteOscurecerActionPerformed
        BarraEstado.setText("Contraste Oscurecer");
        VentanaDibujo vi = (VentanaDibujo) (Escritorio.getSelectedFrame());
        if (vi != null) {
            vi.getLienzo().Contraste(LookupTableProducer.TYPE_POWER);            
            this.jSliderBrillo.setValue(0);
            this.jSliderRotacion.setValue(0);
            this.jSliderUmbralizacion.setValue(127);
            
        }
    }//GEN-LAST:event_jButtonContrasteOscurecerActionPerformed

    private void jButtonSinusoidalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSinusoidalActionPerformed
        BarraEstado.setText("Funcion Seno");
        VentanaDibujo vi = (VentanaDibujo) (Escritorio.getSelectedFrame());
        if (vi != null) {
            vi.getLienzo().vSeno(180.0/255.0);
            this.jSliderBrillo.setValue(0);
            this.jSliderRotacion.setValue(0);
            this.jSliderUmbralizacion.setValue(127);
            
        }
    }//GEN-LAST:event_jButtonSinusoidalActionPerformed

    private void jButtonEscalaMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEscalaMasActionPerformed
        BarraEstado.setText("Escalar Positivo");
        VentanaDibujo vi = (VentanaDibujo) (Escritorio.getSelectedFrame());
        if (vi != null) {
            vi.getLienzo().Escalado(1.25f,1.25f);            
            this.jSliderBrillo.setValue(0);
            this.jSliderRotacion.setValue(0);
            this.jSliderUmbralizacion.setValue(127);
            
        }
    }//GEN-LAST:event_jButtonEscalaMasActionPerformed

    private void jButtonEscalaMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEscalaMenosActionPerformed
        BarraEstado.setText("Escalar Negativo");
        VentanaDibujo vi = (VentanaDibujo) (Escritorio.getSelectedFrame());
        if (vi != null) {
            vi.getLienzo().Escalado(0.75f,0.75f);            
            this.jSliderBrillo.setValue(0);
            this.jSliderRotacion.setValue(0);
            this.jSliderUmbralizacion.setValue(127);
            
        }
    }//GEN-LAST:event_jButtonEscalaMenosActionPerformed

    private void jButtonSepiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSepiaActionPerformed
        BarraEstado.setText("Sepia"); 
        VentanaDibujo vi = (VentanaDibujo) (Escritorio.getSelectedFrame());
        if (vi != null) {
            vi.getLienzo().sepia();            
            this.jSliderBrillo.setValue(0);
            this.jSliderRotacion.setValue(0);
            this.jSliderUmbralizacion.setValue(127);
        }
    }//GEN-LAST:event_jButtonSepiaActionPerformed

    private void jButtonBinarioMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBinarioMasActionPerformed
        BarraEstado.setText("Binario Positivo");
        VentanaDibujo vi = (VentanaDibujo) (Escritorio.getSelectedFrame());
        if (vi != null) {
            VentanaDibujo viNext = (VentanaDibujo) Escritorio.selectFrame(false);
            if (viNext != null) {
                BufferedImage imgRight = vi.getLienzo().getImage(true);
                BufferedImage imgLeft = viNext.getLienzo().getImage(true);
                if (imgRight != null && imgLeft != null) {
                    try {
                        BlendOp op = new BlendOp(imgLeft);
                        BufferedImage imgdest = op.filter(imgRight, null);                        
                        vi = new VentanaDibujo(this);
                        vi.getLienzo().setImage(imgdest);
                        this.Escritorio.add(vi);
                        vi.setVisible(true);
                    } catch (IllegalArgumentException e) {
                        System.err.println("Error: "+e.getLocalizedMessage());
                    }
                }
            }
        }
        this.jSliderBrillo.setValue(0);
        this.jSliderRotacion.setValue(0);
        this.jSliderUmbralizacion.setValue(127);
       
    }//GEN-LAST:event_jButtonBinarioMasActionPerformed

    private void jButtonBinarioMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBinarioMenosActionPerformed
        BarraEstado.setText("Binario Negativo");
        VentanaDibujo vi = (VentanaDibujo) (Escritorio.getSelectedFrame());
        if (vi != null) {
            VentanaDibujo viNext = (VentanaDibujo) Escritorio.selectFrame(false);
            if (viNext != null) {
                BufferedImage imgRight = vi.getLienzo().getImage(true);
                BufferedImage imgLeft = viNext.getLienzo().getImage(true);
                if (imgRight != null && imgLeft != null) {
                    try {
                        SubtractionOp op = new SubtractionOp(imgLeft);
                        BufferedImage imgdest = op.filter(imgRight, null);                        
                        vi = new VentanaDibujo(this);
                        vi.getLienzo().setImage(imgdest);
                        this.Escritorio.add(vi);
                        vi.setVisible(true);
                    } catch (IllegalArgumentException e) {
                        System.err.println("Error: "+e.getLocalizedMessage());
                    }
                }
            }
        }
        this.jSliderBrillo.setValue(0);
        this.jSliderRotacion.setValue(0);
        this.jSliderUmbralizacion.setValue(127);
   
    }//GEN-LAST:event_jButtonBinarioMenosActionPerformed
        
   
    private void ToggleButtonCPControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButtonCPControlActionPerformed
        BarraEstado.setText("Curva con un punto de control");
        VentanaDibujo vi;
        vi = (VentanaDibujo)Escritorio.getSelectedFrame();
        if ( vi != null){
            vi.getLienzo().setTipoActual(4);//Ponemos la Curva Con punto de Control
            vi.getLienzo().setEditar(false);
        }
    }//GEN-LAST:event_ToggleButtonCPControlActionPerformed

    private void ToggleButtonPoligonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButtonPoligonoActionPerformed
        BarraEstado.setText("Poligono");
        VentanaDibujo vi;
        vi = (VentanaDibujo)Escritorio.getSelectedFrame();
        if ( vi != null){
            vi.getLienzo().setTipoActual(5);//Ponemos el Poligono
            vi.getLienzo().setEditar(false);
        }
    }//GEN-LAST:event_ToggleButtonPoligonoActionPerformed

    private void ComboBoxTipoTrazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxTipoTrazoActionPerformed
       VentanaDibujo vi = (VentanaDibujo) (Escritorio.getSelectedFrame());
       if (ComboBoxTipoTrazo.getSelectedIndex() == 0){//lINEA CONTINUA
            if (vi != null) {
                vi.getLienzo().setContinua(true);
                vi.getLienzo().setColorTrazo(ButtonColorTrazo.getBackground());
                vi.getLienzo().setGrosorTrazo(Float.parseFloat(SpinnerGrosor.getValue().toString()));
                vi.getLienzo().actualizaTrazoFigura(true,Float.parseFloat(SpinnerGrosor.getValue().toString()),ButtonColorTrazo.getBackground());//Ponemos que es continua
            }
       }else{
            if (vi != null) {
                vi.getLienzo().setContinua(false);
                vi.getLienzo().setColorTrazo(ButtonColorTrazo.getBackground());
                vi.getLienzo().setGrosorTrazo(Float.parseFloat(SpinnerGrosor.getValue().toString()));
                vi.getLienzo().actualizaTrazoFigura(false,Float.parseFloat(SpinnerGrosor.getValue().toString()),ButtonColorTrazo.getBackground());//Ponemos que es discontinua
            }
       }
        
    }//GEN-LAST:event_ComboBoxTipoTrazoActionPerformed

    private void SpinnerGrosorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinnerGrosorStateChanged
 
        VentanaDibujo vi = (VentanaDibujo) (Escritorio.getSelectedFrame());
        if (vi != null) {
            float value = Float.parseFloat(((JSpinner) evt.getSource()).getValue().toString());
            if (value < 0) 
                vi.getLienzo().setGrosorTrazo(0);
            else
                vi.getLienzo().setGrosorTrazo(Float.parseFloat(SpinnerGrosor.getValue().toString()));
            vi.getLienzo().actualizaGrosorTrazoFigura(Float.parseFloat(SpinnerGrosor.getValue().toString()));
        }
        
    }//GEN-LAST:event_SpinnerGrosorStateChanged

    private void jComboBoxTipoRellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoRellenoActionPerformed
       VentanaDibujo vi = (VentanaDibujo) (Escritorio.getSelectedFrame());
        if (vi != null) {
            if (jComboBoxTipoRelleno.getSelectedIndex()== 0){//Sin relleno
                jComboBoxDegradado.setVisible(false);
                jButtonColorRelleno.setVisible(false);
                jButtonColorGradiente.setVisible(false); 
            }else if(jComboBoxTipoRelleno.getSelectedIndex()== 1){//Relleno liso
                 jComboBoxDegradado.setVisible(false);
                 jButtonColorRelleno.setVisible(true);
                 jButtonColorGradiente.setVisible(false); 
            }else if(jComboBoxTipoRelleno.getSelectedIndex()== 2){//Degradado
                jComboBoxDegradado.setVisible(true);
                jButtonColorRelleno.setVisible(true);
                jButtonColorGradiente.setVisible(true);                
            }
            vi.getLienzo().setTipoRelleno(jComboBoxTipoRelleno.getSelectedIndex());
            vi.getLienzo().setColorRelleno(jButtonColorRelleno.getBackground());
            vi.getLienzo().setColorGradiente(jButtonColorGradiente.getBackground());
            vi.getLienzo().actualizaRellenoFigura(jComboBoxTipoRelleno.getSelectedIndex(), jButtonColorRelleno.getBackground(),jComboBoxDegradado.getSelectedIndex(), jButtonColorGradiente.getBackground());
                    
            this.repaint();
        }   
    }//GEN-LAST:event_jComboBoxTipoRellenoActionPerformed

    private void jComboBoxDegradadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDegradadoActionPerformed

        VentanaDibujo vi = (VentanaDibujo) (Escritorio.getSelectedFrame());
        if (vi != null) {
            vi.getLienzo().setTipoGradiente(jComboBoxDegradado.getSelectedIndex());
            vi.getLienzo().actualizaRellenoFigura(2, jButtonColorRelleno.getBackground(),jComboBoxDegradado.getSelectedIndex(), jButtonColorGradiente.getBackground());//Con el dos ponemos el degradado
            this.repaint();
        }
        
    }//GEN-LAST:event_jComboBoxDegradadoActionPerformed

   
    private void jButtonNegativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNegativoActionPerformed
        BarraEstado.setText("Negativo");
        VentanaDibujo vi = (VentanaDibujo) (Escritorio.getSelectedFrame());
        if (vi != null) {
            vi.getLienzo().negativo();
            this.jSliderBrillo.setValue(0);
            this.jSliderRotacion.setValue(0);
            this.jSliderUmbralizacion.setValue(127);
            vi.getLienzo().repaint();
        }
        
    }//GEN-LAST:event_jButtonNegativoActionPerformed

    private void jButtonDuplicadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDuplicadoActionPerformed
        BarraEstado.setText("Duplicar");
        VentanaDibujo vi = (VentanaDibujo) (Escritorio.getSelectedFrame());
        if (vi != null) {
            BufferedImage img = vi.getLienzo().getImage(true);
            if (img != null ) {
                try {
                    vi = new VentanaDibujo(this);
                    ColorModel cm = img.getColorModel();
                    boolean isAlphaPremultiplied = cm.isAlphaPremultiplied();
                    WritableRaster raster = img.copyData(null);
                    vi.getLienzo().setImage(new BufferedImage(cm, raster, isAlphaPremultiplied, null));
                    vi.setSize(img.getWidth(),img.getHeight());
                    vi.setTitle("Copia duplicada");
                    this.Escritorio.add(vi);
                    vi.setVisible(true);
                } catch (IllegalArgumentException e) {
                    System.err.println("Error al duplicar imagen");
                }
            }
        }
        this.jSliderBrillo.setValue(0);
        this.jSliderRotacion.setValue(0);
        this.jSliderUmbralizacion.setValue(127);
    }//GEN-LAST:event_jButtonDuplicadoActionPerformed

    private void jButtonGrisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGrisesActionPerformed
        BarraEstado.setText("Escala de Grises");
        VentanaDibujo vi = (VentanaDibujo) (Escritorio.getSelectedFrame());
        if (vi != null) {
            vi.getLienzo().escaladegrises();
            this.jSliderBrillo.setValue(0);
            this.jSliderRotacion.setValue(0);
            this.jSliderUmbralizacion.setValue(127);
            vi.getLienzo().repaint();
        }
        
    }//GEN-LAST:event_jButtonGrisesActionPerformed

    private void jButtonPropiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPropiaActionPerformed
        BarraEstado.setText("Funcion Propia MSM");
        VentanaDibujo vi = (VentanaDibujo) (Escritorio.getSelectedFrame());
        if (vi != null) {
            vi.getLienzo().msm();
            this.jSliderBrillo.setValue(0);
            this.jSliderRotacion.setValue(0);
            this.jSliderUmbralizacion.setValue(127);
        }
        
    }//GEN-LAST:event_jButtonPropiaActionPerformed

    private void jSliderUmbralizacionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderUmbralizacionStateChanged
        BarraEstado.setText("umbralizando " + this.jSliderUmbralizacion.getValue());
        VentanaDibujo vi = (VentanaDibujo) (Escritorio.getSelectedFrame());
        if (vi != null) {
            vi.getLienzo().Umbralizar(this.jSliderUmbralizacion.getValue());
            this.jSliderBrillo.setValue(0);
            this.jSliderRotacion.setValue(0);
        }
        
    }//GEN-LAST:event_jSliderUmbralizacionStateChanged

    private void jSliderTransparenciaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderTransparenciaStateChanged
         BarraEstado.setText("Transparencia ");
        VentanaDibujo vi;
        vi = (VentanaDibujo)Escritorio.getSelectedFrame();
        if ( vi != null){
            vi.getLienzo().setTransparencia(this.jSliderTransparencia.getValue()*0.1f);
            vi.getLienzo().actualizaTransparenciaFigura(this.jSliderTransparencia.getValue()*0.1f);
        }
    }//GEN-LAST:event_jSliderTransparenciaStateChanged

    private void jButtonColorGradienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonColorGradienteMouseClicked
        VentanaDibujo vi = (VentanaDibujo) (Escritorio.getSelectedFrame());
        if (vi != null) {
            if (evt.getClickCount() % 2 == 0) {//Pulsamos dos veces
                Color colorGradiente = JColorChooser.showDialog( VentanaPrincipal.this,"Color del Gradiente", jButtonColorGradiente.getBackground());
                if (colorGradiente != null) {
                    jButtonColorGradiente.setBackground(colorGradiente);
                    vi.getLienzo().setColorGradiente(jButtonColorGradiente.getBackground());
                }
            } else if (evt.getClickCount() % 2 == 1) 
                vi.getLienzo().setColorGradiente(jButtonColorGradiente.getBackground());
            vi.getLienzo().actualizaRellenoFigura(this.jComboBoxTipoRelleno.getSelectedIndex(), jButtonColorRelleno.getBackground(),jComboBoxDegradado.getSelectedIndex(), jButtonColorGradiente.getBackground());
        }
    }//GEN-LAST:event_jButtonColorGradienteMouseClicked

    private void jButtonColorRellenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonColorRellenoMouseClicked
         VentanaDibujo vi = (VentanaDibujo) (Escritorio.getSelectedFrame());
         if (vi!= null){
        if (evt.getClickCount() % 2 == 0 || jButtonColorRelleno.getBackground() == null) {
            Color ColorRelleno = JColorChooser.showDialog( VentanaPrincipal.this,"Color de Relleno",jButtonColorRelleno.getBackground());
            if (ColorRelleno != null) {
                jButtonColorRelleno.setBackground(ColorRelleno);
                vi.getLienzo().setColorRelleno(jButtonColorRelleno.getBackground());
            }
        } else if (evt.getClickCount() % 2 == 1) 
            vi.getLienzo().setColorRelleno(jButtonColorRelleno.getBackground());
         vi.getLienzo().actualizaRellenoFigura(this.jComboBoxTipoRelleno.getSelectedIndex(), jButtonColorRelleno.getBackground(),jComboBoxDegradado.getSelectedIndex(), jButtonColorGradiente.getBackground());
         }
    }//GEN-LAST:event_jButtonColorRellenoMouseClicked

    private void ButtonColorTrazoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonColorTrazoMouseClicked
        VentanaDibujo vi = (VentanaDibujo) (Escritorio.getSelectedFrame());
        if (vi != null) {
        if (evt.getClickCount() % 2 == 0 || ButtonColorTrazo.getBackground() == null) {
            Color ColorTrazo = JColorChooser.showDialog( VentanaPrincipal.this, "Color del Trazo", ButtonColorTrazo.getBackground());
            if (ColorTrazo != null) {
                ButtonColorTrazo.setBackground(ColorTrazo);
                vi.getLienzo().setColorGradiente(ButtonColorTrazo.getBackground());
            }
        } else if (evt.getClickCount() % 2 == 1) 
            vi.getLienzo().setColorGradiente(ButtonColorTrazo.getBackground());
        
        vi.getLienzo().actualizaColorTrazoFigura(ButtonColorTrazo.getBackground());
        }
    }//GEN-LAST:event_ButtonColorTrazoMouseClicked

    private void ButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNuevoActionPerformed
        
        MenuNuevoActionPerformed(evt);
        
    }//GEN-LAST:event_ButtonNuevoActionPerformed

    private void ButtonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAbrirActionPerformed
        MenuAbrirActionPerformed(evt);
    }//GEN-LAST:event_ButtonAbrirActionPerformed

    private void ButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGuardarActionPerformed
        MenuGuardarActionPerformed(evt);
    }//GEN-LAST:event_ButtonGuardarActionPerformed

    private void ButtonCapturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCapturaActionPerformed
        if (Escritorio.getSelectedFrame() instanceof VentanaMultimedia){
            VentanaMultimedia viplayer = (VentanaMultimedia)Escritorio.getSelectedFrame();
            BufferedImage img = viplayer.getFrame();
            VentanaDibujo vi = new VentanaDibujo(this);
            vi.getLienzo().setImage(img);
            vi.setSize(img.getWidth(),img.getHeight());
            vi.setTitle("Captura de Video");
            this.Escritorio.add(vi);
            vi.setVisible(true);
        }
 
    }//GEN-LAST:event_ButtonCapturaActionPerformed

    private void ButtonMicrofonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMicrofonoActionPerformed
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showSaveDialog(this);
        dlg.setFileFilter(new ArchivoMp3());
        dlg.addChoosableFileFilter(new ArchivoWav());
        dlg.addChoosableFileFilter(new ArchivoAu());
        if (resp == JFileChooser.APPROVE_OPTION) {
            try {
                File f = dlg.getSelectedFile();
                VentanaGrabacion vi = new VentanaGrabacion(f);
                vi.setTitle(f.getName());
                vi.setVisible(true);
                Escritorio.add(vi);
            }catch (Exception ex) {
                System.err.println("Error al abrir microfono");
            }
        }
    }//GEN-LAST:event_ButtonMicrofonoActionPerformed

    private void ButtonAlisadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAlisadoActionPerformed
        
        VentanaDibujo vi = (VentanaDibujo) (Escritorio.getSelectedFrame());
        if (vi != null) {
            JToggleButton tb;
            tb = (JToggleButton) evt.getSource();
            if (tb.isSelected()) {
                vi.getLienzo().setAlisar(true);
                vi.getLienzo().actualizaAlisarFigura(true);
            } else {
                vi.getLienzo().setAlisar(false);
                vi.getLienzo().actualizaAlisarFigura(false);
            }
            vi.getLienzo().repaint();
        }
    }//GEN-LAST:event_ButtonAlisadoActionPerformed
    
    /**
     * Metodo para realizar modificaciones sobre la ventana dependiendo de como pintemos la figura
     * Vemos la figura seleccionada asi como todos los atributos
     */
  
    public void modificaciones(){
        VentanaDibujo vi= (VentanaDibujo)Escritorio.getSelectedFrame();
       //Veamos si tenemos ventana seleccionada
        if(vi!=null){
            //Vemos que herramienta estamos usando
            if(vi.getLienzo().getTipoActual() == 0)//Punto
                this.jToggleButtonPunto.setSelected(true);
            else if (vi.getLienzo().getTipoActual() == 1)//LINEA
                this.ToggleButtonLinea.setSelected(true);
            else if (vi.getLienzo().getTipoActual() == 2)//Rectangulo
                this.ToggleButtonRectangulo.setSelected(true);
            else if (vi.getLienzo().getTipoActual() == 3)//Elipse
                this.ToggleButtonOvalo.setSelected(true);
            else if (vi.getLienzo().getTipoActual() == 4)//CurvaPuntocontrol
                this.ToggleButtonCPControl.setSelected(true);
            else if (vi.getLienzo().getTipoActual() == 5)//Poligono
                this.ToggleButtonPoligono.setSelected(true);    
            
            
            //vemos el tipo de trazo que usamos
            if(vi.getLienzo().getContinua()==true)
                this.ComboBoxTipoTrazo.setSelectedIndex(0);
            else
                this.ComboBoxTipoTrazo.setSelectedIndex(1);
            
            //tipo de Relleno
            if(vi.getLienzo().getTipoRelleno()==0)//Sin relleno
                this.jComboBoxTipoRelleno.setSelectedIndex(0);
            else if(vi.getLienzo().getTipoRelleno()==1)//Relleno liso
                this.jComboBoxTipoRelleno.setSelectedIndex(1);
            else//Degradao
                this.jComboBoxTipoRelleno.setSelectedIndex(2);
                
            //Para el alisado
            if(vi.getLienzo().getAlisar() == false)
                this.ButtonAlisado.setSelected(false);
            else
                this.ButtonAlisado.setSelected(true);
    
           
            this.SpinnerGrosor.setValue(vi.getLienzo().getGrosorTrazo());
            this.ButtonColorTrazo.setBackground(vi.getLienzo().getColorTrazo());          
            this.jButtonColorRelleno.setBackground(vi.getLienzo().getColorRelleno());
            this.jButtonColorGradiente.setBackground(vi.getLienzo().getColorGradiente());            
           
            this.jSliderTransparencia.setValue((int) (10*vi.getLienzo().getTransparencia()));    
           
        }       
            
        this.repaint();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BarraEstado;
    private javax.swing.JButton ButtonAbrir;
    private javax.swing.JToggleButton ButtonAlisado;
    private javax.swing.JButton ButtonCaptura;
    private javax.swing.JButton ButtonColorTrazo;
    private javax.swing.JButton ButtonGuardar;
    private javax.swing.JButton ButtonMicrofono;
    private javax.swing.JButton ButtonNuevo;
    private javax.swing.JCheckBoxMenuItem CheckBoxBarraAtributos;
    private javax.swing.JCheckBoxMenuItem CheckBoxBarraEstado;
    private javax.swing.JCheckBoxMenuItem CheckBoxBarraInferior;
    private javax.swing.JComboBox<String> ComboBoxTipoTrazo;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.ButtonGroup GrupoHerramientas;
    private javax.swing.JPanel Herramientas;
    private javax.swing.JMenuItem MenuAbrir;
    private javax.swing.JMenu MenuArchivo;
    private javax.swing.JMenu MenuEdicion;
    private javax.swing.JMenuItem MenuGuardar;
    private javax.swing.JMenuItem MenuNuevo;
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JPanel PanelAtributos;
    private javax.swing.JSpinner SpinnerGrosor;
    private javax.swing.JToggleButton ToggleButtonCPControl;
    private javax.swing.JToggleButton ToggleButtonEditar;
    private javax.swing.JToggleButton ToggleButtonLinea;
    private javax.swing.JToggleButton ToggleButtonOvalo;
    private javax.swing.JToggleButton ToggleButtonPoligono;
    private javax.swing.JToggleButton ToggleButtonRectangulo;
    private javax.swing.JPanel Trazo;
    private javax.swing.JButton jButtonBinarioMas;
    private javax.swing.JButton jButtonBinarioMenos;
    private javax.swing.JButton jButtonColorGradiente;
    private javax.swing.JButton jButtonColorRelleno;
    private javax.swing.JButton jButtonContrasteBrillo;
    private javax.swing.JButton jButtonContrasteNormal;
    private javax.swing.JButton jButtonContrasteOscurecer;
    private javax.swing.JButton jButtonDuplicado;
    private javax.swing.JButton jButtonEscalaMas;
    private javax.swing.JButton jButtonEscalaMenos;
    private javax.swing.JButton jButtonGrises;
    private javax.swing.JButton jButtonNegativo;
    private javax.swing.JButton jButtonPropia;
    private javax.swing.JButton jButtonRotar180;
    private javax.swing.JButton jButtonRotar270;
    private javax.swing.JButton jButtonRotar90;
    private javax.swing.JButton jButtonSepia;
    private javax.swing.JButton jButtonSinusoidal;
    private javax.swing.JComboBox<String> jComboBoxDegradado;
    private javax.swing.JComboBox<String> jComboBoxFiltro;
    private javax.swing.JComboBox<String> jComboBoxTipoRelleno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelAlisado;
    private javax.swing.JPanel jPanelBinario;
    private javax.swing.JPanel jPanelBrillo;
    private javax.swing.JPanel jPanelColorRelleno;
    private javax.swing.JPanel jPanelContraste;
    private javax.swing.JPanel jPanelEscala;
    private javax.swing.JPanel jPanelFiltro;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelRelleno;
    private javax.swing.JPanel jPanelRotacion;
    private javax.swing.JPanel jPanelTipo;
    private javax.swing.JPanel jPanelTransparencia;
    private javax.swing.JPanel jPanelUmbralizacion;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JSlider jSliderBrillo;
    private javax.swing.JSlider jSliderRotacion;
    private javax.swing.JSlider jSliderTransparencia;
    private javax.swing.JSlider jSliderUmbralizacion;
    private javax.swing.JToggleButton jToggleButtonPunto;
    // End of variables declaration//GEN-END:variables
}
