package view;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class FormPrincipal extends javax.swing.JFrame {

    public FormPrincipal() {
        initComponents();
        configurarFormulario() ;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaTrabalho = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuArquivoSair = new javax.swing.JMenuItem();
        menuArquivoRelatorio = new javax.swing.JMenuItem();
        menuCadastrar = new javax.swing.JMenu();
        menuCadastrarEmpresa = new javax.swing.JMenuItem();
        menuCadastrarFuncionario = new javax.swing.JMenuItem();
        menuCadastrarVeiculo = new javax.swing.JMenuItem();
        menuCadastrarFornecedor = new javax.swing.JMenuItem();
        menuCadastrarVenda = new javax.swing.JMenuItem();
        menuPesquisar = new javax.swing.JMenu();
        menuPesquisarEmpresa = new javax.swing.JMenuItem();
        menuPesquisarFuncionarios = new javax.swing.JMenuItem();
        menuPesquisarVeiculos = new javax.swing.JMenuItem();
        menuPesquisarFornecedores = new javax.swing.JMenuItem();
        menuPesquisarVenda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Imagem1.png"))); // NOI18N
        jLabel1.setToolTipText("");

        areaTrabalho.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout areaTrabalhoLayout = new javax.swing.GroupLayout(areaTrabalho);
        areaTrabalho.setLayout(areaTrabalhoLayout);
        areaTrabalhoLayout.setHorizontalGroup(
            areaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaTrabalhoLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 4332, Short.MAX_VALUE))
        );
        areaTrabalhoLayout.setVerticalGroup(
            areaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaTrabalhoLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 7035, Short.MAX_VALUE))
        );

        menuArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/folder_1.png"))); // NOI18N
        menuArquivo.setText("Arquivo");

        menuArquivoSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuArquivoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete.png"))); // NOI18N
        menuArquivoSair.setText("Sair");
        menuArquivoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArquivoSairActionPerformed(evt);
            }
        });
        menuArquivo.add(menuArquivoSair);

        menuArquivoRelatorio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        menuArquivoRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconfinder_4_1320813 (1).png"))); // NOI18N
        menuArquivoRelatorio.setText("Relatório");
        menuArquivoRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArquivoRelatorioActionPerformed(evt);
            }
        });
        menuArquivo.add(menuArquivoRelatorio);

        barraMenu.add(menuArquivo);

        menuCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/folder_add.png"))); // NOI18N
        menuCadastrar.setText("Cadastrar");

        menuCadastrarEmpresa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menuCadastrarEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/buildings.png"))); // NOI18N
        menuCadastrarEmpresa.setText("Empresa");
        menuCadastrarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarEmpresaActionPerformed(evt);
            }
        });
        menuCadastrar.add(menuCadastrarEmpresa);

        menuCadastrarFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        menuCadastrarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/worker.png"))); // NOI18N
        menuCadastrarFuncionario.setText("Funcionario");
        menuCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarFuncionarioActionPerformed(evt);
            }
        });
        menuCadastrar.add(menuCadastrarFuncionario);

        menuCadastrarVeiculo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        menuCadastrarVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/car.png"))); // NOI18N
        menuCadastrarVeiculo.setText("Veiculo");
        menuCadastrarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarVeiculoActionPerformed(evt);
            }
        });
        menuCadastrar.add(menuCadastrarVeiculo);

        menuCadastrarFornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        menuCadastrarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/client.png"))); // NOI18N
        menuCadastrarFornecedor.setText("Fornecedor");
        menuCadastrarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarFornecedorActionPerformed(evt);
            }
        });
        menuCadastrar.add(menuCadastrarFornecedor);

        menuCadastrarVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        menuCadastrarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/yelp.png"))); // NOI18N
        menuCadastrarVenda.setText("Vendas");
        menuCadastrarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarVendaActionPerformed(evt);
            }
        });
        menuCadastrar.add(menuCadastrarVenda);

        barraMenu.add(menuCadastrar);

        menuPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/folder_explore_1.png"))); // NOI18N
        menuPesquisar.setText("Pesquisar");

        menuPesquisarEmpresa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        menuPesquisarEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/buildings.png"))); // NOI18N
        menuPesquisarEmpresa.setText("Empresa");
        menuPesquisarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPesquisarEmpresaActionPerformed(evt);
            }
        });
        menuPesquisar.add(menuPesquisarEmpresa);

        menuPesquisarFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        menuPesquisarFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/worker.png"))); // NOI18N
        menuPesquisarFuncionarios.setText("Funcionarios");
        menuPesquisarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPesquisarFuncionariosActionPerformed(evt);
            }
        });
        menuPesquisar.add(menuPesquisarFuncionarios);

        menuPesquisarVeiculos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        menuPesquisarVeiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/car.png"))); // NOI18N
        menuPesquisarVeiculos.setText("Veiculos");
        menuPesquisarVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPesquisarVeiculosActionPerformed(evt);
            }
        });
        menuPesquisar.add(menuPesquisarVeiculos);

        menuPesquisarFornecedores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.ALT_MASK));
        menuPesquisarFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/worker.png"))); // NOI18N
        menuPesquisarFornecedores.setText("Fornecedores");
        menuPesquisarFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPesquisarFornecedoresActionPerformed(evt);
            }
        });
        menuPesquisar.add(menuPesquisarFornecedores);

        menuPesquisarVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.ALT_MASK));
        menuPesquisarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/yelp.png"))); // NOI18N
        menuPesquisarVenda.setText("Vendas");
        menuPesquisarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPesquisarVendaActionPerformed(evt);
            }
        });
        menuPesquisar.add(menuPesquisarVenda);

        barraMenu.add(menuPesquisar);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(areaTrabalho)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(areaTrabalho)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuPesquisarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPesquisarVendaActionPerformed
        // TODO add your handling code here:
        abrirFormulario(new FormPesquisarVendas());
    }//GEN-LAST:event_menuPesquisarVendaActionPerformed

    private void menuCadastrarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarEmpresaActionPerformed
        // TODO add your handling code here:
        abrirFormulario(new FormCadastrarEmpresa());
    }//GEN-LAST:event_menuCadastrarEmpresaActionPerformed

    private void menuArquivoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArquivoSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_menuArquivoSairActionPerformed

    private void menuCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarFuncionarioActionPerformed
        // TODO add your handling code here:
        abrirFormulario(new FormCadastrarFuncionarios());
    }//GEN-LAST:event_menuCadastrarFuncionarioActionPerformed

    private void menuCadastrarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarVeiculoActionPerformed
        // TODO add your handling code here:
        abrirFormulario(new FormCadastrarVeiculos());
    }//GEN-LAST:event_menuCadastrarVeiculoActionPerformed

    private void menuCadastrarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarFornecedorActionPerformed
        // TODO add your handling code here:
        abrirFormulario(new FormCadastrarFornecedores());
    }//GEN-LAST:event_menuCadastrarFornecedorActionPerformed

    private void menuCadastrarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarVendaActionPerformed
        // TODO add your handling code here:
        abrirFormulario(new FormCadastrarVendas());
    }//GEN-LAST:event_menuCadastrarVendaActionPerformed

    private void menuPesquisarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPesquisarEmpresaActionPerformed
        // TODO add your handling code here:
        abrirFormulario(new FormPesquisarEmpresa());
    }//GEN-LAST:event_menuPesquisarEmpresaActionPerformed

    private void menuPesquisarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPesquisarFuncionariosActionPerformed
        // TODO add your handling code here:
        abrirFormulario(new FormPesquisarFuncionarios());
    }//GEN-LAST:event_menuPesquisarFuncionariosActionPerformed

    private void menuPesquisarVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPesquisarVeiculosActionPerformed
        // TODO add your handling code here:
        abrirFormulario(new FormPesquisarVeiculos());
    }//GEN-LAST:event_menuPesquisarVeiculosActionPerformed

    private void menuPesquisarFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPesquisarFornecedoresActionPerformed
        // TODO add your handling code here:
        abrirFormulario(new FormPesquisarFornecedores());
    }//GEN-LAST:event_menuPesquisarFornecedoresActionPerformed

    private void menuArquivoRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArquivoRelatorioActionPerformed
       abrirFormulario(new FormRelatorio());
    }//GEN-LAST:event_menuArquivoRelatorioActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
        }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane areaTrabalho;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuItem menuArquivoRelatorio;
    private javax.swing.JMenuItem menuArquivoSair;
    private javax.swing.JMenu menuCadastrar;
    private javax.swing.JMenuItem menuCadastrarEmpresa;
    private javax.swing.JMenuItem menuCadastrarFornecedor;
    private javax.swing.JMenuItem menuCadastrarFuncionario;
    private javax.swing.JMenuItem menuCadastrarVeiculo;
    private javax.swing.JMenuItem menuCadastrarVenda;
    private javax.swing.JMenu menuPesquisar;
    private javax.swing.JMenuItem menuPesquisarEmpresa;
    private javax.swing.JMenuItem menuPesquisarFornecedores;
    private javax.swing.JMenuItem menuPesquisarFuncionarios;
    private javax.swing.JMenuItem menuPesquisarVeiculos;
    private javax.swing.JMenuItem menuPesquisarVenda;
    // End of variables declaration//GEN-END:variables

private void configurarFormulario() {
        this.setTitle("Concessioanaria");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    private void abrirFormulario(JInternalFrame f) {
        if (areaTrabalho.getAllFrames().length == 0) {
            areaTrabalho.add(f);
            centralizarFormulario(f);
            f.setVisible(true);
        }
    }

    public static void centralizarFormulario(JInternalFrame f) {
        Dimension d = f.getDesktopPane().getSize();
        f.setLocation(
                (d.width - f.getSize().width) / 2,
                (d.height - f.getSize().height) / 2
        );
    }






}
