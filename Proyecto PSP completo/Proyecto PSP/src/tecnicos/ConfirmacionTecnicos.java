package tecnicos;

import com.formdev.flatlaf.FlatLightLaf;
import conexion.ConectarBD;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author albal
 */
public class ConfirmacionTecnicos extends javax.swing.JFrame {

    private JTextField[] txtPrecio;
    private JTextField[] txtComponentes;
    private String[] precios;
    private String[] componentes;

    double total = 0.0; // Inicializamos el total como 0

    public ConfirmacionTecnicos(String[] precios, String[] componentes) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("ConfirmacionTecnicos");
        setResizable(false);
        this.precios = precios;
        this.componentes = componentes;

        txtComponentes = new JTextField[]{txtCpu, txtGpu, txtPlacaBase, txtRam, txtDiscoDuro, txtDiscoSSD,
            txtSistOperativo, txtPastaTermica, txtVentilador, txtTorre,
            txtFuenteAlimentacion, txtDisipador};

        txtPrecio = new JTextField[]{txtPrecioCpu1, txtPrecioGpu, txtPrecioPlacaBase, txtPrecioRam, txtPrecioDiscoDuro,
            txtPrecioDiscoSSD, txtPrecioSisOp, txtPrecioPastaTerm, txtPrecioVentilador,
            txtPrecioTorre, txtPrecioFuentaAlimentacion, txtPrecioDisipador};

        for (int i = 0; i < precios.length; i++) {
            txtPrecio[i].setText(precios[i]);
            txtComponentes[i].setText(componentes[i]);
            // Verificar si la cadena no está vacía antes de convertirla a double
            if (!precios[i].isEmpty()) {
                total += Double.parseDouble(precios[i]);
            }
        }

        // Establecemos el precio total en el campo txtPrecioTotal
        txtPrecioTotal.setText(String.valueOf(total));

    setIconImage(getIconImage());
    }
    @Override
    public Image getIconImage(){
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("./iconimages/images.jpg"));
        return icono;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        comboBox2 = new javax.swing.JComboBox<>();
        btnModificar = new javax.swing.JButton();
        txtGpu = new javax.swing.JTextField();
        txtPlacaBase = new javax.swing.JTextField();
        txtCpu = new javax.swing.JTextField();
        txtRam = new javax.swing.JTextField();
        txtDiscoDuro = new javax.swing.JTextField();
        txtDiscoSSD = new javax.swing.JTextField();
        txtSistOperativo = new javax.swing.JTextField();
        txtPastaTermica = new javax.swing.JTextField();
        txtVentilador = new javax.swing.JTextField();
        txtTorre = new javax.swing.JTextField();
        txtFuenteAlimentacion = new javax.swing.JTextField();
        txtDisipador = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtPrecioDisipador = new javax.swing.JTextField();
        txtPrecioCpu1 = new javax.swing.JTextField();
        txtPrecioGpu = new javax.swing.JTextField();
        txtPrecioFuentaAlimentacion = new javax.swing.JTextField();
        txtPrecioVentilador = new javax.swing.JTextField();
        txtPrecioPastaTerm = new javax.swing.JTextField();
        txtPrecioDiscoDuro = new javax.swing.JTextField();
        txtPrecioPlacaBase = new javax.swing.JTextField();
        txtPrecioRam = new javax.swing.JTextField();
        txtPrecioDiscoSSD = new javax.swing.JTextField();
        txtPrecioSisOp = new javax.swing.JTextField();
        txtPrecioTorre = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnSi = new javax.swing.JRadioButton();
        btnNo = new javax.swing.JRadioButton();
        txtHoras = new javax.swing.JTextField();
        txtPrecioTotal = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIDIncidencia = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(219, 219, 209));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboBox2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        comboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "En reparacion", "Reparado" }));
        jPanel1.add(comboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 150, -1));

        btnModificar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 780, 130, 40));
        jPanel1.add(txtGpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 183, 56));
        jPanel1.add(txtPlacaBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 183, 64));
        jPanel1.add(txtCpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 180, 56));
        jPanel1.add(txtRam, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 180, 64));
        jPanel1.add(txtDiscoDuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 180, 56));
        jPanel1.add(txtDiscoSSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 180, 56));
        jPanel1.add(txtSistOperativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 180, 56));
        jPanel1.add(txtPastaTermica, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, 180, 56));
        jPanel1.add(txtVentilador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 180, 56));
        jPanel1.add(txtTorre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 600, 180, 56));
        jPanel1.add(txtFuenteAlimentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 180, 56));
        jPanel1.add(txtDisipador, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 600, 180, 56));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Precio:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Precio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Precio:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Precio:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Precio:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Precio:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Precio:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Precio:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Precio:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Precio:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Precio:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 570, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Precio:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 570, -1, -1));
        jPanel1.add(txtPrecioDisipador, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 570, 130, -1));
        jPanel1.add(txtPrecioCpu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 130, -1));
        jPanel1.add(txtPrecioGpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 130, -1));
        jPanel1.add(txtPrecioFuentaAlimentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 130, -1));
        jPanel1.add(txtPrecioVentilador, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, 130, -1));
        jPanel1.add(txtPrecioPastaTerm, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 130, -1));
        jPanel1.add(txtPrecioDiscoDuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 130, -1));
        jPanel1.add(txtPrecioPlacaBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 130, -1));
        jPanel1.add(txtPrecioRam, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 130, -1));
        jPanel1.add(txtPrecioDiscoSSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 130, -1));
        jPanel1.add(txtPrecioSisOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 130, -1));
        jPanel1.add(txtPrecioTorre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, 130, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Limpieza:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 60, 20));

        buttonGroup1.add(btnSi);
        btnSi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSi.setForeground(new java.awt.Color(0, 0, 0));
        btnSi.setText("Si");
        btnSi.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnSiStateChanged(evt);
            }
        });
        btnSi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSiMouseClicked(evt);
            }
        });
        btnSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiActionPerformed(evt);
            }
        });
        jPanel1.add(btnSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        buttonGroup1.add(btnNo);
        btnNo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnNo.setForeground(new java.awt.Color(0, 0, 0));
        btnNo.setText("No");
        btnNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNoMouseClicked(evt);
            }
        });
        jPanel1.add(btnNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));
        jPanel1.add(txtHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 170, 120, 30));
        jPanel1.add(txtPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 240, 120, 30));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Horas Trabajadas");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 140, -1, 30));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Precio Total");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 220, -1, -1));

        jPanel2.setBackground(new java.awt.Color(70, 63, 56));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Confirmacion");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 190, 90));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID incidencia:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 37, -1, 40));
        jPanel2.add(txtIDIncidencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 42, 50, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 110));

        btnEnviar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 780, 130, 40));

        jPanel5.setBackground(new java.awt.Color(70, 63, 56));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(70, 63, 56));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 120, 20, 730));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 110, 20, 740));

        jButton1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jButton1.setText("Volver");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 780, 130, 40));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 750, 510, 10));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 750, 920, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 1450, 850));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        ReparacionTecnicos rt = new ReparacionTecnicos();
        rt.setTxtDescripcion(txtDescripcion);
        rt.setTxtIDIncidencia(txtIDIncidencia.getText());
        rt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed

        String sql = "UPDATE incidencias SET estado = ? WHERE id_incidencias = ?";
        String combo = (String) comboBox2.getSelectedItem();

        try {
            Connection con = ConectarBD.conectar();
            boolean bandera = true;

            try {
                PreparedStatement cambiarEstado = con.prepareStatement(sql);
                cambiarEstado.setString(1, combo);
                cambiarEstado.setString(2, txtIDIncidencia.getText());

                if (combo.equals("Reparado")) {
                    cambiarEstado.executeUpdate();
                    String sql2 = "INSERT INTO informes (HorasTrabajo, Limpieza, precio, Descripcion, Fecha, ID_INCIDENCIAS) values (?,?,?,?,?,?)";
                    PreparedStatement crearInforme = con.prepareStatement(sql2);
                    crearInforme.setInt(1, Integer.parseInt(txtHoras.getText()));
                    crearInforme.setBoolean(2, btnSi.isSelected());
                    crearInforme.setDouble(3, Double.parseDouble(txtPrecioTotal.getText()));

                    String componentesElegidos = "";
                    for (int i = 0; i < componentes.length; i++) {
                        if(!precios[i].isEmpty()){
                            componentesElegidos += "Componente: " + componentes[i] + " Precio: " + precios[i] + "\n";
                        }
                    }
                    crearInforme.setString(4, componentesElegidos);
                    crearInforme.setDate(5, java.sql.Date.valueOf(LocalDate.now()));
                    crearInforme.setInt(6, Integer.parseInt(txtIDIncidencia.getText()));

                    crearInforme.executeUpdate();
                    
                    JOptionPane.showMessageDialog(null, "Enviado correctamente");
                    MenuTecnicos m = new MenuTecnicos();
                    m.setVisible(true);
                    this.dispose();
                    
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede enviar una incidencia que su estado no este en Reparado");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnSiStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnSiStateChanged

    }//GEN-LAST:event_btnSiStateChanged

    private void btnSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiActionPerformed

    }//GEN-LAST:event_btnSiActionPerformed

    private void btnSiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiMouseClicked
        total += 80;
        txtPrecioTotal.setText(String.valueOf(total));
    }//GEN-LAST:event_btnSiMouseClicked

    private void btnNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNoMouseClicked
        total -= 80;
        txtPrecioTotal.setText(String.valueOf(total));
    }//GEN-LAST:event_btnNoMouseClicked

    public static void main(String args[]) {
        String[] precios = new String[12];
        String[] componentes = new String[12];

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                  FlatLightLaf.setup();
                new ConfirmacionTecnicos(precios, componentes).setVisible(true);
            }
        });
    }

    public void setDescripcionIncidencia(String idIncidencia) {
        txtIDIncidencia.setText(idIncidencia);
    }

    //Getter y Setter
    public String getTxtDescripcion() {
        return txtDescripcion;
    }

    public void setTxtDescripcion(String txtDescripcion) {
        this.txtDescripcion = txtDescripcion;
    }

    public String getTxtIDIncidencia() {
        return txtIDIncidencia.getText();
    }

    public void setTxtIDIncidencia(String txtIDIncidencia) {
        this.txtIDIncidencia.setText(txtIDIncidencia);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JRadioButton btnNo;
    private javax.swing.JRadioButton btnSi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboBox2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtCpu;
    private javax.swing.JTextField txtDiscoDuro;
    private javax.swing.JTextField txtDiscoSSD;
    private javax.swing.JTextField txtDisipador;
    private javax.swing.JTextField txtFuenteAlimentacion;
    private javax.swing.JTextField txtGpu;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtIDIncidencia;
    private javax.swing.JTextField txtPastaTermica;
    private javax.swing.JTextField txtPlacaBase;
    private javax.swing.JTextField txtPrecioCpu1;
    private javax.swing.JTextField txtPrecioDiscoDuro;
    private javax.swing.JTextField txtPrecioDiscoSSD;
    private javax.swing.JTextField txtPrecioDisipador;
    private javax.swing.JTextField txtPrecioFuentaAlimentacion;
    private javax.swing.JTextField txtPrecioGpu;
    private javax.swing.JTextField txtPrecioPastaTerm;
    private javax.swing.JTextField txtPrecioPlacaBase;
    private javax.swing.JTextField txtPrecioRam;
    private javax.swing.JTextField txtPrecioSisOp;
    private javax.swing.JTextField txtPrecioTorre;
    private javax.swing.JTextField txtPrecioTotal;
    private javax.swing.JTextField txtPrecioVentilador;
    private javax.swing.JTextField txtRam;
    private javax.swing.JTextField txtSistOperativo;
    private javax.swing.JTextField txtTorre;
    private javax.swing.JTextField txtVentilador;
    // End of variables declaration//GEN-END:variables
    private String txtDescripcion;
}
