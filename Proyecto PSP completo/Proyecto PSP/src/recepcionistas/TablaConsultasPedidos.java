package recepcionistas;

import conexion.ConectarBD;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public final class TablaConsultasPedidos extends JPanel {

    public static DefaultTableModel modelo;
    public static JTable table;
    int selectedRow;
    private int idPedido;

    public TablaConsultasPedidos() {
        obtenerDatos();
    }

    public void obtenerDatos() {
        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        table = new JTable(modelo);
        table.getTableHeader().setReorderingAllowed(false);
        table.setPreferredScrollableViewportSize(new Dimension(1220, 550));
        JScrollPane scroll = new JScrollPane(table);
        add(scroll);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        table.setDefaultRenderer(Object.class, centerRenderer);

        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("ESTADO");

        ListSelectionModel seleccion = table.getSelectionModel();
        seleccion.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        seleccion.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

            }

        });

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    selectedRow = table.getSelectedRow();
                    idPedido = (int) table.getValueAt(selectedRow, 0);
                    String estadoActual = (String) table.getValueAt(selectedRow, 2);
                    if (!estadoActual.equals("Entregado")) {
                        Object[] options = {"Entregado", "Pendiente"};
                        int opcion = JOptionPane.showOptionDialog(null, "¿Cambiar estado?", "Elige una opcion", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, options, options[0]);
                        if (opcion == 0) {
                            actualizarPedido("Entregado");
                        } else {
                            actualizarPedido("Pendiente");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El pedido ya está entregado.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        obtenerDataBase();
    }

    public void obtenerDataBase() {
        try {
            Connection cn = ConectarBD.conectar();
            String sql = "SELECT ID_PEDIDOS, NOMBRE, ESTADO FROM PEDIDOS";
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Object[] fila = new Object[3];
                for (int i = 0; i < 3; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void actualizarPedido(String opcion) {
        try {
            Connection cn = ConectarBD.conectar();
            String sql = "UPDATE PEDIDOS SET ESTADO=? WHERE ID_PEDIDOS = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, opcion);
            ps.setInt(2, selectedRow + 1);
            int filas = ps.executeUpdate();
            if (filas > 0) {
                actualizarTabla();
            } else {
                System.out.println("La id es:" + selectedRow);
                System.out.println("No se actualizo nada");
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        if (opcion.equals("Entregado")) {
            try {
                Connection cn = ConectarBD.conectar();
                String sql = "SELECT ID_PRODUCTOS FROM PEDIDOS_PRODUCTOS WHERE ID_PEDIDOS = ?";
                PreparedStatement ps = cn.prepareStatement(sql);
                ps.setInt(1, idPedido);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    int idProducto = rs.getInt("ID_PRODUCTOS");
                    // Actualizar el stock de cada producto
                    sql = "UPDATE PRODUCTOS SET Stock = Stock + 1 WHERE ID_PRODUCTOS = ?";
                    PreparedStatement psStock = cn.prepareStatement(sql);
                    psStock.setInt(1, idProducto);
                    psStock.executeUpdate();
                }
                cn.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    public void actualizarTabla() {
        modelo.setRowCount(0);
        obtenerDataBase();
    }

}
