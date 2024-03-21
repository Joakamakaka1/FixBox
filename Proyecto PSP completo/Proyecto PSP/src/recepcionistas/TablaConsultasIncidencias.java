package recepcionistas;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import conexion.ConectarBD;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.sql.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public final class TablaConsultasIncidencias extends JPanel {

    public static DefaultTableModel modelo;
    public static JTable table;
    int selectedRow;

    public TablaConsultasIncidencias() {
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
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("ESTADO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("FECHA_APERTURA");
        modelo.addColumn("FECHA_CIERRE");

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
                    int idIncidencia = (int) table.getValueAt(selectedRow, 0);
                    String estadoSeleccionado = (String) table.getValueAt(selectedRow, 2);

                    if (estadoSeleccionado.equalsIgnoreCase("Reparado")) {

                        Object[] optionsinos = {
                            "Si",
                            "No"
                        };

                        int optionsino = JOptionPane.showOptionDialog(null,
                                "¿Desea finalizar la incidencia e imprimir factura?",
                                "Confirmar",
                                JOptionPane.YES_NO_OPTION,
                                JOptionPane.QUESTION_MESSAGE,
                                null,
                                optionsinos,
                                optionsinos[0]);
                        /*
                            }
                         */
                        if (optionsino >= 0 && optionsino < optionsinos.length) {
                            String respuestaSiNo = optionsinos[optionsino].toString();

                            if (respuestaSiNo.equals("Si")) {
                                String nuevoEstado = "Entregado";
                                actualizarIncidencias(nuevoEstado);
                                imprimirFactura(idIncidencia);

                            } else {

                            }
                        }
                    } else {
                        Object[] options = {
                            "Incidencia Recibida",
                            "Pendiente de piezas",
                            "En reparacion",
                            "Reparado",
                            "Entregado"
                        };
                        selectedRow = table.getSelectedRow();
                        int opcion = JOptionPane.showOptionDialog(null, "¿Cambiar estado?", "Elige una opcion", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, options, options[0]);
                        if (opcion == 0) {
                            actualizarIncidencias("Incidencia Recibida");
                        } else if (opcion == 1) {
                            actualizarIncidencias("Pendiente de piezas");
                        } else if (opcion == 2) {
                            actualizarIncidencias("En reparacion");
                        } else if (opcion == 3) {
                            actualizarIncidencias("Reparado");
                        } else if (opcion == 4) {
                            actualizarIncidencias("Entregado");

                        }
                    }

                }
            }

        });

       obtenerDataBase();

    }

    public void obtenerDataBase() {
        try {
            Connection cn = ConectarBD.conectar();
            String sql = "SELECT ID_INCIDENCIAS, DESCRIPCION, ESTADO, NOMBRE, FECHAAPERTURA,FECHACIERRE FROM INCIDENCIAS";
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Object[] fila = new Object[6];
                for (int i = 0; i < 6; i++) {
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

    public void actualizarIncidencias(String opcion) {
        try {
            System.out.println(opcion);
            Connection cn = ConectarBD.conectar();
            String sql = "UPDATE INCIDENCIAS SET ESTADO=? WHERE ID_INCIDENCIAS = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, opcion);
            ps.setInt(2, selectedRow + 1);
            ps.executeUpdate();
            int filas = ps.executeUpdate();
            if (filas > 0) {
                actualizarTabla();
            } else {
                System.out.println("La id es:" + selectedRow);
                System.out.println("No se actualizo nada");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void imprimirFactura(int idIncidencia) {
        try {
            String sql = "SELECT ID_INFORMES, HORASTRABAJO,LIMPIEZA,PRECIO,DESCRIPCION,FECHA FROM INFORMES WHERE ID_INCIDENCIAS = ? ";
            Connection cn = ConectarBD.conectar();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, idIncidencia);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                idInforme = rs.getInt(1);
                horastrabajo = rs.getString(2);

                if (rs.getBoolean(3)) {
                    limpieza = "Si";
                } else {
                    limpieza = "No";
                }
                precio = rs.getDouble(4);
                descripcion = rs.getString(5);
                fecha = rs.getDate(6);

            }
            generar(idInforme, horastrabajo, limpieza, precio, descripcion, fecha, nombre, apellidos, dni);

            cn.close();

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void generar(int id, String horas, String limpieza, double precio, String descripcion, Date fecha, String nombre, String apellidos, String dni) {
        try {
            String sql = "SELECT C.NOMBRE, C.APELLIDOS, C.DNI FROM CLIENTES AS C INNER JOIN INCIDENCIAS AS I ON C.ID_CLIENTES=I.ID_CLIENTES WHERE I.ID_INCIDENCIAS=?";
            Connection cn = ConectarBD.conectar();
            PreparedStatement ps = cn.prepareStatement(sql);
            System.out.println(id);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nombre = rs.getString(1);
                apellidos = rs.getString(2);
                dni = rs.getString(3);
            }

            cn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        Document documento = new Document();

        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/factura.pdf"));

            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("src/iconimages/images.jpg");
            header.scaleToFit(200, 200);

            PdfPTable encabezadoTable = new PdfPTable(2);
            encabezadoTable.setWidthPercentage(100);
            encabezadoTable.setSpacingBefore(10);

            PdfPCell logoCell = new PdfPCell(header);
            logoCell.setBorder(Rectangle.NO_BORDER);

            PdfPCell facturaCell = new PdfPCell(new Phrase("Factura", FontFactory.getFont("Tahoma", 14, Font.BOLD, BaseColor.DARK_GRAY)));
            facturaCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            facturaCell.setBorder(Rectangle.NO_BORDER);

            encabezadoTable.addCell(logoCell);
            encabezadoTable.addCell(facturaCell);

            documento.open();
            documento.add(encabezadoTable);

            // Agregar información de la empresa
            Paragraph infoEmpresa = new Paragraph();
            infoEmpresa.setAlignment(Paragraph.ALIGN_LEFT);
            infoEmpresa.add("EMPRESA: FixBox\n");
            infoEmpresa.add("DIRECCIÓN: Calle Andalucia, Cadiz\n");
            infoEmpresa.add("TELÉFONO: 956-000-010\n");
            infoEmpresa.add("EMAIL: FixBox@gmail.com\n\n");
            documento.add(infoEmpresa);
            // Detalles de la factura
            Paragraph titulo = new Paragraph("FACTURA\n\n", FontFactory.getFont("Tahoma", 14, Font.BOLD, BaseColor.DARK_GRAY));
            titulo.setAlignment(Paragraph.ALIGN_CENTER);
            documento.add(titulo);

            PdfPTable tablaproforma = new PdfPTable(6);
            tablaproforma.setWidthPercentage(100);

            PdfPCell cellId = new PdfPCell(new Phrase("ID"));
            PdfPCell cellHoras = new PdfPCell(new Phrase("Horas"));
            PdfPCell cellLimpieza = new PdfPCell(new Phrase("Limpieza"));
            PdfPCell cellPrecio = new PdfPCell(new Phrase("Precio"));
            PdfPCell cellDescripcion = new PdfPCell(new Phrase("Descripcion"));
            PdfPCell cellFecha = new PdfPCell(new Phrase("Fecha"));

            cellId.setBackgroundColor(BaseColor.GRAY);
            cellHoras.setBackgroundColor(BaseColor.GRAY);
            cellLimpieza.setBackgroundColor(BaseColor.GRAY);
            cellPrecio.setBackgroundColor(BaseColor.GRAY);
            cellDescripcion.setBackgroundColor(BaseColor.GRAY);
            cellFecha.setBackgroundColor(BaseColor.GRAY);

            tablaproforma.addCell(cellId);
            tablaproforma.addCell(cellHoras);
            tablaproforma.addCell(cellLimpieza);
            tablaproforma.addCell(cellPrecio);
            tablaproforma.addCell(cellDescripcion);
            tablaproforma.addCell(cellFecha);

            tablaproforma.addCell(String.valueOf(id));
            tablaproforma.addCell(horas);
            tablaproforma.addCell(limpieza);
            tablaproforma.addCell(String.valueOf(precio));
            tablaproforma.addCell(descripcion);
            tablaproforma.addCell(String.valueOf(fecha));

            documento.add(tablaproforma);
            Paragraph infototal = new Paragraph();
            infototal.setAlignment(Paragraph.ALIGN_RIGHT);

            infototal.add("Base imponible: " + precio + "€\n");
            infototal.add("IVA 21% ");
            infototal.add("Precio total: " + precio * 1.21 + "€");
            documento.add(infototal);
            documento.close();

        } catch (DocumentException | IOException e) {
            System.out.println("Error al crear el PDF" + e);

        }

        JOptionPane.showMessageDialog(null, "Factura generada");
    }

    String horastrabajo, descripcion, nombre, apellidos, dni;
    int idInforme;
    double precio;
    String limpieza;
    Date fecha;

}
