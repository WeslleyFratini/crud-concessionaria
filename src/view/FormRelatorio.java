package view;

import controller.Conexao;
import java.sql.Connection;
import report.Relatorio;

public class FormRelatorio extends javax.swing.JInternalFrame {

    public FormRelatorio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVendas = new javax.swing.JButton();
        btnFuncionarios = new javax.swing.JButton();
        btnFornecedores = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();

        btnVendas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnVendas.setText("Vendas");
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });

        btnFuncionarios.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnFuncionarios.setText("Funcionarios");
        btnFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionariosActionPerformed(evt);
            }
        });

        btnFornecedores.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnFornecedores.setText("Fornecedores");
        btnFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFornecedoresActionPerformed(evt);
            }
        });

        btnInventario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnInventario.setText("Inventário");
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnFornecedores)
                    .addComponent(btnFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnFornecedores)
                .addGap(18, 18, 18)
                .addComponent(btnFuncionarios)
                .addGap(23, 23, 23)
                .addComponent(btnInventario)
                .addGap(18, 18, 18)
                .addComponent(btnVendas)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed
        Connection con = Conexao.conectar();
        new Relatorio().exibir(con, "Relatorio_Vendas.jrxml");
    }//GEN-LAST:event_btnVendasActionPerformed

    private void btnFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionariosActionPerformed
        Connection con = Conexao.conectar();
        new Relatorio().exibir(con, "Funcionarios.jrxml");
    }//GEN-LAST:event_btnFuncionariosActionPerformed

    private void btnFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornecedoresActionPerformed
        Connection con = Conexao.conectar();
        new Relatorio().exibir(con, "Fornecedores.jrxml");

    }//GEN-LAST:event_btnFornecedoresActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        Connection con = Conexao.conectar();
        new Relatorio().exibir(con, "Inventario.jrxml");
    }//GEN-LAST:event_btnInventarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFornecedores;
    private javax.swing.JButton btnFuncionarios;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnVendas;
    // End of variables declaration//GEN-END:variables
}
