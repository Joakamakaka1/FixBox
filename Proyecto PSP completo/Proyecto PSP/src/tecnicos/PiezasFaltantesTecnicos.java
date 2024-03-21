/**
 *
 * @author albal
 */
package tecnicos;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.table.DefaultTableModel;
import conexion.ConectarBD;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PiezasFaltantesTecnicos extends javax.swing.JFrame {

    DefaultTableModel modeloTabla;
    private ArrayList<String> productosSeleccionados = new ArrayList<>();

    public PiezasFaltantesTecnicos() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        //listar();
        //listarTodo();
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

        jPanel1 = new javax.swing.JPanel();
        btnEnviarPedido = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPiezasSolicitadas = new javax.swing.JTextArea();
        comboPiezas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tdStock = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIDIncidencia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNombrePedido = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(219, 219, 209));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEnviarPedido.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btnEnviarPedido.setText("Enviar pedido");
        btnEnviarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarPedidoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnviarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 780, 140, 40));

        btnVolver.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 780, 140, 40));

        txtPiezasSolicitadas.setColumns(20);
        txtPiezasSolicitadas.setRows(5);
        jScrollPane2.setViewportView(txtPiezasSolicitadas);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 620, 530));

        comboPiezas.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        comboPiezas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar componente", "CPU", "GPU", "Fuente Alimentacion", "RAM", "Placa Base", "Disco Duro", "Disco SSD", "Sistema Operativo", "Pasta Térmica", "Ventilador", "Torre", "Disipador" }));
        comboPiezas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboPiezasItemStateChanged(evt);
            }
        });
        comboPiezas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPiezasActionPerformed(evt);
            }
        });
        jPanel1.add(comboPiezas, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 140, 220, 31));

        tdStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Descripcion", "Precio", "Stock", "Marca", "Componente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, true
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, 660, 530));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setText("Nº incidencia:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setText("Componente:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 140, -1, 30));
        jPanel1.add(txtIDIncidencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 130, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel1.setText("Nombre incidencia:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 30));
        jPanel1.add(txtNombrePedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 130, 30));

        jPanel2.setBackground(new java.awt.Color(70, 63, 56));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Pedido piezas faltantes");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 910, 90));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 110));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 750, 740, 10));

        jPanel5.setBackground(new java.awt.Color(70, 63, 56));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(70, 63, 56));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 120, 20, 730));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 20, 740));

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 750, 690, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1446, 844));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        ReparacionTecnicos ventanaReparacion = new ReparacionTecnicos();
        ventanaReparacion.setTxtIDIncidencia(txtIDIncidencia.getText());
        ventanaReparacion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnEnviarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarPedidoActionPerformed
       java.sql.Connection cn = ConectarBD.conectar();
     
        if (cn != null) {
            try {
                // Se utiliza PreparedStatement para evitar problemas de seguridad y mejora el rendimiento
                String sql = "INSERT INTO pedidos (nombre, ID_RECEPCIONISTAS) SELECT ?, ID_RECEPCIONISTAS FROM incidencias WHERE id_incidencias = ?";
                PreparedStatement ps = cn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, txtNombrePedido.getText()); // Suponiendo que 'txtNombrePedido' contiene el nombre del producto a insertar
                ps.setString(2, txtIDIncidencia.getText());

                // Se ejecuta la inserción
                int rowsAffected = ps.executeUpdate();

                // Verificar si se han insertado filas
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Pedido creado.");
                    // Obtener el ID del último pedido creado
                    ResultSet generatedKeys = ps.getGeneratedKeys();
                    int lastInsertedId = -1;
                    if (generatedKeys.next()) {
                        lastInsertedId = generatedKeys.getInt(1);
                        System.out.println("ID del último pedido creado: " + lastInsertedId);
                    }

                    // Insertar en la tabla pedido_productos
                    if (lastInsertedId != -1) {
                        // Construir la consulta SQL para la inserción en la tabla pedido_productos
                        String insertPedidoProductos = "INSERT INTO pedidos_productos (id_pedidos, id_productos) VALUES (?, ?)";
                        PreparedStatement psPedidoProductos = cn.prepareStatement(insertPedidoProductos);
                        // Establecer los parámetros para la consulta
                        for (String producto : productosSeleccionados) {
                            // Suponiendo que el ID del producto está en la primera posición de la cadena
                            String[] datosProducto = producto.split(" ");
                            int idProducto = Integer.parseInt(datosProducto[1]); // Se obtiene el ID del producto
                            psPedidoProductos.setInt(1, lastInsertedId); // Se establece el ID del último pedido creado
                            psPedidoProductos.setInt(2, idProducto); // Se establece el ID del producto
                            // Se ejecuta la inserción en la tabla pedido_productos
                            psPedidoProductos.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Envio de pedido realizado");

                        }

                        // Cerrar PreparedStatement después de usarlo
                        psPedidoProductos.close();
                    }
                } else {
                    System.out.println("No se han realizado cambios.");
                }

                // Cerrar PreparedStatement después de usarlo
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    cn.close();  // Cerrar la conexión en el bloque finally
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        txtPiezasSolicitadas.setEnabled(true);
    }//GEN-LAST:event_btnEnviarPedidoActionPerformed

    private void comboPiezasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboPiezasItemStateChanged
        listarPorTipoYStockCero();
    }//GEN-LAST:event_comboPiezasItemStateChanged

    private void comboPiezasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPiezasActionPerformed
        //No hace falta
    }//GEN-LAST:event_comboPiezasActionPerformed

    private void tdStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdStockMouseClicked
        int row = tdStock.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun producto");
        } else {
            int id = (int) tdStock.getValueAt(row, 0);
            String nom = (String) tdStock.getValueAt(row, 1);
            int precio = (int) tdStock.getValueAt(row, 3);
            String marca = (String) tdStock.getValueAt(row, 5);
            String componente = (String) tdStock.getValueAt(row, 6);
           
            String productoSeleccionado = "ID: " + id + " Nombre: " + nom + " Precio: " + precio + " Marca: " + marca + " Componente: " + componente;
            productosSeleccionados.add(productoSeleccionado);

            // Actualiza el JTextArea con los productos seleccionados hasta el momento
            actualizarTextArea();
        }
    }//GEN-LAST:event_tdStockMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                  FlatLightLaf.setup();
                new PiezasFaltantesTecnicos().setVisible(true);
            }
        });
    }

    public String getTxtIDIncidencia() {
        return txtIDIncidencia.getText();
    }

    public void setTxtIDIncidencia(String txtIDIncidencia) {
        this.txtIDIncidencia.setText(txtIDIncidencia);
    }
     
     

    // Método para recoger las piezas solicitadas en la ventana Reparación
    public void setPiezasSolicitadas(String descripcion) {
        txtPiezasSolicitadas.append(descripcion + "\n");
    }

    //Método para listar por componentes con stock 0
    /*public void listar() {
        java.sql.Connection cn = Conexion.conectar();

        if (cn != null) {
            try {
                // Se utiliza Statement en lugar de PreparedStatement ya que no hay parámetros en la consulta
                String sql = "SELECT nombre, descripcion, precio, stock, tipo, marca FROM PRODUCTOS WHERE Stock = 0";
                Statement statement = cn.createStatement();
                ResultSet rs = statement.executeQuery(sql);  // Se ejecuta la consulta usando Statement

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

                // Cerrar ResultSet y Statement después de usarlos
                rs.close();
                statement.close();
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
    }*/

     public void listarPorTipoYStockCero() {
        java.sql.Connection cn = ConectarBD.conectar();
        if (cn != null) {
            try {
                // Se usa PreparedStatement en lugar de Statement para poder establecer el parámetro
                String sql = "SELECT ID_PRODUCTOS, nombre, descripcion, precio, stock, tipo, marca FROM PRODUCTOS WHERE tipo = ? and stock = 0";
                PreparedStatement ps = cn.prepareStatement(sql);
                ps.setString(1, comboPiezas.getSelectedItem().toString());
                ResultSet rs = ps.executeQuery();  // Se ejecuta la consulta usando PreparedStatement

                modeloTabla = (DefaultTableModel) tdStock.getModel();
                modeloTabla.setRowCount(0);

                while (rs.next()) {
                    // Se itera a través de los resultados y agrega cada fila a la tabla
                    Object[] productos = new Object[7];
                    productos[0] = rs.getInt("ID_PRODUCTOS");
                    productos[1] = rs.getString("nombre");
                    productos[2] = rs.getString("descripcion"); // Corregido a getString para la descripción
                    productos[3] = rs.getInt("precio");
                    productos[4] = rs.getString("stock");
                    productos[5] = rs.getString("marca");
                    productos[6] = rs.getString("tipo");
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

    //Metodo para actualizar el txtArea segun los componentes seleccionados en la tabla
    private void actualizarTextArea() {
        // Construye una cadena con todos los productos seleccionados
        StringBuilder texto = new StringBuilder();
        for (String producto : productosSeleccionados) {
            texto.append(producto).append("\n");
        }

        txtPiezasSolicitadas.setText(texto.toString());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarPedido;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> comboPiezas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tdStock;
    private javax.swing.JTextField txtIDIncidencia;
    private javax.swing.JTextField txtNombrePedido;
    private javax.swing.JTextArea txtPiezasSolicitadas;
    // End of variables declaration//GEN-END:variables
}
