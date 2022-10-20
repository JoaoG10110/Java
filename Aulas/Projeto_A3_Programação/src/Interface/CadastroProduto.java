package Interface;

import Classes.Produto;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class CadastroProduto extends javax.swing.JFrame {

    ArrayList<Produto> listaProdutos;
    DefaultListModel defaultListModel;
    //ArrayList<Produto> txtRelatorio;
    //String txtRelatorio [] = new String [100];
    Vector<String> txtRelatorio = new Vector<String>();
    
    public CadastroProduto() {
        initComponents();
        listaProdutos = new ArrayList();
        defaultListModel = new DefaultListModel();
        //txtRelatorio = new ArrayList ();
        
        listaProdutos = new ArrayList();
        Produto produto1 = new Produto("Warzone", 9876, (float) 0.00, "Sobrevivência", "Jogos Digitais", "Actvision", "18");
        Produto produto2 = new Produto("FIFA 22", 9999, (float) 200.00, "Esportes", "Jogos Digitais", "Eletronic Arts", "Livre");
        Produto produto3 = new Produto("Apple Store R$30,00", 0011, (float) 30.00, "Outros", "Gift Card", "Apple", "Livre");
        Produto produto4 = new Produto("2400 COD POINTS", 0055, (float) 140.00, "Outros", "Pacote", "Activision", "18");
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        listaProdutos.add(produto4);
        defaultListModel = new DefaultListModel();
        defaultListModel.addElement(produto1.getNomeProduto());
        defaultListModel.addElement(produto2.getNomeProduto());
        defaultListModel.addElement(produto3.getNomeProduto());
        defaultListModel.addElement(produto4.getNomeProduto());
    ListaProdutosCadastrados.setModel(defaultListModel);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        txtCodigoProduto = new javax.swing.JTextField();
        txtPrecoProduto = new javax.swing.JTextField();
        EscolhaCategoria = new javax.swing.JComboBox<>();
        EscolhaFornecedor = new javax.swing.JComboBox<>();
        EscolhaFaixa = new javax.swing.JComboBox<>();
        RadioButtonJogosDigitais = new javax.swing.JRadioButton();
        RadioButtonGiftCards = new javax.swing.JRadioButton();
        RadioButtonExtensoes = new javax.swing.JRadioButton();
        RadioButtonPacotes = new javax.swing.JRadioButton();
        RadioButtonSkins = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtInformacoesProduto = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListaProdutosCadastrados = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRelatorioProdutos = new javax.swing.JTextArea();
        ButtonSalvarProduto = new javax.swing.JButton();
        ButtonLimparProduto = new javax.swing.JButton();
        ButtonSaidaCadastroProduto = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        ButtonRelatorioProduto = new javax.swing.JButton();
        removerProdutosCadastrados = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuSairCadastroProduto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Produtos");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Nome:");

        jLabel2.setText("Código:");

        jLabel3.setText("Preço:");

        jLabel4.setText("Categoria:");

        jLabel5.setText("Fornecedor:");

        jLabel6.setText("Faixa:");

        jLabel7.setText("Tipo:");

        EscolhaCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione*", "Ação", "Aventura", "Esportes", "Estratégia", "Luta", "Plataforma", "Puzzle", "Role-Playing Games", "Simulação", "Sobrevivência", "Outro" }));
        EscolhaCategoria.setToolTipText("");

        EscolhaFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione*", "Activision", "Apple", "Electronic Arts", "Garena", "Google", "Konami", "Microsoft", "Nintendo", "Sony", "Tencent", "Ubisoft", "Outro" }));

        EscolhaFaixa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione*", "Livre", "10 anos", "12 anos", "14 anos", "16 anos", "18 anos" }));

        RadioButtonJogosDigitais.setText("Jogos Digitais");

        RadioButtonGiftCards.setText("Gift Cards");

        RadioButtonExtensoes.setText("Extensões");

        RadioButtonPacotes.setText("Pacotes");

        RadioButtonSkins.setText("Skins");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Produtos Cadastrados");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Informações Cadastrais:");

        txtInformacoesProduto.setColumns(20);
        txtInformacoesProduto.setRows(5);
        jScrollPane2.setViewportView(txtInformacoesProduto);

        ListaProdutosCadastrados.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaProdutosCadastradosValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(ListaProdutosCadastrados);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Relatório Geral:");

        txtRelatorioProdutos.setColumns(20);
        txtRelatorioProdutos.setRows(5);
        jScrollPane1.setViewportView(txtRelatorioProdutos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel9))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel8)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(99, 99, 99))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ButtonSalvarProduto.setBackground(new java.awt.Color(204, 204, 255));
        ButtonSalvarProduto.setText("Salvar");
        ButtonSalvarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarProdutoActionPerformed(evt);
            }
        });

        ButtonLimparProduto.setBackground(new java.awt.Color(204, 204, 255));
        ButtonLimparProduto.setText("Restaurar");
        ButtonLimparProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimparProdutoActionPerformed(evt);
            }
        });

        ButtonSaidaCadastroProduto.setBackground(new java.awt.Color(204, 204, 255));
        ButtonSaidaCadastroProduto.setText("Saída");
        ButtonSaidaCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSaidaCadastroProdutoActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/png-transparent-xbox-controller-game-controllers-video-games-television-black-technology-black-and-white-joystick-thumbnail-removebg-preview.png"))); // NOI18N

        ButtonRelatorioProduto.setBackground(new java.awt.Color(204, 204, 255));
        ButtonRelatorioProduto.setText("Relatório");
        ButtonRelatorioProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRelatorioProdutoActionPerformed(evt);
            }
        });

        removerProdutosCadastrados.setText("Remover");
        removerProdutosCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerProdutosCadastradosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel7)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(234, 234, 234)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel3)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(RadioButtonJogosDigitais)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(RadioButtonExtensoes))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(RadioButtonSkins)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(RadioButtonGiftCards)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(RadioButtonPacotes)))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ButtonLimparProduto, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(removerProdutosCadastrados)
                                                    .addComponent(ButtonRelatorioProduto)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(ButtonSalvarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel6))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(EscolhaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(EscolhaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(EscolhaFaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ButtonSaidaCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(EscolhaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(EscolhaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSalvarProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(EscolhaFaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonLimparProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(RadioButtonJogosDigitais)
                    .addComponent(RadioButtonExtensoes)
                    .addComponent(ButtonRelatorioProduto))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RadioButtonGiftCards)
                            .addComponent(RadioButtonSkins)
                            .addComponent(RadioButtonPacotes)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removerProdutosCadastrados)))
                .addGap(13, 13, 13)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonSaidaCadastroProduto)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenu1.setText("Finalizar Sessão");

        MenuSairCadastroProduto.setText("Sair");
        MenuSairCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSairCadastroProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(MenuSairCadastroProduto);

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuSairCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSairCadastroProdutoActionPerformed
        Object[] opcoes = {"Sim", "Não"};
        int i = JOptionPane.showOptionDialog(null,
                "Deseja fechar a tela?", "Saída",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                opcoes, opcoes[0]);
        if (i == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_MenuSairCadastroProdutoActionPerformed

    private void ButtonSaidaCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSaidaCadastroProdutoActionPerformed
        Object[] opcoes = {"Sim", "Não"};
        int i = JOptionPane.showOptionDialog(null,
                "Tem certeza que deseja fechar a aplicação?", "Saída",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                opcoes, opcoes[0]);
        if (i == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_ButtonSaidaCadastroProdutoActionPerformed

    private void ButtonSalvarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarProdutoActionPerformed
        String nomeProduto = txtNomeProduto.getText();
        int codigoProduto = Integer.parseInt(txtCodigoProduto.getText());
        float precoProduto = Float.parseFloat(txtPrecoProduto.getText());
        String categoriaProduto = EscolhaCategoria.getSelectedItem().toString();
        String fornecedorProduto = EscolhaFornecedor.getSelectedItem().toString();
        String faixaProduto = EscolhaFaixa.getSelectedItem().toString();
        String tipoProduto = "\n";
        if(RadioButtonJogosDigitais.isSelected()){
            tipoProduto = "Jogos Digitais";
        }
        if(RadioButtonSkins.isSelected()){
            tipoProduto = "Skins";
        }
        if(RadioButtonExtensoes.isSelected()){
            tipoProduto = "Extensoes";
        }
        if(RadioButtonGiftCards.isSelected()){
            tipoProduto = "Gift Cards";
        }
        if(RadioButtonPacotes.isSelected()){
            tipoProduto = "Pacotes";
        }
        Produto produto = new Produto(nomeProduto, codigoProduto, precoProduto, categoriaProduto, tipoProduto, fornecedorProduto, faixaProduto);
        listaProdutos.add(produto);
        defaultListModel.addElement(produto.getNomeProduto());
        ListaProdutosCadastrados.setModel(defaultListModel);
        
        txtNomeProduto.setText("");
        txtCodigoProduto.setText("");
        txtPrecoProduto.setText("");
        EscolhaCategoria.setSelectedItem("Selecione*");
        EscolhaFornecedor.setSelectedItem("Selecione*");
        EscolhaFaixa.setSelectedItem("Selecione*");
         if(RadioButtonJogosDigitais.isSelected()){
            RadioButtonJogosDigitais.setSelected(false);
        }
        if(RadioButtonSkins.isSelected()){
           RadioButtonSkins.setSelected(false);
        }
        if(RadioButtonExtensoes.isSelected()){
            RadioButtonExtensoes.setSelected(false);
        }
        if(RadioButtonGiftCards.isSelected()){
            RadioButtonGiftCards.setSelected(false);
        }
        if(RadioButtonPacotes.isSelected()){
            RadioButtonPacotes.setSelected(false);
        }
        //txtRelatorioProdutos.setText("Clicou em salvar.");
        /*for(int i=0; i<txtRelatorio.length; i++){
            txtRelatorio [0] = ("Administrador salvou um produto");
        }*/
        //txtRelatorio [] += ("");
        txtRelatorio.addElement("Osmar");
        txtRelatorio.addElement("Marcos");
        
        
    }//GEN-LAST:event_ButtonSalvarProdutoActionPerformed

    private void ButtonLimparProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparProdutoActionPerformed
        txtNomeProduto.setText("");
        txtCodigoProduto.setText("");
        txtPrecoProduto.setText("");
        EscolhaCategoria.setSelectedItem("Selecione*");
        EscolhaFornecedor.setSelectedItem("Selecione*");
        EscolhaFaixa.setSelectedItem("Selecione*");
         if(RadioButtonJogosDigitais.isSelected()){
            RadioButtonJogosDigitais.setSelected(false);
        }
        if(RadioButtonSkins.isSelected()){
           RadioButtonSkins.setSelected(false);
        }
        if(RadioButtonExtensoes.isSelected()){
            RadioButtonExtensoes.setSelected(false);
        }
        if(RadioButtonGiftCards.isSelected()){
            RadioButtonGiftCards.setSelected(false);
        }
        if(RadioButtonPacotes.isSelected()){
            RadioButtonPacotes.setSelected(false);
        }
    }//GEN-LAST:event_ButtonLimparProdutoActionPerformed

    private void ListaProdutosCadastradosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaProdutosCadastradosValueChanged
        String nomeProduto = ListaProdutosCadastrados.getSelectedValue();
        for(Produto produto : listaProdutos){
            if(produto.getNomeProduto().equalsIgnoreCase(nomeProduto)){
                txtInformacoesProduto.setText(produto.visualizarProdutos());
            }
        }
    }//GEN-LAST:event_ListaProdutosCadastradosValueChanged

    private void ButtonRelatorioProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRelatorioProdutoActionPerformed
       //String relatorio = "";
       //txtRelatorioProdutos.setText(relatorio);
       for(int i=0; i<101; i++){
            txtRelatorio.lastElement();
        }
        
    }//GEN-LAST:event_ButtonRelatorioProdutoActionPerformed

    private void removerProdutosCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerProdutosCadastradosActionPerformed
        defaultListModel.removeElementAt(ListaProdutosCadastrados.getSelectedIndex());
    }//GEN-LAST:event_removerProdutosCadastradosActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLimparProduto;
    private javax.swing.JButton ButtonRelatorioProduto;
    private javax.swing.JButton ButtonSaidaCadastroProduto;
    private javax.swing.JButton ButtonSalvarProduto;
    private javax.swing.JComboBox<String> EscolhaCategoria;
    private javax.swing.JComboBox<String> EscolhaFaixa;
    private javax.swing.JComboBox<String> EscolhaFornecedor;
    private javax.swing.JList<String> ListaProdutosCadastrados;
    private javax.swing.JMenuItem MenuSairCadastroProduto;
    private javax.swing.JRadioButton RadioButtonExtensoes;
    private javax.swing.JRadioButton RadioButtonGiftCards;
    private javax.swing.JRadioButton RadioButtonJogosDigitais;
    private javax.swing.JRadioButton RadioButtonPacotes;
    private javax.swing.JRadioButton RadioButtonSkins;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton removerProdutosCadastrados;
    private javax.swing.JTextField txtCodigoProduto;
    private javax.swing.JTextArea txtInformacoesProduto;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtPrecoProduto;
    private javax.swing.JTextArea txtRelatorioProdutos;
    // End of variables declaration//GEN-END:variables
}
