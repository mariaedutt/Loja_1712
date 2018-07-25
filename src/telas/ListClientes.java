
package telas;

import com.sun.media.sound.ModelOscillator;
import dao.ClienteDAO;
import dao.ClienteFisicoJuridicoDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.ClienteFisico;
import model.ClienteJuridico;

public class ListClientes extends javax.swing.JInternalFrame {

    public ListClientes() {
        initComponents();
        carregarTabela("");
        
    }

    private void carregarTabela(String tipo){
        DefaultTableModel model = new DefaultTableModel();
        String[] colunas = {};
        switch (tipo){
            case "":
                List<Cliente> lista = ClienteDAO.getClientes();
                colunas = new String[]{ "Código", "Nome", "Endereço" , "Cidade"};
                model.setColumnIdentifiers(colunas);
                for (Cliente cli : lista ){
                    Object[] obj = {
                        cli.getCodigo(),
                        cli.getNome(),
                        cli.getEndereco(),
                        cli.getCidade()
                    };
                    model.addRow(obj);
                }
                tableClientes.setModel(model);
                break;
            
            case Cliente.PESSOA_FISICA :
                //nomear as colunas
                colunas = new String[] { "Código" , "Nome" , "Endereço" , "Cidade", "CPF" , "RG"};
                //adicionar as colunas a janela
                model.setColumnIdentifiers(colunas);
                //buscar no banco a lista de clientes físicos
                List<ClienteFisico> listaFisicos = ClienteFisicoJuridicoDAO.getClientesFisicos();
                for (ClienteFisico cli : listaFisicos ){
                    Object[] obj = { 
                        cli.getCodigo() , 
                        cli.getNome() ,
                        cli.getEndereco() , 
                        cli.getCidade().getNome() , 
                        cli.getCpf() , 
                        cli.getRg() 
                        };     
                    model.addRow(obj);
                }
                tableClientes.setModel(model);           
                break;
            case Cliente.PESSOA_JURIDICA :
                colunas = new String[] {"Código" , "Nome" , "Endereço" , "Cidade" , "CNPJ" , "IE" };
                model.setColumnIdentifiers(colunas);
                 List<ClienteJuridico> listaJuridicos = ClienteFisicoJuridicoDAO.getClientesJuridicos();
                for (ClienteJuridico cli : listaJuridicos ){
                    Object[] obj = { 
                        cli.getCodigo() , 
                        cli.getNome() , 
                        cli.getEndereco() , 
                        cli.getCidade().getNome() , 
                        cli.getCnpj(), 
                        cli.getIe()
                    };     
                    model.addRow(obj);
                }
            tableClientes.setModel(model);
            break;
            case "todos" :
                colunas = new String[]{"Código" , "Nome" , "Endereço" , "Cidade" , "Tipo" , "CPF / CNPJ" , "RG / IE"};
                model.setColumnIdentifiers(colunas);
                lista = ClienteDAO.getClientes();
                listaFisicos = ClienteFisicoJuridicoDAO.getClientesFisicos();
                listaJuridicos = ClienteFisicoJuridicoDAO.getClientesJuridicos();
                for ( Cliente cli : lista ){
                    Object[] obj = {
                            cli.getCodigo(),
                            cli.getNome(),
                            cli.getEndereco(),
                            cli.getCidade().getNome(),
                            cli.getTipo(),
                            "",
                            ""
                    };
                    model.addRow(obj);
                }
                for ( ClienteFisico cli : listaFisicos ){
                    Object[] obj = {
                            cli.getCodigo(),
                            cli.getNome(),
                            cli.getEndereco(),
                            cli.getCidade().getNome(),
                            cli.getTipo(),
                            cli.getCpf(),
                            cli.getRg()
                    };
                    model.addRow(obj);
                }
                for ( ClienteJuridico cli : listaJuridicos ){
                    Object[] obj = {
                            cli.getCodigo(),
                            cli.getNome(),
                            cli.getEndereco(),
                            cli.getCidade().getNome(),
                            cli.getTipo(),
                            cli.getCnpj(),
                            cli.getIe()
                    };
                    model.addRow(obj);
                }
                tableClientes.setModel(model);
            break;
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableClientes = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Clientes Cadastrados");
        setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setText("Tipo:");

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Clientes Físicos", "Clientes Jurídicos", "Todos" }));
        cmbTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipoItemStateChanged(evt);
            }
        });
        cmbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoActionPerformed(evt);
            }
        });

        tableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoItemStateChanged
        int posicao = cmbTipo.getSelectedIndex();
        switch(posicao){
            case 0 : 
                carregarTabela("");
                break;
            case 1 :
                carregarTabela( Cliente.PESSOA_FISICA );
                break;
            case 2 :
                carregarTabela( Cliente.PESSOA_JURIDICA );
                break;
            case 3 :
                carregarTabela( "todos" );
                break;
        }
                
    }//GEN-LAST:event_cmbTipoItemStateChanged

    private void cmbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableClientes;
    // End of variables declaration//GEN-END:variables
}
