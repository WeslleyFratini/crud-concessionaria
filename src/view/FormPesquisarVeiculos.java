package view;

import controller.dao.VeiculosDAO;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;
import model.Veiculos;

public class FormPesquisarVeiculos extends javax.swing.JInternalFrame {

    public FormPesquisarVeiculos() {
        initComponents();
        configurarFormulario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rdbIdVei = new javax.swing.JRadioButton();
        rdbNomeVei = new javax.swing.JRadioButton();
        txtPesquisar = new javax.swing.JTextField();
        scpResultados2 = new javax.swing.JScrollPane();
        tabResultadosVei = new javax.swing.JTable();
        rdbIdDesc = new javax.swing.JRadioButton();
        rdbNomeDesc = new javax.swing.JRadioButton();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        rdbIdVei.setBackground(new java.awt.Color(255, 255, 255));
        rdbIdVei.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        rdbIdVei.setText("ID ASC");

        rdbNomeVei.setBackground(new java.awt.Color(255, 255, 255));
        rdbNomeVei.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        rdbNomeVei.setText("Nome ASC");

        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });

        tabResultadosVei.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 11)); // NOI18N
        tabResultadosVei.setModel(new javax.swing.table.DefaultTableModel(
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
        tabResultadosVei.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabResultadosVeiMouseClicked(evt);
            }
        });
        scpResultados2.setViewportView(tabResultadosVei);

        rdbIdDesc.setText("ID DESC");

        rdbNomeDesc.setText("Nome DESC");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdbIdVei)
                        .addGap(18, 18, 18)
                        .addComponent(rdbNomeVei)
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
                        .addComponent(rdbIdVei)
                        .addComponent(rdbNomeVei))
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
    List<Veiculos> lista = null;
        String chave = txtPesquisar.getText();
        
        if(rdbIdVei.isSelected() && !chave.isEmpty()){
            lista = new VeiculosDAO().pesquisarPorId(chave);
        }else if(rdbNomeVei.isSelected()){
            lista = new VeiculosDAO().pesquisarPorNome(chave);
        }else if(rdbIdDesc.isSelected() && !chave.isEmpty()){
             lista = new VeiculosDAO().pesquisarPorId(chave); 
        }else if(rdbNomeDesc.isSelected() && !chave.isEmpty()){
            lista = new VeiculosDAO().pesquisarPorNome(chave);
        }
        
       
       
        if(rdbIdDesc.isSelected() && chave.isEmpty()){
            lista = new VeiculosDAO().listarDesc();
        }
        if(rdbNomeDesc.isSelected() && chave.isEmpty()){
            lista = new VeiculosDAO().listarDescNome();
        }
        if(rdbIdVei.isSelected() && chave.isEmpty()){
            lista = new VeiculosDAO().listar();
        }
        if(rdbNomeVei.isSelected() && chave.isEmpty()){
             lista = new VeiculosDAO().listarNomeAsc();
        }
        
        
        
        
        
        
        configurarTabela();
        preencherTabela(lista);
        
    }//GEN-LAST:event_txtPesquisarKeyReleased

    private void tabResultadosVeiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabResultadosVeiMouseClicked
        // TODO add your handling code here:
if (evt.getClickCount() == 2){

      int linha = tabResultadosVei.getSelectedRow();
      Veiculos vei = new Veiculos(
         Integer.parseInt(tabResultadosVei.getValueAt(linha, 0).toString()),
         tabResultadosVei.getValueAt(linha, 1).toString(),
         tabResultadosVei.getValueAt(linha,2).toString(),
         tabResultadosVei.getValueAt(linha,3).toString(),
         Integer.parseInt(tabResultadosVei.getValueAt(linha, 4).toString()),
         Double.parseDouble(tabResultadosVei.getValueAt(linha, 5).toString())
                   
            );
            
            FormCadastrarVeiculos f = new FormCadastrarVeiculos(vei);
            getDesktopPane().add(f);
            f.setVisible(true);
            
            this.dispose();
        }
       
    }//GEN-LAST:event_tabResultadosVeiMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rdbIdDesc;
    private javax.swing.JRadioButton rdbIdVei;
    private javax.swing.JRadioButton rdbNomeDesc;
    private javax.swing.JRadioButton rdbNomeVei;
    private javax.swing.JScrollPane scpResultados2;
    private javax.swing.JTable tabResultadosVei;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables


    private void configurarFormulario() {
        this.setTitle("Pesquisar Veiculos");
        this.setMaximizable(false);
        this.setIconifiable(false);
        this.setClosable(true);
       
        ButtonGroup bg = new ButtonGroup();
        bg.add(rdbIdVei);
        bg.add(rdbNomeVei);
        bg.add(rdbNomeDesc);
        bg.add(rdbIdDesc);
        rdbNomeVei.setSelected(true);
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
        m.addColumn("Marca");
        m.addColumn("Modelo");
        m.addColumn("Cor");
        m.addColumn("Ano");
        m.addColumn("Preco");
       
        tabResultadosVei.setModel(m);
    }
 
    private void preencherTabela(List<Veiculos> lista) {
        if (lista != null) {
            if (lista.size() > 0) {
                configurarTabela();
                DefaultTableModel m = (DefaultTableModel) 
                    tabResultadosVei.getModel();
                for (Veiculos e : lista) {
                    m.addRow(new Object[]{
                        e.getId(),
                        e.getMarca(),
                        e.getModelo(),
                        e.getCor(),
                        e.getAno(),
                        e.getPreco(),
                        
                        new VeiculosDAO().pesquisarPorId(Integer.toString(e.getId())).get(0)
                    });
                }
                tabResultadosVei.setModel(m);
            }
        }
    }
    
}
