package view;

import controller.dao.FornecedoresDAO;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;
import model.Fornecedores;

public class FormPesquisarFornecedores extends javax.swing.JInternalFrame {

    public FormPesquisarFornecedores() {
        initComponents();
        configurarFormulario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rdbIdForne = new javax.swing.JRadioButton();
        rdbNomeForne = new javax.swing.JRadioButton();
        txtPesquisar = new javax.swing.JTextField();
        scpResultados2 = new javax.swing.JScrollPane();
        tabResultadosForne = new javax.swing.JTable();
        rdbNomeDesc = new javax.swing.JRadioButton();
        rdbIdDesc = new javax.swing.JRadioButton();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        rdbIdForne.setBackground(new java.awt.Color(255, 255, 255));
        rdbIdForne.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        rdbIdForne.setText("ID ASC ");

        rdbNomeForne.setBackground(new java.awt.Color(255, 255, 255));
        rdbNomeForne.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        rdbNomeForne.setText("Nome ASC");

        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });

        tabResultadosForne.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 11)); // NOI18N
        tabResultadosForne.setModel(new javax.swing.table.DefaultTableModel(
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
        tabResultadosForne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabResultadosForneMouseClicked(evt);
            }
        });
        scpResultados2.setViewportView(tabResultadosForne);

        rdbNomeDesc.setText("Nome DESC");

        rdbIdDesc.setText("ID DESC");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdbIdForne)
                        .addGap(18, 18, 18)
                        .addComponent(rdbNomeForne)
                        .addGap(18, 18, 18)
                        .addComponent(rdbNomeDesc)
                        .addGap(18, 18, 18)
                        .addComponent(rdbIdDesc))
                    .addComponent(scpResultados2, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                    .addComponent(txtPesquisar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdbIdForne)
                        .addComponent(rdbNomeForne))
                    .addComponent(rdbNomeDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rdbIdDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    List<Fornecedores> lista = null;
        String chave = txtPesquisar.getText();
        
        if(rdbIdForne.isSelected() && !chave.isEmpty()){
            lista = new FornecedoresDAO().pesquisarPorId(chave);
        }else if(rdbNomeForne.isSelected()){
            lista = new FornecedoresDAO().pesquisarPorNome(chave);
        }else if(rdbIdDesc.isSelected() && !chave.isEmpty()){
             lista = new FornecedoresDAO().pesquisarPorId(chave); 
        }else if(rdbNomeDesc.isSelected() && !chave.isEmpty()){
            lista = new FornecedoresDAO().pesquisarPorNome(chave);
        }
        
       
       
        if(rdbIdDesc.isSelected() && chave.isEmpty()){
            lista = new FornecedoresDAO().listarDesc();
        }
        if(rdbNomeDesc.isSelected() && chave.isEmpty()){
            lista = new FornecedoresDAO().listarDescNome();
        }
        if(rdbIdForne.isSelected() && chave.isEmpty()){
            lista = new FornecedoresDAO().listar();
        }
        if(rdbNomeForne.isSelected() && chave.isEmpty()){
             lista = new FornecedoresDAO().listarNomeAsc();
        }
        
        
        
        
        
       /* if(chave.isEmpty()){
            lista = new FornecedoresDAO().listar();
        }
        */
        
        
        
        configurarTabela();
        preencherTabela(lista);
        
    }//GEN-LAST:event_txtPesquisarKeyReleased

    private void tabResultadosForneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabResultadosForneMouseClicked
        // TODO add your handling code here:

        if (evt.getClickCount() == 2){

            int linha = tabResultadosForne.getSelectedRow();
           Fornecedores forn = new Fornecedores(
                Integer.parseInt(tabResultadosForne.getValueAt(linha, 0).toString()),
                tabResultadosForne.getValueAt(linha, 1).toString(),
                   tabResultadosForne.getValueAt(linha,2).toString()
                   
            );
            
            FormCadastrarFornecedores f = new FormCadastrarFornecedores(forn);
            getDesktopPane().add(f);
            f.setVisible(true);
            
            this.dispose();
        }
        
    }//GEN-LAST:event_tabResultadosForneMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rdbIdDesc;
    private javax.swing.JRadioButton rdbIdForne;
    private javax.swing.JRadioButton rdbNomeDesc;
    private javax.swing.JRadioButton rdbNomeForne;
    private javax.swing.JScrollPane scpResultados2;
    private javax.swing.JTable tabResultadosForne;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables

    
    private void configurarFormulario() {
        this.setTitle("Pesquisar Fornecedores");
        this.setMaximizable(false);
        this.setIconifiable(false);
        this.setClosable(true);
       
        ButtonGroup bg = new ButtonGroup();
        bg.add(rdbIdForne);
        bg.add(rdbNomeForne);
        bg.add(rdbNomeDesc);
        bg.add(rdbIdDesc);
        rdbNomeForne.setSelected(true);
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
        m.addColumn("Fornecedor");
        m.addColumn("CNPJ");
        tabResultadosForne.setModel(m);
    }
       
    private void preencherTabela(List<Fornecedores> lista) {
        if (lista != null) {
            if (lista.size() > 0) {
                configurarTabela();
                DefaultTableModel m = (DefaultTableModel) 
                    tabResultadosForne.getModel();
                for (Fornecedores e : lista) {
                    m.addRow(new Object[]{
                        e.getId(),
                        e.getNome_forn(),
                        e.getCnpj(),                      
                        new FornecedoresDAO().pesquisarPorId(Integer.toString(e.getId())).get(0)
                    });
                }
                tabResultadosForne.setModel(m);
            }
        }
    }
    
    
    
    
}
