/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad.vista;


import java.util.Objects;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import seguridad.dominio.Usuario;
import seguridad.datos.UsuarioDAO;
import seguridad.datos.Hash;


/**
 *
 * @author OtakuGT
 */
public class Mantenimiento_Usuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmCrudUsuarios
     */
    public Mantenimiento_Usuario() {
             initComponents();
    }
 public void limpiar() {
        txtID.setText("");
        txtNom.setText("");
        txtApe.setText("");
        txtPass.setText("");
        RBCC1.setSelected(false);
        RBCC0.setSelected(false);
        RBEU1.setSelected(false);
        RBEU0.setSelected(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnGCambiarContrasena = new javax.swing.ButtonGroup();
        BtnGEstadoUs = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        txtApe = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        RBCC1 = new javax.swing.JRadioButton();
        RBCC0 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        RBEU1 = new javax.swing.JRadioButton();
        RBEU0 = new javax.swing.JRadioButton();
        BtnIng = new javax.swing.JButton();
        BtnMod = new javax.swing.JButton();
        BtnElim = new javax.swing.JButton();
        BtnList = new javax.swing.JButton();
        BtnBus = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Mantenimiento Usuarios");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel1.setText("ID Usuario");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Password");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Cambiar contraseña"));

        BtnGCambiarContrasena.add(RBCC1);
        RBCC1.setText("Activado");

        BtnGCambiarContrasena.add(RBCC0);
        RBCC0.setText("Desactivado");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(RBCC1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RBCC0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBCC1)
                    .addComponent(RBCC0))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado usuario"));

        BtnGEstadoUs.add(RBEU1);
        RBEU1.setText("Habilitado");

        BtnGEstadoUs.add(RBEU0);
        RBEU0.setText("Deshabilitado");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(RBEU1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RBEU0)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBEU1)
                    .addComponent(RBEU0))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        BtnIng.setText("Ingresar");
        BtnIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngActionPerformed(evt);
            }
        });

        BtnMod.setText("Modificar");
        BtnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModActionPerformed(evt);
            }
        });

        BtnElim.setText("Eliminar");
        BtnElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnElimActionPerformed(evt);
            }
        });

        BtnList.setText("Listar");
        BtnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnListActionPerformed(evt);
            }
        });

        BtnBus.setText("Buscar");
        BtnBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(txtNom)
                    .addComponent(txtApe)
                    .addComponent(txtPass))
                .addGap(98, 98, 98)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BtnList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnIng, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnMod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnElim, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnBus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BtnBus, BtnElim, BtnIng, BtnMod});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnIng)
                    .addComponent(BtnMod)
                    .addComponent(BtnElim)
                    .addComponent(BtnBus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnList))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BtnBus, BtnElim, BtnIng, BtnMod});

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles"));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Pass", "Cambiar Pass", "Ultim.Conex", "Estado Usuar"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String last_session=null;
    Date date = new Date();
    DateFormat fechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private void BtnBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBusActionPerformed
        Usuario usuarioBuscar = new Usuario();
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioBuscar.setId_usuario((txtID.getText()));

        usuarioBuscar = usuarioDAO.query(usuarioBuscar);

        txtID.setText(String.valueOf(usuarioBuscar.getId_usuario()));
        txtNom.setText(String.valueOf(usuarioBuscar.getNombre_usuario()));
        txtApe.setText(String.valueOf(usuarioBuscar.getApellido_usuario()));
        txtPass.setText(String.valueOf(usuarioBuscar.getPassword_usuario()));
        last_session = usuarioBuscar.getUltima_conexion();
        
        if (usuarioBuscar.getEstado_usuario() == 1) {
            RBCC1.setSelected(true);
        }
        if (usuarioBuscar.getEstado_usuario() == 0) {
            RBCC0.setSelected(true);
        }
        if (usuarioBuscar.getEstado_usuario() == 1) {
            RBEU1.setSelected(true);
        }
        if (usuarioBuscar.getEstado_usuario() == 0) {
            RBEU0.setSelected(true);
        }
        {
        }
    }//GEN-LAST:event_BtnBusActionPerformed

    private void BtnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListActionPerformed
        Usuario usuarioListar = new Usuario();
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = (DefaultTableModel) Tabla.getModel();
        for (int i = 0; i < Tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < Tabla.getColumnCount(); i++) {
            Tabla.getColumnModel().getColumn(i).setCellRenderer(tcr);
        }
        Tabla.setModel(modelo);
        List<Usuario> lista = usuarioDAO.listar();
        Object[] objeto = new Object[7];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getId_usuario();
            objeto[1] = lista.get(i).getNombre_usuario();
            objeto[2] = lista.get(i).getApellido_usuario();
            objeto[3] = lista.get(i).getPassword_usuario();
            objeto[4] = lista.get(i).getCambio_password();
            objeto[5] = lista.get(i).getUltima_conexion();
            objeto[6] = lista.get(i).getEstado_usuario();
            modelo.addRow(objeto);
        }
        Tabla.setRowHeight(35);
        Tabla.setRowMargin(10);

    }//GEN-LAST:event_BtnListActionPerformed

    private void BtnElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnElimActionPerformed
        Usuario usuarioEliminar = new Usuario();
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        usuarioEliminar.setId_usuario((txtID.getText()));
        usuarioDAO.delete(usuarioEliminar);
        JOptionPane.showMessageDialog(null, "Usuario Eliminado.");
        limpiar();
    }//GEN-LAST:event_BtnElimActionPerformed

    private void BtnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModActionPerformed
        Usuario usuarioMod = new Usuario();
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        String pass = txtPass.getText();
        String nuevoPass = Hash.sha1(pass);
        usuarioMod.setId_usuario(txtID.getText());
        usuarioMod.setNombre_usuario(txtNom.getText());
        usuarioMod.setApellido_usuario(txtApe.getText());
        usuarioMod.setPassword_usuario(nuevoPass);
        usuarioMod.setUltima_conexion(last_session);
        
        if (RBCC1.isSelected()) {
            usuarioMod.setCambio_password(1);
        }
        if (RBCC0.isSelected()) {
            usuarioMod.setCambio_password(0);
        }
        if (RBEU1.isSelected()) {
            usuarioMod.setEstado_usuario(1);
        }
        if (RBEU0.isSelected()) {
            usuarioMod.setEstado_usuario(0);
        }

        usuarioDAO.update(usuarioMod);
        JOptionPane.showMessageDialog(null, "Modificación Exitosa");

    }//GEN-LAST:event_BtnModActionPerformed

    private void BtnIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngActionPerformed

        Usuario usuarioInsertar = new Usuario();
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        String pass = txtPass.getText();
        if (txtID.getText().length() != 0 && txtNom.getText().length() != 0
            && txtApe.getText().length() != 0 && txtPass.getText().length() != 0 && RBCC1.isSelected() ||
            RBCC0.isSelected() && RBEU1.isSelected() || RBEU0.isSelected())  {
            {
                String nuevoPass = Hash.sha1(pass);
                usuarioInsertar.setId_usuario(txtID.getText());
                usuarioInsertar.setNombre_usuario(txtNom.getText());
                usuarioInsertar.setApellido_usuario(txtApe.getText());
                usuarioInsertar.setPassword_usuario(nuevoPass);
                usuarioInsertar.setUltima_conexion(fechaHora.format(date));
                if (RBCC1.isSelected()) {
                    usuarioInsertar.setCambio_password(1);
                }
                if (RBCC0.isSelected()) {
                    usuarioInsertar.setCambio_password(0);
                }
                if (RBEU1.isSelected()) {
                    usuarioInsertar.setEstado_usuario(1);
                }
                if (RBCC0.isSelected()) {
                    usuarioInsertar.setEstado_usuario(0);
                }
                {
                    JOptionPane.showMessageDialog(null, "Usuario registrado Exitosamente");
                }
                limpiar();
                usuarioDAO.insert(usuarioInsertar);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Los campos estan vacios");
        }
    }//GEN-LAST:event_BtnIngActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBus;
    private javax.swing.JButton BtnElim;
    public javax.swing.ButtonGroup BtnGCambiarContrasena;
    public javax.swing.ButtonGroup BtnGEstadoUs;
    private javax.swing.JButton BtnIng;
    private javax.swing.JButton BtnList;
    private javax.swing.JButton BtnMod;
    private javax.swing.JRadioButton RBCC0;
    private javax.swing.JRadioButton RBCC1;
    private javax.swing.JRadioButton RBEU0;
    private javax.swing.JRadioButton RBEU1;
    public javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApe;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPass;
    // End of variables declaration//GEN-END:variables
}
