package view;

import controller.dao.FuncionariosDAO;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;

import model.Funcionarios;

public class FormPesquisarFuncionarios extends javax.swing.JInternalFrame {

    public FormPesquisarFuncionarios() {
        initComponents();
        configurarFormulario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rdbIdFunc = new javax.swing.JRadioButton();
        rdbNomeFunc = new javax.swing.JRadioButton();
        txtPesquisar = new javax.swing.JTextField();
        scpResultados2 = new javax.swing.JScrollPane();
        tabResultadosFunc = new javax.swing.JTable();
        rdbIdDesc = new javax.swing.JRadioButton();
        rdbNomeDesc = new javax.swing.JRadioButton();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        rdbIdFunc.setBackground(new java.awt.Color(255, 255, 255));
        rdbIdFunc.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        rdbIdFunc.setText("ID ASC");

        rdbNomeFunc.setBackground(new java.awt.Color(255, 255, 255));
        rdbNomeFunc.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        rdbNomeFunc.setText("Nome ASC");

        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });

        tabResultadosFunc.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 11)); // NOI18N
        tabResultadosFunc.setModel(new javax.swing.table.DefaultTableModel(
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
        tabResultadosFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabResultadosFuncMouseClicked(evt);
            }
        });
        scpResultados2.setViewportView(tabResultadosFunc);

        rdbIdDesc.setBackground(new java.awt.Color(255, 255, 255));
        rdbIdDesc.setText("ID DESC");

        rdbNomeDesc.setBackground(new java.awt.Color(255, 255, 255));
        rdbNomeDesc.setText("Nome DESC");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdbIdFunc)
                        .addGap(18, 18, 18)
                        .addComponent(rdbNomeFunc)
                        .addGap(18, 18, 18)
                        .addComponent(rdbIdDesc)
                        .addGap(18, 18, 18)
                        .addComponent(rdbNomeDesc))
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
                        .addComponent(rdbIdFunc)
                        .addComponent(rdbNomeFunc))
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
    List<Funcionarios> lista = null;
        String chave = txtPesquisar.getText();
        
        if(rdbIdFunc.isSelected() && !chave.isEmpty()){
            lista = new FuncionariosDAO().pesquisarPorId(chave);
        }else if(rdbNomeFunc.isSelected()){
            lista = new FuncionariosDAO().pesquisarPorNome(chave);
        }else if(rdbIdDesc.isSelected() && !chave.isEmpty()){
             lista = new FuncionariosDAO().pesquisarPorId(chave); 
        }else if(rdbNomeDesc.isSelected() && !chave.isEmpty()){
            lista = new FuncionariosDAO().pesquisarPorNome(chave);
        }
        
       
       
        if(rdbIdDesc.isSelected() && chave.isEmpty()){
            lista = new FuncionariosDAO().listarDesc();
        }
        if(rdbNomeDesc.isSelected() && chave.isEmpty()){
            lista = new FuncionariosDAO().listarDescNome();
        }
        if(rdbIdFunc.isSelected() && chave.isEmpty()){
            lista = new FuncionariosDAO().listar();
        }
        if(rdbNomeFunc.isSelected() && chave.isEmpty()){
             lista = new FuncionariosDAO().listarNomeAsc();
        }
        
        
        
        
        
        configurarTabela();
        preencherTabela(lista);
     
    }//GEN-LAST:event_txtPesquisarKeyReleased

    private void tabResultadosFuncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabResultadosFuncMouseClicked
        // TODO add your handling code here:

        if (evt.getClickCount() == 2){

            int linha = tabResultadosFunc.getSelectedRow();
           Funcionarios fuc = new Funcionarios(
                Integer.parseInt(tabResultadosFunc.getValueAt(linha, 0).toString()),
                tabResultadosFunc.getValueAt(linha, 1).toString(),                 
                Double.parseDouble(tabResultadosFunc.getValueAt(linha, 2).toString()),                  
                tabResultadosFunc.getValueAt(linha,3).toString()
                   
            );
            
            FormCadastrarFuncionarios f = new FormCadastrarFuncionarios(fuc);
            getDesktopPane().add(f);
            f.setVisible(true);
            
            this.dispose();
        }
       
    }//GEN-LAST:event_tabResultadosFuncMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rdbIdDesc;
    private javax.swing.JRadioButton rdbIdFunc;
    private javax.swing.JRadioButton rdbNomeDesc;
    private javax.swing.JRadioButton rdbNomeFunc;
    private javax.swing.JScrollPane scpResultados2;
    private javax.swing.JTable tabResultadosFunc;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Pesquisar Funcionarios");
        this.setMaximizable(false);
        this.setIconifiable(false);
        this.setClosable(true);
       
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rdbIdFunc);
        bg.add(rdbNomeFunc);
        bg.add(rdbNomeDesc);
        bg.add(rdbIdDesc);
        rdbNomeFunc.setSelected(true);
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
        m.addColumn("NomeFunc");
        m.addColumn("Salario");
        m.addColumn("Cargo");
        tabResultadosFunc.setModel(m);
    }

private void preencherTabela(List<Funcionarios> lista) {
        if (lista != null) {
            if (lista.size() > 0) {
                configurarTabela();
                DefaultTableModel m = (DefaultTableModel) 
                    tabResultadosFunc.getModel();
                for (Funcionarios e : lista) {
                    m.addRow(new Object[]{
                        e.getId(),
                        e.getNomeFunc(),
                        e.getSalario(),
                        e.getCargo(),
                     
                        new FuncionariosDAO().pesquisarPorId(Integer.toString(e.getId())).get(0)
                    });
                }
                tabResultadosFunc.setModel(m);
            }
        }


}

}

