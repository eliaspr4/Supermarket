/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;


public class CustomersView extends javax.swing.JPanel {

    /**
     * Creates new form CustomersView
     */
    public CustomersView() {
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

        jLabel2 = new javax.swing.JLabel();
        jtf_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtf_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtf_surname1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtf_surname2 = new javax.swing.JTextField();
        jtf_phone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtf_email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jtf_state = new javax.swing.JTextField();
        jtf_rfc = new javax.swing.JTextField();
        jtf_street = new javax.swing.JTextField();
        jtf_number = new javax.swing.JTextField();
        jtf_suburb = new javax.swing.JTextField();
        jtf_city = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_customersTable = new javax.swing.JTable();
        jbtn_edit = new javax.swing.JButton();
        jbtn_remove = new javax.swing.JButton();
        jbtn_find = new javax.swing.JButton();
        jbtn_first = new javax.swing.JButton();
        jbtn_previous = new javax.swing.JButton();
        jbtn_next = new javax.swing.JButton();
        jbtn_last = new javax.swing.JButton();
        jbtn_add = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 204, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Cliente");

        jtf_id.setBackground(new java.awt.Color(153, 153, 153));
        jtf_id.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jtf_id.setForeground(new java.awt.Color(255, 255, 255));
        jtf_id.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");

        jtf_name.setBackground(new java.awt.Color(153, 153, 153));
        jtf_name.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jtf_name.setForeground(new java.awt.Color(255, 255, 255));
        jtf_name.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellido paterno");

        jtf_surname1.setBackground(new java.awt.Color(153, 153, 153));
        jtf_surname1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jtf_surname1.setForeground(new java.awt.Color(255, 255, 255));
        jtf_surname1.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellido materno");

        jtf_surname2.setBackground(new java.awt.Color(153, 153, 153));
        jtf_surname2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jtf_surname2.setForeground(new java.awt.Color(255, 255, 255));
        jtf_surname2.setBorder(null);

        jtf_phone.setBackground(new java.awt.Color(153, 153, 153));
        jtf_phone.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jtf_phone.setForeground(new java.awt.Color(255, 255, 255));
        jtf_phone.setBorder(null);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Teléfono");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email");

        jtf_email.setBackground(new java.awt.Color(153, 153, 153));
        jtf_email.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jtf_email.setForeground(new java.awt.Color(255, 255, 255));
        jtf_email.setBorder(null);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ciudad");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Estado");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("RFC");

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Calle");

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Número");

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Colonia");

        jtf_state.setBackground(new java.awt.Color(153, 153, 153));
        jtf_state.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jtf_state.setForeground(new java.awt.Color(255, 255, 255));
        jtf_state.setBorder(null);

        jtf_rfc.setBackground(new java.awt.Color(153, 153, 153));
        jtf_rfc.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jtf_rfc.setForeground(new java.awt.Color(255, 255, 255));
        jtf_rfc.setBorder(null);

        jtf_street.setBackground(new java.awt.Color(153, 153, 153));
        jtf_street.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jtf_street.setForeground(new java.awt.Color(255, 255, 255));
        jtf_street.setBorder(null);

        jtf_number.setBackground(new java.awt.Color(153, 153, 153));
        jtf_number.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jtf_number.setForeground(new java.awt.Color(255, 255, 255));
        jtf_number.setBorder(null);

        jtf_suburb.setBackground(new java.awt.Color(153, 153, 153));
        jtf_suburb.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jtf_suburb.setForeground(new java.awt.Color(255, 255, 255));
        jtf_suburb.setBorder(null);

        jtf_city.setBackground(new java.awt.Color(153, 153, 153));
        jtf_city.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jtf_city.setForeground(new java.awt.Color(255, 255, 255));
        jtf_city.setBorder(null);

        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        jt_customersTable.setBackground(new java.awt.Color(0, 102, 255));
        jt_customersTable.setFont(new java.awt.Font("Trebuchet MS", 0, 10)); // NOI18N
        jt_customersTable.setForeground(new java.awt.Color(255, 255, 255));
        jt_customersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido Paterno", "Apellido Materno", "Telefono", "@", "RFC", "Calle", "No.", "Colonia", "Cd", "Est"
            }
        ));
        jt_customersTable.setGridColor(new java.awt.Color(0, 0, 204));
        jt_customersTable.setSelectionBackground(new java.awt.Color(0, 121, 107));
        jt_customersTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jt_customersTable);

        jbtn_edit.setBackground(new java.awt.Color(51, 204, 255));
        jbtn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit_user.png"))); // NOI18N
        jbtn_edit.setBorder(null);
        jbtn_edit.setBorderPainted(false);

        jbtn_remove.setBackground(new java.awt.Color(51, 204, 255));
        jbtn_remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete_user.png"))); // NOI18N
        jbtn_remove.setBorder(null);
        jbtn_remove.setBorderPainted(false);

        jbtn_find.setBackground(new java.awt.Color(51, 204, 255));
        jbtn_find.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/find_user.png"))); // NOI18N
        jbtn_find.setBorder(null);
        jbtn_find.setBorderPainted(false);

        jbtn_first.setBackground(new java.awt.Color(51, 204, 255));
        jbtn_first.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/first.png"))); // NOI18N
        jbtn_first.setBorder(null);
        jbtn_first.setBorderPainted(false);

        jbtn_previous.setBackground(new java.awt.Color(51, 204, 255));
        jbtn_previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/previous.png"))); // NOI18N
        jbtn_previous.setBorder(null);
        jbtn_previous.setBorderPainted(false);

        jbtn_next.setBackground(new java.awt.Color(51, 204, 255));
        jbtn_next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/next.png"))); // NOI18N
        jbtn_next.setBorder(null);
        jbtn_next.setBorderPainted(false);

        jbtn_last.setBackground(new java.awt.Color(51, 204, 255));
        jbtn_last.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/last.png"))); // NOI18N
        jbtn_last.setBorder(null);
        jbtn_last.setBorderPainted(false);

        jbtn_add.setBackground(new java.awt.Color(51, 204, 255));
        jbtn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add_user.png"))); // NOI18N
        jbtn_add.setBorder(null);
        jbtn_add.setBorderPainted(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbtn_first)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(23, 23, 23))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jbtn_add))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jbtn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jbtn_previous))
                                        .addGap(167, 167, 167))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtf_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jbtn_next))
                                    .addComponent(jbtn_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtf_surname1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_surname2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10))
                                .addGap(10, 10, 10)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbtn_last, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtn_find))
                                .addGap(182, 182, 182))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtf_city, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                    .addComponent(jtf_state, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                    .addComponent(jtf_number, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                    .addComponent(jtf_suburb, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                    .addComponent(jtf_rfc, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_street))
                                .addGap(152, 152, 152))))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jtf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtf_rfc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_street, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jtf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jtf_surname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jtf_surname2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtf_suburb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jtf_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jtf_state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtn_add)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn_first, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtn_edit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbtn_remove, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jbtn_find)))
                                .addGap(0, 2, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtn_previous, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn_last, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbtn_add;
    public javax.swing.JButton jbtn_edit;
    public javax.swing.JButton jbtn_find;
    public javax.swing.JButton jbtn_first;
    public javax.swing.JButton jbtn_last;
    public javax.swing.JButton jbtn_next;
    public javax.swing.JButton jbtn_previous;
    public javax.swing.JButton jbtn_remove;
    public javax.swing.JTable jt_customersTable;
    public javax.swing.JTextField jtf_city;
    public javax.swing.JTextField jtf_email;
    public javax.swing.JTextField jtf_id;
    public javax.swing.JTextField jtf_name;
    public javax.swing.JTextField jtf_number;
    public javax.swing.JTextField jtf_phone;
    public javax.swing.JTextField jtf_rfc;
    public javax.swing.JTextField jtf_state;
    public javax.swing.JTextField jtf_street;
    public javax.swing.JTextField jtf_suburb;
    public javax.swing.JTextField jtf_surname1;
    public javax.swing.JTextField jtf_surname2;
    // End of variables declaration//GEN-END:variables
}
