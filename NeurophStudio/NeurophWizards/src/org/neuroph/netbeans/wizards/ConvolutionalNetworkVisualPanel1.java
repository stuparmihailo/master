/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.neuroph.netbeans.wizards;

import javax.swing.JTextField;

/**
 *
 * @author root
 */
public class ConvolutionalNetworkVisualPanel1 extends javax.swing.JPanel {

    private static ConvolutionalNetworkVisualPanel1 instance;

    /**
     * Creates new form ConvolutionalNetworkVisualPanel1
     */
    public ConvolutionalNetworkVisualPanel1() {
        initComponents();
    }

    public static ConvolutionalNetworkVisualPanel1 getInstance() {
        if (instance == null) {
            instance = new ConvolutionalNetworkVisualPanel1();
        }
        return instance;
    }

    @Override
    public String getName() {
        return "Setting Convolutional Network parameters";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtInputWidth = new javax.swing.JTextField();
        txtInputHeight = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNumberOfMaps = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtKernelWidth = new javax.swing.JTextField();
        txtKernelHeight = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtOutputNeuronCount = new javax.swing.JTextField();

        jTextField4.setText(org.openide.util.NbBundle.getMessage(ConvolutionalNetworkVisualPanel1.class, "ConvolutionalNetworkVisualPanel1.jTextField4.text")); // NOI18N

        jTextField5.setText(org.openide.util.NbBundle.getMessage(ConvolutionalNetworkVisualPanel1.class, "ConvolutionalNetworkVisualPanel1.jTextField5.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(ConvolutionalNetworkVisualPanel1.class, "ConvolutionalNetworkVisualPanel1.jLabel1.text")); // NOI18N

        txtInputWidth.setText(org.openide.util.NbBundle.getMessage(ConvolutionalNetworkVisualPanel1.class, "ConvolutionalNetworkVisualPanel1.txtInputWidth.text")); // NOI18N
        txtInputWidth.setPreferredSize(new java.awt.Dimension(10, 27));
        txtInputWidth.setRequestFocusEnabled(false);
        txtInputWidth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputWidthActionPerformed(evt);
            }
        });

        txtInputHeight.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtInputHeight.setText(org.openide.util.NbBundle.getMessage(ConvolutionalNetworkVisualPanel1.class, "ConvolutionalNetworkVisualPanel1.txtInputHeight.text")); // NOI18N
        txtInputHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputHeightActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(ConvolutionalNetworkVisualPanel1.class, "ConvolutionalNetworkVisualPanel1.jLabel2.text")); // NOI18N

        txtNumberOfMaps.setText(org.openide.util.NbBundle.getMessage(ConvolutionalNetworkVisualPanel1.class, "ConvolutionalNetworkVisualPanel1.txtNumberOfMaps.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(ConvolutionalNetworkVisualPanel1.class, "ConvolutionalNetworkVisualPanel1.jLabel3.text")); // NOI18N

        txtKernelWidth.setText(org.openide.util.NbBundle.getMessage(ConvolutionalNetworkVisualPanel1.class, "ConvolutionalNetworkVisualPanel1.txtKernelWidth.text")); // NOI18N
        txtKernelWidth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKernelWidthActionPerformed(evt);
            }
        });

        txtKernelHeight.setText(org.openide.util.NbBundle.getMessage(ConvolutionalNetworkVisualPanel1.class, "ConvolutionalNetworkVisualPanel1.txtKernelHeight.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(ConvolutionalNetworkVisualPanel1.class, "ConvolutionalNetworkVisualPanel1.jLabel4.text")); // NOI18N

        txtOutputNeuronCount.setText(org.openide.util.NbBundle.getMessage(ConvolutionalNetworkVisualPanel1.class, "ConvolutionalNetworkVisualPanel1.txtOutputNeuronCount.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInputWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(txtInputHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumberOfMaps, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKernelWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKernelHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOutputNeuronCount, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtInputWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInputHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtOutputNeuronCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtKernelWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKernelHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumberOfMaps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(129, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtInputWidthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputWidthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputWidthActionPerformed

    private void txtInputHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputHeightActionPerformed

    private void txtKernelWidthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKernelWidthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKernelWidthActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField txtInputHeight;
    private javax.swing.JTextField txtInputWidth;
    private javax.swing.JTextField txtKernelHeight;
    private javax.swing.JTextField txtKernelWidth;
    private javax.swing.JTextField txtNumberOfMaps;
    private javax.swing.JTextField txtOutputNeuronCount;
    // End of variables declaration//GEN-END:variables

    public JTextField getInputHeight() {
        return txtInputHeight;
    }

    public JTextField getInputWidth() {
        return txtInputWidth;
    }

    public JTextField getKernelHeigh() {
        return txtKernelHeight;
    }

    public JTextField getKernelWidth() {
        return txtKernelWidth;
    }

    public JTextField getNumberOfMaps() {
        return txtNumberOfMaps;
    }
    
    public JTextField getOutputNeurons(){
        return txtOutputNeuronCount;
    }
    
    public void clearForm() {
        txtKernelWidth.setText("");
        txtKernelHeight.setText("");
        txtInputHeight.setText("");
        txtInputWidth.setText("");
        txtNumberOfMaps.setText("");
    }

}
