package Interface;

import javax.swing.JOptionPane;

public class ControleAdministrador extends javax.swing.JFrame {

    public ControleAdministrador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        MenuNovoUsuario = new javax.swing.JMenuItem();
        MenuNovoProduto = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        MenuVisualizarUsuario = new javax.swing.JMenuItem();
        MenuVisualizarProduto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuNovoLogin = new javax.swing.JMenuItem();
        OpcaoSairControleGeral = new javax.swing.JMenuItem();
        relatorioAtividades = new javax.swing.JMenu();
        exibirRelatorio = new javax.swing.JMenuItem();

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

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Geral (Administrador)");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/png-transparent-xbox-controller-game-controllers-video-games-television-black-technology-black-and-white-joystick-thumbnail-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Cadastro");

        jMenu4.setText("Novo");

        MenuNovoUsuario.setText("Usuário");
        MenuNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuNovoUsuarioActionPerformed(evt);
            }
        });
        jMenu4.add(MenuNovoUsuario);

        MenuNovoProduto.setText("Produto");
        MenuNovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuNovoProdutoActionPerformed(evt);
            }
        });
        jMenu4.add(MenuNovoProduto);

        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        jMenu6.setText("Visualizar");

        MenuVisualizarUsuario.setText("Usuários");
        MenuVisualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuVisualizarUsuarioActionPerformed(evt);
            }
        });
        jMenu6.add(MenuVisualizarUsuario);

        MenuVisualizarProduto.setText("Produto");
        MenuVisualizarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuVisualizarProdutoActionPerformed(evt);
            }
        });
        jMenu6.add(MenuVisualizarProduto);

        jMenuBar1.add(jMenu6);

        jMenu2.setText("Finalizar Sessão");

        MenuNovoLogin.setText("Novo Login");
        MenuNovoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuNovoLoginActionPerformed(evt);
            }
        });
        jMenu2.add(MenuNovoLogin);

        OpcaoSairControleGeral.setText("Sair");
        OpcaoSairControleGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcaoSairControleGeralActionPerformed(evt);
            }
        });
        jMenu2.add(OpcaoSairControleGeral);

        jMenuBar1.add(jMenu2);

        relatorioAtividades.setText("Relatório");

        exibirRelatorio.setText("Exibir");
        exibirRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exibirRelatorioActionPerformed(evt);
            }
        });
        relatorioAtividades.add(exibirRelatorio);

        jMenuBar1.add(relatorioAtividades);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void OpcaoSairControleGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcaoSairControleGeralActionPerformed
        Object[] opcoes = {"Sim", "Não"};
        int i = JOptionPane.showOptionDialog(null,
                "Tem certeza que deseja sair?", "Saída",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                opcoes, opcoes[0]);
        if (i == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_OpcaoSairControleGeralActionPerformed

    private void MenuNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuNovoUsuarioActionPerformed
        new CadastroUsuario().setVisible(true);
    }//GEN-LAST:event_MenuNovoUsuarioActionPerformed

    private void MenuNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuNovoProdutoActionPerformed
        new CadastroProduto().setVisible(true);
    }//GEN-LAST:event_MenuNovoProdutoActionPerformed

    private void MenuNovoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuNovoLoginActionPerformed
        Object[] opcoes = {"Sim", "Não"};
        int i = JOptionPane.showOptionDialog(null,
                "Tem certeza que deseja realizar um novo Login?", "Novo Login",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                opcoes, opcoes[0]);
        if (i == JOptionPane.YES_OPTION) {
            new Login().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_MenuNovoLoginActionPerformed

    private void MenuVisualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVisualizarUsuarioActionPerformed
        new ConsultaUsuarioAdministrador().setVisible(true);
    }//GEN-LAST:event_MenuVisualizarUsuarioActionPerformed

    private void MenuVisualizarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVisualizarProdutoActionPerformed
        new ConsultaProdutoAdministrador().setVisible(true);
    }//GEN-LAST:event_MenuVisualizarProdutoActionPerformed

    private void exibirRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exibirRelatorioActionPerformed
        new VisualizacaoRelatorio().setVisible(true);
    }//GEN-LAST:event_exibirRelatorioActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControleAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuNovoLogin;
    private javax.swing.JMenuItem MenuNovoProduto;
    private javax.swing.JMenuItem MenuNovoUsuario;
    private javax.swing.JMenuItem MenuVisualizarProduto;
    private javax.swing.JMenuItem MenuVisualizarUsuario;
    private javax.swing.JMenuItem OpcaoSairControleGeral;
    private javax.swing.JMenuItem exibirRelatorio;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu relatorioAtividades;
    // End of variables declaration//GEN-END:variables
}
