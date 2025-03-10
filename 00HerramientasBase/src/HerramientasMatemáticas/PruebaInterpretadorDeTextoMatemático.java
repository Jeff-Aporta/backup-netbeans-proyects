package HerramientasMatemáticas;

import static HerramientaDeImagen.Filtros_Lineales.*;
import HerramientaDeImagen.GeneradorDeTexto;
import HerramientaArchivos.LectoEscrituraArchivos;
import javax.swing.JFrame;

import static HerramientasGUI.NimbusModificado.*;
import static HerramientasMatemáticas.Matemática.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Font;
import static HerramientaArchivos.LectoEscrituraArchivos.*;
import java.awt.BasicStroke;
import java.awt.Graphics2D;
import javax.swing.JColorChooser;

public final class PruebaInterpretadorDeTextoMatemático extends JFrame {

    GeneradorDeTexto generadorDeTexto = new GeneradorDeTexto()
            .ModificarFuente(new Font("times new roman", Font.PLAIN, 55))
            .DistanciaEntreRenglones(3)
            .AlineaciónHorizontal(Dupla.MEDIO)
            .ColorFuente(Color.BLACK)
            .Borde(Color.WHITE, 3.5f);

    BufferedImage últimaImagenCargada = null;
    BufferedImage fotograma = null;

    public static void main(String args[]) {
        try {
            CargarTemaOscuroNimbus();
            CargarNimbus();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        new PruebaInterpretadorDeTextoMatemático();
    }

    public PruebaInterpretadorDeTextoMatemático() {
        initComponents();
        setTitle("Interprete Matemático - Jeff Aporta (Jeffrey Alexander Agudelo Espitia)");
        MostrarTexto("Interprete\nMatemático\n(Reales)");
        jButton1.setBackground(new Color(150, 100, 0));
        jTextArea1.setForeground(new Color(30, 190, 255));
        jTextPane2.setForeground(new Color(0, 190, 255));
        jTextArea2.setForeground(new Color(30, 255, 190));
        jTextPane1.setForeground(new Color(0, 255, 190));
        setSize(900, 600);
        setLocationRelativeTo(null);
        pack();
        try {
            {
                BufferedImage logo;
                try {
                    logo = cargar_imagen("/HerramientasGUI/logo.png");
                    if (logo == null) {
                        throw new Exception("No se pudo localizar");
                    }
                } catch (Exception e) {
                    logo = cargar_imagen(
                            "https://img00.deviantart.net/cc6c/i/2016/283/8/a/firma_jeff_aporta___copia_by_"
                            + "jeffreyagudelo-dakl4y3.png"
                    );
                }
                BufferedImage icono = EscalarGranCalidad(logo, 32, -1);
                setIconImage(icono);
            }
            BufferedImage logoTexto;
            try {
                logoTexto = cargar_imagen("/HerramientasGUI/logotexto.png");
                if (logoTexto == null) {
                    throw new Exception("No se pudo localizar");
                }
            } catch (Exception e) {
                logoTexto = cargar_imagen(
                        "https://orig00.deviantart.net/ca4c/f/2016/322/4/1/firma_jeff_aporta_copia_by_"
                        + "jeffreyagudelo-daovr7h.png"
                );
            }
            logoTexto = EscalarGranCalidad(logoTexto, -1, (int) (últimaImagenCargada.getHeight() * 1.3));
            BufferedImage muestra = new Dupla(últimaImagenCargada)
                    .Escalar(1.3)
                    .ReemplazarX(logoTexto.getWidth() + últimaImagenCargada.getWidth())
                    .convBufferedImage();
            {
                Graphics g = muestra.getGraphics();
                g.drawImage(logoTexto, 0, 0, null);
                Dupla pos = Dupla.Alinear(muestra, últimaImagenCargada, Dupla.MEDIO, Dupla.MEDIO);
                g.drawImage(últimaImagenCargada, logoTexto.getWidth(), pos.intY(), null);
            }
            últimaImagenCargada = muestra;
            actualizarFotograma();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR", "ERROR", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        setExtendedState(MAXIMIZED_BOTH);
        setVisible(true);
        setFocusable(true);
    }

    void ActualizarTextoError(String texto) {
        generadorDeTexto.ColorBorde(Color.DARK_GRAY);
        generadorDeTexto.ColorFuente(Color.YELLOW);
        MostrarTexto(texto);
    }

    void ActualizarTexto(String texto) {
        generadorDeTexto.ColorBorde(new Color(0, 150, 255));
        generadorDeTexto.ColorFuente(Color.WHITE);
        MostrarTexto(texto);
    }

    void MostrarTexto(String texto) {
        if (texto == null) {
            últimaImagenCargada = generadorDeTexto.GenerarTexto("error");
            actualizarFotograma();
        } else {
            texto = texto.replace(" ", "");
            últimaImagenCargada = generadorDeTexto.GenerarTexto(texto);
            actualizarFotograma();
        }
    }

    void actualizarFotograma() {
        Presentador.setIcon(null);
        Presentador.setIcon(new ImageIcon(new BufferedImage(Presentador.getWidth() - 2, Presentador.getHeight() - 2, 2) {
            {
                Graphics g = getGraphics();
                g.setColor(Color.BLACK);
                g.fillRect(0, 0, getWidth(), getHeight());
                Ajuste_Personalizado(últimaImagenCargada, this, AJUSTE_CENTRADO_AJUSTAR);
            }
        })
        );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Presentador = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jPanel3 = new javax.swing.JPanel();
        jSpinner1 = new javax.swing.JSpinner();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jButton7 = new javax.swing.JButton();
        jRadioButton7 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMaximumSize(null);
        setPreferredSize(new java.awt.Dimension(900, 590));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jScrollPane2.setMaximumSize(null);
        jScrollPane2.setMinimumSize(null);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(852, 600));

        jPanel1.setMaximumSize(null);
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 590));

        jPanel2.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel2.setPreferredSize(new java.awt.Dimension(830, 590));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Evaluar");
        jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton1MouseMoved(evt);
            }
        });
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Presentador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("x=4\ny=-2\ne^x*sin(y)+e^y*cos(x)");
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setText("Listar funciones");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane4.setMaximumSize(new java.awt.Dimension(400, 800));
        jScrollPane4.setMinimumSize(new java.awt.Dimension(400, 800));

        jEditorPane1.setEditable(false);
        jScrollPane4.setViewportView(jEditorPane1);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consola");

        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea2KeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jTextArea2);

        jButton4.setText("Limpiar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextPane1.setEditable(false);
        jTextPane1.setPreferredSize(new java.awt.Dimension(200, 6));
        jScrollPane5.setViewportView(jTextPane1);

        jTextPane2.setEditable(false);
        jTextPane2.setPreferredSize(new java.awt.Dimension(200, 20));
        jScrollPane6.setViewportView(jTextPane2);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Interpretador de árbol binario"));
        jPanel3.setLayout(null);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(4, 0, null, 1));
        jPanel3.add(jSpinner1);
        jSpinner1.setBounds(90, 20, 50, 25);

        jRadioButton4.setSelected(true);
        jRadioButton4.setText("Bordear");
        jPanel3.add(jRadioButton4);
        jRadioButton4.setBounds(140, 80, 70, 18);

        jLabel4.setText("Grosor Borde");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(10, 19, 80, 25);

        jLabel5.setText("Sep. Hor.");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(150, 20, 60, 25);

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(20, 0, null, 1));
        jPanel3.add(jSpinner2);
        jSpinner2.setBounds(205, 20, 50, 25);

        jLabel6.setText("Sep. Vert.");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(280, 20, 60, 25);

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(20, 0, null, 1));
        jPanel3.add(jSpinner3);
        jSpinner3.setBounds(340, 20, 50, 25);

        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Mostrar variables");
        jPanel3.add(jRadioButton1);
        jRadioButton1.setBounds(10, 50, 130, 18);

        jRadioButton3.setSelected(true);
        jRadioButton3.setText("Mostrar vertices");
        jPanel3.add(jRadioButton3);
        jRadioButton3.setBounds(140, 50, 120, 18);

        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Mostrar ramas");
        jPanel3.add(jRadioButton2);
        jRadioButton2.setBounds(10, 80, 130, 18);

        jButton5.setText("Mostrar árboles");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(270, 80, 120, 28);

        jLabel2.setText("Interpretador 1");

        jLabel3.setText("Interpretador 2");

        jButton6.setText("Guargar imagen");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jRadioButton5.setText("Obligar punto y coma (;)");

        jRadioButton6.setText("Obligar punto y coma (;)");

        jButton7.setText("Expresiones entendidas");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jRadioButton7.setSelected(true);
        jRadioButton7.setText("Simplificación automática");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Presentador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(3, 3, 3)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton5)
                                .addGap(0, 51, Short.MAX_VALUE))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton2)
                                    .addGap(208, 208, 208)
                                    .addComponent(jButton1))
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Presentador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(jButton7))
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton6))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4)
                        .addComponent(jRadioButton5)))
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jPanel1);

        getContentPane().add(jScrollPane2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextArea1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyReleased
        jTextArea1.setBackground(nimbusLightBackground);
        jTextArea2.setBackground(nimbusLightBackground);
    }//GEN-LAST:event_jTextArea1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        InterpretadorDeTextoMatemático interpretador = null;
        try {
            if (!jTextArea1.getText().trim().isEmpty() && !jTextArea2.getText().trim().isEmpty()) {
                interpretador = new InterpretadorDeTextoMatemático(
                        jTextArea1.getText(),  jRadioButton6.isSelected(), true,jRadioButton7.isSelected()
                );
                String mostrar1 = "";
                double vals[] = interpretador.ObtenerValorDeExpresión();
                for (double d : vals) {
                    if (Double.isNaN(d)) {
                        mostrar1 += "NaN (revise la expresión)" + "\n";
                    } else {
                        mostrar1 += EliminarNotaciónCientifica(d) + "\n";
                    }
                }
                jTextPane2.setText(mostrar1);
                jEditorPane1.setContentType("text/plain");
                jEditorPane1.setText(interpretador.TextoDeAnalisis);
                String mostrar2 = "";
                interpretador = new InterpretadorDeTextoMatemático(
                        jTextArea2.getText(),  jRadioButton5.isSelected(), true,jRadioButton7.isSelected()
                );
                double vals2[] = interpretador.ObtenerValorDeExpresión();
                for (double d : vals2) {
                    if (Double.isNaN(d)) {
                        mostrar2 += "NaN (revise la expresión)" + "\n";
                    } else {
                        mostrar2 += EliminarNotaciónCientifica(d) + "\n";
                    }
                }
                jTextPane1.setText(mostrar2);
                jEditorPane1.setText(
                        jEditorPane1.getText()
                        + "\n\n\n\n-------------Segundo analisis\n\n\n\n"
                        + interpretador.TextoDeAnalisis);
                generadorDeTexto.ColorBorde(new Color(0, 150, 255));
                generadorDeTexto.ColorFuente(Color.WHITE);
                BufferedImage col1 = generadorDeTexto.GenerarTexto(mostrar1);
                generadorDeTexto.ColorBorde(new Color(0, 255, 150));
                generadorDeTexto.ColorFuente(Color.WHITE);
                BufferedImage col2 = generadorDeTexto.GenerarTexto(mostrar2);
                int d = 30;
                BufferedImage matriz = Dupla.convBufferedImage(
                        col1.getWidth() + col2.getWidth() + d,
                        Máx(col1.getHeight(), col2.getHeight())
                );
                Graphics g = matriz.getGraphics();
                g.drawImage(col1, 0, 0, null);
                g.drawImage(col2, col1.getWidth() + d, 0, null);
                últimaImagenCargada = matriz;
                actualizarFotograma();
            } else if (!jTextArea1.getText().trim().isEmpty()) {
                interpretador = new InterpretadorDeTextoMatemático(
                        jTextArea1.getText(),  jRadioButton6.isSelected(), true,jRadioButton7.isSelected()
                );
                String mostrar = "";
                double vals[] = interpretador.ObtenerValorDeExpresión();
                for (double d : vals) {
                    if (Double.isNaN(d)) {
                        mostrar += "NaN (revise la expresión)" + "\n";
                    } else {
                        mostrar += EliminarNotaciónCientifica(d) + "\n";
                    }
                }
                mostrar = mostrar.substring(0, mostrar.length() - 1);
                ActualizarTexto(mostrar + "");
                if (vals.length > 1) {
                    mostrar = mostrar.replace("\n", ",  ");
                }
                jTextPane2.setText(mostrar);
                jEditorPane1.setContentType("text/plain");
                jEditorPane1.setText(interpretador.TextoDeAnalisis);
            } else if (!jTextArea2.getText().trim().isEmpty()) {
                interpretador = new InterpretadorDeTextoMatemático(
                        jTextArea2.getText(),  jRadioButton5.isSelected(), true,jRadioButton7.isSelected()
                );
                String mostrar = "";
                double vals[] = interpretador.ObtenerValorDeExpresión();
                for (double d : vals) {
                    if (Double.isNaN(d)) {
                        mostrar += "NaN (revise la expresión)" + "\n";
                    } else {
                        mostrar += EliminarNotaciónCientifica(d) + "\n";
                    }
                }
                mostrar = mostrar.substring(0, mostrar.length() - 1);
                ActualizarTexto(mostrar + "");
                if (vals.length > 1) {
                    mostrar = mostrar.replace("\n", ",  ");
                }
                jTextPane1.setText(mostrar);
                jEditorPane1.setContentType("text/plain");
                jEditorPane1.setText(interpretador.TextoDeAnalisis);
            }
            jTextArea1.setBackground(nimbusLightBackground);
            jTextArea2.setBackground(nimbusLightBackground);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ActualizarTextoError(e.getMessage());
            jTextArea1.setBackground(new Color(50, 0, 0));
            jTextArea2.setBackground(new Color(50, 0, 0));
            jEditorPane1.setText(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        new Thread(() -> {
            Presentador.setIcon(null);
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
            actualizarFotograma();
        }).start();
    }//GEN-LAST:event_formComponentResized

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String lista;
        lista = "<B>" + TxtColorHTML("Variables", Color.GREEN) + "</B>";
        lista += nlHTML();
        lista += nlHTML();
        lista += VarList("π", "3.141592653589793");
        lista += VarList("φ", "1.618033988749895");
        lista += VarList("Φ", "1.618033988749895");
        lista += VarList("e", "2.718281828459045");
        lista += VarList("∞", "Infinito");
        lista += VarList("infinito", "Infinito");
        lista += nlHTML();
        lista += "<B>" + TxtColorHTML("Operadores binarios", Color.GREEN) + "</B>";
        lista += nlHTML();
        lista += OPList("+", "Para la suma");
        lista += OPList("-", "Para la resta");
        lista += OPList("* , ×", "Para la multiplicación");
        lista += OPList("/ , ÷", "Para la división");
        lista += OPList("^", "Para la potencia");
        lista += nlHTML();
        lista += "<B>" + TxtColorHTML("Funciones", Color.GREEN) + "</B>";
        lista += nlHTML();
        lista += TxtColorHTML("%núm% será cualquier número, %var% cualquier variable "
                + ", %exp% cualquier expresión algebraica y  %núm_var% para indicar que es un número o una variable "
                + "cualquiera", Color.RED);
        lista += nlHTML();
        lista += nlHTML();
        lista += "<B>" + TxtColorHTML("Multiplicaciones implicitas", Color.BLUE) + "</B>";
        lista += nlHTML();
        lista += nlHTML();
        lista += Función("%núm_var%", "Escala la expresión por el número indicado", "%núm_var%* , "
                + "con el operador (*)");
        lista += "Ejemplos:<br><br>2(5+1) retorna 12<br><br>x=5<br>5(x+2) retorna 35<br><br>";
        lista += Función("(%exp%)(%exp%)...", "multiplica todas las expresiones encerradas");
        lista += Función("-", "multiplica por -1 la expresión encerrada");
        lista += nlHTML();
        lista += "<B>" + TxtColorHTML("De índice indicable", Color.BLUE) + "</B>";
        lista += nlHTML();
        lista += nlHTML();
        lista += Función("raiz%núm_var%", "obtiene la raíz de la expresión tomando como radical al número que "
                + "acompaña a \"raiz\"", "raíz%núm_var% , root%núm_var% su forma en inglés");
        lista += TxtColorHTML("Ejemplos: <br><br>root2(4) retorna 2<br><br>raíz3(27) retorna 3<br><br>"
                + "raiz5(32) retorna 2 <br><br>raiz20(1048576) retorna 2<br><br>x=9;<br>raiz2(9) retorna 3", Color.WHITE);
        lista += nlHTML();
        lista += nlHTML();
        lista += "<B>" + TxtColorHTML("De exponente indicable", Color.BLUE) + "</B>";
        lista += nlHTML();
        lista += nlHTML();
        lista += TxtColorHTML("Todas las funciones trigonometricas y la función potencia son de potencia indicable",
                Color.WHITE);
        lista += nlHTML();
        lista += nlHTML();
        lista += Función("poten%núm_var%", "Eleva la expresión tomando de exponente a la variable o al número "
                + "que acompaña a \"poten\"", "pow%núm_var% su forma en inglés");
        lista += Función("sen%núm_var%", "Eleva el seno de la expresión tomando de exponente a la variable o al número "
                + "que acompaña a \"sen\"", "sin%núm_var% su forma en inglés");
        lista += Función("cos%núm_var%", "Eleva el coseno de la expresión tomando de exponente a la variable o al número "
                + "que acompaña a \"cos\"");
        lista += Función("tan%núm_var%", "Eleva la tangente de la expresión tomando de exponente a la variable o al número "
                + "que acompaña a \"tan\"");
        lista += Función("sec%núm_var%", "Eleva la secante de la expresión tomando de exponente a la variable o al número "
                + "que acompaña a \"sec\"");
        lista += Función("csc%núm_var%", "Eleva la cosecante de la expresión tomando de exponente a la variable o al número "
                + "que acompaña a \"csc\"");
        lista += Función("cot%núm_var%", "Eleva la cotangente de la expresión tomando de exponente a la variable o al número "
                + "que acompaña a \"cot\"");
        lista += nlHTML();
        lista += TxtColorHTML("Ejemplos:<br><br>cos2(3)+sen2(3) retorna 1<br><br>x=123;<br> cos2(x)+sen2(x) retorna 1", Color.WHITE);
        lista += "<br><br>sec2(3)-tan2(3) retorna 1<br><br>x=123;<br> sec2(x)-tan2(x) retorna 1";
        lista += "<br><br>csc2(3)-cot2(3) retorna 1<br><br>x=123;<br> csc2(x)-cot2(x) retorna 1";
        lista = lista.replace("retorna", TxtColorHTML("retorna", Color.RED));
        jEditorPane1.setContentType("text/html");
        jEditorPane1.setBackground(Color.WHITE);
        jEditorPane1.setText(lista);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(new Color(200, 150, 0));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new Color(150, 100, 0));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        jButton1.setBackground(new Color(255, 200, 0));
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        jButton1.setBackground(new Color(150, 100, 0));
    }//GEN-LAST:event_jButton1MouseReleased

    private void jButton1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseMoved
        jButton1.setBackground(new Color(200, 150, 0));
    }//GEN-LAST:event_jButton1MouseMoved

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextArea1.setText("");
        jTextArea1.setBackground(nimbusLightBackground);
        jTextPane2.setText("");
        jEditorPane1.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextArea2.setText("");
        jTextArea2.setBackground(nimbusLightBackground);
        jTextPane1.setText("");
        jEditorPane1.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String[] botones = {"fondo transparente", "fondo color", "cancelar"};
        int fondoColor = JOptionPane.showOptionDialog(
                this,
                "Seleccione el tipo de fondo con el que se guardará la imagen",
                "Fondo",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                botones,
                botones[0]
        );
        if (fondoColor == 0) {
            LectoEscrituraArchivos.exportar_imagen_con_JFileChooser(últimaImagenCargada, this);
        } else if (fondoColor == 1) {
            BufferedImage retorno = Dupla.convBufferedImage(últimaImagenCargada);
            JColorChooser jcc = new JColorChooser(Color.BLACK);
            Color c = JColorChooser.showDialog(this, "Seleccione el color del fondo", Color.BLACK);
            Graphics2D g = retorno.createGraphics();
            g.setColor(c);
            g.fillRect(0, 0, retorno.getWidth(), retorno.getHeight());
            g.drawImage(últimaImagenCargada, 0, 0, null);
            LectoEscrituraArchivos.exportar_imagen_con_JFileChooser(retorno, this);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        InterpretadorDeTextoMatemático idtm = null;
        BufferedImage col1 = null;
        BufferedImage col2 = null;
        boolean A1Vacía = jTextArea1.getText().trim().isEmpty();
        boolean A2Vacía = jTextArea2.getText().trim().isEmpty();
        int d = 30;
        if (!A1Vacía) {
            try {
                idtm = new InterpretadorDeTextoMatemático(
                        jTextArea1.getText(), jRadioButton6.isSelected(),true,jRadioButton7.isSelected()
                );
                idtm.ÁrbolBinario_BasicStroke = new BasicStroke((int) jSpinner1.getValue());
                idtm.ÁrbolBinario_SeparaciónHorizontal_Ramas = (int) jSpinner2.getValue();
                idtm.ÁrbolBinario_SeparaciónVertical_Ramas = (int) jSpinner3.getValue();
                idtm.ÁrbolBinario_MostrarNombreVariables = jRadioButton1.isSelected();
                idtm.ÁrbolBinario_DibujarUnión_Ramas = jRadioButton2.isSelected();
                idtm.ÁrbolBinario_DibujarTextura_Nodos = jRadioButton3.isSelected();
                idtm.ÁrbolBinario_Bordear_Nodos = jRadioButton4.isSelected();
                BufferedImage[] arbolesCol1 = idtm.ImagenesÁrbolesBinarios();
                if (arbolesCol1.length == 0) {
                    throw new Exception("Hay variables pero no hay expresiones de retorno"
                            + "\nEn el interprete 1");
                }
                int w = 0, h = 0;
                for (BufferedImage Árbol : arbolesCol1) {
                    w = Máx(w, Árbol.getWidth());
                    h += Árbol.getHeight() + d;
                }
                col1 = Dupla.convBufferedImage(w, h);
                Graphics2D g = col1.createGraphics();
                int py = 0;
                for (BufferedImage árbol : arbolesCol1) {
                    Dupla pos = Dupla.Alinear(col1, árbol, Dupla.MEDIO, Dupla.POR_DEFECTO);
                    g.drawImage(árbol, pos.intX(), py, null);
                    py += árbol.getHeight() + d;
                }
            } catch (Exception e) {
                e.printStackTrace();
                ActualizarTextoError(e.getMessage() + "; " + e.getLocalizedMessage());
                return;
            }
        }
        if (!A2Vacía) {
            try {
                idtm = new InterpretadorDeTextoMatemático(jTextArea2.getText(), jRadioButton5.isSelected(),true,jRadioButton7.isSelected());
                idtm.ÁrbolBinario_colorBordes = new Color(0, 255, 190);
                idtm.ÁrbolBinario_BasicStroke = new BasicStroke((int) jSpinner1.getValue());
                idtm.ÁrbolBinario_SeparaciónHorizontal_Ramas = (int) jSpinner2.getValue();
                idtm.ÁrbolBinario_SeparaciónVertical_Ramas = (int) jSpinner3.getValue();
                idtm.ÁrbolBinario_MostrarNombreVariables = jRadioButton1.isSelected();
                idtm.ÁrbolBinario_DibujarUnión_Ramas= jRadioButton2.isSelected();
                idtm.ÁrbolBinario_DibujarTextura_Nodos = jRadioButton3.isSelected();
                idtm.ÁrbolBinario_Bordear_Nodos = jRadioButton4.isSelected();
                BufferedImage[] arbolesCol2 = idtm.ImagenesÁrbolesBinarios();
                if (arbolesCol2.length == 0) {
                    throw new Exception("Hay variables pero no hay expresiones de retorno"
                            + "\nEn el interprete 2");
                }
                int w = 0, h = 0;
                for (BufferedImage Árbol : arbolesCol2) {
                    w = Máx(w, Árbol.getWidth());
                    h += Árbol.getHeight() + d;
                }
                col2 = Dupla.convBufferedImage(w, h);
                Graphics2D g = col2.createGraphics();
                int py = 0;
                for (BufferedImage árbol : arbolesCol2) {
                    Dupla pos = Dupla.Alinear(col2, árbol, Dupla.MEDIO, Dupla.POR_DEFECTO);
                    g.drawImage(árbol, pos.intX(), py, null);
                    py += árbol.getHeight() + d;
                }
            } catch (Exception e) {
                e.printStackTrace();
                ActualizarTextoError(e.getMessage() + "; " + e.getLocalizedMessage());
            }
        }
        if (col1 == null && col2 == null) {
            ActualizarTextoError("No se pudo realizar la generación de los árboles binarios");
            return;
        }
        BufferedImage retorno = null;
        if (!A1Vacía && !A2Vacía) {
            retorno = Dupla.convBufferedImage(
                    col1.getWidth() + col2.getWidth() + d,
                    Máx(col1.getHeight(), col2.getHeight())
            );
            Graphics2D g = retorno.createGraphics();
            g.drawImage(col1, 0, 0, null);
            g.drawImage(col2, col1.getWidth() + d, 0, null);
        } else if (A2Vacía) {
            retorno = col1;
        } else {
            retorno = col2;
        }
        últimaImagenCargada = retorno;
        actualizarFotograma();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextArea2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea2KeyReleased
        jTextArea1.setBackground(nimbusLightBackground);
        jTextArea2.setBackground(nimbusLightBackground);
    }//GEN-LAST:event_jTextArea2KeyReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String exps1 = "";
        BufferedImage col1;
        BufferedImage col2;
        InterpretadorDeTextoMatemático idtm;
        try {
            idtm = new InterpretadorDeTextoMatemático(jTextArea1.getText(), jRadioButton6.isSelected(),true);
            for (InterpretadorDeTextoMatemático.Expresiones expresiónes : idtm.Expresiones) {
                exps1 += expresiónes.TextoGenerador + "\n";
            }
            generadorDeTexto.ColorBorde(new Color(0, 150, 255));
            generadorDeTexto.ColorFuente(Color.WHITE);
            col1 = generadorDeTexto.GenerarTexto(exps1);
            últimaImagenCargada = col1;
            actualizarFotograma();
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    static String Función(String nombre, String descripción, String también) {
        return TxtColorHTML(nombre, Color.CYAN)
                + TxtColorHTML("(", Color.WHITE)
                + TxtColorHTML("%exp%", Color.YELLOW)
                + TxtColorHTML(")", Color.WHITE)
                + TxtColorHTML("<br>" + descripción, Color.WHITE)
                + nlHTML() + nlHTML()
                + TxtColorHTML("también se puede escribir como: ", Color.WHITE)
                + nlHTML()
                + TxtColorHTML(también, Color.GRAY)
                + nlHTML() + nlHTML();
    }

    static String Función(String nombre, String descripción) {
        return TxtColorHTML(nombre, Color.CYAN)
                + TxtColorHTML("(", Color.WHITE)
                + TxtColorHTML("%exp%", Color.YELLOW)
                + TxtColorHTML(")", Color.WHITE)
                + TxtColorHTML("<br>" + descripción, Color.WHITE)
                + nlHTML()
                + nlHTML();
    }

    static String OPList(String OP, String Descipción) {
        return TxtColorHTML(OP, Color.CYAN)
                + "&nbsp&nbsp" + TxtColorHTML(":->", Color.RED)
                + TxtColorHTML(Descipción, Color.MAGENTA)
                + nlHTML();
    }

    static String VarList(String nombre, String valor) {
        return TxtColorHTML(nombre, Color.CYAN)
                + " retorna "
                + valor
                + nlHTML();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Presentador;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration//GEN-END:variables
}
