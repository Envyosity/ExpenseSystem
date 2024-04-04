/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabalhoFinal.apresentacao;

/**
 *
 * @author leokr
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form menuPrincipal
     */
    public MenuPrincipal() {
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

        titulo = new javax.swing.JLabel();
        botaoCadastroCategoria = new javax.swing.JButton();
        botaoCadastroFamiliar = new javax.swing.JButton();
        botaoDespesas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        titulo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Cadastro de Despesas");

        botaoCadastroCategoria.setText("Cadastro de Categoria");
        botaoCadastroCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastroCategoriaActionPerformed(evt);
            }
        });

        botaoCadastroFamiliar.setText("Cadastro de Familiar");
        botaoCadastroFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastroFamiliarActionPerformed(evt);
            }
        });

        botaoDespesas.setText("Cadastro de Despesas");
        botaoDespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDespesasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botaoDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botaoCadastroFamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoCadastroCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(titulo)
                .addGap(41, 41, 41)
                .addComponent(botaoCadastroCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoCadastroFamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastroCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastroCategoriaActionPerformed
        // TODO add your handling code here:
        TelaCategoria telaDespesas = new TelaCategoria();
        telaDespesas.setVisible(true);
    }//GEN-LAST:event_botaoCadastroCategoriaActionPerformed

    private void botaoCadastroFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastroFamiliarActionPerformed
        // TODO add your handling code here:
        TelaFamiliar telaFamiliar = new TelaFamiliar();
        telaFamiliar.setVisible(true);
    }//GEN-LAST:event_botaoCadastroFamiliarActionPerformed

    private void botaoDespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDespesasActionPerformed
        TelaDespesa telaDespesa = new TelaDespesa();
        telaDespesa.setVisible(true);
    }//GEN-LAST:event_botaoDespesasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastroCategoria;
    private javax.swing.JButton botaoCadastroFamiliar;
    private javax.swing.JButton botaoDespesas;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
