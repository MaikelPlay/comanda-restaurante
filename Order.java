package PqUd8;

import javax.swing.JOptionPane;

public class Order extends javax.swing.JFrame {

    public Order() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        chkHamburguesa = new javax.swing.JCheckBox();
        chkPatatasFritas = new javax.swing.JCheckBox();
        chkRefresco = new javax.swing.JCheckBox();
        chkCerveza = new javax.swing.JCheckBox();
        chkPetit = new javax.swing.JCheckBox();
        chkHelado = new javax.swing.JCheckBox();
        chkCafe = new javax.swing.JCheckBox();
        chkHambDoble = new javax.swing.JCheckBox();
        txfPvpHamburguesa = new javax.swing.JTextField();
        txfPvpPatatasFritas = new javax.swing.JTextField();
        txfPvpRefresco = new javax.swing.JTextField();
        txfPvpCerveza = new javax.swing.JTextField();
        txfPvpPetit = new javax.swing.JTextField();
        txfPvpHelado = new javax.swing.JTextField();
        txfPvpCafe = new javax.swing.JTextField();
        txfPvpHambDoble = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        rdbMaxi = new javax.swing.JRadioButton();
        rdbJoven = new javax.swing.JRadioButton();
        rdbInfantil = new javax.swing.JRadioButton();
        btnPedido = new javax.swing.JButton();
        txfTotal = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Comanda");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Platos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18), new java.awt.Color(204, 0, 0))); // NOI18N

        chkHamburguesa.setSelected(true);
        chkHamburguesa.setText("Hamburguesa");

        chkPatatasFritas.setSelected(true);
        chkPatatasFritas.setText("Patatas Fritas");

        chkRefresco.setSelected(true);
        chkRefresco.setText("Refresco");

        chkCerveza.setText("Cerveza");

        chkPetit.setText("Petit");

        chkHelado.setSelected(true);
        chkHelado.setText("Helado");

        chkCafe.setText("Café");

        chkHambDoble.setText("Hamb. Doble");

        txfPvpHamburguesa.setEditable(false);
        txfPvpHamburguesa.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfPvpHamburguesa.setText("3.5");
        txfPvpHamburguesa.setFocusable(false);

        txfPvpPatatasFritas.setEditable(false);
        txfPvpPatatasFritas.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfPvpPatatasFritas.setText("1");
        txfPvpPatatasFritas.setFocusable(false);

        txfPvpRefresco.setEditable(false);
        txfPvpRefresco.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfPvpRefresco.setText("1.5");
        txfPvpRefresco.setFocusable(false);

        txfPvpCerveza.setEditable(false);
        txfPvpCerveza.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfPvpCerveza.setText("1.75");
        txfPvpCerveza.setFocusable(false);

        txfPvpPetit.setEditable(false);
        txfPvpPetit.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfPvpPetit.setText("1.5");
        txfPvpPetit.setFocusable(false);

        txfPvpHelado.setEditable(false);
        txfPvpHelado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfPvpHelado.setText("2");
        txfPvpHelado.setFocusable(false);

        txfPvpCafe.setEditable(false);
        txfPvpCafe.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfPvpCafe.setText("1.25");
        txfPvpCafe.setFocusable(false);

        txfPvpHambDoble.setEditable(false);
        txfPvpHambDoble.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfPvpHambDoble.setText("5.75");
        txfPvpHambDoble.setFocusable(false);
        txfPvpHambDoble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfPvpHambDobleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkPatatasFritas)
                    .addComponent(chkRefresco)
                    .addComponent(chkCerveza)
                    .addComponent(chkPetit)
                    .addComponent(chkHelado)
                    .addComponent(chkCafe)
                    .addComponent(chkHambDoble)
                    .addComponent(chkHamburguesa))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txfPvpCerveza)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txfPvpCafe, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txfPvpHelado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txfPvpPetit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txfPvpRefresco, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfPvpHambDoble, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfPvpPatatasFritas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txfPvpHamburguesa, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkHamburguesa)
                    .addComponent(txfPvpHamburguesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkPatatasFritas)
                    .addComponent(txfPvpPatatasFritas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkRefresco)
                    .addComponent(txfPvpRefresco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkCerveza)
                    .addComponent(txfPvpCerveza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkPetit)
                    .addComponent(txfPvpPetit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkHelado)
                    .addComponent(txfPvpHelado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkCafe)
                    .addComponent(txfPvpCafe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkHambDoble)
                    .addComponent(txfPvpHambDoble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menús", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18), new java.awt.Color(204, 0, 0))); // NOI18N

        buttonGroup1.add(rdbMaxi);
        rdbMaxi.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        rdbMaxi.setForeground(new java.awt.Color(255, 51, 0));
        rdbMaxi.setText("Maxi");
        rdbMaxi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbMaxiActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbJoven);
        rdbJoven.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        rdbJoven.setForeground(new java.awt.Color(51, 204, 255));
        rdbJoven.setSelected(true);
        rdbJoven.setText("Joven");
        rdbJoven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbJovenActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbInfantil);
        rdbInfantil.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        rdbInfantil.setForeground(new java.awt.Color(255, 51, 255));
        rdbInfantil.setText("Infantil");
        rdbInfantil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbInfantilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbMaxi)
                    .addComponent(rdbJoven)
                    .addComponent(rdbInfantil))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdbInfantil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdbJoven)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdbMaxi)
                .addGap(68, 68, 68))
        );

        btnPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PqUd8/ordernowPagos.png"))); // NOI18N
        btnPedido.setMnemonic('p');
        btnPedido.setText("Pedido");
        btnPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoActionPerformed(evt);
            }
        });

        txfTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfTotal.setText("0,0");

        btnSalir.setMnemonic('s');
        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblTotal.setText("Total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTotal)
                .addGap(18, 18, 18)
                .addComponent(txfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPedido)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal)
                    .addComponent(txfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfPvpHambDobleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfPvpHambDobleActionPerformed

    }//GEN-LAST:event_txfPvpHambDobleActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        rootPane.setDefaultButton(btnPedido);
    }//GEN-LAST:event_formWindowOpened

    private double[] ArrayDePrecios() {
        double[] arrayDePrecios = new double[8];

        arrayDePrecios[0] = 3.5; //Hamburguesa
        arrayDePrecios[1] = 1; //Patatas Fritas
        arrayDePrecios[2] = 1.5; //Refresco
        arrayDePrecios[3] = 1.75; //Cerveza
        arrayDePrecios[4] = 1.5; //Petit
        arrayDePrecios[5] = 2; //Helado
        arrayDePrecios[6] = 1.25; //Café
        arrayDePrecios[7] = 5.75; //Hamburguesa Doble

        return arrayDePrecios;
    }

    private boolean[] ArraySeleccionados() {
        boolean[] arraySeleccionados = new boolean[8];

        arraySeleccionados[0] = chkHamburguesa.isSelected();
        arraySeleccionados[1] = chkPatatasFritas.isSelected();
        arraySeleccionados[2] = chkRefresco.isSelected();
        arraySeleccionados[3] = chkCerveza.isSelected();
        arraySeleccionados[4] = chkPetit.isSelected();
        arraySeleccionados[5] = chkHelado.isSelected();
        arraySeleccionados[6] = chkCafe.isSelected();
        arraySeleccionados[7] = chkHambDoble.isSelected();

        return arraySeleccionados;
    }

    private void rdbInfantilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbInfantilActionPerformed
        boolean[] arraySeleccionados = ArraySeleccionados();

        if (rdbInfantil.isSelected())
        {
            // Seleccionar Hamburguesa, Refresco y Petit
            arraySeleccionados[0] = true; //Hamburguesa
            arraySeleccionados[1] = false; //Patatas Fritas
            arraySeleccionados[2] = true; //Refresco
            arraySeleccionados[3] = false; //Cerveza
            arraySeleccionados[4] = true; //Petit
            arraySeleccionados[5] = false; //Helado
            arraySeleccionados[6] = false; //Café
            arraySeleccionados[7] = false; //Hamburguesa Doble

            // Actualizar los checkboxes según el array de seleccionados
            chkHamburguesa.setSelected(arraySeleccionados[0]);
            chkPatatasFritas.setSelected(arraySeleccionados[1]);
            chkRefresco.setSelected(arraySeleccionados[2]);
            chkCerveza.setSelected(arraySeleccionados[3]);
            chkPetit.setSelected(arraySeleccionados[4]);
            chkHelado.setSelected(arraySeleccionados[5]);
            chkCafe.setSelected(arraySeleccionados[6]);
            chkHambDoble.setSelected(arraySeleccionados[7]);

        }
    }//GEN-LAST:event_rdbInfantilActionPerformed

    private void rdbJovenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbJovenActionPerformed
        boolean[] arraySeleccionados = ArraySeleccionados();
        if (rdbJoven.isSelected())
        {
            arraySeleccionados[0] = true; //Hamburguesa
            arraySeleccionados[1] = true; //Patatas Fritas
            arraySeleccionados[2] = true; //Refresco
            arraySeleccionados[3] = false; //Cerveza
            arraySeleccionados[4] = false; //Petit
            arraySeleccionados[5] = true; //Helado
            arraySeleccionados[6] = false; //Café
            arraySeleccionados[7] = false; //Hamburguesa Doble

            // Actualizar los checkboxes según el array de seleccionados
            chkHamburguesa.setSelected(arraySeleccionados[0]);
            chkPatatasFritas.setSelected(arraySeleccionados[1]);
            chkRefresco.setSelected(arraySeleccionados[2]);
            chkCerveza.setSelected(arraySeleccionados[3]);
            chkPetit.setSelected(arraySeleccionados[4]);
            chkHelado.setSelected(arraySeleccionados[5]);
            chkCafe.setSelected(arraySeleccionados[6]);
            chkHambDoble.setSelected(arraySeleccionados[7]);

        }
    }//GEN-LAST:event_rdbJovenActionPerformed

    private void rdbMaxiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbMaxiActionPerformed
        boolean[] arraySeleccionados = ArraySeleccionados();

        if (rdbMaxi.isSelected())
        {
            arraySeleccionados[0] = false; //Hamburguesa
            arraySeleccionados[1] = true; //Patatas Fritas
            arraySeleccionados[2] = true; //Refresco
            arraySeleccionados[3] = false; //Cerveza
            arraySeleccionados[4] = false; //Petit
            arraySeleccionados[5] = true; //Helado
            arraySeleccionados[6] = true; //Café
            arraySeleccionados[7] = true; //Hamburguesa Doble

            // Actualizar los checkboxes según el array de seleccionados
            chkHamburguesa.setSelected(arraySeleccionados[0]);
            chkPatatasFritas.setSelected(arraySeleccionados[1]);
            chkRefresco.setSelected(arraySeleccionados[2]);
            chkCerveza.setSelected(arraySeleccionados[3]);
            chkPetit.setSelected(arraySeleccionados[4]);
            chkHelado.setSelected(arraySeleccionados[5]);
            chkCafe.setSelected(arraySeleccionados[6]);
            chkHambDoble.setSelected(arraySeleccionados[7]);         
        }
    }//GEN-LAST:event_rdbMaxiActionPerformed

    private void btnPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoActionPerformed
        double[] arrayDePrecios = ArrayDePrecios();
        boolean[] arraySeleccionados = ArraySeleccionados();

        boolean haySeleccionado = false;
        
        int g = 0;
        while (g < arraySeleccionados.length && !haySeleccionado)
        {
            if (arraySeleccionados[g])
            {
                haySeleccionado = true;
            }
            g++;
        }

        if (!haySeleccionado)
        {           
            JOptionPane.showMessageDialog(this, "Nngún plato seleccionado", "Error en Platos", JOptionPane.ERROR_MESSAGE);
            
            chkHamburguesa.requestFocus();
            
            txfTotal.setText("0,00");
        } else
        {
            double suma = 0;
            for (int k = 0; k < arraySeleccionados.length; k++)
            {
                if (arraySeleccionados[k])
                {
                    suma = suma + arrayDePrecios[k];
                }
            }
            
            txfTotal.setText(String.format("%.2f", suma).replace('.', ','));
        }
    }//GEN-LAST:event_btnPedidoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int resp = JOptionPane.showOptionDialog(this, "¿Desea cancelar su pedido?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (resp == JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ej8_23_Compra_Mcdonalds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ej8_23_Compra_Mcdonalds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ej8_23_Compra_Mcdonalds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ej8_23_Compra_Mcdonalds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ej8_23_Compra_Mcdonalds().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPedido;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkCafe;
    private javax.swing.JCheckBox chkCerveza;
    private javax.swing.JCheckBox chkHambDoble;
    private javax.swing.JCheckBox chkHamburguesa;
    private javax.swing.JCheckBox chkHelado;
    private javax.swing.JCheckBox chkPatatasFritas;
    private javax.swing.JCheckBox chkPetit;
    private javax.swing.JCheckBox chkRefresco;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JRadioButton rdbInfantil;
    private javax.swing.JRadioButton rdbJoven;
    private javax.swing.JRadioButton rdbMaxi;
    private javax.swing.JTextField txfPvpCafe;
    private javax.swing.JTextField txfPvpCerveza;
    private javax.swing.JTextField txfPvpHambDoble;
    private javax.swing.JTextField txfPvpHamburguesa;
    private javax.swing.JTextField txfPvpHelado;
    private javax.swing.JTextField txfPvpPatatasFritas;
    private javax.swing.JTextField txfPvpPetit;
    private javax.swing.JTextField txfPvpRefresco;
    private javax.swing.JTextField txfTotal;
    // End of variables declaration//GEN-END:variables

}
