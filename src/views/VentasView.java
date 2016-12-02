/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Elias Pujol R
 */
public class VentasView extends javax.swing.JPanel {

    /**
     * Creates new form VentasView
     */
    public VentasView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtf_IdCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtf_Nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtf_IdProducto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtf_Producto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtf_PrecioVenta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtf_Cantidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtf_Total = new javax.swing.JTextField();
        jbtn_agregarProducto = new javax.swing.JButton();
        jbtn_buscar = new javax.swing.JButton();
        jbtn_buscarCliente = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtf_fecha = new javax.swing.JTextField();
        jtf_Subtotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_detalleVentas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_ventas = new javax.swing.JTable();
        jbtn_nuevaVenta = new javax.swing.JButton();
        jbtn_cerrarVenta = new javax.swing.JButton();
        jbtn_eliminarProducto = new javax.swing.JButton();
        ID_Venta = new javax.swing.JLabel();
        jtf_IDventa = new javax.swing.JTextField();

        jMenuItem1.setText("jMenuItem1");

        setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("                                                                       Ventas");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel2.setText("ID Cliente");

        jtf_IdCliente.setBackground(new java.awt.Color(255, 255, 255));
        jtf_IdCliente.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel3.setText("Nombre");

        jtf_Nombre.setBackground(new java.awt.Color(255, 255, 255));
        jtf_Nombre.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel4.setText("ID Producto");

        jtf_IdProducto.setBackground(new java.awt.Color(255, 255, 255));
        jtf_IdProducto.setForeground(new java.awt.Color(51, 51, 51));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel5.setText("Producto");

        jtf_Producto.setBackground(new java.awt.Color(255, 255, 255));
        jtf_Producto.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel6.setText("Precio de venta");

        jtf_PrecioVenta.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel7.setText("Cantidad");

        jtf_Cantidad.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel8.setText("Total");

        jtf_Total.setBackground(new java.awt.Color(255, 255, 255));

        jbtn_agregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cart_add.png"))); // NOI18N
        jbtn_agregarProducto.setBorder(null);
        jbtn_agregarProducto.setBorderPainted(false);
        jbtn_agregarProducto.setContentAreaFilled(false);

        jbtn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search_32.png"))); // NOI18N
        jbtn_buscar.setBorder(null);
        jbtn_buscar.setBorderPainted(false);
        jbtn_buscar.setContentAreaFilled(false);

        jbtn_buscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Find User Male Filled-35.png"))); // NOI18N
        jbtn_buscarCliente.setBorder(null);
        jbtn_buscarCliente.setBorderPainted(false);
        jbtn_buscarCliente.setContentAreaFilled(false);

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel9.setText("Fecha");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel10.setText("Subtotal");

        jtf_fecha.setBackground(new java.awt.Color(255, 255, 255));
        jtf_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_fechaActionPerformed(evt);
            }
        });

        jtf_Subtotal.setBackground(new java.awt.Color(255, 255, 255));

        jt_detalleVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Producto", "Producto", "Precio  venta", "Cantidad", "Subtotal"
            }
        ));
        jScrollPane1.setViewportView(jt_detalleVentas);
        if (jt_detalleVentas.getColumnModel().getColumnCount() > 0) {
            jt_detalleVentas.getColumnModel().getColumn(0).setHeaderValue("ID Producto");
        }

        jt_ventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Venta", "Cliente", "Fecha", "Total"
            }
        ));
        jScrollPane2.setViewportView(jt_ventas);

        jbtn_nuevaVenta.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jbtn_nuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Shopping Cart Loaded-30.png"))); // NOI18N
        jbtn_nuevaVenta.setText("Nueva venta");
        jbtn_nuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_nuevaVentaActionPerformed(evt);
            }
        });

        jbtn_cerrarVenta.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jbtn_cerrarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cart_remove.png"))); // NOI18N
        jbtn_cerrarVenta.setText("Cerrar venta");
        jbtn_cerrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_cerrarVentaActionPerformed(evt);
            }
        });

        jbtn_eliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Cancel-50.png"))); // NOI18N
        jbtn_eliminarProducto.setBorder(null);
        jbtn_eliminarProducto.setBorderPainted(false);
        jbtn_eliminarProducto.setContentAreaFilled(false);

        ID_Venta.setText("ID_Venta");

        jtf_IDventa.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtf_IdCliente)
                                .addComponent(jtf_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtf_IdProducto))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(jtf_Producto))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtf_PrecioVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(jtf_Cantidad)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ID_Venta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jtf_IDventa, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtn_buscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn_nuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(27, 27, 27)
                            .addComponent(jtf_Subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbtn_buscar)
                                    .addGap(19, 19, 19))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9))
                                    .addGap(23, 23, 23))
                                .addComponent(jbtn_agregarProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jbtn_cerrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtf_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtf_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(59, 59, 59)
                                    .addComponent(jbtn_eliminarProducto))))))
                .addGap(17, 77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtf_IdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jtf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtn_nuevaVenta)
                            .addComponent(jbtn_buscarCliente))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jtf_IdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbtn_buscar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtf_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jbtn_cerrarVenta)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_PrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jbtn_agregarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtn_eliminarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jtf_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jtf_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtf_Subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID_Venta)
                    .addComponent(jtf_IDventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_fechaActionPerformed

    private void jbtn_nuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_nuevaVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_nuevaVentaActionPerformed

    private void jbtn_cerrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_cerrarVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_cerrarVentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID_Venta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JButton jbtn_agregarProducto;
    public javax.swing.JButton jbtn_buscar;
    public javax.swing.JButton jbtn_buscarCliente;
    public javax.swing.JButton jbtn_cerrarVenta;
    public javax.swing.JButton jbtn_eliminarProducto;
    public javax.swing.JButton jbtn_nuevaVenta;
    public javax.swing.JTable jt_detalleVentas;
    public javax.swing.JTable jt_ventas;
    public javax.swing.JTextField jtf_Cantidad;
    public javax.swing.JTextField jtf_IDventa;
    public javax.swing.JTextField jtf_IdCliente;
    public javax.swing.JTextField jtf_IdProducto;
    public javax.swing.JTextField jtf_Nombre;
    public javax.swing.JTextField jtf_PrecioVenta;
    public javax.swing.JTextField jtf_Producto;
    public javax.swing.JTextField jtf_Subtotal;
    public javax.swing.JTextField jtf_Total;
    public javax.swing.JTextField jtf_fecha;
    // End of variables declaration//GEN-END:variables
}
