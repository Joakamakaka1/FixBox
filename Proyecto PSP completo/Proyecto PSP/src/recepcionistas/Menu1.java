package recepcionistas;

import com.formdev.flatlaf.FlatLightLaf;
import inicializar.InicioSesion;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Menu1 extends javax.swing.JFrame {

    /**
     * Creates new form Menu1
     */
    public Menu1() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        labelbackclientes.setVisible(false);
        labelbackincidencias.setVisible(false);
        labelbackpedidos.setVisible(false);
        
        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                actualizarHora();
            }
        });
        timer.start();
    setIconImage(getIconImage());
    }
    @Override
    public Image getIconImage(){
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("./iconimages/images.jpg"));
        return icono;
    }
    private void actualizarHora() {
        Locale spanish = new Locale("es", "ES");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendario = Calendar.getInstance();
        int hora, minutos, segundos;
        hora = calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
     
        labelhora.setText(sdf.format(new java.util.Date()) +"  "+  hora + ":" + minutos + ":" + segundos);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelincidencias = new javax.swing.JLabel();
        labelclientes = new javax.swing.JLabel();
        labelpedidos = new javax.swing.JLabel();
        labeltextpedidos = new javax.swing.JLabel();
        labeltextincidencias = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelbackincidencias = new javax.swing.JLabel();
        labelbackclientes = new javax.swing.JLabel();
        labelbackpedidos = new javax.swing.JLabel();
        labelcerrar = new javax.swing.JLabel();
        labeltextcerrar = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        labelhora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(219, 219, 209));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelincidencias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelincidencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconimages/iconincidencias.png"))); // NOI18N
        labelincidencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelincidenciasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelincidenciasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelincidenciasMouseExited(evt);
            }
        });
        jPanel1.add(labelincidencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 380, 130, 120));

        labelclientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconimages/iconclientes.png"))); // NOI18N
        labelclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelclientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelclientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelclientesMouseExited(evt);
            }
        });
        jPanel1.add(labelclientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 150, 140));

        labelpedidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelpedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconimages/iconpedido.png"))); // NOI18N
        labelpedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelpedidosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelpedidosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelpedidosMouseExited(evt);
            }
        });
        jPanel1.add(labelpedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, 140, 130));

        labeltextpedidos.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        labeltextpedidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltextpedidos.setText("Pedidos");
        jPanel1.add(labeltextpedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 130, 30));

        labeltextincidencias.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        labeltextincidencias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltextincidencias.setText("Incidencias");
        jPanel1.add(labeltextincidencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 300, 140, 40));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Clientes");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 160, 30));

        jPanel2.setBackground(new java.awt.Color(70, 63, 56));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Panel de control recepcionistas ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 920, 80));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 120));

        labelbackincidencias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelbackincidencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconimages/circuloback.png"))); // NOI18N
        labelbackincidencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelbackincidenciasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelbackincidenciasMouseExited(evt);
            }
        });
        jPanel1.add(labelbackincidencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 340, 210, 200));

        labelbackclientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelbackclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconimages/circuloback.png"))); // NOI18N
        labelbackclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelbackclientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelbackclientesMouseExited(evt);
            }
        });
        jPanel1.add(labelbackclientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 210, 200));

        labelbackpedidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelbackpedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconimages/circuloback.png"))); // NOI18N
        labelbackpedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelbackpedidosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelbackpedidosMouseExited(evt);
            }
        });
        jPanel1.add(labelbackpedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 210, 200));

        labelcerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelcerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconimages/iconcerrarsesioninactivo.png"))); // NOI18N
        labelcerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelcerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelcerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelcerrarMouseExited(evt);
            }
        });
        jPanel1.add(labelcerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 760, 70, 80));

        labeltextcerrar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        labeltextcerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltextcerrar.setText("Cerrar Sesión");
        jPanel1.add(labeltextcerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 770, 110, 60));

        jPanel5.setBackground(new java.awt.Color(70, 63, 56));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(70, 63, 56));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 120, 20, 730));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 120, 20, 730));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 750, 1430, 10));

        labelhora.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(labelhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 760, 210, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 850));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void labelclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelclientesMouseClicked
        PanelClientes panelclientes = new PanelClientes();
        this.dispose();
        panelclientes.setVisible(true);
    }//GEN-LAST:event_labelclientesMouseClicked

    private void labelpedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelpedidosMouseClicked
        FrameConsultasPedidos ped = new FrameConsultasPedidos();
        this.dispose();
        ped.setVisible(true);
    }//GEN-LAST:event_labelpedidosMouseClicked

    private void labelincidenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelincidenciasMouseClicked
        FrameConsultasIncidencias inci = new FrameConsultasIncidencias();
        this.dispose();
        inci.setVisible(true);
    }//GEN-LAST:event_labelincidenciasMouseClicked

    private void labelbackincidenciasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelbackincidenciasMouseEntered

    }//GEN-LAST:event_labelbackincidenciasMouseEntered

    private void labelbackincidenciasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelbackincidenciasMouseExited

    }//GEN-LAST:event_labelbackincidenciasMouseExited

    private void labelclientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelclientesMouseEntered
        labelbackclientes.setVisible(true);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_labelclientesMouseEntered

    private void labelclientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelclientesMouseExited
        labelbackclientes.setVisible(false);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_labelclientesMouseExited

    private void labelbackclientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelbackclientesMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelbackclientesMouseEntered

    private void labelbackclientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelbackclientesMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelbackclientesMouseExited

    private void labelbackpedidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelbackpedidosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelbackpedidosMouseEntered

    private void labelbackpedidosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelbackpedidosMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelbackpedidosMouseExited

    private void labelcerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelcerrarMouseEntered
        labelcerrar.setIcon(iconorojo);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        labelcerrar.repaint();
    }//GEN-LAST:event_labelcerrarMouseEntered

    private void labelcerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelcerrarMouseExited
        labelcerrar.setIcon(icononegro);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        labelcerrar.repaint();
    }//GEN-LAST:event_labelcerrarMouseExited

    private void labelpedidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelpedidosMouseEntered
        labelbackpedidos.setVisible(true);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_labelpedidosMouseEntered

    private void labelpedidosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelpedidosMouseExited
        labelbackpedidos.setVisible(false);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_labelpedidosMouseExited

    private void labelincidenciasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelincidenciasMouseEntered
        labelbackincidencias.setVisible(true);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_labelincidenciasMouseEntered

    private void labelincidenciasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelincidenciasMouseExited
        labelbackincidencias.setVisible(false);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_labelincidenciasMouseExited

    private void labelcerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelcerrarMouseClicked
        InicioSesion is = new InicioSesion();
        this.dispose();
        is.setVisible(true);
    }//GEN-LAST:event_labelcerrarMouseClicked
    String rutaIconRojo = "/iconimages/iconcerrarsesion.png";
    ImageIcon iconorojo = new ImageIcon(getClass().getResource(rutaIconRojo));
    
    String rutaIconNegro = "/iconimages/iconcerrarsesioninactivo.png";
    ImageIcon icononegro = new ImageIcon(getClass().getResource(rutaIconNegro));

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 FlatLightLaf.setup();
                new Menu1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelbackclientes;
    private javax.swing.JLabel labelbackincidencias;
    private javax.swing.JLabel labelbackpedidos;
    private javax.swing.JLabel labelcerrar;
    private javax.swing.JLabel labelclientes;
    private javax.swing.JLabel labelhora;
    private javax.swing.JLabel labelincidencias;
    private javax.swing.JLabel labelpedidos;
    private javax.swing.JLabel labeltextcerrar;
    private javax.swing.JLabel labeltextincidencias;
    private javax.swing.JLabel labeltextpedidos;
    // End of variables declaration//GEN-END:variables
}
