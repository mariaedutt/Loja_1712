/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

/**
 *
 * @author 181710046
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpTelaInicial = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuCadastrarCategoria = new javax.swing.JMenuItem();
        menuCadastrarCidade = new javax.swing.JMenuItem();
        menuCadastrarCliente = new javax.swing.JMenuItem();
        menuCadastrarProduto = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MenuListarCidades = new javax.swing.JMenuItem();
        menuListarClientes = new javax.swing.JMenuItem();
        menuListarCategorias = new javax.swing.JMenuItem();
        menuListarProdutos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 768));

        javax.swing.GroupLayout jdpTelaInicialLayout = new javax.swing.GroupLayout(jdpTelaInicial);
        jdpTelaInicial.setLayout(jdpTelaInicialLayout);
        jdpTelaInicialLayout.setHorizontalGroup(
            jdpTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 782, Short.MAX_VALUE)
        );
        jdpTelaInicialLayout.setVerticalGroup(
            jdpTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );

        jMenu1.setText("Arquivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Imprimir");
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Sair");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cadastrar");

        menuCadastrarCategoria.setText("Categoria");
        menuCadastrarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarCategoriaActionPerformed(evt);
            }
        });
        jMenu2.add(menuCadastrarCategoria);

        menuCadastrarCidade.setText("Cidade");
        menuCadastrarCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarCidadeActionPerformed(evt);
            }
        });
        jMenu2.add(menuCadastrarCidade);

        menuCadastrarCliente.setText("Cliente");
        menuCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarClienteActionPerformed(evt);
            }
        });
        jMenu2.add(menuCadastrarCliente);

        menuCadastrarProduto.setText("Produto");
        menuCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarProdutoActionPerformed(evt);
            }
        });
        jMenu2.add(menuCadastrarProduto);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Listar");

        MenuListarCidades.setText("Cidades");
        MenuListarCidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListarCidadesActionPerformed(evt);
            }
        });
        jMenu3.add(MenuListarCidades);

        menuListarClientes.setText("Clientes");
        menuListarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarClientesActionPerformed(evt);
            }
        });
        jMenu3.add(menuListarClientes);

        menuListarCategorias.setText("Categorias");
        menuListarCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarCategoriasActionPerformed(evt);
            }
        });
        jMenu3.add(menuListarCategorias);

        menuListarProdutos.setText("Produtos");
        menuListarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarProdutosActionPerformed(evt);
            }
        });
        jMenu3.add(menuListarProdutos);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpTelaInicial)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpTelaInicial)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarClienteActionPerformed
        FrmCliente frm = new FrmCliente();
        jdpTelaInicial.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_menuCadastrarClienteActionPerformed

    private void menuCadastrarCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarCidadeActionPerformed
        FrmCidade frm = new FrmCidade();
        jdpTelaInicial.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_menuCadastrarCidadeActionPerformed

    private void menuCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarProdutoActionPerformed
        FrmProduto frm = new FrmProduto();
        jdpTelaInicial.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_menuCadastrarProdutoActionPerformed

    private void menuCadastrarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarCategoriaActionPerformed
        FrmCategorias frm = new FrmCategorias();
        jdpTelaInicial.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_menuCadastrarCategoriaActionPerformed

    private void MenuListarCidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListarCidadesActionPerformed
        //Instancia
        ListCidades tela = new ListCidades( jdpTelaInicial );
        jdpTelaInicial.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_MenuListarCidadesActionPerformed

    private void menuListarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarClientesActionPerformed
        ListClientes tela = new ListClientes();
        jdpTelaInicial.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_menuListarClientesActionPerformed

    private void menuListarCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarCategoriasActionPerformed
        ListCategorias tela = new ListCategorias();
        jdpTelaInicial.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_menuListarCategoriasActionPerformed

    private void menuListarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarProdutosActionPerformed
        ListProdutos tela = new ListProdutos();
        jdpTelaInicial.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_menuListarProdutosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuListarCidades;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JDesktopPane jdpTelaInicial;
    private javax.swing.JMenuItem menuCadastrarCategoria;
    private javax.swing.JMenuItem menuCadastrarCidade;
    private javax.swing.JMenuItem menuCadastrarCliente;
    private javax.swing.JMenuItem menuCadastrarProduto;
    private javax.swing.JMenuItem menuListarCategorias;
    private javax.swing.JMenuItem menuListarClientes;
    private javax.swing.JMenuItem menuListarProdutos;
    // End of variables declaration//GEN-END:variables
}
