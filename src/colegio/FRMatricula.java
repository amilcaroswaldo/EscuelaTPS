/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

import Acceso_Datos.Grado;
import Logica_Negocios.AlumnoJpaController;
import Logica_Negocios.GradoJpaController;
import javax.swing.table.DefaultTableModel;
import Logica_Negocios.Matricula;
import Acceso_Datos.VariablesCompartidas;
import Acceso_Datos.Sesion;
import Acceso_Datos.Responsable;
import Acceso_Datos.Parentesco;
import Acceso_Datos.Alumno;
import javax.swing.JOptionPane;
import Logica_Negocios.ResponsableJpaController;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class FRMatricula extends javax.swing.JInternalFrame {

    AlumnoJpaController controlAlum = new AlumnoJpaController();
    GradoJpaController controlGrado = new GradoJpaController();
    VariablesCompartidas vars = new VariablesCompartidas();
    Matricula controlMatri = new Matricula();
    Short idAlum = 0, idGrado = 0, idSecc = 0, idResp, idParent;
    Sesion classSesion = new Sesion();
    Responsable classResp = new Responsable();
    Parentesco classParen = new Parentesco();
    Alumno classAlum = new Alumno();
    ResponsableJpaController controlResp = new ResponsableJpaController();

    public FRMatricula() {
        initComponents();
        controlAlum.mostrarAlumno(tableAlumno);
        controlGrado.comboGrado(cbxGrado);

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
        txtAlumno = new javax.swing.JTextField();
        btnNuevoALumno = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAlumno = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbxGrado = new javax.swing.JComboBox<Grado>();
        btnNuevoGrado = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableAlumsGrado = new javax.swing.JTable();
        checkPago = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        lblNombreAlum = new javax.swing.JLabel();
        btnMatricular = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Alumno:");

        btnNuevoALumno.setText("Nuevo");
        btnNuevoALumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoALumnoActionPerformed(evt);
            }
        });

        tableAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAlumnoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableAlumno);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevoALumno, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevoALumno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("MATRICULA");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("Grado:");

        cbxGrado.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));
        cbxGrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxGradoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cbxGradoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbxGradoMousePressed(evt);
            }
        });
        cbxGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxGradoActionPerformed(evt);
            }
        });

        btnNuevoGrado.setText("Nuevo");
        btnNuevoGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoGradoActionPerformed(evt);
            }
        });

        tableAlumsGrado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tableAlumsGrado);

        checkPago.setText("CANCELO MATRICULA");
        checkPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPagoActionPerformed(evt);
            }
        });

        jButton1.setText("Seleccionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(cbxGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(checkPago)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(btnNuevoGrado)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkPago)
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(btnNuevoGrado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblNombreAlum.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNombreAlum.setText("--");

        btnMatricular.setText("MATRICULAR");
        btnMatricular.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatricularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblNombreAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMatricular, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(269, 269, 269))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNombreAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnMatricular, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoALumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoALumnoActionPerformed
        FRDatosAlumnos Dat = new FRDatosAlumnos();
        PRINCIPAL.escritorio.add(Dat);
        Dat.show();        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoALumnoActionPerformed

    private void tableAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAlumnoMouseClicked
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) tableAlumno.getModel();

        try {
            idAlum = Short.parseShort(modelo.getValueAt(tableAlumno.getSelectedRow(), 0) + "");
            idResp = Short.parseShort(modelo.getValueAt(tableAlumno.getSelectedRow(), 1) + "");
            lblNombreAlum.setText("Id: " + modelo.getValueAt(tableAlumno.getSelectedRow(), 0) + " "
                    + modelo.getValueAt(tableAlumno.getSelectedRow(), 2) + " "
                    + modelo.getValueAt(tableAlumno.getSelectedRow(), 3) + "");
            classResp.setIdResponsable(idAlum);
            if ((modelo.getValueAt(tableAlumno.getSelectedRow(), 0) + "").equals("Hijo")) {
                idParent = 1;
            } else {
                idParent = 2;
            }
            classParen.setIdParentesco(idParent);
            classAlum.setNombre(modelo.getValueAt(tableAlumno.getSelectedRow(), 3) + "");
            classAlum.setApellido(modelo.getValueAt(tableAlumno.getSelectedRow(), 4) + "");
            classAlum.setFechaNacimiento(modelo.getValueAt(tableAlumno.getSelectedRow(), 3) + "");
            classAlum.setProblemasSalud(modelo.getValueAt(tableAlumno.getSelectedRow(), 3) + "");
            classAlum.setIdAlumno(idAlum);
            classAlum.setIdParentesco(classParen);
            classAlum.setIdResponsable(classResp);
        } catch (Exception ex) {
            Logger.getLogger(FRMatricula.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_tableAlumnoMouseClicked


    private void btnMatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatricularActionPerformed
        // TODO add your handling code here:
        if (checkPago.isSelected()) {
            idGrado = cbxGrado.getItemAt(cbxGrado.getSelectedIndex()).getIdGrado();
            controlMatri.matricular(classSesion.getIdUsuario(), idAlum, idGrado);
            controlMatri.matricular(2, idAlum, idGrado);
            JOptionPane.showMessageDialog(null, "Matrícula realizada con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "Debe realizar el pago de la matrícula");
        }

    }//GEN-LAST:event_btnMatricularActionPerformed

    private void checkPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkPagoActionPerformed

    private void btnNuevoGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoGradoActionPerformed
        FRSalonClase Res = new FRSalonClase();
        PRINCIPAL.escritorio.add(Res);
        Res.show();        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoGradoActionPerformed

    private void cbxGradoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxGradoMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_cbxGradoMousePressed

    private void cbxGradoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxGradoMouseExited
        // TODO add your handling code here:
        //         idGrado= cbxGrado.getItemAt(cbxGrado.getSelectedIndex()).getIdGrado();
        //        controlMatri.mostrarAlumnosGrado(tableAlumsGrado, idGrado);
    }//GEN-LAST:event_cbxGradoMouseExited

    private void cbxGradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxGradoMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbxGradoMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
             if(this.tableAlumno.getSelectedRow()>=0){
                 
            controlAlum.edit(classAlum);
            controlAlum.mostrarAlumno(tableAlumno);
            }else{
                 JOptionPane.showMessageDialog(this, "Debe seleccionar un alumno de la tabla");
             }
            // TODO add your handling code here:
           
        } catch (Exception ex) {
            Logger.getLogger(FRMatricula.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void cbxGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxGradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxGradoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        idGrado = cbxGrado.getItemAt(cbxGrado.getSelectedIndex()).getIdGrado();
        controlMatri.mostrarAlumnosGrado(tableAlumsGrado, idGrado);
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnMatricular;
    private javax.swing.JButton btnNuevoALumno;
    private javax.swing.JButton btnNuevoGrado;
    private javax.swing.JComboBox<Grado> cbxGrado;
    private javax.swing.JCheckBox checkPago;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNombreAlum;
    private javax.swing.JTable tableAlumno;
    private javax.swing.JTable tableAlumsGrado;
    private javax.swing.JTextField txtAlumno;
    // End of variables declaration//GEN-END:variables
}
