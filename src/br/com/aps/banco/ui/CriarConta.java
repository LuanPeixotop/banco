/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aps.banco.ui;

import Exceptions.ContaException;
import br.com.aps.banco.ContaCorrente;
import br.com.aps.banco.ContaPoupanca;
import javax.swing.JOptionPane;

/**
 *
 * @author ti
 */
public class CriarConta extends javax.swing.JInternalFrame {

    /**
     * Creates new form CriarConta
     */
    public CriarConta() {
        initComponents();
        radioContas.add(radioContaCorrente);
        radioContas.add(radioContaPoupanca);
    }
    
    public void limparFormulario() {
        tfNumeroConta.setText("");
        tfSaldo.setText("");
        tfTaxaOuLimite.setText("");
        tfNumeroConta.requestFocusInWindow();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioContas = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        radioContaCorrente = new javax.swing.JRadioButton();
        radioContaPoupanca = new javax.swing.JRadioButton();
        tfNumeroConta = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfSaldo = new javax.swing.JFormattedTextField();
        taxaOuLimite = new javax.swing.JLabel();
        tfTaxaOuLimite = new javax.swing.JFormattedTextField();
        btnCadastrar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Contas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        radioContaCorrente.setSelected(true);
        radioContaCorrente.setText("Conta Corrente");
        radioContaCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioContaCorrenteActionPerformed(evt);
            }
        });

        radioContaPoupanca.setText("Conta Poupança");
        radioContaPoupanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioContaPoupancaActionPerformed(evt);
            }
        });

        tfNumeroConta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel1.setText("Número da Conta:");

        jLabel2.setText("Saldo:");

        tfSaldo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        taxaOuLimite.setText("Taxa: ");

        tfTaxaOuLimite.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseClicked(evt);
            }
        });
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radioContaCorrente)
                                .addGap(18, 18, 18)
                                .addComponent(radioContaPoupanca))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(taxaOuLimite))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfNumeroConta)
                                    .addComponent(tfSaldo)
                                    .addComponent(tfTaxaOuLimite, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnFechar)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioContaCorrente)
                    .addComponent(radioContaPoupanca))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNumeroConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taxaOuLimite)
                    .addComponent(tfTaxaOuLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnFechar))
                .addContainerGap())
        );

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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {
            if(radioContaCorrente.isSelected()) {
               ContaCorrente conta = new ContaCorrente(
                       Long.parseLong(tfNumeroConta.getText()),
                       Double.parseDouble(tfSaldo.getText()),
                       Double.parseDouble(tfTaxaOuLimite.getText()));
               BancoUI.banco.inserir(conta);
               JOptionPane.showMessageDialog(rootPane, "Conta Corrente Cadastrada com sucesso!");
            }
            else if(radioContaPoupanca.isSelected()) {
                ContaPoupanca conta = new ContaPoupanca(
                       Long.parseLong(tfNumeroConta.getText()),
                       Double.parseDouble(tfSaldo.getText()),
                       Double.parseDouble(tfTaxaOuLimite.getText()));
               BancoUI.banco.inserir(conta);
               JOptionPane.showMessageDialog(rootPane, "Conta Poupanca Cadastrada com sucesso!");
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(rootPane, "Preencha os campos corretamente!");;
        } 
        catch (ContaException ce) {
            JOptionPane.showMessageDialog(rootPane, ce.getMessage());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro: " + e.getMessage());
        }
        limparFormulario();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void radioContaCorrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioContaCorrenteActionPerformed
        taxaOuLimite.setText("Taxa:");
    }//GEN-LAST:event_radioContaCorrenteActionPerformed

    private void radioContaPoupancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioContaPoupancaActionPerformed
       taxaOuLimite.setText("Limite:");
    }//GEN-LAST:event_radioContaPoupancaActionPerformed

    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton radioContaCorrente;
    private javax.swing.JRadioButton radioContaPoupanca;
    private javax.swing.ButtonGroup radioContas;
    private javax.swing.JLabel taxaOuLimite;
    private javax.swing.JFormattedTextField tfNumeroConta;
    private javax.swing.JFormattedTextField tfSaldo;
    private javax.swing.JFormattedTextField tfTaxaOuLimite;
    // End of variables declaration//GEN-END:variables
}
