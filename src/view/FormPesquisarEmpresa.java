package view;

import controller.dao.EmpresaDAO;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;
import model.Empresa;

public class FormPesquisarEmpresa extends javax.swing.JInternalFrame {

    public FormPesquisarEmpresa() {
        initComponents();
        configurarFormulario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rdbIdEmpre = new javax.swing.JRadioButton();
        rdbNomeEmpre = new javax.swing.JRadioButton();
        txtPesquisar = new javax.swing.JTextField();
        scpResultados = new javax.swing.JScrollPane();
        tabResultadosEmpre = new javax.swing.JTable();
        rdbIdDesc = new javax.swing.JRadioButton();
        rdbNomeDesc = new javax.swing.JRadioButton();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        rdbIdEmpre.setBackground(new java.awt.Color(255, 255, 255));
        rdbIdEmpre.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        rdbIdEmpre.setText("ID ASC");
        rdbIdEmpre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbIdEmpreActionPerformed(evt);
            }
        });

        rdbNomeEmpre.setBackground(new java.awt.Color(255, 255, 255));
        rdbNomeEmpre.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        rdbNomeEmpre.setText("Nome ASC");

        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });

        tabResultadosEmpre.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 11)); // NOI18N
        tabResultadosEmpre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabResultadosEmpre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabResultadosEmpreMouseClicked(evt);
            }
        });
        scpResultados.setViewportView(tabResultadosEmpre);

        rdbIdDesc.setBackground(new java.awt.Color(255, 255, 255));
        rdbIdDesc.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        rdbIdDesc.setText("ID DESC");
        rdbIdDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbIdDescActionPerformed(evt);
            }
        });

        rdbNomeDesc.setText("Nome DESC");
        rdbNomeDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNomeDescActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdbIdEmpre)
                        .addGap(18, 18, 18)
                        .addComponent(rdbNomeEmpre)
                        .addGap(18, 18, 18)
                        .addComponent(rdbIdDesc)
                        .addGap(18, 18, 18)
                        .addComponent(rdbNomeDesc))
                    .addComponent(scpResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                    .addComponent(txtPesquisar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdbIdEmpre)
                        .addComponent(rdbNomeEmpre))
                    .addComponent(rdbNomeDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rdbIdDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scpResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        // TODO add your handling code here:
        List<Empresa> lista = null;
        String chave = txtPesquisar.getText();
        
        if(rdbIdEmpre.isSelected() && !chave.isEmpty()){
            lista = new EmpresaDAO().pesquisarPorId(chave);
        }else if(rdbNomeEmpre.isSelected()){
            lista = new EmpresaDAO().pesquisarPorNome(chave);
        }else if(rdbIdDesc.isSelected() && !chave.isEmpty()){
             lista = new EmpresaDAO().pesquisarPorId(chave); 
        }else if(rdbNomeDesc.isSelected() && !chave.isEmpty()){
            lista = new EmpresaDAO().pesquisarPorNome(chave);
        }
        
       
       
        if(rdbIdDesc.isSelected() && chave.isEmpty()){
            lista = new EmpresaDAO().listarDesc();
        }
        if(rdbNomeDesc.isSelected() && chave.isEmpty()){
            lista = new EmpresaDAO().listarDescNome();
        }
        if(rdbIdEmpre.isSelected() && chave.isEmpty()){
            lista = new EmpresaDAO().listar();
        }
        if(rdbNomeEmpre.isSelected() && chave.isEmpty()){
             lista = new EmpresaDAO().listarNomeAsc();
        }
         
        
        
        configurarTabela();
        preencherTabela(lista);
        
    }//GEN-LAST:event_txtPesquisarKeyReleased

    private void tabResultadosEmpreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabResultadosEmpreMouseClicked
        // TODO add your handling code here:

        if (evt.getClickCount() == 2){

            int linha = tabResultadosEmpre.getSelectedRow();
           Empresa emp = new Empresa(
                Integer.parseInt(tabResultadosEmpre.getValueAt(linha, 0).toString()),
                tabResultadosEmpre.getValueAt(linha, 1).toString(),
                   tabResultadosEmpre.getValueAt(linha,2).toString(),
                   Integer.parseInt(tabResultadosEmpre.getValueAt(linha, 3).toString()),
                   Integer.parseInt(tabResultadosEmpre.getValueAt(linha, 4).toString()),
                   tabResultadosEmpre.getValueAt(linha,5).toString(),
                   tabResultadosEmpre.getValueAt(linha,6).toString()
            );
            
            FormCadastrarEmpresa f = new FormCadastrarEmpresa(emp);
            getDesktopPane().add(f);
            f.setVisible(true);
            
            this.dispose();
        }
    }//GEN-LAST:event_tabResultadosEmpreMouseClicked

    private void rdbIdEmpreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbIdEmpreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbIdEmpreActionPerformed

    private void rdbIdDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbIdDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbIdDescActionPerformed

    private void rdbNomeDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNomeDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbNomeDescActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rdbIdDesc;
    private javax.swing.JRadioButton rdbIdEmpre;
    private javax.swing.JRadioButton rdbNomeDesc;
    private javax.swing.JRadioButton rdbNomeEmpre;
    private javax.swing.JScrollPane scpResultados;
    private javax.swing.JTable tabResultadosEmpre;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables


    private void configurarFormulario() {
        this.setTitle("Pesquisar Empresa");
        this.setMaximizable(false);
        this.setIconifiable(false);
        this.setClosable(true);
        txtPesquisar.requestFocus();

        ButtonGroup bg = new ButtonGroup();
        bg.add(rdbIdEmpre);
        bg.add(rdbNomeEmpre);
        bg.add(rdbNomeDesc);
        bg.add(rdbIdDesc);
        rdbNomeEmpre.setSelected(true);
        configurarTabela();
    }
   private void configurarTabela() {
        DefaultTableModel m = new DefaultTableModel(){
        
            @Override
            public boolean isCellEditable(int row,int column){
                return false;
            }
        
        };
        
        m.addColumn("Id");
        m.addColumn("NomeEmpre");
        m.addColumn("Rua");
        m.addColumn("Cep");
        m.addColumn("Numero");
        m.addColumn("Cidade");
        m.addColumn("Uf");
        tabResultadosEmpre.setModel(m);
    }

   
    private void preencherTabela(List<Empresa> lista) {
        if (lista != null) {
            if (lista.size() > 0) {
                configurarTabela();
                DefaultTableModel m = (DefaultTableModel) 
                    tabResultadosEmpre.getModel();
                for (Empresa e : lista) {
                    m.addRow(new Object[]{
                        e.getId(),
                        e.getNomeEmpre(),
                        e.getRua(),
                        e.getCep(),
                        e.getNumero(),
                        e.getCidade(),
                        e.getUf(),
                        new EmpresaDAO().pesquisarPorId(Integer.toString(e.getId())).get(0)
                    });
                }
                tabResultadosEmpre.setModel(m);
            }
        }
    }
    
    
    
    
    
    
    
    
}
   
   
   
   
   
   
   
   
   
   
   

