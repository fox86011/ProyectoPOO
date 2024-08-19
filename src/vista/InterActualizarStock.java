/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;
import conexion.Conexion;
import controlador.Ctrl_Producto;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Producto;
/**
 *
 * @author ediso
 */
public class InterActualizarStock extends javax.swing.JInternalFrame {

    int idProducto = 0;
    int cantidad = 0;

    public InterActualizarStock() {
        initComponents();
        setTitle("Actualizar Stock de los Productos");
        setSize(new Dimension(400, 300));

        this.CargarComboProductos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_cantidad_actual = new javax.swing.JTextField();
        txt_cantidad_nueva = new javax.swing.JTextField();
        jComboBox_producto = new javax.swing.JComboBox<>();
        jButton_actualizar = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Actualizar Stock de Productos");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Producto:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Stock Actual:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Stock Nuevo:");

        txt_cantidad_actual.setEnabled(false);

        jComboBox_producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Producto:" }));
        jComboBox_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_productoActionPerformed(evt);
            }
        });

        jButton_actualizar.setText("Actualizar");
        jButton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txt_cantidad_nueva))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_cantidad_actual)
                                    .addComponent(jComboBox_producto, 0, 185, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)))
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton_actualizar)
                .addGap(154, 154, 154))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_cantidad_actual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_cantidad_nueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButton_actualizar)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_productoActionPerformed
        // TODO add your handling code here:
        this.MostrarStock();
    }//GEN-LAST:event_jComboBox_productoActionPerformed

    private void jButton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizarActionPerformed
        // TODO add your handling code here:
        if (!jComboBox_producto.getSelectedItem().equals("Seleccione producto:")) {
            //Validamos campos vacios
            if (!txt_cantidad_nueva.getText().isEmpty()) {
                //validamos que el usuario no ingrese otros caracteres no numericos
                boolean validacion = validar(txt_cantidad_nueva.getText().trim());
                if (validacion == true) {
                    //validar que la cantidad sea mayor cero (0)
                    if (Integer.parseInt(txt_cantidad_nueva.getText()) > 0) {

                        Producto producto = new Producto();
                        Ctrl_Producto controlProducto = new Ctrl_Producto();
                        int stockActual = Integer.parseInt(txt_cantidad_actual.getText().trim());
                        int stockNuevo = Integer.parseInt(txt_cantidad_nueva.getText().trim());

                        stockNuevo = stockActual + stockNuevo;
                        producto.setCantidad(stockNuevo);
                        if (controlProducto.actualizarStock(producto, idProducto)) {
                            JOptionPane.showMessageDialog(null, "Stock Actualizado");
                            jComboBox_producto.setSelectedItem("Seleccione producto:");
                            txt_cantidad_actual.setText("");
                            txt_cantidad_nueva.setText("");
                            this.CargarComboProductos();
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al Actualizar Stock");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "La cantidad no puede ser cero ni negativa");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "En la cantidad no se admiten caracteres no numericos");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese una nueva cantidad para sumar el stock del producto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un producto");
        }
    }//GEN-LAST:event_jButton_actualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_actualizar;
    private javax.swing.JComboBox<String> jComboBox_producto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_cantidad_actual;
    private javax.swing.JTextField txt_cantidad_nueva;
    // End of variables declaration//GEN-END:variables
    private void CargarComboProductos() {

        Connection cn = Conexion.conectar();
        String sql = "select * from tb_producto";
        Statement st;
        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_producto.removeAllItems();
            jComboBox_producto.addItem("Seleccione producto:");
            while (rs.next()) {
                jComboBox_producto.addItem(rs.getString("nombre"));
            }

        } catch (SQLException e) {
            System.out.println("Error al cargar los productos en: " + e);
        }

    }

    //metodo para mostrar stock del producto seleccionado
    private void MostrarStock() {
        try {

            Connection cn = Conexion.conectar();
            String sql = "select * from tb_producto where nombre = '" + this.jComboBox_producto.getSelectedItem() + "'";
            Statement st;
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                idProducto = rs.getInt("idProducto");
                cantidad = rs.getInt("cantidad");
                txt_cantidad_actual.setText(String.valueOf(cantidad));
            } else {
                txt_cantidad_actual.setText("");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener stock del producto en: " + e);
        }
    }

    //metodo de validacion de caracteres no numericos
    private boolean validar(String valor) {
        int num;
        try {
            num = Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
