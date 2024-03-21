package recepcionistas;

import conexion.ConectarBD;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.sql.*;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public final class TablaConsultasClientes extends JPanel {
    
    public static DefaultTableModel modelo;
    public static JTable table;
    
    public TablaConsultasClientes() {
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
        modelo.addColumn("APELLIDOS");
        modelo.addColumn("DNI");
        modelo.addColumn("CORREO");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("DIRECCION");
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
                    int selectedRow = table.getSelectedRow();
                    FrameModificarClientesRecepcion frame = new FrameModificarClientesRecepcion();
                    frame.setId(modelo.getValueAt(selectedRow, 0).toString());
                    frame.setNombre((String) modelo.getValueAt(selectedRow, 1));
                    frame.setApellidos((String) modelo.getValueAt(selectedRow, 2));
                    frame.setDni((String) modelo.getValueAt(selectedRow, 3));
                    frame.setEmail((String) modelo.getValueAt(selectedRow, 4));
                    frame.setTelefono((String) modelo.getValueAt(selectedRow, 5));
                    frame.setDireccion((String) modelo.getValueAt(selectedRow, 6));
                    frame.setEstado((String) modelo.getValueAt(selectedRow, 7));
                    frame.setVisible(true);
                    
                }
            }
        });
        
       obtenerDataBase();
        
    }
    
    public void obtenerDataBase() {
        try {
            Connection cn = ConectarBD.conectar();
            String sql = "SELECT ID_CLIENTES, NOMBRE, APELLIDOS, DNI, CORREO,TELEFONO,DIRECCION, ESTADOACTUAL FROM CLIENTES";
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Object[] fila = new Object[8];
                for (int i = 0; i < 8; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
            cn.close();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public void actualizarTabla() {
        modelo.setRowCount(0);
        obtenerDataBase();
    }
    
}
