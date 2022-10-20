package Interface;

import javax.swing.JOptionPane;

public class ControleAtendente extends javax.swing.JFrame {

    public ControleAtendente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuProduto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuSair = new javax.swing.JMenuItem();
        relatorioAtividades = new javax.swing.JMenu();
        exibirRelatorio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Geral (Atendente)");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/png-transparent-xbox-controller-game-controllers-video-games-television-black-technology-black-and-white-joystick-thumbnail-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jMenu1.setText("Visualizar");

        MenuProduto.setText("Produtos");
        MenuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(MenuProduto);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Finalizar Sessão");

        MenuSair.setText("Sair");
        MenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSairActionPerformed(evt);
            }
        });
        jMenu2.add(MenuSair);

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProdutoActionPerformed
        new ConsultaProdutoAtendente().setVisible(true);
    }//GEN-LAST:event_MenuProdutoActionPerformed

    private void MenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSairActionPerformed
        Object[] opcoes = {"Sim", "Não"};
        int i = JOptionPane.showOptionDialog(null,
                "Tem certeza que deseja realizar um novo Login?", "Novo Login",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                opcoes, opcoes[0]);
        if (i == JOptionPane.YES_OPTION) {
            new Login().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_MenuSairActionPerformed

    private void exibirRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exibirRelatorioActionPerformed
       
    }//GEN-LAST:event_exibirRelatorioActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControleAtendente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuProduto;
    private javax.swing.JMenuItem MenuSair;
    private javax.swing.JMenuItem exibirRelatorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu relatorioAtividades;
    // End of variables declaration//GEN-END:variables
}
