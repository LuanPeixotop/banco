package br.com.aps.banco.ui;

import br.com.aps.banco.ContaBancaria;
import java.util.ArrayList;

public class GerarRelatorio extends javax.swing.JInternalFrame {

    /**
     * Creates new form GerarRelatorio
     */
    public GerarRelatorio() {
        initComponents();
        radioGroupTodasContas.add(radioNao);
        radioGroupTodasContas.add(radioSim);
        ArrayList<String> numeroContas = BancoUI.banco.retornaNumeroContas();
        if (numeroContas != null) {
            numeroContas.forEach(numeroConta -> {
                cbContas.addItem(numeroConta);
            });
        } 
        cbContas.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioGroupTodasContas = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        radioSim = new javax.swing.JRadioButton();
        radioNao = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        btnVisualizarRelatorio = new javax.swing.JButton();
        cbContas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        taRelatorio = new javax.swing.JTextArea();

        setClosable(true);

        jLabel1.setText("Gerar de Todas as Contas?");

        radioSim.setSelected(true);
        radioSim.setText("Sim");
        radioSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSimActionPerformed(evt);
            }
        });

        radioNao.setText("Não");
        radioNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNaoActionPerformed(evt);
            }
        });

        jLabel2.setText("Selecione uma Conta:");

        btnVisualizarRelatorio.setText("Visualizar Relatório");
        btnVisualizarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarRelatorioActionPerformed(evt);
            }
        });

        taRelatorio.setColumns(20);
        taRelatorio.setRows(5);
        jScrollPane1.setViewportView(taRelatorio);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btnVisualizarRelatorio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(radioSim)
                                .addGap(18, 18, 18)
                                .addComponent(radioNao))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1)))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(cbContas, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioNao)
                    .addComponent(radioSim)
                    .addComponent(cbContas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnVisualizarRelatorio)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
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

    private void radioSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSimActionPerformed
        cbContas.setEnabled(false);
    }//GEN-LAST:event_radioSimActionPerformed

    private void radioNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNaoActionPerformed
        cbContas.setEnabled(true);
    }//GEN-LAST:event_radioNaoActionPerformed

    private void btnVisualizarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarRelatorioActionPerformed
        if (radioSim.isSelected()) {
            taRelatorio.setText(BancoUI.banco.retornarDados());
        } else if (cbContas.getSelectedItem() != null) {
            Long numeroContaSelecionada = Long.parseLong((String) cbContas.getSelectedItem());
            ContaBancaria conta = BancoUI.banco.procurarConta(numeroContaSelecionada);
            taRelatorio.setText(conta.retornarDados());
        }
    }//GEN-LAST:event_btnVisualizarRelatorioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVisualizarRelatorio;
    private javax.swing.JComboBox<String> cbContas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup radioGroupTodasContas;
    private javax.swing.JRadioButton radioNao;
    private javax.swing.JRadioButton radioSim;
    private javax.swing.JTextArea taRelatorio;
    // End of variables declaration//GEN-END:variables
}
