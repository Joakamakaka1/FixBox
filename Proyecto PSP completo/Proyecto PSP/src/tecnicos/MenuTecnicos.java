package tecnicos;

import com.formdev.flatlaf.FlatLightLaf;
import inicializar.InicioSesion;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author Joakamakaka
 */
public class MenuTecnicos extends javax.swing.JFrame {

    public MenuTecnicos() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("MenuTecnicos");
        setResizable(false);
        labelbackverincidencias.setVisible(false);
        labelbackpedirpiezas.setVisible(false);
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

        labelhora.setText(sdf.format(new java.util.Date()) + "  " + hora + ":" + minutos + ":" + segundos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelverincidencias = new javax.swing.JLabel();
        labeltextincidencias = new javax.swing.JLabel();
        labelbackverincidencias = new javax.swing.JLabel();
        labeltextpiezas = new javax.swing.JLabel();
        labelverpiezas = new javax.swing.JLabel();
        labelbackpedirpiezas = new javax.swing.JLabel();
        labelcerrar = new javax.swing.JLabel();
        labeltextcerrar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        labelhora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(219, 219, 209));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(70, 63, 56));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Panel de control tecnicos");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 920, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 90));

        labelverincidencias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelverincidencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconimages/iconincidencias.png"))); // NOI18N
        labelverincidencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelverincidenciasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelverincidenciasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelverincidenciasMouseExited(evt);
            }
        });
        jPanel1.add(labelverincidencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 150, 140));

        labeltextincidencias.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        labeltextincidencias.setForeground(new java.awt.Color(0, 0, 0));
        labeltextincidencias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltextincidencias.setText("Ver incidencias");
        jPanel1.add(labeltextincidencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 170, 30));

        labelbackverincidencias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelbackverincidencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconimages/circuloback.png"))); // NOI18N
        labelbackverincidencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelbackverincidenciasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelbackverincidenciasMouseExited(evt);
            }
        });
        jPanel1.add(labelbackverincidencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 210, 200));

        labeltextpiezas.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        labeltextpiezas.setForeground(new java.awt.Color(0, 0, 0));
        labeltextpiezas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltextpiezas.setText("Pedir piezas");
        jPanel1.add(labeltextpiezas, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 310, 150, 30));

        labelverpiezas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelverpiezas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconimages/iconpedirpiezas.png"))); // NOI18N
        labelverpiezas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelverpiezasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelverpiezasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelverpiezasMouseExited(evt);
            }
        });
        jPanel1.add(labelverpiezas, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 370, 140, 130));

        labelbackpedirpiezas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelbackpedirpiezas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconimages/circuloback.png"))); // NOI18N
        labelbackpedirpiezas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelbackpedirpiezasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelbackpedirpiezasMouseExited(evt);
            }
        });
        jPanel1.add(labelbackpedirpiezas, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 340, 210, 200));

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
        jPanel1.add(labelcerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 760, 70, 90));

        labeltextcerrar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        labeltextcerrar.setForeground(new java.awt.Color(0, 0, 0));
        labeltextcerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltextcerrar.setText("Cerrar Sesión");
        jPanel1.add(labeltextcerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 780, 110, 50));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 760, 1430, 10));

        jPanel5.setBackground(new java.awt.Color(70, 63, 56));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(70, 63, 56));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 120, 20, 730));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 90, 20, 760));

        labelhora.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(labelhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 770, 210, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1446, 844));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelverincidenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelverincidenciasMouseClicked
        IncidenciasTecnicos it = new IncidenciasTecnicos();
        it.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_labelverincidenciasMouseClicked

    private void labelverincidenciasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelverincidenciasMouseEntered
        labelbackverincidencias.setVisible(true);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_labelverincidenciasMouseEntered

    private void labelverincidenciasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelverincidenciasMouseExited
        labelbackverincidencias.setVisible(false);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_labelverincidenciasMouseExited

    private void labelbackverincidenciasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelbackverincidenciasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelbackverincidenciasMouseEntered

    private void labelbackverincidenciasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelbackverincidenciasMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelbackverincidenciasMouseExited

    private void labelverpiezasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelverpiezasMouseClicked
        PedirPiezasTecnicos pft = new PedirPiezasTecnicos();
        pft.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_labelverpiezasMouseClicked

    private void labelverpiezasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelverpiezasMouseEntered
        labelbackpedirpiezas.setVisible(true);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_labelverpiezasMouseEntered

    private void labelverpiezasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelverpiezasMouseExited
        labelbackpedirpiezas.setVisible(false);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_labelverpiezasMouseExited

    private void labelbackpedirpiezasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelbackpedirpiezasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelbackpedirpiezasMouseEntered

    private void labelbackpedirpiezasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelbackpedirpiezasMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelbackpedirpiezasMouseExited

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
    String rutaIconRojo = "/iconimages/iconcerrarsesion.png";
    ImageIcon iconorojo = new ImageIcon(getClass().getResource(rutaIconRojo));

    String rutaIconNegro = "/iconimages/iconcerrarsesioninactivo.png";
    ImageIcon icononegro = new ImageIcon(getClass().getResource(rutaIconNegro));
    private void labelcerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelcerrarMouseClicked
       InicioSesion is = new InicioSesion();
        this.dispose();
        is.setVisible(true);
    }//GEN-LAST:event_labelcerrarMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                     FlatLightLaf.setup();
                new MenuTecnicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelbackpedirpiezas;
    private javax.swing.JLabel labelbackverincidencias;
    private javax.swing.JLabel labelcerrar;
    private javax.swing.JLabel labelhora;
    private javax.swing.JLabel labeltextcerrar;
    private javax.swing.JLabel labeltextincidencias;
    private javax.swing.JLabel labeltextpiezas;
    private javax.swing.JLabel labelverincidencias;
    private javax.swing.JLabel labelverpiezas;
    // End of variables declaration//GEN-END:variables
}
