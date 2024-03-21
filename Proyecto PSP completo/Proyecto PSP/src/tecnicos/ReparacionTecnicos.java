package tecnicos;

import com.formdev.flatlaf.FlatLightLaf;
import conexion.ConectarBD;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author pablo
 */
public class ReparacionTecnicos extends JFrame {

    DefaultTableModel modeloTabla;
    private JTextField[] camposTexto;
    private JTextField[] precios;

    public ReparacionTecnicos() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("ReparacionTecnicos");
        setResizable(false);
        listarTodo();

        camposTexto = new JTextField[]{txtCpu, txtGpu, txtPlacaBase, txtRam, txtDiscoDuro, txtDiscoSSD,
            txtSistOperativo, txtPastaTermica, txtVentilador, txtTorre,
            txtFuenteAlimentacion, txtDisipador};

        precios = new JTextField[]{txtPrecioCpu1, txtPrecioGpu, txtPrecioPlacaBase, txtPrecioRam, txtPrecioDiscoDuro,
            txtPrecioDiscoSSD, txtPrecioSisOp, txtPrecioPastaTerm, txtPrecioVentilador,
            txtPrecioTorre, txtPrecioFuentaAlimentacion, txtPrecioDisipador};
        setIconImage(getIconImage());
    }

    @Override
    public Image getIconImage() {
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("./iconimages/images.jpg"));
        return icono;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtGpu = new javax.swing.JTextField();
        txtPlacaBase = new javax.swing.JTextField();
        txtCpu = new javax.swing.JTextField();
        txtRam = new javax.swing.JTextField();
        btnFinalizar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtDiscoDuro = new javax.swing.JTextField();
        txtDiscoSSD = new javax.swing.JTextField();
        txtSistOperativo = new javax.swing.JTextField();
        txtPastaTermica = new javax.swing.JTextField();
        txtVentilador = new javax.swing.JTextField();
        txtTorre = new javax.swing.JTextField();
        txtFuenteAlimentacion = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tdStock = new javax.swing.JTable();
        btnPedirPiezas = new javax.swing.JButton();
        txtDisipador = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        comboEstados = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        txtIDIncidencia = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        comboPiezas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(219, 219, 209));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Componente:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 140, -1, -1));

        txtGpu.setText("GPU");
        jPanel1.add(txtGpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 180, 56));

        txtPlacaBase.setText("Placa Base");
        jPanel1.add(txtPlacaBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 180, 64));

        txtCpu.setText("CPU");
        jPanel1.add(txtCpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 180, 56));

        txtRam.setText("RAM");
        jPanel1.add(txtRam, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 180, 64));

        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 780, 100, 40));

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, 100, 40));

        txtDiscoDuro.setText("Disco Duro");
        jPanel1.add(txtDiscoDuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 180, 60));

        txtDiscoSSD.setText("Disco SSD");
        jPanel1.add(txtDiscoSSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 180, 56));

        txtSistOperativo.setText("Sistema Operativo");
        jPanel1.add(txtSistOperativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 180, 56));

        txtPastaTermica.setText("Pasta Térmica");
        jPanel1.add(txtPastaTermica, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 180, 56));

        txtVentilador.setText("Ventilador");
        jPanel1.add(txtVentilador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 180, 56));

        txtTorre.setText("Torre");
        jPanel1.add(txtTorre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 180, 56));

        txtFuenteAlimentacion.setText("Fuente Alimentacion");
        jPanel1.add(txtFuenteAlimentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 180, 56));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        txtDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Descripcion"));
        jScrollPane2.setViewportView(txtDescripcion);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 660, 570, 160));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Precio:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Precio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Precio:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 50, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Precio:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Precio:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Precio:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Precio:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Precio:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Precio:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Precio:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("Precio:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, -1, 20));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Precio:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, -1, -1));
        jPanel1.add(txtPrecioDisipador, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, 130, -1));
        jPanel1.add(txtPrecioCpu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 130, -1));
        jPanel1.add(txtPrecioGpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 130, -1));
        jPanel1.add(txtPrecioFuentaAlimentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 130, -1));
        jPanel1.add(txtPrecioVentilador, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 130, -1));
        jPanel1.add(txtPrecioPastaTerm, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 130, -1));
        jPanel1.add(txtPrecioDiscoDuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 130, -1));
        jPanel1.add(txtPrecioPlacaBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 130, -1));
        jPanel1.add(txtPrecioRam, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 130, -1));
        jPanel1.add(txtPrecioDiscoSSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 130, -1));
        jPanel1.add(txtPrecioSisOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 130, -1));
        jPanel1.add(txtPrecioTorre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 130, -1));

        tdStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Descripcion", "Precio", "Stock", "Tipo", "Marca"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tdStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tdStockMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tdStock);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, 620, 640));

        btnPedirPiezas.setText("Pedir Piezas");
        btnPedirPiezas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedirPiezasActionPerformed(evt);
            }
        });
        jPanel1.add(btnPedirPiezas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 720, 100, 40));

        txtDisipador.setText("Disipador");
        jPanel1.add(txtDisipador, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 180, 50));

        jPanel2.setBackground(new java.awt.Color(70, 63, 56));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Reparacion");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 170, 90));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Estado");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 50, 50));

        comboEstados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Incidencia Recibida","Pendiente de piezas","Piezas Recibidas", "En reparacion" }));
        jPanel2.add(comboEstados, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 130, 30));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ID incidencia:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, 30));

        txtIDIncidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDIncidenciaActionPerformed(evt);
            }
        });
        jPanel2.add(txtIDIncidencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 60, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 110));

        jPanel5.setBackground(new java.awt.Color(70, 63, 56));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(70, 63, 56));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 120, 20, 730));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 110, 20, 740));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 770, 20));

        comboPiezas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar componente", "CPU", "GPU", "RAM", "Placa Base", "Fuente Alimentacion", "Disco Duro", "Disco SSD", "Sistema Operativo", "Pasta Termica", "Ventilador", "Torre", "Disipador" }));
        comboPiezas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboPiezasItemStateChanged(evt);
            }
        });
        jPanel1.add(comboPiezas, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 132, 230, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 850));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        IncidenciasTecnicos it = new IncidenciasTecnicos();
        it.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        /*if(!camposCompletos()){
            JOptionPane.showMessageDialog(null, "Porfavor completa todos los campos");  
            return;
        }*/

        int opcion = JOptionPane.showConfirmDialog(this, "¿Desea finalizar la reparación?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            String[] precios = new String[12];
            String[] componentes = new String[12];

            // Llenar los arreglos con los precios y componentes
            for (int i = 0; i < precios.length; i++) {
                precios[i] = this.precios[i].getText();
                componentes[i] = this.camposTexto[i].getText();
            }

            // Crear la instancia de ConfirmacionTecnicos y pasar los valores obtenidos
            ConfirmacionTecnicos ct = new ConfirmacionTecnicos(precios, componentes);
            ct.setTxtDescripcion(txtDescripcion.getText());
            ct.setTxtIDIncidencia(txtIDIncidencia.getText());
            ct.setVisible(true);
            this.dispose();
            updateStock();
        }
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void tdStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdStockMouseClicked
        int row = tdStock.getSelectedRow();

        if (row == -1) {
            JOptionPane.showMessageDialog(null, "No se Selecciono");
        } else {
            String nom = (String) tdStock.getValueAt(row, 0);
            int precio = (int) tdStock.getValueAt(row, 2);
            String marca = (String) tdStock.getValueAt(row, 5);
            String tipo = (String) tdStock.getValueAt(row, 4);
            String stock = (String) tdStock.getValueAt(row, 3);

            if ("0".equals(stock)) {
                JOptionPane.showMessageDialog(null, "No puedes añadir una pieza con 0 de stock");
            } else {

                switch (tipo) {
                    case "CPU":
                        txtCpu.setText(nom);
                        txtPrecioCpu1.setText(String.valueOf(precio));
                        break;
                    case "GPU":
                        txtGpu.setText(nom);
                        txtPrecioGpu.setText(String.valueOf(precio));
                        break;
                    case "RAM":
                        txtRam.setText(nom);
                        txtPrecioRam.setText(String.valueOf(precio));
                        break;
                    case "Placa Base":
                        txtPlacaBase.setText(nom);
                        txtPrecioPlacaBase.setText(String.valueOf(precio));
                        break;
                    case "Fuente Alimentacion":
                        txtFuenteAlimentacion.setText(nom);
                        txtPrecioFuentaAlimentacion.setText(String.valueOf(precio));
                        break;
                    case "Disco SSD":
                        txtDiscoSSD.setText(nom);
                        txtPrecioDiscoSSD.setText(String.valueOf(precio));
                        break;
                    case "Disco Duro":
                        txtDiscoDuro.setText(nom);
                        txtPrecioDiscoDuro.setText(String.valueOf(precio));
                        break;
                    case "Sistema Operativo":
                        txtSistOperativo.setText(nom);
                        txtPrecioSisOp.setText(String.valueOf(precio));
                        break;
                    case "Pasta Termica":
                        txtPastaTermica.setText(nom);
                        txtPrecioPastaTerm.setText(String.valueOf(precio));
                        break;
                    case "Ventilador":
                        txtVentilador.setText(nom);
                        txtPrecioVentilador.setText(String.valueOf(precio));
                        break;
                    case "Torre":
                        txtTorre.setText(nom);
                        txtPrecioTorre.setText(String.valueOf(precio));
                        break;
                    case "Disipador":
                        txtDisipador.setText(nom);
                        txtPrecioDisipador.setText(String.valueOf(precio));
                        break;
                }
            }
        }
    }//GEN-LAST:event_tdStockMouseClicked

    private void btnPedirPiezasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedirPiezasActionPerformed
        PiezasFaltantesTecnicos pft = new PiezasFaltantesTecnicos();
        pft.setTxtIDIncidencia(txtIDIncidencia.getText());
        pft.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPedirPiezasActionPerformed

    private void txtIDIncidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDIncidenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDIncidenciaActionPerformed

    private void comboPiezasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboPiezasItemStateChanged
        if (comboPiezas.getSelectedItem().toString().equals("Seleccionar componente")) {
            listarTodo();
        } else {
            listar();
        }
    }//GEN-LAST:event_comboPiezasItemStateChanged

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FlatLightLaf.setup();
                new ReparacionTecnicos().setVisible(true);
            }
        });
    }

    //Metodo para recoger la descripcion de la incidencia
    public void setDescripcionIncidencia(String descripcion, String idIncidencia) {
        txtDescripcion.setText(descripcion);
        txtIDIncidencia.setText(idIncidencia);
    }

    // Metodo para verificar que todos los elementos esten completos, ya sean con algun dato o con alguna respuesta de "Nada que poner" o "Vacio"
    /*
    private boolean camposCompletos(){
        Component[] campos = getContentPane().getComponents();
        
        for(Component c: campos){
            if(c instanceof JTextField){
                JTextField textField = (JTextField) c;
                if(textField.getText().isEmpty()){
                    return false;
                }
            }
        }
        return true;
    }
     */
    //Tabla Stock. Se lista por componente para comprobar que hayan existencias.
    public void listar() {

        java.sql.Connection cn = ConectarBD.conectar();

        if (cn != null) {
            try {
                // Se usa PreparedStatement en lugar de Statement para poder establecer el parámetro
                String sql = "SELECT nombre, descripcion, precio, stock, tipo, marca FROM PRODUCTOS WHERE tipo = ?";
                PreparedStatement ps = cn.prepareStatement(sql);
                System.out.println(comboPiezas.getSelectedItem().toString());
                ps.setString(1, comboPiezas.getSelectedItem().toString());
                ResultSet rs = ps.executeQuery();  // Se ejecuta la consulta usando PreparedStatement

                modeloTabla = (DefaultTableModel) tdStock.getModel();
                modeloTabla.setRowCount(0);

                while (rs.next()) {
                    // Se itera a través de los resultados y agrega cada fila a la tabla
                    Object[] productos = new Object[6];
                    productos[0] = rs.getString("nombre");
                    productos[1] = rs.getString("descripcion");
                    productos[2] = rs.getInt("precio");
                    productos[3] = rs.getString("stock");
                    productos[4] = rs.getString("tipo");
                    productos[5] = rs.getString("marca");
                    modeloTabla.addRow(productos);
                }

                // Cerrar ResultSet y PreparedStatement después de usarlos
                rs.close();
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    // Metodo para mostrar todos los componentes
    public void listarTodo() {

        java.sql.Connection cn = ConectarBD.conectar();

        if (cn != null) {
            try {
                // Se usa PreparedStatement en lugar de Statement para poder establecer el parámetro
                String sql = "SELECT nombre, descripcion, precio, stock, tipo, marca FROM PRODUCTOS";
                PreparedStatement ps = cn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();  // Se ejecuta la consulta usando PreparedStatement

                modeloTabla = (DefaultTableModel) tdStock.getModel();
                modeloTabla.setRowCount(0);

                while (rs.next()) {
                    // Se itera a través de los resultados y agrega cada fila a la tabla
                    Object[] productos = new Object[6];
                    productos[0] = rs.getString("nombre");
                    productos[1] = rs.getString("descripcion");
                    productos[2] = rs.getInt("precio");
                    productos[3] = rs.getString("stock");
                    productos[4] = rs.getString("tipo");
                    productos[5] = rs.getString("marca");
                    modeloTabla.addRow(productos);
                }

                // Cerrar ResultSet y PreparedStatement después de usarlos
                rs.close();
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public void updateStock() {
        // Consulta para actualizar el stock
        String sql = "UPDATE productos SET stock = stock - 1 WHERE nombre = ?";

        // Se obtiene la fila seleccionada en la tabla
        int fila = tdStock.getSelectedRow();

        if (fila < 0) {
            JOptionPane.showMessageDialog(null, "Elemento no seleccionado");
            return;
        }

        try {
            String nomProducto = (String) tdStock.getValueAt(fila, 0);
            Connection con = ConectarBD.conectar();

            boolean bandera = true;

            try {
                PreparedStatement comprobarStock = con.prepareStatement("SELECT stock FROM PRODUCTOS WHERE nombre = ? ");
                comprobarStock.setString(1, nomProducto);
                ResultSet rs = comprobarStock.executeQuery();

                if (rs.next()) {
                    if (rs.getInt(1) == 0) {
                        bandera = false;
                    }
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

            if (bandera) {
                PreparedStatement pstmt = con.prepareStatement(sql);
                // Se establece el nombre del producto como parámetro en la consulta SQL
                pstmt.setString(1, nomProducto);

                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Stock actualizado");
                    listar(); // Actualiza la tabla después de actualizar el stock
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo actualizar el stock");
                }

                con.close();

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Setter y Getter
    public String getTxtDescripcion() {
        return txtDescripcion.getText();
    }

    public void setTxtDescripcion(String txtDescripcion) {
        this.txtDescripcion.setText(txtDescripcion);
    }

    public String getTxtIDIncidencia() {
        return txtIDIncidencia.getText();
    }

    public void setTxtIDIncidencia(String txtIDIncidencia) {
        this.txtIDIncidencia.setText(txtIDIncidencia);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnPedirPiezas;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> comboEstados;
    private javax.swing.JComboBox<String> comboPiezas;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tdStock;
    private javax.swing.JTextField txtCpu;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtDiscoDuro;
    private javax.swing.JTextField txtDiscoSSD;
    private javax.swing.JTextField txtDisipador;
    private javax.swing.JTextField txtFuenteAlimentacion;
    private javax.swing.JTextField txtGpu;
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
    private javax.swing.JTextField txtPrecioVentilador;
    private javax.swing.JTextField txtRam;
    private javax.swing.JTextField txtSistOperativo;
    private javax.swing.JTextField txtTorre;
    private javax.swing.JTextField txtVentilador;
    // End of variables declaration//GEN-END:variables
    String consulta;
}
