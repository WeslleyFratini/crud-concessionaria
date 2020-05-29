package view;

import controller.dao.VendasDAO;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;
import model.Vendas;

public class FormPesquisarVendas extends javax.swing.JInternalFrame {

    public FormPesquisarVendas() {
        initComponents();
        configurarFormulario();
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        rdbIdVen = new javax.swing.JRadioButton();
        rdbNomeVen = new javax.swing.JRadioButton();
        txtPesquisar = new javax.swing.JTextField();
        scpResultados2 = new javax.swing.JScrollPane();
        tabResultadosVen = new javax.swing.JTable();
        rdbIdDesc = new javax.swing.JRadioButton();
        rdbNomeDesc = new javax.swing.JRadioButton();

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        rdbIdVen.setBackground(new java.awt.Color(255, 255, 255));
        rdbIdVen.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        rdbIdVen.setText("ID Asc");

        rdbNomeVen.setBackground(new java.awt.Color(255, 255, 255));
        rdbNomeVen.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        rdbNomeVen.setText("Nome ASC");
        rdbNomeVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNomeVenActionPerformed(evt);
            }
        });

        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });

        tabResultadosVen.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 11)); // NOI18N
        tabResultadosVen.setModel(new javax.swing.table.DefaultTableModel(
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
        tabResultadosVen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabResultadosVenMouseClicked(evt);
            }
        });
        scpResultados2.setViewportView(tabResultadosVen);

        rdbIdDesc.setText("Id Desc");

        rdbNomeDesc.setText("Nome Desc");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(rdbIdVen)
                        .addGap(18, 18, 18)
                        .addComponent(rdbNomeVen)
                        .addGap(18, 18, 18)
                        .addComponent(rdbIdDesc)
                        .addGap(18, 18, 18)
                        .addComponent(rdbNomeDesc))
                    .addComponent(scpResultados2, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                    .addComponent(txtPesquisar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdbIdVen)
                        .addComponent(rdbNomeVen))
                    .addComponent(rdbIdDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rdbNomeDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scpResultados2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        List<Vendas> lista = null;
        String chave = txtPesquisar.getText();
        
        if(rdbIdVen.isSelected() && !chave.isEmpty()){
            lista = new VendasDAO().pesquisarPorId(chave);
        }else if(rdbNomeVen.isSelected()){
            lista = new VendasDAO().pesquisarPorNome(chave);
        }else if(rdbIdDesc.isSelected() && !chave.isEmpty()){
             lista = new VendasDAO().pesquisarPorId(chave); 
        }else if(rdbNomeDesc.isSelected() && !chave.isEmpty()){
            lista = new VendasDAO().pesquisarPorNome(chave);
        }
        
       
       
        if(rdbIdDesc.isSelected() && chave.isEmpty()){
            lista = new VendasDAO().listarDesc();
        }
        if(rdbNomeDesc.isSelected() && chave.isEmpty()){
            lista = new VendasDAO().listarDescNome();
        }
        if(rdbIdVen.isSelected() && chave.isEmpty()){
            lista = new VendasDAO().listar();
        }
        if(rdbNomeVen.isSelected() && chave.isEmpty()){
             lista = new VendasDAO().listarNomeAsc();
        }
         
        
        
        
        
        
        
        configurarTabela();
        preencherTabela(lista);

       
    }//GEN-LAST:event_txtPesquisarKeyReleased

    private void tabResultadosVenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabResultadosVenMouseClicked
        // TODO add your handling code here:
if (evt.getClickCount() == 2){

         int linha = tabResultadosVen.getSelectedRow();
         Vendas ven = new Vendas(
             Integer.parseInt(tabResultadosVen.getValueAt(linha, 0).toString()),
             tabResultadosVen.getValueAt(linha, 1).toString(), 
             Integer.parseInt(tabResultadosVen.getValueAt(linha, 2).toString()),
             Double.parseDouble(tabResultadosVen.getValueAt(linha, 3).toString()),
             tabResultadosVen.getValueAt(linha,4).toString()
                   
            );
            
            FormCadastrarVendas f = new FormCadastrarVendas(ven);
            getDesktopPane().add(f);
            f.setVisible(true);
            
            this.dispose();
        }
        
        
        
    }//GEN-LAST:event_tabResultadosVenMouseClicked

    private void rdbNomeVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNomeVenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbNomeVenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton rdbIdDesc;
    private javax.swing.JRadioButton rdbIdVen;
    private javax.swing.JRadioButton rdbNomeDesc;
    private javax.swing.JRadioButton rdbNomeVen;
    private javax.swing.JScrollPane scpResultados2;
    private javax.swing.JTable tabResultadosVen;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables


    private void configurarFormulario() {
        this.setTitle("Pesquisar Vendas");
        this.setMaximizable(false);
        this.setIconifiable(false);
        this.setClosable(true);
        
        txtPesquisar.requestFocus();

        ButtonGroup bg = new ButtonGroup();
        bg.add(rdbIdVen);
        bg.add(rdbNomeVen);
        bg.add(rdbNomeDesc);
        bg.add(rdbIdDesc);
        rdbNomeVen.setSelected(true);
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
        m.addColumn("modelo");
        m.addColumn("quantidade");
        m.addColumn("preco");
        m.addColumn("cliente");
        
        tabResultadosVen.setModel(m);
    }

       private void preencherTabela(List<Vendas> lista) {
        if (lista != null) {
            if (lista.size() > 0) {
                configurarTabela();
                DefaultTableModel m = (DefaultTableModel) 
                    tabResultadosVen.getModel();
                for (Vendas e : lista) {
                    m.addRow(new Object[]{
                        e.getId(),
                        e.getModeloVei(),
                        e.getQuantidade(),
                        e.getPreco(),
                        e.getCliente(),
                        
                        new VendasDAO().pesquisarPorId(Integer.toString(e.getId())).get(0)
                    });
                }
                tabResultadosVen.setModel(m);
            }
        }
    }
}

    
    
    

    
    
    
    
    



