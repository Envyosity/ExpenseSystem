/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabalhoFinal.apresentacao;

import br.univates.ogiva.persistence.Filter;
import br.univates.ogiva.persistence.IDao;
import java.util.ArrayList;
import java.util.Date;
import trabalhoFinal.Persistencia.DaoFactory;
import static trabalhoFinal.Persistencia.DaoFactory.criarDespesaDao;
import trabalhoFinal.negocio.Categoria;
import trabalhoFinal.negocio.Despesa;
import trabalhoFinal.negocio.Familiar;

/**
 *
 * @author leokr
 */
public class TelaDespesa extends javax.swing.JFrame {

    private Despesa despesa;

    /**
     * Creates new form TelaDespesa
     */
    public TelaDespesa() {
        initComponents();
        this.comboCategoria.removeAllItems();
        this.comboFamiliar.removeAllItems();

        IDao<Categoria, String> daoCategoria = DaoFactory.criarCategoriaDao();
        IDao<Familiar, String> daoFamiliar = DaoFactory.criarFamiliarDao();

        ArrayList<Categoria> listaCategoria = daoCategoria.readAll();
        ArrayList<Familiar> listaFamiliar = daoFamiliar.readAll();

        for (Categoria categoria : listaCategoria) {
            this.comboCategoria.addItem(categoria);
        }

        for (Familiar familiar : listaFamiliar) {
            this.comboFamiliar.addItem(familiar);
        }

        IDao<Despesa, String> dao = DaoFactory.criarDespesaDao();

        ArrayList<Despesa> listaDespesa = dao.readAll();
        TabelaDespesa model = new TabelaDespesa(listaDespesa);
        this.tabelaDespesa.setModel(model);

        this.setLocationRelativeTo(null);
    }

    public Despesa getDespesa() {
        return despesa;
    }

    public void setDespesa(Despesa despesa) {
        this.despesa = despesa;

        this.campoNome.setText(despesa.getNome());
        
        
        this.comboCategoria.setSelectedItem(despesa.getCategoria());
        this.comboFamiliar.setSelectedItem(despesa.getFamiliar());
        
        String[] data = despesa.getData().toString().split("-");
        this.campoData.setText(data[2]+ data[1] + data[0]);
        this.campoValor.setDouble(despesa.getValor());
    }

    IDao dao = criarDespesaDao();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        comboCategoria = new javax.swing.JComboBox<>();
        botaoCadastrar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        comboFamiliar = new javax.swing.JComboBox<>();
        campoData = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botaoEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDespesa = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        campoFiltro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoValor = new br.univates.ogiva.componentes.JCurrencyField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro Despesa");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Nome:");

        campoNome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        comboCategoria.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        comboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoriaActionPerformed(evt);
            }
        });

        botaoCadastrar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        botaoExcluir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        comboFamiliar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        comboFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFamiliarActionPerformed(evt);
            }
        });

        try {
            campoData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDataActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Categoria:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Familiar:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Data:");

        botaoEditar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        botaoEditar.setText("Editar");
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        tabelaDespesa.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelaDespesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaDespesaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaDespesa);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Valor:");

        campoFiltro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        campoFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoFiltroActionPerformed(evt);
            }
        });
        campoFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoFiltroKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("Busca por Nome:");

        campoValor.setText("jCurrencyField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(315, 315, 315))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboFamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(4, 4, 4)
                                .addComponent(campoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoEditar)
                                .addGap(12, 12, 12)
                                .addComponent(botaoExcluir)
                                .addGap(8, 8, 8)))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoValor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboFamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoExcluir)
                    .addComponent(botaoCadastrar)
                    .addComponent(botaoEditar)
                    .addComponent(campoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoriaActionPerformed

    }//GEN-LAST:event_comboCategoriaActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        Despesa d = new Despesa();
        d.setNome(this.campoNome.getText());
        d.setCategoria((Categoria) this.comboCategoria.getSelectedItem());
        d.setFamiliar((Familiar) this.comboFamiliar.getSelectedItem());
        d.setValor(this.campoValor.getDouble());

        String[] data = this.campoData.getText().toString().split("/");

        int a = Integer.parseInt(data[2]) - 1900;
        int m = Integer.parseInt(data[1]) - 1;
        int day = Integer.parseInt(data[0]);
        if (m > 11 || day > 31) {
            System.out.println("Data Invalida");
        } else {
            d.setData(new Date(a, m, day));
            dao.create(d);

            ArrayList<Despesa> listaDespesa = dao.readAll();
            this.tabelaDespesa.setModel(new TabelaDespesa(listaDespesa));
        }

    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void comboFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFamiliarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFamiliarActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        despesa.setNome(this.campoNome.getText());
        despesa.setCategoria((Categoria) this.comboCategoria.getSelectedItem());
        despesa.setFamiliar((Familiar) this.comboFamiliar.getSelectedItem());
        despesa.setValor(this.campoValor.getDouble());
        String[] data = this.campoData.getText().toString().split("/");

        int a = Integer.parseInt(data[2]) - 1900;
        int m = Integer.parseInt(data[1]) - 1;
        int d = Integer.parseInt(data[0]);
        if (m > 11 || d > 31) {
            System.out.println("Data Invalida");
        } else {
            despesa.setData(new Date(a, m, d));

            dao.update(this.despesa);
            this.tabelaDespesa.revalidate();
            this.tabelaDespesa.repaint();
        }
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void campoDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDataActionPerformed

    private void tabelaDespesaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaDespesaMouseClicked
        int linhaSelecionada = this.tabelaDespesa.getSelectedRow();

        TabelaDespesa model = (TabelaDespesa) this.tabelaDespesa.getModel();
        Despesa despesa = model.getListaDespesa().get(linhaSelecionada);

        this.setDespesa(despesa);
    }//GEN-LAST:event_tabelaDespesaMouseClicked

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        // TODO add your handling code here:
        int linhaSelecionada = this.tabelaDespesa.getSelectedRow();

        TabelaDespesa model = (TabelaDespesa) this.tabelaDespesa.getModel();
        Despesa despesa = model.getListaDespesa().get(linhaSelecionada);
        dao.delete(despesa.getId());
        model.getListaDespesa().remove(despesa);

        this.campoNome.setText("");
        this.tabelaDespesa.revalidate();
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void campoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoFiltroActionPerformed
    }//GEN-LAST:event_campoFiltroActionPerformed

    private void campoFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoFiltroKeyReleased
        String nome = this.campoFiltro.getText();

        ArrayList listaDespesa = DaoFactory.criarDespesaDao().readAll(new Filter<Despesa>() {
            @Override
            public boolean isAccept(Despesa despesa) { 
                boolean b = (despesa.getNome().toLowerCase().contains(nome.toLowerCase()));
                return b;
            }
        });

        TabelaDespesa model = new TabelaDespesa(listaDespesa);
        this.tabelaDespesa.setModel(model);
    }//GEN-LAST:event_campoFiltroKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JFormattedTextField campoData;
    private javax.swing.JTextField campoFiltro;
    private javax.swing.JTextField campoNome;
    private br.univates.ogiva.componentes.JCurrencyField campoValor;
    private javax.swing.JComboBox<Categoria> comboCategoria;
    private javax.swing.JComboBox<Familiar> comboFamiliar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaDespesa;
    // End of variables declaration//GEN-END:variables
}
