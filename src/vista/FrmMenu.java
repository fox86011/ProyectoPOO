/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JDesktopPane;

/**
 *
 * @author ediso
 */
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenu
     */
    public static JDesktopPane jDesktopPane_menu;

    public FrmMenu() {
        initComponents();
        this.setSize(new Dimension(1200, 700));
        this.setLocationRelativeTo(null);
        this.setTitle("REGISTRO_CANCHAS");

        this.setLayout(null);
        jDesktopPane_menu = new JDesktopPane();
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.jDesktopPane_menu.setBounds(0, 0, ancho, (alto - 110));
        this.add(jDesktopPane_menu);
    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/pelota-de-futbol.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_nuevo_usuario = new javax.swing.JMenuItem();
        jMenuItem_gestion_usuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_nuevo_producto = new javax.swing.JMenuItem();
        jMenuItem_gestion_producto = new javax.swing.JMenuItem();
        jMenuItem_actualizar_stock = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem_nuevo_cliente = new javax.swing.JMenuItem();
        jMenuItem_gestion_cliente = new javax.swing.JMenuItem();
        jMenu_nueva_categoria = new javax.swing.JMenu();
        jMenuItem_nueva_categoria = new javax.swing.JMenuItem();
        jMenuItem_gestion_categorias = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem_nueva_venta = new javax.swing.JMenuItem();
        jMenuItem_gestion_ventas = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem_reportes_clientes = new javax.swing.JMenuItem();
        jMenuItem_reportes_categorias = new javax.swing.JMenuItem();
        jMenuItem_reportes_productos = new javax.swing.JMenuItem();
        jMenuItem_reportes_ventas = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem_historial = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem_salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar-usuario.png"))); // NOI18N
        jMenu1.setText("USUARIO");
        jMenu1.setPreferredSize(new java.awt.Dimension(100, 50));

        jMenuItem_nuevo_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        jMenuItem_nuevo_usuario.setText("Nuevo Usuario");
        jMenuItem_nuevo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_usuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_nuevo_usuario);

        jMenuItem_gestion_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menos.png"))); // NOI18N
        jMenuItem_gestion_usuario.setText("Gestion Usuario");
        jMenuItem_gestion_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestion_usuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_gestion_usuario);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/productos.png"))); // NOI18N
        jMenu2.setText("PRODUCTO");
        jMenu2.setMinimumSize(new java.awt.Dimension(150, 50));
        jMenu2.setPreferredSize(new java.awt.Dimension(120, 50));

        jMenuItem_nuevo_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gfut.png"))); // NOI18N
        jMenuItem_nuevo_producto.setText("Nuevo Producto");
        jMenuItem_nuevo_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_productoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_nuevo_producto);

        jMenuItem_gestion_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gpro.png"))); // NOI18N
        jMenuItem_gestion_producto.setText("Gestion Producto");
        jMenuItem_gestion_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestion_productoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_gestion_producto);

        jMenuItem_actualizar_stock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevop.png"))); // NOI18N
        jMenuItem_actualizar_stock.setText("Actualizar Stock");
        jMenuItem_actualizar_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_actualizar_stockActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_actualizar_stock);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clientes.png"))); // NOI18N
        jMenu3.setText("CLIENTE");
        jMenu3.setPreferredSize(new java.awt.Dimension(100, 50));

        jMenuItem_nuevo_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nueva-cuenta.png"))); // NOI18N
        jMenuItem_nuevo_cliente.setText("Nuevo Cliente");
        jMenuItem_nuevo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_clienteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_nuevo_cliente);

        jMenuItem_gestion_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/la-mejor-experiencia-del-cliente.png"))); // NOI18N
        jMenuItem_gestion_cliente.setText("Gestion Cliente");
        jMenuItem_gestion_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestion_clienteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_gestion_cliente);

        jMenuBar1.add(jMenu3);

        jMenu_nueva_categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clasificacion.png"))); // NOI18N
        jMenu_nueva_categoria.setText("CATEGORIA");
        jMenu_nueva_categoria.setPreferredSize(new java.awt.Dimension(120, 50));

        jMenuItem_nueva_categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/opciones.png"))); // NOI18N
        jMenuItem_nueva_categoria.setText("Nueva Categoria");
        jMenuItem_nueva_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nueva_categoriaActionPerformed(evt);
            }
        });
        jMenu_nueva_categoria.add(jMenuItem_nueva_categoria);

        jMenuItem_gestion_categorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/opciones.png"))); // NOI18N
        jMenuItem_gestion_categorias.setText("Gestion Categorias");
        jMenuItem_gestion_categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestion_categoriasActionPerformed(evt);
            }
        });
        jMenu_nueva_categoria.add(jMenuItem_gestion_categorias);

        jMenuBar1.add(jMenu_nueva_categoria);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/factura.png"))); // NOI18N
        jMenu5.setText("FACTURAR");
        jMenu5.setPreferredSize(new java.awt.Dimension(110, 50));

        jMenuItem_nueva_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fac.png"))); // NOI18N
        jMenuItem_nueva_venta.setText("Nueva Venta");
        jMenuItem_nueva_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nueva_ventaActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_nueva_venta);

        jMenuItem_gestion_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fac.png"))); // NOI18N
        jMenuItem_gestion_ventas.setText("Gestion Ventas");
        jMenuItem_gestion_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestion_ventasActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_gestion_ventas);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reporte-de-negocios.png"))); // NOI18N
        jMenu6.setText("REPORTES");
        jMenu6.setPreferredSize(new java.awt.Dimension(110, 50));

        jMenuItem_reportes_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportes.png"))); // NOI18N
        jMenuItem_reportes_clientes.setText("Reportes Clientes");
        jMenu6.add(jMenuItem_reportes_clientes);

        jMenuItem_reportes_categorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportes.png"))); // NOI18N
        jMenuItem_reportes_categorias.setText("Reportes Categorias");
        jMenu6.add(jMenuItem_reportes_categorias);

        jMenuItem_reportes_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportes.png"))); // NOI18N
        jMenuItem_reportes_productos.setText("Reportes Productos");
        jMenuItem_reportes_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_reportes_productosActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_reportes_productos);

        jMenuItem_reportes_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportes.png"))); // NOI18N
        jMenuItem_reportes_ventas.setText("Reportes Ventas");
        jMenu6.add(jMenuItem_reportes_ventas);

        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/historial-de-transacciones.png"))); // NOI18N
        jMenu7.setText("HISTORIAL");
        jMenu7.setPreferredSize(new java.awt.Dimension(110, 50));

        jMenuItem_historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/historial1.png"))); // NOI18N
        jMenuItem_historial.setText("Ver Historial");
        jMenu7.add(jMenuItem_historial);

        jMenuBar1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion.png"))); // NOI18N
        jMenu8.setText("CERRAR SESION");
        jMenu8.setPreferredSize(new java.awt.Dimension(135, 50));

        jMenuItem_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida.png"))); // NOI18N
        jMenuItem_salir.setText("Cerrar Sesion");
        jMenuItem_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_salirActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem_salir);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_nuevo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_usuarioActionPerformed
        // TODO add your handling code here:
        InterUsuario interUsuario = new InterUsuario();
        jDesktopPane_menu.add(interUsuario);
        interUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nuevo_usuarioActionPerformed

    private void jMenuItem_gestion_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestion_usuarioActionPerformed
        // TODO add your handling code here:
        InterGestionarUsuario interGestionarUsuario = new InterGestionarUsuario();
        jDesktopPane_menu.add(interGestionarUsuario);
        interGestionarUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestion_usuarioActionPerformed

    private void jMenuItem_gestion_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestion_clienteActionPerformed
        // TODO add your handling code here:
        InterGestionarCliente interGestionarCliente = new InterGestionarCliente();
        jDesktopPane_menu.add(interGestionarCliente);
        interGestionarCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestion_clienteActionPerformed

    private void jMenuItem_gestion_categoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestion_categoriasActionPerformed
        // TODO add your handling code here:
        InterGestionarCategorias interGestionarCategoria = new InterGestionarCategorias();
        jDesktopPane_menu.add(interGestionarCategoria);
        interGestionarCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestion_categoriasActionPerformed

    private void jMenuItem_reportes_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_reportes_productosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_reportes_productosActionPerformed

    private void jMenuItem_nueva_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nueva_categoriaActionPerformed
        // TODO add your handling code here:
        InterCategoria interCategoria = new InterCategoria();
        jDesktopPane_menu.add(interCategoria);
        interCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nueva_categoriaActionPerformed

    private void jMenuItem_nuevo_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_productoActionPerformed
        // TODO add your handling code here:
        InterProducto interProducto = new InterProducto();
        jDesktopPane_menu.add(interProducto);
        interProducto.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nuevo_productoActionPerformed

    private void jMenuItem_gestion_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestion_productoActionPerformed
        // TODO add your handling code here:
        InterGestionarProducto interGestionarProducto = new InterGestionarProducto();
        jDesktopPane_menu.add(interGestionarProducto);
        interGestionarProducto.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestion_productoActionPerformed

    private void jMenuItem_nuevo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_clienteActionPerformed
        // TODO add your handling code here:
        InterCliente interCliente = new InterCliente();
        jDesktopPane_menu.add(interCliente);
        interCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nuevo_clienteActionPerformed

    private void jMenuItem_actualizar_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_actualizar_stockActionPerformed
        // TODO add your handling code here:
        InterActualizarStock interActualizarStock = new InterActualizarStock();
        jDesktopPane_menu.add(interActualizarStock);
        interActualizarStock.setVisible(true);
    }//GEN-LAST:event_jMenuItem_actualizar_stockActionPerformed

    private void jMenuItem_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem_salirActionPerformed

    private void jMenuItem_nueva_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nueva_ventaActionPerformed
        // TODO add your handling code here:
        InterFacturacion interFacturacion = new InterFacturacion();
        jDesktopPane_menu.add(interFacturacion);
        interFacturacion.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nueva_ventaActionPerformed

    private void jMenuItem_gestion_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestion_ventasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_gestion_ventasActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_actualizar_stock;
    private javax.swing.JMenuItem jMenuItem_gestion_categorias;
    private javax.swing.JMenuItem jMenuItem_gestion_cliente;
    private javax.swing.JMenuItem jMenuItem_gestion_producto;
    private javax.swing.JMenuItem jMenuItem_gestion_usuario;
    private javax.swing.JMenuItem jMenuItem_gestion_ventas;
    private javax.swing.JMenuItem jMenuItem_historial;
    private javax.swing.JMenuItem jMenuItem_nueva_categoria;
    private javax.swing.JMenuItem jMenuItem_nueva_venta;
    private javax.swing.JMenuItem jMenuItem_nuevo_cliente;
    private javax.swing.JMenuItem jMenuItem_nuevo_producto;
    private javax.swing.JMenuItem jMenuItem_nuevo_usuario;
    private javax.swing.JMenuItem jMenuItem_reportes_categorias;
    private javax.swing.JMenuItem jMenuItem_reportes_clientes;
    private javax.swing.JMenuItem jMenuItem_reportes_productos;
    private javax.swing.JMenuItem jMenuItem_reportes_ventas;
    private javax.swing.JMenuItem jMenuItem_salir;
    private javax.swing.JMenu jMenu_nueva_categoria;
    // End of variables declaration//GEN-END:variables
}
