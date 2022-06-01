package Telas_acesso_cadastro_view;

import Classes_func_prod.Produto;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class Cadastro_Produtos extends javax.swing.JFrame {

    ArrayList<Produto> produtosCadastrados;
    DefaultListModel dlm;

    public Cadastro_Produtos() {
        initComponents();
        produtosCadastrados = new ArrayList();
        dlm = new DefaultListModel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome_Produtos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFornecedor_produto = new javax.swing.JLabel();
        txtFaixa_produto = new javax.swing.JLabel();
        txtCod_produto = new javax.swing.JLabel();
        txtPreco_produto = new javax.swing.JLabel();
        txtNome_Produto = new javax.swing.JTextField();
        txtPreco_produtos = new javax.swing.JTextField();
        txtCodigo_produto = new javax.swing.JTextField();
        JCcategoria_produto = new javax.swing.JComboBox<>();
        jCdesenvolvedor_produto = new javax.swing.JComboBox<>();
        jCclassificacao_produto = new javax.swing.JComboBox<>();
        txtTipo_produto = new javax.swing.JLabel();
        JRextensoes = new javax.swing.JRadioButton();
        JRgift_cards = new javax.swing.JRadioButton();
        JRjogos = new javax.swing.JRadioButton();
        JRpacotes = new javax.swing.JRadioButton();
        JRskins = new javax.swing.JRadioButton();
        jButtonSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListCadastrados = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtInfoGerais_produto = new javax.swing.JScrollPane();
        txtInfo_produto = new javax.swing.JTextArea();
        ButtonFinalizar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNome_Produtos.setText("Nome:");

        jLabel2.setText("Categoria:");

        txtFornecedor_produto.setText("Desenvolvedor:");

        txtFaixa_produto.setText("Classificação: ");

        txtCod_produto.setText("Cód. Produto:");

        txtPreco_produto.setText("Preço:");

        txtNome_Produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome_ProdutoActionPerformed(evt);
            }
        });

        txtPreco_produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPreco_produtosActionPerformed(evt);
            }
        });

        JCcategoria_produto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "** Selecione **", "ALL", "Aventura", "Ação", "Esportes", "Estratégia Luta", "MMORPG", "Plataforma", "Puzzle", "RPG", "Shooter", "Simulação", "Sobrevivência", "Terror" }));

        jCdesenvolvedor_produto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "** Selecione **", "Activision Blizzard", "Apple", "Bandai Namco", "Eletronic Arts", "EPIC Games", "Google", "Konami", "Microsoft", "Nitendo", "Sega Sammy", "Sony", "Take- Two Interactive", "Tecent" }));

        jCclassificacao_produto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "** Selecione **", "Livre", "10", "16", "18" }));

        txtTipo_produto.setText("Tipo:");

        JRextensoes.setText("Extensões");

        JRgift_cards.setText("Gift Cards");
        JRgift_cards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRgift_cardsActionPerformed(evt);
            }
        });

        JRjogos.setText("Jogos");
        JRjogos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRjogosActionPerformed(evt);
            }
        });

        JRpacotes.setText("Pacotes");
        JRpacotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRpacotesActionPerformed(evt);
            }
        });

        JRskins.setText("Skins");

        jButtonSalvar.setBackground(new java.awt.Color(204, 204, 255));
        jButtonSalvar.setText("Salvar produto");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jListCadastrados.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListCadastradosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListCadastrados);

        jLabel3.setText("Produtos cadastrados:");

        jLabel4.setText("Informações gerais:");

        txtInfo_produto.setColumns(20);
        txtInfo_produto.setRows(5);
        txtInfoGerais_produto.setViewportView(txtInfo_produto);

        ButtonFinalizar.setBackground(new java.awt.Color(204, 204, 255));
        ButtonFinalizar.setText("Finalizar");
        ButtonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFinalizarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setText("Exibir relatório");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFaixa_produto)
                            .addComponent(txtFornecedor_produto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtNome_Produtos))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JCcategoria_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCclassificacao_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addComponent(txtTipo_produto)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(JRgift_cards)
                                        .addGap(18, 18, 18)
                                        .addComponent(JRjogos))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JRskins)
                                        .addGap(18, 18, 18)
                                        .addComponent(JRpacotes)
                                        .addGap(18, 18, 18)
                                        .addComponent(JRextensoes)))
                                .addGap(84, 84, 84))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNome_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(txtCod_produto)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCodigo_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPreco_produto)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPreco_produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonSalvar)
                                            .addComponent(jCdesenvolvedor_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(193, 193, 193))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtInfoGerais_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ButtonFinalizar)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome_Produtos)
                    .addComponent(txtNome_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCod_produto)
                    .addComponent(txtCodigo_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPreco_produto)
                    .addComponent(txtPreco_produtos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(JCcategoria_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFaixa_produto)
                            .addComponent(jCclassificacao_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JRskins)
                            .addComponent(txtTipo_produto)
                            .addComponent(JRpacotes)
                            .addComponent(JRextensoes))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JRgift_cards)
                            .addComponent(JRjogos))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCdesenvolvedor_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFornecedor_produto))
                        .addGap(26, 26, 26)
                        .addComponent(jButtonSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInfoGerais_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonFinalizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPreco_produtosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPreco_produtosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPreco_produtosActionPerformed

    private void txtNome_ProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome_ProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome_ProdutoActionPerformed

    private void JRgift_cardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRgift_cardsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JRgift_cardsActionPerformed

    private void JRjogosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRjogosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JRjogosActionPerformed

    private void JRpacotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRpacotesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JRpacotesActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        String nome_produto = txtNome_Produto.getText();
        int codigo_produto = Integer.parseInt(txtCodigo_produto.getText());
        float preco_produto = Float.parseFloat(txtPreco_produtos.getText());
        String categoria_produto = JCcategoria_produto.getSelectedItem().toString();
        String classificacao_produto = jCclassificacao_produto.getSelectedItem().toString();
        String desenvolvedor_produto = jCdesenvolvedor_produto.getSelectedItem().toString();
        String tipo_produto = null;
        if (JRskins.isSelected()) {
            tipo_produto = "Skins";
        }

        if (JRpacotes.isSelected()) {
            tipo_produto = "Pacotes";
        }

        if (JRextensoes.isSelected()) {
            tipo_produto = "Extensões";
        }

        if (JRgift_cards.isSelected()) {
            tipo_produto = "Gift Cards";
        }

        if (JRjogos.isSelected()) {
            tipo_produto = "Jogos";
        }

        Produto produto = new Produto(nome_produto, codigo_produto, preco_produto, classificacao_produto, categoria_produto, desenvolvedor_produto, tipo_produto);
        produtosCadastrados.add(produto);
        dlm.addElement(produto.getNomeProduto());
        jListCadastrados.setModel(dlm);

        txtNome_Produto.setText("");
        txtCodigo_produto.setText("");
        txtPreco_produtos.setText("");
        if (JRskins.isSelected()) {
            JRskins.setSelected(false);
        }

        if (JRpacotes.isSelected()) {
            JRpacotes.setSelected(false);
        }

        if (JRextensoes.isSelected()) {
            JRextensoes.setSelected(false);
        }

        if (JRgift_cards.isSelected()) {
            JRgift_cards.setSelected(false);
        }

        if (JRjogos.isSelected()) {
            JRjogos.setSelected(false);
        }

        JCcategoria_produto.setSelectedIndex(0);
        jCclassificacao_produto.setSelectedIndex(0);
        jCdesenvolvedor_produto.setSelectedIndex(0);

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jListCadastradosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListCadastradosValueChanged
        String nome = jListCadastrados.getSelectedValue();
        for (Produto produto : produtosCadastrados) {
            if (produto.getNomeProduto().equalsIgnoreCase(nome)) {
                txtInfo_produto.setText(produto.mostrar_produto_cadastrado());
            }
        }

    }//GEN-LAST:event_jListCadastradosValueChanged

    private void ButtonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFinalizarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ButtonFinalizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String all = "\n";
        for (Produto produto : produtosCadastrados) {
            all += produto.mostrar_produto_cadastrado() + "\n";
        }
        txtInfo_produto.setText(all);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro_Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_Produtos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonFinalizar;
    private javax.swing.JComboBox<String> JCcategoria_produto;
    private javax.swing.JRadioButton JRextensoes;
    private javax.swing.JRadioButton JRgift_cards;
    private javax.swing.JRadioButton JRjogos;
    private javax.swing.JRadioButton JRpacotes;
    private javax.swing.JRadioButton JRskins;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jCclassificacao_produto;
    private javax.swing.JComboBox<String> jCdesenvolvedor_produto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jListCadastrados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtCod_produto;
    private javax.swing.JTextField txtCodigo_produto;
    private javax.swing.JLabel txtFaixa_produto;
    private javax.swing.JLabel txtFornecedor_produto;
    private javax.swing.JScrollPane txtInfoGerais_produto;
    private javax.swing.JTextArea txtInfo_produto;
    private javax.swing.JTextField txtNome_Produto;
    private javax.swing.JLabel txtNome_Produtos;
    private javax.swing.JLabel txtPreco_produto;
    private javax.swing.JTextField txtPreco_produtos;
    private javax.swing.JLabel txtTipo_produto;
    // End of variables declaration//GEN-END:variables
}
