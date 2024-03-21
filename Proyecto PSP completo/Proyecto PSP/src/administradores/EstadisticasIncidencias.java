/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administradores;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Hugo
 */
public class EstadisticasIncidencias extends javax.swing.JFrame {

    /**
     * Creates new form EstadisticasClientela
     */
    public EstadisticasIncidencias() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    setIconImage(getIconImage());
    }
    @Override
    public Image getIconImage(){
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("./iconimages/images.jpg"));
        return icono;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new javax.swing.JPanel();
        btnVolverAtras = new javax.swing.JButton();
        txtVolverAtras = new javax.swing.JLabel();
        textClientela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelFondo.setBackground(new java.awt.Color(219, 219, 209));
        PanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolverAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconimages/iconatras.png"))); // NOI18N
        btnVolverAtras.setContentAreaFilled(false);
        btnVolverAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVolverAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverAtrasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverAtrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverAtrasMouseExited(evt);
            }
        });
        btnVolverAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverAtrasActionPerformed(evt);
            }
        });
        PanelFondo.add(btnVolverAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 730, 90, 80));

        txtVolverAtras.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        txtVolverAtras.setText("Volver atrás");
        PanelFondo.add(txtVolverAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 750, -1, 40));

        textClientela.setBackground(new java.awt.Color(0, 0, 0));
        textClientela.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        textClientela.setText("Estadísticas Incidencias");
        PanelFondo.add(textClientela, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 1440, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverAtrasMouseClicked
        PanelEstadisticas ppa = new PanelEstadisticas();
        ppa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverAtrasMouseClicked

    private void btnVolverAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverAtrasMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnVolverAtrasMouseEntered

    private void btnVolverAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverAtrasMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnVolverAtrasMouseExited

    private void btnVolverAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverAtrasActionPerformed

    }//GEN-LAST:event_btnVolverAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(EstadisticasIncidencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstadisticasIncidencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstadisticasIncidencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstadisticasIncidencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstadisticasIncidencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JButton btnVolverAtras;
    private javax.swing.JLabel textClientela;
    private javax.swing.JLabel txtVolverAtras;
    // End of variables declaration//GEN-END:variables
}
