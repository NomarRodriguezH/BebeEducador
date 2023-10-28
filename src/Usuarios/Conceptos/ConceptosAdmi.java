/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Usuarios.Conceptos;

import Administrador.MenuAdmin;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ConceptosAdmi extends javax.swing.JFrame {

    ArrayList<ConceptoDatos> arreglo=new ArrayList<ConceptoDatos>();
    SerializadoConceptos serie=new SerializadoConceptos();
    public ConceptosAdmi() {
        initComponents();
        mostrar();
        JOptionPane.showMessageDialog(this, "-Para Añadir llena los datos en los espacios vacios y presiona añadir"+"\n"+"-Para Borrar escribe el nombre del concepto y presiona borrar"+"\n"+"-Para Modificar escribe el nombre del concepto y los demás datos"+"\n"+" ya modificados, presiona modificar");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLConcepto = new javax.swing.JLabel();
        jLTema = new javax.swing.JLabel();
        jLSignificado = new javax.swing.JLabel();
        jTSignificado = new javax.swing.JTextField();
        jTConcepto = new javax.swing.JTextField();
        jTTema = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTTablita = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jBAñadir = new javax.swing.JButton();
        jBBorrar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        minimizar = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1100, 650));
        setMinimumSize(new java.awt.Dimension(1100, 650));
        setUndecorated(true);

        jLConcepto.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLConcepto.setText("Concepto:");

        jLTema.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLTema.setText("Tema:");

        jLSignificado.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLSignificado.setText("Significado:");

        jTSignificado.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jTConcepto.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jTTema.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jTTablita = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex,int colIndex){
                return false;
            }
        };
        jTTablita.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTTablita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Concepto", "Tema", "Definicion"
            }
        ));
        jTTablita.setFocusable(false);
        jTTablita.setRowHeight(100);
        jTTablita.setShowGrid(false);
        jTTablita.getTableHeader().setResizingAllowed(false);
        jTTablita.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTTablita);
        if (jTTablita.getColumnModel().getColumnCount() > 0) {
            jTTablita.getColumnModel().getColumn(0).setResizable(false);
            jTTablita.getColumnModel().getColumn(1).setResizable(false);
            jTTablita.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel5.setFont(new java.awt.Font("Old English Text MT", 0, 48)); // NOI18N
        jLabel5.setText("El bebé historiador");

        jBAñadir.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jBAñadir.setText("Añadir");
        jBAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAñadirActionPerformed(evt);
            }
        });

        jBBorrar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jBBorrar.setText("Borrar");
        jBBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarActionPerformed(evt);
            }
        });

        jBModificar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jBModificar.setText("modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        volver.setText("volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
                new MenuAdmin();
            }
        });

        minimizar.setText("Minimizar");
        minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizarActionPerformed(evt);
            }
        });

        cerrar.setText("Cerrar");
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(volver))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(87, 87, 87)
                            .addComponent(jLSignificado)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTSignificado, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(355, 355, 355)
                                    .addComponent(jBAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLTema)
                                .addGap(18, 18, 18)
                                .addComponent(jTTema, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(93, 93, 93)
                                    .addComponent(jLConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(108, 108, 108)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(minimizar)
                        .addComponent(cerrar))
                    .addComponent(volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTConcepto))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLTema))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTSignificado)
                            .addComponent(jLSignificado))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAñadirActionPerformed
        if(jTConcepto.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Debes Llenar los espacios correctamente");
                }
        else{
        ConceptoDatos concepto=new ConceptoDatos(jTConcepto.getText(),jTTema.getText(), jTSignificado.getText());
        arreglo.add(concepto);
        serie.GuardaConcepto(concepto);
      
        jTConcepto.setText("");
                jTTema.setText("");
                        jTSignificado.setText("");
        mostrar();
        }
    }//GEN-LAST:event_jBAñadirActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        
        if(jTConcepto.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Debes insertar un Concepto existente");
                }
        else{
        int j = 0;            
        j=JOptionPane.showConfirmDialog(this, "¿Seguro de eliminarlo?");
        if(j==0){
        jTTema.setVisible(false);              
        jTSignificado.setVisible(false);
        serie.eliminar(jTConcepto.getText());
        jTTema.setVisible(true);
                        jTSignificado.setVisible(true);
        jTConcepto.setText("");
                jTTema.setText("");
                        jTSignificado.setText("");
        mostrar();
        }
        else{}
        
        }
    }//GEN-LAST:event_jBBorrarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        if(jTConcepto.getText().equals("")){
         JOptionPane.showMessageDialog(this,"Debes insertar un Concepto existente");
        }
        else{
        int t=0; 
        t=JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cambiarlo?");
        if(t==0){
        ConceptoDatos concepto=new ConceptoDatos(jTConcepto.getText(),jTTema.getText(), jTSignificado.getText());
      
        serie.modificar(jTConcepto.getText(), jTTema.getText(), jTSignificado.getText());
        System.out.println("esta aqui");
        jTConcepto.setText("");
                jTTema.setText("");
                        jTSignificado.setText("");
        mostrar();
        }
        }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        dispose();
        new MenuAdmin();
    }//GEN-LAST:event_volverActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
       System.exit(0);
    }//GEN-LAST:event_cerrarActionPerformed

    private void minimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizarActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizarActionPerformed

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
            java.util.logging.Logger.getLogger(ConceptosAdmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConceptosAdmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConceptosAdmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConceptosAdmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConceptosAdmi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrar;
    private javax.swing.JButton jBAñadir;
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JLabel jLConcepto;
    private javax.swing.JLabel jLSignificado;
    private javax.swing.JLabel jLTema;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTConcepto;
    private javax.swing.JTextField jTSignificado;
    private javax.swing.JTable jTTablita;
    private javax.swing.JTextField jTTema;
    private javax.swing.JButton minimizar;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables

    private void mostrar() {
       arreglo=serie.regresarConceptos();
       String matris[][]=new String[arreglo.size()][4];
       
       for(int i=0; i<arreglo.size(); i++){
       
           matris[i][0]=arreglo.get(i).getConcepto();
           matris[i][1]=arreglo.get(i).getTema();
           matris[i][2]=arreglo.get(i).getDefinicion();
       }
       jTTablita.setModel(new javax.swing.table.DefaultTableModel(
            matris,
            new String [] {
                "Concepto", "Tema", "Definición"
            }
        ));
    }
}
