package tecnicos;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.table.DefaultTableModel;
import conexion.ConectarBD;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Joakamakaka
 */
public class IncidenciasTecnicos extends javax.swing.JFrame {

    DefaultTableModel modeloTabla;

    public IncidenciasTecnicos() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("IncidenciasTecnicos");
        setResizable(false);
        listar();
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
        chEstado = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tdIncidencias = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(219, 219, 209));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chEstado.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        chEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Incidencia Recibida", "Pendiente de piezas", "Piezas Recibidas", "En reparacion", "Reparado" }));
        chEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chEstadoItemStateChanged(evt);
            }
        });
        jPanel1.add(chEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 230, 40));

        jPanel3.setBackground(new java.awt.Color(70, 63, 56));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Incidencias");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 890, 70));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 90));

        tdIncidencias.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tdIncidencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Descripcion", "Estado", "Nombre", "FechaApertura", "FechaCierre"
            }
        ));
        tdIncidencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tdIncidenciasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tdIncidencias);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 1260, 580));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 780, 1430, 10));

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 800, 100, 30));

        jPanel5.setBackground(new java.awt.Color(70, 63, 56));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(70, 63, 56));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 120, 20, 730));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 90, 20, 760));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 850));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chEstadoItemStateChanged
        listar();
    }//GEN-LAST:event_chEstadoItemStateChanged

    private void tdIncidenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdIncidenciasMouseClicked
        int filaSeleccionada = tdIncidencias.getSelectedRow();
        String desInci = "";
        String estadoInci = "";
        String idIncidencias = "";
        
        if (filaSeleccionada != -1) {
            
            estadoInci = (String) modeloTabla.getValueAt(filaSeleccionada, 2);
            desInci = (String) modeloTabla.getValueAt(filaSeleccionada, 1);
            idIncidencias = (String) modeloTabla.getValueAt(filaSeleccionada, 0);

            if ("Incidencia Recibida".equals(estadoInci)) {
                int opcion = JOptionPane.showConfirmDialog(this, "¿Desea comenzar con el proceso de reparación de esta incidencia?", "Comfirmación", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    ReparacionTecnicos repTec = new ReparacionTecnicos();
                    repTec.setDescripcionIncidencia(desInci, idIncidencias);
                    repTec.setVisible(true);
                    this.dispose();
                }
            } else {
                int opcion = JOptionPane.showConfirmDialog(this, "¿Desea modificar esta incidencia?", "Comfirmación", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    ReparacionTecnicos repTec = new ReparacionTecnicos();
                    repTec.setDescripcionIncidencia(desInci, idIncidencias);
                    repTec.setVisible(true);
                    this.dispose();
                }
            }
        }
    }//GEN-LAST:event_tdIncidenciasMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       MenuTecnicos menu = new MenuTecnicos();
       menu.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                     FlatLightLaf.setup();
                new IncidenciasTecnicos().setVisible(true);
            }
        });
    }

    private void listar() {
        java.sql.Connection cn = ConectarBD.conectar();

        if (cn != null && !chEstado.getSelectedItem().toString().equals("Todos")) {
            try {
                // Se usa PreparedStatement en lugar de Statement para poder establecer el parámetro
                String sql = "SELECT ID_INCIDENCIAS, descripcion, estado, nombre, FechaApertura, FechaCierre FROM incidencias WHERE ESTADO = ?";
                PreparedStatement ps = cn.prepareStatement(sql);
                ps.setString(1, chEstado.getSelectedItem().toString());
                ResultSet rs = ps.executeQuery();  // Se ejecuta la consulta usando PreparedStatement

                modeloTabla = (DefaultTableModel) tdIncidencias.getModel();
                modeloTabla.setRowCount(0);

                while (rs.next()) {
                    // Se itera a través de los resultados y agrega cada fila a la tabla
                    Object[] incidencias = new Object[6];
                    incidencias[0] = rs.getString("ID_INCIDENCIAS");
                    incidencias[1] = rs.getString("descripcion");
                    incidencias[2] = rs.getString("estado");
                    incidencias[3] = rs.getString("nombre");
                    incidencias[4] = rs.getString("FechaApertura");
                    incidencias[5] = rs.getString("FechaCierre");
                    modeloTabla.addRow(incidencias);
                }

                // Cerrar ResultSet y PreparedStatement después de usarlos
                rs.close();
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
        }else if (cn != null && chEstado.getSelectedItem().toString().equals("Todos")) {
            try {
                // Se usa PreparedStatement en lugar de Statement para poder establecer el parámetro
                String sql = "SELECT ID_INCIDENCIAS, descripcion, estado, nombre, FechaApertura, FechaCierre FROM incidencias WHERE ESTADO !='Entregado'";
                PreparedStatement ps = cn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();  // Se ejecuta la consulta usando PreparedStatement

                modeloTabla = (DefaultTableModel) tdIncidencias.getModel();
                modeloTabla.setRowCount(0);

                while (rs.next()) {
                    // Se itera a través de los resultados y agrega cada fila a la tabla
                    Object[] incidencias = new Object[6];
                    incidencias[0] = rs.getString("ID_INCIDENCIAS");
                    incidencias[1] = rs.getString("descripcion");
                    incidencias[2] = rs.getString("estado");
                    incidencias[3] = rs.getString("nombre");
                    incidencias[4] = rs.getString("FechaApertura");
                    incidencias[5] = rs.getString("FechaCierre");
                    modeloTabla.addRow(incidencias);
                }

                // Cerrar ResultSet y PreparedStatement después de usarlos
                rs.close();
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
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> chEstado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tdIncidencias;
    // End of variables declaration//GEN-END:variables

    String consulta;

}
