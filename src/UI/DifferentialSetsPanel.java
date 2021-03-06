/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Util.ConstantsUI;
import static UI.FormulaDisplayPanel.ta_formula;
import Util.IInsertFormula;

/**
 *
 * @author Elliot-VS
 */
public class DifferentialSetsPanel extends javax.swing.JPanel implements IInsertFormula {

    /**
     * Creates new form DifferentialSetsPanel
     */
    public DifferentialSetsPanel() {
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

        bt_lim = new javax.swing.JButton();
        bt_ax = new javax.swing.JButton();
        bt_dx = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bt_lim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        bt_lim.setText("Limit lim");
        bt_lim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_limActionPerformed(evt);
            }
        });

        bt_ax.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        bt_ax.setText("Partial differential ax");
        bt_ax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_axActionPerformed(evt);
            }
        });

        bt_dx.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        bt_dx.setText("Differential dx");
        bt_dx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_dxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bt_lim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_ax)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_dx)
                .addGap(0, 347, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_lim)
                    .addComponent(bt_ax)
                    .addComponent(bt_dx))
                .addGap(0, 42, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_axActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_axActionPerformed
        // TODO add your handling code here:
        
        insertFormula(ConstantsUI.A_STRING);

    }//GEN-LAST:event_bt_axActionPerformed

    private void bt_dxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_dxActionPerformed
        // TODO add your handling code here:
        
        insertFormula(ConstantsUI.DX_STRING);
    }//GEN-LAST:event_bt_dxActionPerformed

    private void bt_limActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limActionPerformed
        // TODO add your handling code here:
        
        insertFormula(ConstantsUI.LIM_STRING);
    }//GEN-LAST:event_bt_limActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_ax;
    private javax.swing.JButton bt_dx;
    private javax.swing.JButton bt_lim;
    // End of variables declaration//GEN-END:variables

    @Override
    public void insertFormula(String formulaString) {
        ta_formula.insert(formulaString, ta_formula.getCaretPosition());
        System.out.println("print: " + formulaString);
    }
}
